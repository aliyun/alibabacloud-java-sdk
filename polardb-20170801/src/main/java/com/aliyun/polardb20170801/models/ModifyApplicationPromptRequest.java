// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyApplicationPromptRequest extends TeaModel {
    /**
     * <p>The application ID. Usage note: Only applications of the mem0 type support prompt operations. You can verify this by checking the ApplicationType field by calling DescribeApplicationAttribute.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The prompt ID. The value is an identifier that starts with papt-.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>papt-f9lajgw765f4fnrzn1</p>
     */
    @NameInMap("PromptId")
    public String promptId;

    /**
     * <p>The prompt name.</p>
     * 
     * <strong>example:</strong>
     * <p>prompt name</p>
     */
    @NameInMap("PromptName")
    public String promptName;

    /**
     * <p>The prompt content.</p>
     * 
     * <strong>example:</strong>
     * <p>prompt value</p>
     */
    @NameInMap("PromptValue")
    public String promptValue;

    public static ModifyApplicationPromptRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationPromptRequest self = new ModifyApplicationPromptRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationPromptRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ModifyApplicationPromptRequest setPromptId(String promptId) {
        this.promptId = promptId;
        return this;
    }
    public String getPromptId() {
        return this.promptId;
    }

    public ModifyApplicationPromptRequest setPromptName(String promptName) {
        this.promptName = promptName;
        return this;
    }
    public String getPromptName() {
        return this.promptName;
    }

    public ModifyApplicationPromptRequest setPromptValue(String promptValue) {
        this.promptValue = promptValue;
        return this;
    }
    public String getPromptValue() {
        return this.promptValue;
    }

}
