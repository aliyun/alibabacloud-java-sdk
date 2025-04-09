// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateGlobalQuestionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Answers")
    public String answers;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GlobalQuestionName")
    public String globalQuestionName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>COMMON</p>
     */
    @NameInMap("GlobalQuestionType")
    public String globalQuestionType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>174952ab-9825-4cc9-a5e2-de82d7fa4cdd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Questions")
    public String questions;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>36fea72b-d6fa-4974-ace7-19ffe3f622fb</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static CreateGlobalQuestionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalQuestionRequest self = new CreateGlobalQuestionRequest();
        return TeaModel.build(map, self);
    }

    public CreateGlobalQuestionRequest setAnswers(String answers) {
        this.answers = answers;
        return this;
    }
    public String getAnswers() {
        return this.answers;
    }

    public CreateGlobalQuestionRequest setGlobalQuestionName(String globalQuestionName) {
        this.globalQuestionName = globalQuestionName;
        return this;
    }
    public String getGlobalQuestionName() {
        return this.globalQuestionName;
    }

    public CreateGlobalQuestionRequest setGlobalQuestionType(String globalQuestionType) {
        this.globalQuestionType = globalQuestionType;
        return this;
    }
    public String getGlobalQuestionType() {
        return this.globalQuestionType;
    }

    public CreateGlobalQuestionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateGlobalQuestionRequest setQuestions(String questions) {
        this.questions = questions;
        return this;
    }
    public String getQuestions() {
        return this.questions;
    }

    public CreateGlobalQuestionRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
