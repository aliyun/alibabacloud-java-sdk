// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListGlobalQuestionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("GlobalQuestions")
    public ListGlobalQuestionsResponseBodyGlobalQuestions globalQuestions;

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

        /**
         * <strong>example:</strong>
         * <p>53c27755-d41e-46a6-bb3c-4f66f257d50c</p>
         */
        @NameInMap("GlobalQuestionId")
        public String globalQuestionId;

        @NameInMap("GlobalQuestionName")
        public String globalQuestionName;

        /**
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("GlobalQuestionType")
        public String globalQuestionType;

        @NameInMap("Questions")
        public String questions;

        /**
         * <strong>example:</strong>
         * <p>aa279896-64a6-4182-864c-4f2b04ec8d17</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
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
