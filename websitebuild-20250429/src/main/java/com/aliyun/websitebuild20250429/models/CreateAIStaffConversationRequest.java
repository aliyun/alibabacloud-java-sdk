// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAIStaffConversationRequest extends TeaModel {
    @NameInMap("Text")
    public String text;

    public static CreateAIStaffConversationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAIStaffConversationRequest self = new CreateAIStaffConversationRequest();
        return TeaModel.build(map, self);
    }

    public CreateAIStaffConversationRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
