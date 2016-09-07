page title:Harvard Business Publishing Test Builder

#Object Definitions
====================================================================================

search_Page_Question_List                     xpath                              //div[contains(@class,'width-capped page-content')]//div[@class='mtm']
edit_Form_Row1                                css                                .row.spaced.mts
create_Test_Bank_Button                       css                                .flex-none.col.ai-end .button
edit_Page_Heading                             css                                .wide-caps.mbs
text_Under_Heading                            xpath                              //div[contains(@class,'col ai-center')and contains(.,'add, edit')]
form_Field_Heading                            xpath                              (//div[contains(@class,'fs-smallest wide-caps bold')])[${text}]
form_Input_Fields                             xpath                              (//div[contains(@class,'row')]//input)[${text}]
buttons_On_Edit_Page                          xpath                               //button[contains(.,'${text}')]
link_Navigation_With_Text                     xpath                              //a[contains(.,'${text}')]
build_New_Test_DDL                            xpath                              //select
discipline_List                               xpath                              //select//option