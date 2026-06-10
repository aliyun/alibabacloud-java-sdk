// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateGlobalQuestionRequest extends TeaModel {
    /**
     * <p>The answers to the global question.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;你好,您可以再说一遍吗&quot;,&quot;不好意思我刚才没有听清&quot;]</p>
     */
    @NameInMap("Answers")
    public String answers;

    /**
     * <p>The name of the global question.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>未识别全局问题</p>
     */
    @NameInMap("GlobalQuestionName")
    public String globalQuestionName;

    /**
     * <p>The type of the global question.</p>
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
     * <p>361c8a53-0e29-42f3-8aa7-c7752d010399</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The questions that trigger the global question.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;未识别的用户问题&quot;]</p>
     */
    @NameInMap("Questions")
    public String questions;

    /**
     * <p>The script ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c5c5d8c0-c0f1-48a7-be2b-dc46006d888a</p>
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
