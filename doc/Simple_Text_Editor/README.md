# Simple Text Editor v0.0.1

## Agile Development - For more information please visit our [Trello Board](https://trello.com/b/KE6xmLeo)

A Simple Text Editor with classic design like Windows Notepad.

### Design/Structure:

***Form*** - Main Frame:
###### JFrame
- Bordered Layout

***Top*** - Menu Bar with Dropdown Menus for classic navigation:
###### JFrame > JMenuBar
- File: 'New', 'Open', 'Save', 'Save As', 'Exit'
- Edit: 'Insert HTML'
- Help: 'About'

***Top*** - Toolbar with Buttons for easy access:
###### JFrame > JPanel > JToolBar
- 'New'
- 'Open'
- 'Save'
- 'Save As'

***Center*** - Text Area with Tab and Scroll for Reading and Writing:
###### JFrame > JTabbedPane > JScrollPane > JTextArea
- Tabbed Panel prepared for 'Advanced Text Editor'
- Scroll Panel to enable scrolling if text exceeds window size vertically
- Text Area for read and write with Line Wrap so that text can't exceed window size horizontally

***Bottom*** - Footer for Information about Events and Files:
###### JFrame > JPanel > JLabel
- 'Message' shows information about events and files
- 'Path' shows the path of files

### Description:

When **New** is chosen the user gets prompted to *save changes*, if confirmed, the **Save As** method is executed. Then a temporary *'Untitled Document.txt'* is referenced (not created untill saved) and the **Text Area** is cleared. If the referenced temporary file is already created in that location the user gets prompted to replace existing file, if Not confirmed, the **Save As** method is executed.

When **Open** is chosen the user gets prompted to *save changes*, if confirmed, the **Save As** method is executed. Then a *Open* Dialog is shown.

When **Save** is chosen the referenced file is saved. If there is No referenced file the **Save As** method is executed. If the file exists, the user gets prompted to replace existing file, if Not confirmed, the **Save As** method is executed.

When **Save As** is chosen, the **Save As** method is executed.

When **Exit** is chosen the user gets prompted to *save changes*, if confirmed, the referenced file is saved. If there is No referenced file the **Save As** method is executed. Then the Text Editor is closed.

When **Insert HTML** is chosen the **Text Area** gets populated with a HTML snippet.

When **About** is chosen a popup window is shown with information about the application.
