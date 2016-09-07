#Object Definitions
====================================================================================
notesIconDesktop                    xpath                       //ul[contains(@class,'navbar-menu')]/li[contains(@class,'notes')]/a
notesIconMobile                     xpath                       //ul[contains(@class,'footer-menu')]/li[contains(@class,'footer-notes')]/span
top_Nav_Bar                         xpath                       //nav//div[contains(@class,'navbar-wrapper')]
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
about_modal_window					classname					modal-header
done_modal_window					xpath						.//div[contains(@class,'about-hbp-modal')]//button[@class='btn js-close-modal']
header_text_modal_window			xpath						.//div[contains(@class,'about-hbp-modal')]//h1
body_heading_modal_window		    xpath						.//div[contains(@class,'about-hbp-modal')]//h3
body_modal_window					xpath						.//div[contains(@class,'about-hbp-modal')]//div[contains(@class,'js-content')]/div
legal_link							xpath						.//li[contains(@class,'sidebar-legal')]
case_title							classname					case-title
plus_font_size						xpath						.//*[@class='settings-wrapper']//span[contains(@class,'hbp-icon-plus')]
last_page_number					css							footer div.pages span[class*='total']
current_page_number                 css                         footer div.pages span[class*='current']
last_iframe							xpath						(.//iframe)[last()-2]
last_word							xpath						(.//word)[last()]
heading								css							h1
yellow_circle						css							.icons-holder>span>svg>ellipse
circled_yellow_filter				css							.annotation-label-cbm>svg>ellipse
font_size_phone						xpath						.//*[@class='font-size-phone']
backButton                          css                         nav#hbpNavbar span.span-back
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
====================================================================================