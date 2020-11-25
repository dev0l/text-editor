# Simple Text Editor v0.0.1

## Agile Development - For more information please visit our [Trello Board](https://trello.com/b/KE6xmLeo)

A Simple Text Editor with classic design like Windows Notepad.

**Design/Structure:**

**Form** - Main Frame:
###### JFrame
- Bordered Layout

**Top** - Menu Bar with Dropdown Menus for classic navigation:
###### JFrame > JMenuBar
- File: 'New', 'Open', 'Save', 'Save As', 'Exit'
- Edit: 'Insert HTML'
- Help: 'About'

**Top** - Toolbar with buttons for easy access:
###### JFrame > JPanel > JToolBar
- 'New'
- 'Open'
- 'Save'
- 'Save As'

**Center** - Text Area with Tab and Scroll for Reading and Writing:
###### JFrame > JTabbedPane > JScrollPane > JTextArea
- Tabbed Panel prepared for 'Advanced Text Editor'
- Scroll Panel to enable scrolling if text exceeds window size vertically
- Text Area for read and write with Line Wrap so that text can't exceed window size horizontally

**Bottom** - Footer for information about events and files:
JFrame > JPanel > JLabel
- 'Message' shows information about events and files
- 'Path' shows the path of files
