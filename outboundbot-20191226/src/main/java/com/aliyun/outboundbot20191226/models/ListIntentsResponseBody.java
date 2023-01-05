// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListIntentsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Intents")
    public ListIntentsResponseBodyIntents intents;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListIntentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIntentsResponseBody self = new ListIntentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIntentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIntentsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListIntentsResponseBody setIntents(ListIntentsResponseBodyIntents intents) {
        this.intents = intents;
        return this;
    }
    public ListIntentsResponseBodyIntents getIntents() {
        return this.intents;
    }

    public ListIntentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIntentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIntentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListIntentsResponseBodyIntentsList extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("IntentDescription")
        public String intentDescription;

        @NameInMap("IntentId")
        public String intentId;

        @NameInMap("IntentName")
        public String intentName;

        @NameInMap("Keywords")
        public String keywords;

        @NameInMap("ScriptId")
        public String scriptId;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("Utterances")
        public String utterances;

        public static ListIntentsResponseBodyIntentsList build(java.util.Map<String, ?> map) throws Exception {
            ListIntentsResponseBodyIntentsList self = new ListIntentsResponseBodyIntentsList();
            return TeaModel.build(map, self);
        }

        public ListIntentsResponseBodyIntentsList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListIntentsResponseBodyIntentsList setIntentDescription(String intentDescription) {
            this.intentDescription = intentDescription;
            return this;
        }
        public String getIntentDescription() {
            return this.intentDescription;
        }

        public ListIntentsResponseBodyIntentsList setIntentId(String intentId) {
            this.intentId = intentId;
            return this;
        }
        public String getIntentId() {
            return this.intentId;
        }

        public ListIntentsResponseBodyIntentsList setIntentName(String intentName) {
            this.intentName = intentName;
            return this;
        }
        public String getIntentName() {
            return this.intentName;
        }

        public ListIntentsResponseBodyIntentsList setKeywords(String keywords) {
            this.keywords = keywords;
            return this;
        }
        public String getKeywords() {
            return this.keywords;
        }

        public ListIntentsResponseBodyIntentsList setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public ListIntentsResponseBodyIntentsList setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListIntentsResponseBodyIntentsList setUtterances(String utterances) {
            this.utterances = utterances;
            return this;
        }
        public String getUtterances() {
            return this.utterances;
        }

    }

    public static class ListIntentsResponseBodyIntents extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListIntentsResponseBodyIntentsList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListIntentsResponseBodyIntents build(java.util.Map<String, ?> map) throws Exception {
            ListIntentsResponseBodyIntents self = new ListIntentsResponseBodyIntents();
            return TeaModel.build(map, self);
        }

        public ListIntentsResponseBodyIntents setList(java.util.List<ListIntentsResponseBodyIntentsList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListIntentsResponseBodyIntentsList> getList() {
            return this.list;
        }

        public ListIntentsResponseBodyIntents setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListIntentsResponseBodyIntents setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListIntentsResponseBodyIntents setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
