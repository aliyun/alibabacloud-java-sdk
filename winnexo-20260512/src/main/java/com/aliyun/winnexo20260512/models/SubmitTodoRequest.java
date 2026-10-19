// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SubmitTodoRequest extends TeaModel {
    /**
     * <p>作答数组（question 原文须与待办问题对齐）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("answers")
    public java.util.List<SubmitTodoRequestAnswers> answers;

    /**
     * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>待办ID</p>
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
         * <p>作答值数组</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("answer")
        public java.util.List<String> answer;

        /**
         * <p>对应 questions[].question 原文</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>是否通过审批</p>
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
