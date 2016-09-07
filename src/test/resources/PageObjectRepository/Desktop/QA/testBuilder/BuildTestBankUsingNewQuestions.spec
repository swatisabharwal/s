page title:Harvard Business Publishing Test Builder

#Object Definitions
====================================================================================
created_Test_List                                  css                                .mtm .row.ai-center  
page_Heading                                       css                                .wide-caps.mbs
testBank_Heading                                   xpath                              //div[contains(@class,'fs-large link')and contains(.,'${text}') ]
button_On_Edit_Page                                xpath                              //a[@class='button'and contains(.,'${text}')]  
edit_Page_Heading                                  css                                .wide-caps.mbs
select_Question_Type_DDL                           xpath                              //option/parent::select
question_Field_Label                               xpath                              //div[@class='ProseMirror-content']/parent::div/parent::div/preceding-sibling::div//span
answer_Field                                       xpath                              //div[contains(@class,'row mts')]
optional_Answer_Field                              xpath                              //textarea[@id='${text}']
cancel_Link                                        xpath                              //a[contains(text(),'Cancel')]
question_Type_Option                               xpath                              //select//option[contains(text(),'${text}')]
question_Field                                     xpath                              //div[@class='ProseMirror-content']//p
question_Field_Normal_Text                         xpath                              //div[@class='ProseMirror-content']//p//code
bold_Label                                         xpath                              //div[contains(@title,'Toggle strong')]
bold_Text_In_The_Field                             xpath                              //div[@class='ProseMirror-content']//p//Strong
insert_Label                                       xpath                              //div[contains(text(),'Insert')]
image_Option_Within_Insert                         xpath                              //div[contains(@title,'Insert image')]
insertImageForm                                    xpath                              (//form//div/input)[${text}]
image_In_Field                                     xpath                              (//p//img)[last()]
question_Field_After_JS                            css                                .ProseMirror-content p
answer_Field_text_Field                            xpath                              (//div[contains(@class,'row mts')]//input[contains(@class,'text-field')])[${text}]
answer_Field_List                                  xpath                              (//div[contains(@class,'row mts')]//input[contains(@class,'text-field')])
remove_Answer_Field_Button                         xpath                              (//div[contains(@class,'row mts')]//button[(contains(@aria-label,'Delete'))])[last()]
add_Answer_Field_Button                            xpath                              (//div[contains(@class,'row mts')])[last()]//button[1]
radio_Input_For_Answer_Field                       xpath                              (//div[contains(@class,'row mts')]//input[@type='radio'])[${text}]
save_And_Done_Button                               xpath                              //button[contains(text(),'Save & Done')]