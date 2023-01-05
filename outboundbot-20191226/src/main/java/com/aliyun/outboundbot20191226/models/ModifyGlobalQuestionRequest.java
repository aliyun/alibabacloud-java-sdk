// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyGlobalQuestionRequest extends TeaModel {
    @NameInMap("Answers")
    public String answers;

    @NameInMap("GlobalQuestionId")
    public String globalQuestionId;

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

    public static ModifyGlobalQuestionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalQuestionRequest self = new ModifyGlobalQuestionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalQuestionRequest setAnswers(String answers) {
        this.answers = answers;
        return this;
    }
    public String getAnswers() {
        return this.answers;
    }

    public ModifyGlobalQuestionRequest setGlobalQuestionId(String globalQuestionId) {
        this.globalQuestionId = globalQuestionId;
        return this;
    }
    public String getGlobalQuestionId() {
        return this.globalQuestionId;
    }

    public ModifyGlobalQuestionRequest setGlobalQuestionName(String globalQuestionName) {
        this.globalQuestionName = globalQuestionName;
        return this;
    }
    public String getGlobalQuestionName() {
        return this.globalQuestionName;
    }

    public ModifyGlobalQuestionRequest setGlobalQuestionType(String globalQuestionType) {
        this.globalQuestionType = globalQuestionType;
        return this;
    }
    public String getGlobalQuestionType() {
        return this.globalQuestionType;
    }

    public ModifyGlobalQuestionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyGlobalQuestionRequest setQuestions(String questions) {
        this.questions = questions;
        return this;
    }
    public String getQuestions() {
        return this.questions;
    }

    public ModifyGlobalQuestionRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
