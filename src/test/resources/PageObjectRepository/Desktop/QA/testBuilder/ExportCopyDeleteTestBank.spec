page title:Harvard Business Publishing Test Builder

#Object Definitions
====================================================================================
export_Button                                 xpath                               //div[contains(@class,'fs-large link')and contains(.,'${text}') ]/parent::a//following-sibling::button[contains(text(),'Export')]
duplicate_Button                              xpath                               //div[contains(@class,'fs-large link')and contains(.,'${text}') ]/parent::a//following-sibling::button[@title='Duplicate']
copied_Test_Bank                              xpath                               (//div[contains(@class,'fs-large link')])[last()]
delete_Button                                 xpath                               //div[contains(@class,'fs-large link')and contains(.,'${text}') ]/parent::a//following-sibling::button[@title='Delete']
cancel_Button_On_Dilogue                      xpath                               //button[contains(@class,'link wide-caps fs-smallest')]