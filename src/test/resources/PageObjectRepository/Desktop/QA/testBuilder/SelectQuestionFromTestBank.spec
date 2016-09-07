page title:Harvard Business Publishing Test Builder

#Object Definitions
====================================================================================
discipline_dropdown                        css                                  .custom-select>select
build_New_Test_DDL                         xpath                                //select
discipline_field                           xpath                                //select//option[contains(@value,'${text}')]
test_Bank_List                             xpath                                //span[contains(@class,'row ai-center')]//span[contains(@class,'wide-caps')]
expanded_Test_Bank                         xpath                                //span[contains(@class,'fs-large mts')and contains(text(),'${text}')]/parent::span/preceding-sibling::span//span
question_List                              css                                  .row.mts
show_Details_Button_List                   css                                  .col.ai-center.mts>button
question_Count_On_TB_Title                 xpath                                //div[contains(@class,'phl pbm')]/preceding-sibling::div//div[contains(@class,'row spaced')]//div[@class='fs-smallest'and contains(text(),'${text}')]/preceding-sibling::div
question_Checkbox                          xpath                                (//div[contains(@class,'phl pbm')]//input)[${text}]
question_Selected_Label                    xpath                                //span[contains(.,'${text}')]
default_Selected_Question_Count            xpath                                //span[contains(.,'${text}')]/preceding-sibling::*
Selected_Test_Bank_Heading                 xpath                                //span[contains(@class,'fs-large mts')and contains(text(),'${Text}')]
details_Button                             xpath                                ( //div[contains(@class,'phl pbm')]//div[contains(@class,'row mts')])[${Text}]//button
no_Question_Message                        css                                  div[class='width-capped mtm']>.col.ai-center>div:first-child
test_Bank_Total_Questions                  xpath                                //div[contains(@class,'phl pbm')]/preceding-sibling::div//label[contains(@class,'col jc-center')]//input
chosen_Test_Bank                           xpath                                //div[contains(@class,'phl pbm')]/preceding-sibling::div//button//span[contains(@class,'fs-large mts')]
question_List_On_Test_Bank                 css                                .row.mts.bg-white 