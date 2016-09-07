page title:Harvard Business Publishing Reader

#Object Definitions
====================================================================================
closed_notes   							    xpath       				navbar-notes
sideBar_notes                               xpath                       //div[@class='sidebar']/div[contains(@class,'sidebar-notes')]
annotateModeICon                            xpath                       //ul[@class='footer-menu']//span[@id='annotationModeBtn']
annotate_mode_icon_li_tag                   xpath                       //footer//li[contains(@class,'footer-annotations-mode')]
annotateModePopUp                           css                         div[class*='annotation-mode-modal'] div[class*='modal js-modal']
annotateModeModalDialog                     css                         div[class*='annotation-mode-modal'] div[class='modal-content']
DoneButton                                  linktext                    Done
Annotation_Pop_Up_Done_Button               xpath                    	//div[contains(@class,'annotation-mode-modal')]//span[contains(@class,'hbp-icon-close')]
top_iframe									id							chapter_0
first_word									xpath						//word[contains(text(),'${text}')]
last_word									xpath						//word[contains(text(),'feedback')]
second_word                                 xpath                       //word[contains(text(),'NEERAJ')]
yellow_highlight							xpath						.//div[@class='shapes-wrapper']//span[contains(@style,'background: rgb(255, 238, 172)')]
annotation									xpath						.//annotation
open_notes_pane								xpath						.//*[@class='navbar-notes active']
search_notes_field							id							searchNotesInput
search_result								xpath    					//div[not(@style = 'display: none;') and contains(@class,'annotation-card')]//span[@class='result']
search_results								xpath    					//span[@class='result']
annotation_card_For_A_Search_Result         xpath                       //span[@class='result' and text()='${text}']/ancestor::div[contains(@class,'annotation-card')]
notePadIconOfFirstNotesCard                 css                         div[class*='sidebar-notes'] div[class^='annotation-card']:nth-child(1) span[class*='icon-edit']
notes_Text_Area_FirstNoteCard               css                         div[class*='sidebar-notes'] div[class^='annotation-card']:nth-child(1)>div:nth-child(3) textarea
notesIcon_On_Nav_bar                        xpath                       //ul[contains(@class,'navbar-menu')]//span[@class='hbp-icon hbp-icon-notes']
backButton                                  xpath                       //span[contains(@class,'js-back')]
bodyElement                                 css                         body#HBPreader
red_grey_spinner                            css                         div#fakeLoader div[class='fl spinner1']
annotation_Edit_Flyout                      css                         div[class^='annotation-flyout edit-flyout']    
pink_highlight								xpath						(.//div[@class='shapes-wrapper']//span[contains(@style,'background: rgb(255, 202, 214)')])[${text}]
notes_preview1								xpath						.//*[@class='quote']/..
last_selected_color							css							.add-note-wrapper>span:nth-child(1)>svg>path
last_select_color_span                      css                         div[class^='annotation-flyout create-flyout']>div:nth-child(${text}) span.last-type
trashcan_of_annotation_flyout				css							span[class^='hbp-icon hbp-icon-trashcan icon-remove']
edit_icon_of_annotation_flyout				css							span[class='hbp-icon hbp-icon-edit icon-edit']
pink_side_text_note_icon                    xpath                       .//span[contains(@class,'icons-holder')]//span[@class='shape active' and @data-type='2']/parent::span
notes_list                                  css                         span[class='quote']
side_text_note_icon_list                    css                         span[class^='icons-holder']
delete_icon_of_note_card                    css                         div[class$='remove-annotation']
style_list                                  xpath                       .//*[@style]
notes_annotation_list                       xpath                       .//div[@class='annotation-list']
side_text_note_On_Side_OfText               xpath                       //word[contains(text(),'${text}')]/following-sibling::span[contains(@class,'icons-holder')]//span[@class='shape active' and @data-type='2']
annotate_In_Note_card                       css                         div[class*='sidebar-notes'] div[class^='annotation-card']:nth-child(2) span.quote
top_Navigation_Bar                          css                         nav[id^=hbpNavbar] div[class^=navbar-wrapper]
top_Nav_Bar                                 xpath                       //nav[@id='hbpNavbar']//div[@class='navbar-container']
global_Search_Icon                          css                         span[class='hbp-icon hbp-icon-search']
annotation_create_flyout                    css                         div[class^='annotation-flyout create-flyout']
green_highlight                             xpath                        (.//div[@class='shapes-wrapper']//span[contains(@style,'background: rgb(207, 246, 199)')])[1]
blue_highlight                              xpath                        (.//div[@class='shapes-wrapper']//span[contains(@style,'background: rgb(202, 241, 255)')])[1]    
pink_highlight1                             xpath                        (.//div[@class='shapes-wrapper']//span[contains(@style,'background: rgb(255, 202, 214)')])[1]
note_cards_in_notes_pane                    css                          div[class^='annotation-card']
hidden_notes_cards                          css                          div[class^='annotation-card'][style='display: none;']
delete_icons                                css                          div[class$='remove-annotation']>span
specific_word_ocurrence                     xpath                        (//word[contains(text(),'$')])[%]
next_arrow_span                             xpath                       .//*[contains(@class,'next hbp-next arrows-wrapper')]/span
previous_arrow_span                         xpath                       .//*[@class='prev hbp-previous arrows-wrapper']/span
nextarrow							        xpath						.//*[contains(@class,'next hbp-next arrows-wrapper')]
previousarrow                               xpath                       .//*[contains(@class,'prev hbp-previous arrows-wrapper')] 
current_page_number                         css                         footer div.pages span[class*='current']
divs_under_annotation_wrapper               css                         div[class^='annotations-wrapper '] div[class='annotation-card']
last_page_number							css							footer div.pages span[class*='total']
cbm_yellowhighlight							css							div[class*='create-flyout']>div[class*='shapes-wrapper']>div:nth-child(1)>svg
last_chosen_color                           css                         div[class^='annotation-flyout create-flyout']>div:nth-child(2) span[class=last-type]>*
Right_side_notes_Icon_For_A_Word            xpath                       //word[contains(text(),'${text}')]/parent::annotation//span[contains(@class,'side-text-note icon active')]
Notes_textarea_For_Particluar_Notes_Card    xpath                       //span[@class='quote' and contains(text(),'${text}')]/parent::*/parent::div/following-sibling::div//textarea
particular_note_Card                        xpath                       //span[@class='quote' and contains(text(),'${text}')]/ancestor::div[contains(@class,'annotation-card')]
annotate_particular_note_Card               xpath                       //span[@class='quote' and contains(text(),'${text}')]
notes_Icon_For_A_WordFill                   xpath                       //span[contains(@class,'side-text-note')]/*/*[@fill='${text}']/parent::*/parent::*
show_more_link                              css                         div[class='annotation-card highlight-card'] span[class*='show-more']
show_less_link                              css                         div[class='annotation-card highlight-card'] span[class*='show-less']
notes_Preview_Of_Current_Note_Card          css                         div[class='annotation-card highlight-card'] div[class='notes-preview']
textArea_Of_Current_Note_Card               css                         div[class='annotation-card highlight-card'] textarea
Current_Highlighted_note_card               css                         div[class*='sidebar-notes'] div[class^='annotation-card highlight']
annotation_Of_Particular_Word               xpath                       //annotation//word[contains(text(),'${text}')]/parent::*
first_annotation_card                       css                         div[class*='sidebar-notes'] div[class^='annotation-card']:nth-child(1)
particular_frame_element                    xpath                       //iframe[@id='chapter_${text}']
cross_buttons                               css                         button[class*='close-modal']
current_1page								css 					    .js-current-page
last_1page									css							.js-total-pages
last_pagenumber								css							footer div.pages span[class*='total']
current_pagenumber                         	css                         footer div.pages span[class*='current']
invisible_note_cards                        css                         div[class^='annotations-wrapper '] div[style*='none;']>div[class='annotation-card']
note_cards_parenets                         xpath                       //div[contains(@class,'annotations-wrapper ')]//div[contains(@class,'annotation-card')]/parent::div
notePadIcons                                css                         div[class*='sidebar-notes'] div[class^='annotation-card']:nth-child(1) span[class*='icon-edit']
annotation_class_elements_under_annotation_list xpath                   //div[contains(@class,'annotation-list ')]//div[contains(@class,'annotation-')]
copy_button                                 css                         span.copy-button
search_field							    classname					search-publication

====================================================================================