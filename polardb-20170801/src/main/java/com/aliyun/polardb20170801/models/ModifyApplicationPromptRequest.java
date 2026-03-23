// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyApplicationPromptRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>papt-xx</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>papt-f9lajgw765f4fnrzn1</p>
     */
    @NameInMap("PromptId")
    public String promptId;

    /**
     * <strong>example:</strong>
     * <p>prompt name</p>
     */
    @NameInMap("PromptName")
    public String promptName;

    /**
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
