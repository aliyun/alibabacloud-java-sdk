// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DataInterpretationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Data")
    public String data;

    @NameInMap("ModelCode")
    public String modelCode;

    @NameInMap("PromptForceOverride")
    public Boolean promptForceOverride;

    @NameInMap("UserPrompt")
    public String userPrompt;

    @NameInMap("UserQuestion")
    public String userQuestion;

    public static DataInterpretationRequest build(java.util.Map<String, ?> map) throws Exception {
        DataInterpretationRequest self = new DataInterpretationRequest();
        return TeaModel.build(map, self);
    }

    public DataInterpretationRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DataInterpretationRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public DataInterpretationRequest setPromptForceOverride(Boolean promptForceOverride) {
        this.promptForceOverride = promptForceOverride;
        return this;
    }
    public Boolean getPromptForceOverride() {
        return this.promptForceOverride;
    }

    public DataInterpretationRequest setUserPrompt(String userPrompt) {
        this.userPrompt = userPrompt;
        return this;
    }
    public String getUserPrompt() {
        return this.userPrompt;
    }

    public DataInterpretationRequest setUserQuestion(String userQuestion) {
        this.userQuestion = userQuestion;
        return this;
    }
    public String getUserQuestion() {
        return this.userQuestion;
    }

}
