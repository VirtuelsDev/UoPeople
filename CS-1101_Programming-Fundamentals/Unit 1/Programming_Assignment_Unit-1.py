#!/usr/bin/env python
# coding: utf-8

# # Part 1:
# ## (a): Displayed name, shared the code, and output, and justified the output or error

# In[19]:


# Attempting to print a name with missing closing quotation mark
print("Benewende)  # Missing closing quotation mark


# In[20]:


# Attempting to print a name with missing opening quotation mark
print(Pierre")  # Missing opening quotation mark


# In[21]:


# Attempting to print a lastname with no quotation mark
print(BONKOUNGOU)     # No quotation marks


# ## Explanation:
# ### Print name by omitting one of the quotes (opening or closing).
# Printing my name requires enclosing it in matching quotation marks. The first two statements, if executed without one of the quotes (opening or closing), will yield a `SyntaxError:` `unterminated string literal` ([Jones, 2019]). 
# 
# ### Print my name by omitting the quotes (opening and closing).
# Similarly, attempting to print my name without any quotes (opening and closing) in the third statement will result in a `NameError`. Python interprets `BONKOUNGOU` as a variable, but it's not defined, causing an error([Downey, 2015]).. Always ensure to enclose strings properly to avoid these common syntax and variable reference errors in Python.

# ## (b): Difference in * and ** operators along with example code and output
# In Python, the `*` and `**` operators are also used for multiplication and exponentiation, respectively.
# 
#    - `*` is the multiplication operator;
#    - `**` is the exponentiation operator. It raises the number on the left to the power of the number on the right. 
#    
#    For example:

# In[34]:


a = 5
b = 3
print(f"a*b = {a * b}")  # Outputs: 15
print(f"a**b = {a ** b}")  # Outputs: 125


# ## Explanation:
# The `*` and `**` operators are both used for arithmetic operations in Python, but they have different meanings and effects. The `*` operator performs multiplication, which is the repeated addition of a number by itself. For example, `5 * 3` means adding 5 three times, which is `15`. The`**` operator performs exponentiation, which is the repeated multiplication of a number by itself. For example, `5 ** 3` means multiplying `5` by itself three times, which is `125`.
# 
# Multiplication and exponentiation are related, but not the same. Multiplication is a simpler and more common operation than exponentiation. Exponentiation is a more complex and powerful operation than multiplication. Exponentiation can produce much larger numbers than multiplication, even with small inputs. 

# ## (c): Code is shared and justified

# In[23]:


# Attempting to display an integer like 09
print(09)


# ### Explanation:
# No, it's not possible to display an integer with a leading zero like 09 in Python ([Lutz, 2013]). Python interprets numbers starting with 0 as octal literals. However, 09 is not a valid octal number, leading to a `SyntaxError: leading zeros in decimal integer literals are not permitted`; `use an 0o prefix for octal integers`.

# ## (d): Code and output are shared along with the explanation of the difference

# In[33]:


# Using the type() function on a string
print(type('67'))
# Using the type() function on a integer
print(type(67))


# ### Explanation:
# The type function in Python returns the data type of the object passed as an argument. The strings are locked in quotes `(' ')`, while the whole are not. The strings may contain characters, while the integers can only contain figures. The chains are immutable, which means that they cannot be modified once created, while the integers are mutable, which means that they can be modified by arithmetic operations. The strings and integers have different methods and behaviors in Python ([Downey, 2015])..
# 
# ### For example
# Strings can be concatenated with the + operator, while integers can be added with the + operator.

# In[26]:


a, b = '67', 67
print(type(a))  # Outputs: <class 'str'>
print(type(b))  # Outputs: <class 'int'>
print(f"a + a = {a + a}")  # Outputs: 6767
print(f"b + b = {b + b}")  # Outputs: 134


# # Part 2
# ## (a): To multiply your age by 2 and display it.

# In[27]:


# Multiplying age by 2 and displaying the result
age = 33
result = age * 2
print(f"The age multiplied by 2 is : {result}")


# ### Explanation:
# This code multiplies the age variable by 2 and prints the result, allowing for easy modification based on different age values ([Lutz, 2013]).

# ## (b): Display the name of the city, country, and continent you are living in python

# In[28]:


# Displaying information about the location
city = "Ouagadougou"
country = "Burkina Faso"
continent = "Africa"
print(f"City: {city}\nCountry: {country}\nContinent: {continent}")


# ### Explanation:
# This code prints information about the city, country, and continent using formatted strings for better readability ([Downey, 2015]).

# ## (c): To display the examination schedule (i.e., the starting and the ending day) of this term.

# In[29]:


# Displaying examination schedule
exam_start_date = "11 January 2024"
exam_end_date = "14 January 2024"
print(f"Exam Schedule: {exam_start_date} to {exam_end_date}")


# ### Explanation:
# The code displays the examination schedule with the start and end dates, providing a clear representation ([Rossum, 2003]).

# ## (d): Display the temperature of your country on the day the assignment is attempted by you.

# In[30]:


# Displaying the temperature of the country
temperature = 35  # Example temperature value
print(f"The temperature is {temperature} degrees Celsius.")


# ### Explanation:
# This code prints the temperature of the country, and the value can be adjusted based on the actual temperature ([Lutz, 2013]).

# ## Conclusion:
# In this assignment, we explored various scenarios involving mistakes and experimented with different Python features. From syntax errors to understanding the use of operators, we gained insights into common pitfalls and best practices. 
# 
# Additionally, we created Python programs to perform specific tasks related to personal information and practical scenarios. This assignment reinforced the importance of making mistakes deliberately to enhance learning and provided hands-on experience in Python programming.
# 

# # References:
# 
# - Downey, A. (2015). Think Python: How to Think Like a Computer Scientist. Green Tea Press.
# - Jones, B. (2019). Python Programming for Beginners. Packt Publishing.
# - Lutz, M. (2013). Learning Python. O'Reilly Media.
# - Rossum, G. V. (2003). Python Reference Manual. Python Software Foundation.
# - Van Rossum, G. (2021). Python Enhancement Proposals: PEP 468. Python Software Foundation.
