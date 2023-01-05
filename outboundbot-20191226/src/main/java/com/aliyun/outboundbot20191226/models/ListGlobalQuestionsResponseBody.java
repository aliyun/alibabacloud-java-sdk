// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListGlobalQuestionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("GlobalQuestions")
    public ListGlobalQuestionsResponseBodyGlobalQuestions globalQuestions;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListGlobalQuestionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGlobalQuestionsResponseBody self = new ListGlobalQuestionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGlobalQuestionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGlobalQuestionsResponseBody setGlobalQuestions(ListGlobalQuestionsResponseBodyGlobalQuestions globalQuestions) {
        this.globalQuestions = globalQuestions;
        return this;
    }
    public ListGlobalQuestionsResponseBodyGlobalQuestions getGlobalQuestions() {
        return this.globalQuestions;
    }

    public ListGlobalQuestionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListGlobalQuestionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGlobalQuestionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGlobalQuestionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListGlobalQuestionsResponseBodyGlobalQuestionsList extends TeaModel {
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

        public static ListGlobalQuestionsResponseBodyGlobalQuestionsList build(java.util.Map<String, ?> map) throws Exception {
            ListGlobalQuestionsResponseBodyGlobalQuestionsList self = new ListGlobalQuestionsResponseBodyGlobalQuestionsList();
            return TeaModel.build(map, self);
        }

        public ListGlobalQuestionsResponseBodyGlobalQuestionsList setAnswers(String answers) {
            this.answers = answers;
            return this;
        }
        public String getAnswers() {
            return this.answers;
        }

        public ListGlobalQuestionsResponseBodyGlobalQuestionsList setGlobalQuestionId(String globalQuestionId) {
            this.globalQuestionId = globalQuestionId;
            return this;
        }
        public String getGlobalQuestionId() {
            return this.globalQuestionId;
        }

        public ListGlobalQuestionsResponseBodyGlobalQuestionsList setGlobalQuestionName(String globalQuestionName) {
            this.globalQuestionName = globalQuestionName;
            return this;
        }
        public String getGlobalQuestionName() {
            return this.globalQuestionName;
        }

        public ListGlobalQuestionsResponseBodyGlobalQuestionsList setGlobalQuestionType(String globalQuestionType) {
            this.globalQuestionType = globalQuestionType;
            return this;
        }
        public String getGlobalQuestionType() {
            return this.globalQuestionType;
        }

        public ListGlobalQuestionsResponseBodyGlobalQuestionsList setQuestions(String questions) {
            this.questions = questions;
            return this;
        }
        public String getQuestions() {
            return this.questions;
        }

        public ListGlobalQuestionsResponseBodyGlobalQuestionsList setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

    }

    public static class ListGlobalQuestionsResponseBodyGlobalQuestions extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListGlobalQuestionsResponseBodyGlobalQuestionsList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListGlobalQuestionsResponseBodyGlobalQuestions build(java.util.Map<String, ?> map) throws Exception {
            ListGlobalQuestionsResponseBodyGlobalQuestions self = new ListGlobalQuestionsResponseBodyGlobalQuestions();
            return TeaModel.build(map, self);
        }

        public ListGlobalQuestionsResponseBodyGlobalQuestions setList(java.util.List<ListGlobalQuestionsResponseBodyGlobalQuestionsList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListGlobalQuestionsResponseBodyGlobalQuestionsList> getList() {
            return this.list;
        }

        public ListGlobalQuestionsResponseBodyGlobalQuestions setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListGlobalQuestionsResponseBodyGlobalQuestions setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGlobalQuestionsResponseBodyGlobalQuestions setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
