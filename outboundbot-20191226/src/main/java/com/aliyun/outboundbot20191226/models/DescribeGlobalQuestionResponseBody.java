// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeGlobalQuestionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("GlobalQuestion")
    public DescribeGlobalQuestionResponseBodyGlobalQuestion globalQuestion;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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

        @NameInMap("GlobalQuestionId")
        public String globalQuestionId;

        @NameInMap("GlobalQuestionName")
        public String globalQuestionName;

        @NameInMap("GlobalQuestionType")
        public String globalQuestionType;

        @NameInMap("Questions")
        public String questions;

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
