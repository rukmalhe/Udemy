import pandas as pd
import matplotlib.pyplot as plt
import numpy as np

file_path = '/Users/rukmal/Downloads/sterling/sterling/prius_3.xlsx'  # Change this to the path of your Excel file
df = pd.read_excel(file_path)

# Print the columns to verify the names
print(df.columns)

# Ensure columns are correctly named
df.columns = df.columns.str.strip()  # Remove any leading/trailing whitespace

# Check if required columns are present
required_columns = ['Year', 'Colour', 'Mileage', 'Price']
for column in required_columns:
    if column not in df.columns:
        raise ValueError(f"Missing required column: {column}")

# Step 2: Extract and group the data by year and color
#grouped = df.groupby(['Year', 'Colour'])

# Step 2: User selects the grouping method
print("Choose the grouping method:")
print("1. Group by both Year and Colour")
print("2. Group by Year only")
print("3. Group by Colour only")

choice = input("Enter the number of your choice (1, 2, or 3): ")

if choice == '1':
    grouping_columns = ['Year', 'Colour']
    group_label = 'Year and Colour'
elif choice == '2':
    grouping_columns = ['Year']
    group_label = 'Year'
elif choice == '3':
    grouping_columns = ['Colour']
    group_label = 'Colour'
else:
    raise ValueError("Invalid choice. Please enter 1, 2, or 3.")

# Step 3: Extract and group the data based on user choice
grouped = df.groupby(grouping_columns)

# Step 4: Plot the data
plt.figure(figsize=(12, 8))

# Loop through each (year, color) group and plot the mileage vs price
for group_name, group in grouped:
    if isinstance(group_name, tuple):
        label = ', '.join(map(str, group_name))
    else:
        label = str(group_name)
    plt.scatter(group['Mileage'], group['Price'], label=f'{group_label}: {label}')
    
    # Step 5: Add a trend line
    z = np.polyfit(group['Mileage'], group['Price'], 1)
    p = np.poly1d(z)
    plt.plot(group['Mileage'], p(group['Mileage']), linestyle='--', label=f'Trend {label}')

# Step 5: Add title, labels, and legend
plt.title('Car Mileage vs Price by Year and Colour with Trend Lines')
plt.xlabel('Mileage (km)')
plt.ylabel('Price ($)')

# Positioning the legend outside the plot area
plt.legend(bbox_to_anchor=(1.05, 1), loc='upper left', borderaxespad=0.)

plt.grid(True)

# Step 6: Display the plot
plt.tight_layout(rect=[0, 0, 0.85, 1])  # Adjust layout to make space for the legend
plt.show()