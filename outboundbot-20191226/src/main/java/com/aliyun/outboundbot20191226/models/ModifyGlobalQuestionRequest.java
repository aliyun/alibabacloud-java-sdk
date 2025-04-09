// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyGlobalQuestionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Answers")
    public String answers;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ad80de88-1661-445a-92ec-bf88dc45d581</p>
     */
    @NameInMap("GlobalQuestionId")
    public String globalQuestionId;

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
     * <p>8fa1953f-4a84-46d8-b80c-8ce9cf684fb3</p>
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
     * <p>19ac2375-53e3-477f-abe9-6cd334227981</p>
     */
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
