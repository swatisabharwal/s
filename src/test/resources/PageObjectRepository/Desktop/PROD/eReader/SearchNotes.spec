page title: Harvard Business Publishing Reader

#Object Definitions
====================================================================================
next_arrow							xpath						.//*[@class='next hbp-next arrows-wrapper']
next_arrow_span                     xpath                       .//*[@class='next hbp-next arrows-wrapper']/span
annotations_list					xpath						//div[not(@style = 'display: none;') and contains(@class,'annotation-card')]
yellow_filter						xpath						.//div[@style='background-color: #FFEEAC']
pink_filter							xpath						.//div[@style='background-color: #FFCAD6']
blue_filter							xpath						.//div[@style='background-color: #CAF1FF']
green_filter						xpath						.//div[@style='background-color: #CFF6C7']
search_result						xpath						//div[not(@style = 'display: none;') and contains(@class,'annotation-card')]//span[@class='result']
filter_label                        xpath                       .//div[@class='label-container js-label-container']
notes_list                          css                         span[class='quote']
page_nums_Notes_Pane                css                         div[class*='sidebar-notes'] span.js-bind-pageNumber
annotate_text_In_Highlighted_card   css                         div[class='annotation-card highlight-card'] span.quote
particular_note_Card                xpath                       //span[contains(text(),'${text}')]/ancestor::div[contains(@class,'annotation-card')]
cross_icon                          css                         div[class*='sidebar-notes'] span[class='hbp-icon hbp-icon-close']
search_message_pTag                 css                         div[class*='sidebar-notes'] div.search-message>p
note_cards_in_notes_pane            css                         div[class^='annotation-card']
search_notes_Input                  css                         #searchNotesInput
annotation_cards                    xpath                       //div[contains(@class,'annotation-card')]
particluar_card_bgcolor_element     xpath                       (//div[contains(@class,'annotation-card')])[${text}]//p
particular_frame_element            xpath                       //iframe[@id='chapter_${text}']
note_cards_parenets                 xpath                       //div[contains(@class,'annotations-wrapper ')]//div[contains(@class,'annotation-card')]/parent::div
highlighted_cards                   xpath                       //div[contains(@class,'annotation-card highlight-card')]
====================================================================================