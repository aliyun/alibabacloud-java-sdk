// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SubmitTodoRequest extends TeaModel {
    /**
     * <p>The answer array. The original text of the question must align with the to-do question.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("answers")
    public java.util.List<SubmitTodoRequestAnswers> answers;

    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The to-do task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The answer array. The original text of the question must align with the to-do question.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>todo_abc123</p>
     */
    @NameInMap("todoId")
    public String todoId;

    public static SubmitTodoRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTodoRequest self = new SubmitTodoRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTodoRequest setAnswers(java.util.List<SubmitTodoRequestAnswers> answers) {
        this.answers = answers;
        return this;
    }
    public java.util.List<SubmitTodoRequestAnswers> getAnswers() {
        return this.answers;
    }

    public SubmitTodoRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public SubmitTodoRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public SubmitTodoRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public SubmitTodoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SubmitTodoRequest setTodoId(String todoId) {
        this.todoId = todoId;
        return this;
    }
    public String getTodoId() {
        return this.todoId;
    }

    public static class SubmitTodoRequestAnswers extends TeaModel {
        /**
         * <p>The array of answer values.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("answer")
        public java.util.List<String> answer;

        /**
         * <p>The original text corresponding to questions[].question.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Whether to approve</p>
         */
        @NameInMap("question")
        public String question;

        public static SubmitTodoRequestAnswers build(java.util.Map<String, ?> map) throws Exception {
            SubmitTodoRequestAnswers self = new SubmitTodoRequestAnswers();
            return TeaModel.build(map, self);
        }

        public SubmitTodoRequestAnswers setAnswer(java.util.List<String> answer) {
            this.answer = answer;
            return this;
        }
        public java.util.List<String> getAnswer() {
            return this.answer;
        }

        public SubmitTodoRequestAnswers setQuestion(String question) {
            this.question = question;
            return this;
        }
        public String getQuestion() {
            return this.question;
        }

    }

}
