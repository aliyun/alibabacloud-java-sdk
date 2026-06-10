// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeGlobalQuestionResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the global question.</p>
     */
    @NameInMap("GlobalQuestion")
    public DescribeGlobalQuestionResponseBodyGlobalQuestion globalQuestion;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeGlobalQuestionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalQuestionResponseBody self = new DescribeGlobalQuestionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalQuestionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGlobalQuestionResponseBody setGlobalQuestion(DescribeGlobalQuestionResponseBodyGlobalQuestion globalQuestion) {
        this.globalQuestion = globalQuestion;
        return this;
    }
    public DescribeGlobalQuestionResponseBodyGlobalQuestion getGlobalQuestion() {
        return this.globalQuestion;
    }

    public DescribeGlobalQuestionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeGlobalQuestionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGlobalQuestionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGlobalQuestionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeGlobalQuestionResponseBodyGlobalQuestion extends TeaModel {
        /**
         * <p>The answers to the global question.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;你好,我是你的专属客服顾问.&quot;]</p>
         */
        @NameInMap("Answers")
        public String answers;

        /**
         * <p>The ID of the global question.</p>
         * 
         * <strong>example:</strong>
         * <p>f160ec2e-94f2-4c03-87be-ece5b52d5dd9</p>
         */
        @NameInMap("GlobalQuestionId")
        public String globalQuestionId;

        /**
         * <p>The name of the global question.</p>
         * 
         * <strong>example:</strong>
         * <p>你是谁-全局问题</p>
         */
        @NameInMap("GlobalQuestionName")
        public String globalQuestionName;

        /**
         * <p>The type of the global question.</p>
         * 
         * <strong>example:</strong>
         * <p>COMMON</p>
         */
        @NameInMap("GlobalQuestionType")
        public String globalQuestionType;

        /**
         * <p>The questions mapped to this global question.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;你是谁&quot;,&quot;你叫什么&quot;]</p>
         */
        @NameInMap("Questions")
        public String questions;

        /**
         * <p>The ID of the script.</p>
         * 
         * <strong>example:</strong>
         * <p>290e06a5-6de2-4cc8-8a9c-72b7c152256c</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        public static DescribeGlobalQuestionResponseBodyGlobalQuestion build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalQuestionResponseBodyGlobalQuestion self = new DescribeGlobalQuestionResponseBodyGlobalQuestion();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalQuestionResponseBodyGlobalQuestion setAnswers(String answers) {
            this.answers = answers;
            return this;
        }
        public String getAnswers() {
            return this.answers;
        }

        public DescribeGlobalQuestionResponseBodyGlobalQuestion setGlobalQuestionId(String globalQuestionId) {
            this.globalQuestionId = globalQuestionId;
            return this;
        }
        public String getGlobalQuestionId() {
            return this.globalQuestionId;
        }

        public DescribeGlobalQuestionResponseBodyGlobalQuestion setGlobalQuestionName(String globalQuestionName) {
            this.globalQuestionName = globalQuestionName;
            return this;
        }
        public String getGlobalQuestionName() {
            return this.globalQuestionName;
        }

        public DescribeGlobalQuestionResponseBodyGlobalQuestion setGlobalQuestionType(String globalQuestionType) {
            this.globalQuestionType = globalQuestionType;
            return this;
        }
        public String getGlobalQuestionType() {
            return this.globalQuestionType;
        }

        public DescribeGlobalQuestionResponseBodyGlobalQuestion setQuestions(String questions) {
            this.questions = questions;
            return this;
        }
        public String getQuestions() {
            return this.questions;
        }

        public DescribeGlobalQuestionResponseBodyGlobalQuestion setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

    }

}
