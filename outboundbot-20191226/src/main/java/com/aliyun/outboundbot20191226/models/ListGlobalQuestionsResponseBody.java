// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListGlobalQuestionsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The global question data.</p>
     */
    @NameInMap("GlobalQuestions")
    public ListGlobalQuestionsResponseBodyGlobalQuestions globalQuestions;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
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
        /**
         * <p>The replies to the global question.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;你好,您可以再说一遍吗&quot;,&quot;不好意思我刚才没有听清&quot;]</p>
         */
        @NameInMap("Answers")
        public String answers;

        /**
         * <p>The global question ID.</p>
         * 
         * <strong>example:</strong>
         * <p>53c27755-d41e-46a6-bb3c-4f66f257d50c</p>
         */
        @NameInMap("GlobalQuestionId")
        public String globalQuestionId;

        /**
         * <p>The name of the global question.</p>
         * 
         * <strong>example:</strong>
         * <p>未识别</p>
         */
        @NameInMap("GlobalQuestionName")
        public String globalQuestionName;

        /**
         * <p>The type of the global question.</p>
         * <ul>
         * <li><p>SYSTEM: System-defined</p>
         * </li>
         * <li><p>COMMON: General</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("GlobalQuestionType")
        public String globalQuestionType;

        /**
         * <p>The list of global questions.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;测试问题1&quot;,&quot;测试问题2&quot;]</p>
         */
        @NameInMap("Questions")
        public String questions;

        /**
         * <p>The scenario ID.</p>
         * 
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
        /**
         * <p>The array of global questions.</p>
         */
        @NameInMap("List")
        public java.util.List<ListGlobalQuestionsResponseBodyGlobalQuestionsList> list;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
