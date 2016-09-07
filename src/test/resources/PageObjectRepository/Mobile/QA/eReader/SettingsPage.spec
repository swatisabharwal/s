page title: Harvard Business Publishing Reader

#Object Definitions
====================================================================================
notesIconDesktop                    xpath                       //ul[contains(@class,'navbar-menu')]/li[contains(@class,'notes')]/a
notesIconMobile                     xpath                       //ul[contains(@class,'footer-menu')]/li[contains(@class,'footer-notes')]/span
top_Nav_Bar                         xpath                       //nav[@id='hbpNavbar']//div[@class='navbar-container']
spinner								xpath						.//*[@class='fl spinner1']
settings_icon						xpath						.//*[@class='hbp-icon hbp-icon-settings']
active_settings_link				xpath						.//*[@class='navbar-settings active']
closed_settings_link				xpath						.//li[contains(@class,'navbar-settings')]
accessibility_heading				xpath						.//li[@class='settings-menu-item accessibility']//span[1]
accessibility_description			xpath						.//li[@class='settings-menu-item accessibility']//span[2]
accessibility_toggle				xpath						.//li[@class='settings-menu-item accessibility']//label
settingsLink                        xpath                       //li[contains(@class,'navbar-settings')]
feedback							xpath						.//div[contains(@class,'js-collapsible')]/span[text()='Feedback']
feedback_messaging					css							p[class='feedback-legend']
feedback_email_Button				css							a.btn.feedback-btn
about_hbp_reader_link				xpath						.//li[contains(@class,'sidebar-about-hbp')]
about_modal_window					xpath						.//div[contains(@class,'about-hbp-modal')]//div[@class='modal-header']
done_modal_window					xpath						.//div[contains(@class,'about-hbp-modal')]//button[@class='btn js-close-modal']
header_text_modal_window			xpath						.//div[contains(@class,'about-hbp-modal')]//h1
body_heading_modal_window		    xpath						.//div[contains(@class,'about-hbp-modal')]//h3
body_modal_window					xpath						.//div[contains(@class,'about-hbp-modal')]//div[contains(@class,'js-content')]/div
legal_link							xpath						.//li[contains(@class,'sidebar-legal')]
case_title							classname					case-title
plus_font_size						xpath						.//div[@class='icons-group']//button[contains(@class,'js-font-plus')]
last_page_number					xpath							.//div[contains(@class,'footer-reading-mode')]//span[@class='js-total-pages']
current_page_number                 css                         footer div.pages span[class*='current']
last_iframe							xpath						(.//iframe[contains(@id,'chapter_')])[last()]
last_word							xpath						(.//word)[last()]
heading								css							h1
yellow_circle						css							.icons-holder>span>svg>ellipse
circled_yellow_filter				css							.annotation-label-cbm>svg>ellipse
font_size_phone						xpath					     .//*[@id='fsPhone']
backButton                          xpath                         //div[contains(@class,'js-back span-back')]
offline								xpath						.//span[text()='Make Available Offline']
offline_messaging					xpath						.//li[contains(@class,'offline')]//span[@class='span-legend']
offline_toggle						xpath						.//label[@for='toggle-offline']
print								xpath						.//div[contains(@class,'js-collapsible')]/span[text()='Print']
print_Text_Button					xpath						.//button[contains(@class,'js-print-btn-text')]
print_Notes_Button					xpath						.//button[contains(@class,'js-print-btn-notes')]
show_Highlights_Text_Checkbox		id							printHighlightsContent
show_Notes_Text_Checkbox			id							printHighlightsNotes
particular_frame_element            xpath                       //iframe[@id='chapter_${text}']
current_page						css 					    .js-current-page
offline_content_expan_icon          xpath                       //li[contains(@class,'sidebar-offline-collapsible')]//span[@class='hbp-icon hbp-icon-chevron-bottom right-side-icons']
offline_settings_drop_down          css                         li[class*='sidebar-offline-collapsible'] div.settings-dropdown
Yellow_messaging_bookmark_checkbox   xpath                      //input[@id='toggle-bookmark']
yellow_messaging_bookmark_done_button  xpath                    //div[@class='alert bookmark-warning']//button
blue_bookmark_success_messaging_OK_button      xpath            //div[@class='alert bookmark-success']//button
instructor_Print_Description			xpath					(.//div[@class='instructor-mode-print']//span)[1]
instruction_Print_Button				xpath					(.//div[@class='instructor-mode-print']//span)[3]
bookmark_alert_title					css						div[class^='user-alert-container']>div>h1
bookmark_alet_body						css  					div[class^='user-alert-container']>div[class^='js-contents']
bookmark_alert_checkbox_message			xpath					.//div[@class='user-alert-container']//label
bookmark_alertcheckbox					xpath					.//div[@class='user-alert-container']//input
bookmark_alert_done						xpath					.//div[@class='user-alert-container']//button
====================================================================================