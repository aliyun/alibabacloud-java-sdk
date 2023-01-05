// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateGlobalQuestionRequest extends TeaModel {
    @NameInMap("Answers")
    public String answers;

    @NameInMap("GlobalQuestionName")
    public String globalQuestionName;

    @NameInMap("GlobalQuestionType")
    public String globalQuestionType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Questions")
    public String questions;

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
