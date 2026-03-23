// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteApplicationPromptRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>papt-f9lajgw765f4fnrzn1</p>
     */
    @NameInMap("PromptId")
    public String promptId;

    public static DeleteApplicationPromptRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationPromptRequest self = new DeleteApplicationPromptRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationPromptRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DeleteApplicationPromptRequest setPromptId(String promptId) {
        this.promptId = promptId;
        return this;
    }
    public String getPromptId() {
        return this.promptId;
    }

}
