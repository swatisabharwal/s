#Object Definitions
====================================================================================
spinner								xpath						.//*[@class='fl spinner1']
toc_icon							xpath						//ul[@class='menu-a navbar-menu']//span[@class='hbp-icon hbp-icon-toc']
exhibit1_link						xpath						//div[contains(@class,'sidebar-toc')]//span[contains(text(),'Exhibit 1 Projected Market Volumes')]
exhibit_iframe						id							chapter_2
exhibit1_text						xpath						.//word[contains(text(),'Exhibit ')]
right_chevron_icon					xpath						.//*[@class='next hbp-next arrows-wrapper']
current_page						css 					    .js-current-page
body_element                        xpath                       //body
top_Nav_Bar                         xpath                       //nav//div[contains(@class,'navbar-wrapper')]
toc_flyout_popUp_mobile             css                         div.sidebar  div[class^='sidebar-toc']
toc_flyout_popUp_desktop            css                         div[class^='popover']
current_page_number                 css                         footer div.pages span[class*='current']
toc_topic_to_nav_desktop            xpath                       //div[@class='popover-wrapper']//span[text()='${text}']
toc_topic_to_nav_mobile             xpath                       //div[contains(@class,'sidebar-toc')]//span[text()='${text}']
nece_background_heading             xpath                       //h1[contains(@class,'hbp_reader__heading2')]
marketing_the_tronn_heading         xpath                       //h1[contains(@class,'hbp_reader__heading3')]
pageNum_Topic_In_TOC_desktop        xpath                       //div[@class='popover-wrapper']//span[text()='${text}']/following-sibling::span
pageNum_Topic_In_TOC_mobile         xpath                       //div[contains(@class,'sidebar-toc')]//span[text()='${text}']/following-sibling::span
footnote_link                       xpath                       //word[text()='[${text}]']
span_link_Of_footnote               xpath                       //word[text()='[${text}]']/ancestor::span[@class='fn-marker']
exhibit_to_Click                    css                         div[id*='exh00${text}']>div[class='figure']
enlarged_exhibit_modal_popup        css                         div#linearContentModal div.modal-content
copyright                           xpath                       //div[@class='popover-wrapper']//ul[@class='toc-menu']//span[text()='Copyright']/ancestor::li
necessary_background                xpath                       //div[@class='popover-wrapper']//ul[@class='toc-menu']//span[text()='II. The Necessary Background']/ancestor::li
salient_pricing_information         xpath                       //div[@class='popover-wrapper']//ul[@class='toc-menu']//span[text()='Exhibit 3 Salient Pricing Information']/ancestor::li
copyright_mobile                    xpath                       //div[contains(@class,'sidebar-toc')]//ul[@class='toc-menu']//span[text()='Copyright']/ancestor::li
list_toc_menu                       css                         div[class^='popover-wrapper'] ul.toc-menu  
list_toc_menu_mobile                css                         div[class^='sidebar-toc'] ul.toc-menu
parent_topics_in_TOC_desktop        xpath                       //div[@class='popover-wrapper']//li[@class='chapter-wrapper']
parent_topics_in_TOC_mobile         xpath                       //div[contains(@class,'sidebar-toc')]//li[@class='chapter-wrapper']
toc_items_desktop                   css                         div[class^='popover-wrapper'] ul.toc-menu li
====================================================================================

@objects
--------------------------------
copyright
      inside: list_toc_menu 14px left
necessary_background
      inside: list_toc_menu 14px left
salient_pricing_information
      inside: list_toc_menu 28px left

    