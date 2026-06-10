// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SaveAppRequirementRequest extends TeaModel {
    /**
     * <p>Session ID</p>
     * 
     * <strong>example:</strong>
     * <p>5b7105a2-2999-430b-ba23-ba09149d5434</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>Requirement document content</p>
     * 
     * <strong>example:</strong>
     * <p>prd</p>
     */
    @NameInMap("Prd")
    public String prd;

    public static SaveAppRequirementRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveAppRequirementRequest self = new SaveAppRequirementRequest();
        return TeaModel.build(map, self);
    }

    public SaveAppRequirementRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public SaveAppRequirementRequest setPrd(String prd) {
        this.prd = prd;
        return this;
    }
    public String getPrd() {
        return this.prd;
    }

}
