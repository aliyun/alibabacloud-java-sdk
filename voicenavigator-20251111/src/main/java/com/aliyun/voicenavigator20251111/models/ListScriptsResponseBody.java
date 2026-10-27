// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListScriptsResponseBody extends TeaModel {
    /**
     * <p>The internal error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The paginated result of the scenario list.</p>
     */
    @NameInMap("Data")
    public ListScriptsResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance af81a389-91f0-4157-8d82-720edd02b66a
     *  does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of dynamic error parameters.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BA092E9B-3421-5862-BC75-E646B7587531</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListScriptsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScriptsResponseBody self = new ListScriptsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScriptsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListScriptsResponseBody setData(ListScriptsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListScriptsResponseBodyData getData() {
        return this.data;
    }

    public ListScriptsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListScriptsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListScriptsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListScriptsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListScriptsResponseBodyDataScripts extends TeaModel {
        /**
         * <p>The concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Concurrency")
        public Integer concurrency;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1773228988000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Used for testing</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The draft version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>efbafa38-336d-4eb0-865e-c16c97a91773</p>
         */
        @NameInMap("DraftVersionId")
        public String draftVersionId;

        /**
         * <p>The scenario name.</p>
         * 
         * <strong>example:</strong>
         * <p>Navigation test scenario</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The NLU invocation method.</p>
         * 
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("NluAccessType")
        public String nluAccessType;

        /**
         * <p>The NLU engine.</p>
         * 
         * <strong>example:</strong>
         * <p>BEEBOT</p>
         */
        @NameInMap("NluEngine")
        public String nluEngine;

        /**
         * <p>The number.</p>
         * 
         * <strong>example:</strong>
         * <p>13816111993</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <p>The published version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>efbafa38-336d-4eb0-865e-c16c97a91774</p>
         */
        @NameInMap("PublishedVersionId")
        public String publishedVersionId;

        /**
         * <p>The scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>efbafa38-336d-4eb0-865e-c16c97a91772</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>DRAFT</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1773228988000</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static ListScriptsResponseBodyDataScripts build(java.util.Map<String, ?> map) throws Exception {
            ListScriptsResponseBodyDataScripts self = new ListScriptsResponseBodyDataScripts();
            return TeaModel.build(map, self);
        }

        public ListScriptsResponseBodyDataScripts setConcurrency(Integer concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Integer getConcurrency() {
            return this.concurrency;
        }

        public ListScriptsResponseBodyDataScripts setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public ListScriptsResponseBodyDataScripts setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListScriptsResponseBodyDataScripts setDraftVersionId(String draftVersionId) {
            this.draftVersionId = draftVersionId;
            return this;
        }
        public String getDraftVersionId() {
            return this.draftVersionId;
        }

        public ListScriptsResponseBodyDataScripts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListScriptsResponseBodyDataScripts setNluAccessType(String nluAccessType) {
            this.nluAccessType = nluAccessType;
            return this;
        }
        public String getNluAccessType() {
            return this.nluAccessType;
        }

        public ListScriptsResponseBodyDataScripts setNluEngine(String nluEngine) {
            this.nluEngine = nluEngine;
            return this;
        }
        public String getNluEngine() {
            return this.nluEngine;
        }

        public ListScriptsResponseBodyDataScripts setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListScriptsResponseBodyDataScripts setPublishedVersionId(String publishedVersionId) {
            this.publishedVersionId = publishedVersionId;
            return this;
        }
        public String getPublishedVersionId() {
            return this.publishedVersionId;
        }

        public ListScriptsResponseBodyDataScripts setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public ListScriptsResponseBodyDataScripts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListScriptsResponseBodyDataScripts setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

    public static class ListScriptsResponseBodyData extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The list of scenarios.</p>
         */
        @NameInMap("Scripts")
        public java.util.List<ListScriptsResponseBodyDataScripts> scripts;

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListScriptsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListScriptsResponseBodyData self = new ListScriptsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListScriptsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListScriptsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListScriptsResponseBodyData setScripts(java.util.List<ListScriptsResponseBodyDataScripts> scripts) {
            this.scripts = scripts;
            return this;
        }
        public java.util.List<ListScriptsResponseBodyDataScripts> getScripts() {
            return this.scripts;
        }

        public ListScriptsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
