// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeGlobalQuestionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("GlobalQuestion")
    public DescribeGlobalQuestionResponseBodyGlobalQuestion globalQuestion;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
        @NameInMap("Answers")
        public String answers;

        /**
         * <strong>example:</strong>
         * <p>f160ec2e-94f2-4c03-87be-ece5b52d5dd9</p>
         */
        @NameInMap("GlobalQuestionId")
        public String globalQuestionId;

        @NameInMap("GlobalQuestionName")
        public String globalQuestionName;

        /**
         * <strong>example:</strong>
         * <p>COMMON</p>
         */
        @NameInMap("GlobalQuestionType")
        public String globalQuestionType;

        @NameInMap("Questions")
        public String questions;

        /**
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
