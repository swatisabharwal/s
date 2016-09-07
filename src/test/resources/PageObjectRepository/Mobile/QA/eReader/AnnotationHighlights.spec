page title:Harvard Business Publishing Reader

#Object Definitions
====================================================================================
closed_notes   							    xpath       				navbar-notes
sideBar_notes                               xpath                       //div[@class='sidebar']/div[contains(@class,'sidebar-notes')]
annotateModeICon                            xpath                       //div[contains(@class,'footer-reading-mode')]//span[contains(@class,'hbp-icon-annotation-mode')]
annotate_mode_icon_li_tag                   xpath                       //footer//li[contains(@class,'footer-annotations-mode')]
annotateModePopUp                           css                         div[class*='annotation-mode-modal'] div[class*='modal js-modal']
annotateModeModalDialog                     css                         div[class*='annotation-mode-modal'] div[class='modal-content']
DoneButton                                  linktext                    Done
Annotation_Pop_Up_Done_Button               xpath                    	//div[contains(@class,'annotation-mode-modal')]//span[contains(@class,'hbp-icon-close')]
top_iframe									id							chapter_0
first_word									xpath						//word[contains(text(),'${text}')]
last_word									xpath						//word[contains(text(),'feedback')]
second_word                                 xpath                       //word[contains(text(),'NEERAJ')]
yellow_highlight							xpath						.//div[contains(@class,'annotation-tooltip')]//span[contains(@style,'background-color: #FFEEAC')]
annotation									xpath						.//annotation
grey_annotation                             xpath                       //annotation[contains(@style,'rgb(198, 198, 198)')]
open_notes_pane								xpath						.//*[@class='navbar-notes active']
search_notes_field							id							searchNotesInput
search_result								xpath    					//div[not(@style = 'display: none;') and contains(@class,'annotation-card')]//span[@class='result']
search_results								xpath    					//span[@class='result']
annotation_card_For_A_Search_Result         xpath                       //span[@class='result' and text()='${text}']/ancestor::div[contains(@class,'annotation-card')]
notePadIconOfFirstNotesCard                 css                         div[class*='sidebar-notes'] div[class^='annotation-card']:nth-child(1) span[class*='icon-edit']
notes_Text_Area_FirstNoteCard               css                         div[class*='sidebar-notes'] div[class^='annotation-card']:nth-child(1)>div:nth-child(3) textarea
notesIcon_On_Nav_bar                        xpath                       //div[contains(@class,'footer-mobile')]//span[contains(@class,'hbp-icon hbp-icon-notes')]
backButton                                  xpath                       //div[contains(@class,'js-back span-back')]
bodyElement                                 css                         body#HBPreader
red_grey_spinner                            css                         div#fakeLoader div[class='fl spinner1']
annotation_Edit_Flyout                      xpath                       .//div[contains(@class,'annotation-tooltip touch-device edit')]    
pink_highlight								xpath						(.//div[contains(@class,'annotation-tooltip')]//span[contains(@style,'background-color: #FFCAD6')])[${text}]
notes_preview1								xpath						.//*[@class='quote']/..
last_selected_color							css							.btn-add-note>span>span[class='label']
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
annotation_create_flyout                    css                         div[class^='annotation-tooltip touch-device create']
green_highlight                             xpath                        (.//div[contains(@class,'annotation-tooltip')]//span[contains(@style,'background-color: #CFF6C7')])[1]
blue_highlight                              xpath                        (.//div[contains(@class,'annotation-tooltip')]//span[contains(@style,'background-color: #CAF1FF')])[1]
pink_highlight1                             xpath                        (.//div[contains(@class,'annotation-tooltip')]//span[contains(@style,'background-color: #FFCAD6')])[1]
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
last_page_number							css							.//div[contains(@class,'footer-mobile')]//span[@class='js-total-pages']
cbm_yellowhighlight							css							.annotation-tooltip>ul>li:nth-child(1)>span>svg
last_chosen_color                           css                         .btn-add-note>span>span:nth-child(1)
Right_side_notes_Icon_For_A_Word            xpath                       //word[contains(text(),'${text}')]/parent::annotation//span[contains(@class,'side-text-note icon active')]/*
Notes_textarea_For_Particluar_Notes_Card    xpath                       //span[@class='quote' and contains(text(),'${text}')]/parent::*/parent::div/following-sibling::div//textarea
particular_note_Card                        xpath                       //span[@class='quote' and contains(text(),'${text}')]/ancestor::div[contains(@class,'annotation-card')]
annotate_particular_note_Card               xpath                       //span[@class='quote' and contains(text(),'${text}')]
notes_Icon_For_A_WordFill                   xpath                       //span[contains(@class,'side-text-note')]/*/*[@style='fill: ${text};']/parent::*/parent::*
show_more_link                              css                         div[class='annotation-card highlight-card'] span[class*='show-more']
show_less_link                              css                         div[class='annotation-card highlight-card'] span[class*='show-less']
notes_Preview_Of_Current_Note_Card          css                         div[class='annotation-card highlight-card'] div[class='notes-preview']
textArea_Of_Current_Note_Card               css                         div[class='annotation-card highlight-card'] textarea
Current_Highlighted_note_card               css                         div[class*='sidebar-notes'] div[class^='annotation-card highlight']
annotation_Of_Particular_Word               xpath                       //annotation//word[contains(text(),'${text}')]/parent::*
first_annotation_card                       css                         div[class*='sidebar-notes'] div[class^='annotation-card']:nth-child(1)
particular_frame_element                    xpath                       //iframe[@id='chapter_${text}']
cross_buttons                               css                         button[class*='close-modal']
current_1page								css 					    div[class*='footer-desktop'] .js-current-page
last_1page									css							.js-total-pages
last_pagenumber								xpath						.//div[contains(@class,'footer-reading-mode')]//span[@class='js-total-pages']
current_pagenumber                         	css                         footer div[class*='footer-reading-mode'] span[class*='current-page']
invisible_note_cards                        css                         div[class^='annotations-wrapper '] div[style*='none;']>div[class='annotation-card']
note_cards_parenets                         xpath                       //div[contains(@class,'annotations-wrapper ')]//div[contains(@class,'annotation-card')]/parent::div
notePadIcons                                css                         div[class*='sidebar-notes'] div[class^='annotation-card']:nth-child(1) span[class*='icon-edit']
annotation_class_elements_under_annotation_list xpath                   //div[contains(@class,'annotation-list ')]//div[contains(@class,'annotation-')]
copy_button                                 xpath                       //span[@class='btn-copy']/span[text()='Copy']
search_field							    classname					search-publication
footer_in_mobile                            xpath                       //div[@class='footer-base footer-mobile']
annotation_Instruction_Title				xpath						.//div[contains(@class,'js-notes')]//div[@class='instructions-title']
annotation_Instruction_Message				xpath						.//div[contains(@class,'js-notes')]//div[@class='instructions-message']
refresh_sync_icon							xpath						.//span[contains(@class,'js-spinner-refresh')]
yellow_side_text_note_On_Side_OfText        xpath                       //word[contains(text(),'${text}')]/parent::annotation//span[contains(@class,'side-text-note icon active')]
footer_In_Reading_Mode						xpath						.//div[contains(@class,'footer-reading-mode')]
font_size_phone								xpath					     .//*[@id='fsPhone']
scrubber		                         	xpath                         (.//div[@class='rangeslider rangeslider--horizontal'])[2]
notes_icon_In_Scrubber_Bar					xpath						.//div[contains(@class,'footer-mobile')]//span[contains(@class,'hbp-icon-notes-b')]
annotation_icon_In_Scrubber_Bar				xpath						.//div[contains(@class,'footer-mobile')]//span[contains(@class,'js-annotation-icon')]
words										xpath						.//word
hidden_annotation_Flyout					xpath						.//div[contains(@class,'annotation-tool')]
unhighlighted_notes_preview					css							div[class='annotation-card'] div[class='notes-preview']
grey_annotation                             xpath                       //annotation[contains(@style,'rgb(198, 198, 198)')]
body_element                                xpath                       //body
right_chevron_icon					        xpath						.//*[@class='next hbp-next arrows-wrapper js-arrows-wrapper']
first_Word									css							p[class^='author']>word:nth-child(1)
left_chevron_icon                           xpath                       .//*[@class='prev hbp-previous arrows-wrapper js-arrows-wrapper']
menu_bar_nav                                xpath                       //nav[@id='hbpNavbar']//div[contains(@class,'menubar js-menubar')]
navbar_element                              xpath                       //nav[@id='hbpNavbar']
annotation_pop_up_heading                   xpath                       (//div[contains(@class,'AnnotationTutorialModalView')]//h1)[2]
annotation_pop_up_instructions_part         xpath                        (//div[contains(@class,'AnnotationTutorialModalView')]//div[contains(@class,'section-b')]//h2)[${text}]
dont_show_again                             css                         input[class*="js-hide-tutorial"]
====================================================================================
@@ set text  
@annotate_Icon_In_Reading_Mode
--------------------------------
annotateModeICon
      inside: footer_In_Reading_Mode 4px bottom
annotateModeICon
      inside: footer_In_Reading_Mode 20px right
      
@icons_In_Scrubber_Bar
--------------------------------
scrubber
      below: font_size_phone
scrubber
      below: notes_icon_In_Scrubber_Bar
scrubberannotateModeModalDialog
	  below: annotation_icon_In_Scrubber_Bar
annotation_icon_In_Scrubber_Bar
      inside: footer_in_mobile

 
