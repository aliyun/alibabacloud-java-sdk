// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListIntentsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The paginated list of intents.</p>
     */
    @NameInMap("Intents")
    public ListIntentsResponseBodyIntents intents;

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
        /**
         * <p>The time when the intent was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1578469042851</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the intent.</p>
         * 
         * <strong>example:</strong>
         * <p>同意还款意图</p>
         */
        @NameInMap("IntentDescription")
        public String intentDescription;

        /**
         * <p>The intent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a8494b35-eefb-4c8a-887b-b60d2f0fa57a</p>
         */
        @NameInMap("IntentId")
        public String intentId;

        /**
         * <p>The intent name.</p>
         * 
         * <strong>example:</strong>
         * <p>统一还款</p>
         */
        @NameInMap("IntentName")
        public String intentName;

        /**
         * <p>The keywords of the intent.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;还款&quot;]</p>
         */
        @NameInMap("Keywords")
        public String keywords;

        /**
         * <p>The script ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6ef95fd5-558f-4ee8-af34-b2ede087a87c</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <p>The time when the intent was last updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1578469042851</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The user utterances that trigger the intent.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ok&quot;,&quot;好的&quot;,&quot;好吧&quot;,&quot;好嘞&quot;,&quot;可以&quot;,&quot;行啊&quot;,&quot;行吧&quot;,&quot;那行&quot;,&quot;知道了&quot;,&quot;我看一下&quot;,&quot;能的&quot;,&quot;等会吧&quot;,&quot;等一下&quot;,&quot;马上还&quot;,&quot;等一会&quot;,&quot;过两天&quot;,&quot;我会想办法处理&quot;]</p>
         */
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
        /**
         * <p>The list of intents.</p>
         */
        @NameInMap("List")
        public java.util.List<ListIntentsResponseBodyIntentsList> list;

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
         * <p>The total number of intents.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
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
