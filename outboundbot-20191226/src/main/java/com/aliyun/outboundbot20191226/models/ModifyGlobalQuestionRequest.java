// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyGlobalQuestionRequest extends TeaModel {
    /**
     * <p>A JSON string containing an array of answers.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;你好,我是你的专属客服顾问.&quot;]</p>
     */
    @NameInMap("Answers")
    public String answers;

    /**
     * <p>The unique ID of the global question.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ad80de88-1661-445a-92ec-bf88dc45d581</p>
     */
    @NameInMap("GlobalQuestionId")
    public String globalQuestionId;

    /**
     * <p>The global question name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>未识别全局问题</p>
     */
    @NameInMap("GlobalQuestionName")
    public String globalQuestionName;

    /**
     * <p>The global question type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>COMMON</p>
     */
    @NameInMap("GlobalQuestionType")
    public String globalQuestionType;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e5035654-1745-484a-8c5b-165f7c7bcd79</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>A JSON string containing an array of questions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;你是谁&quot;,&quot;你叫什么&quot;]</p>
     */
    @NameInMap("Questions")
    public String questions;

    /**
     * <p>The script ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0fe7f71c-8771-42ef-9bb1-19aa16ae7120</p>
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
