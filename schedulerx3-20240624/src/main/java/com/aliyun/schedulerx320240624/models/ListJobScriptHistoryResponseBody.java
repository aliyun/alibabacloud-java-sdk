// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListJobScriptHistoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public ListJobScriptHistoryResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>not support query script history, please upgrade engine version to 2.2.2+</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>5EF879D0-3B43-5AD1-9BF7-52418F9C5E73</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListJobScriptHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobScriptHistoryResponseBody self = new ListJobScriptHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobScriptHistoryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListJobScriptHistoryResponseBody setData(ListJobScriptHistoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListJobScriptHistoryResponseBodyData getData() {
        return this.data;
    }

    public ListJobScriptHistoryResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListJobScriptHistoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListJobScriptHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobScriptHistoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListJobScriptHistoryResponseBodyDataRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-06-29 15:56:36</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1963096506470832</p>
         */
        @NameInMap("Creator")
        public String creator;

        @NameInMap("ScriptContent")
        public String scriptContent;

        /**
         * <strong>example:</strong>
         * <p>init version</p>
         */
        @NameInMap("VersionDescription")
        public String versionDescription;

        public static ListJobScriptHistoryResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListJobScriptHistoryResponseBodyDataRecords self = new ListJobScriptHistoryResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListJobScriptHistoryResponseBodyDataRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListJobScriptHistoryResponseBodyDataRecords setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListJobScriptHistoryResponseBodyDataRecords setScriptContent(String scriptContent) {
            this.scriptContent = scriptContent;
            return this;
        }
        public String getScriptContent() {
            return this.scriptContent;
        }

        public ListJobScriptHistoryResponseBodyDataRecords setVersionDescription(String versionDescription) {
            this.versionDescription = versionDescription;
            return this;
        }
        public String getVersionDescription() {
            return this.versionDescription;
        }

    }

    public static class ListJobScriptHistoryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>eCKqVlS5FKF5EWGGOo8EgQ==</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Records")
        public java.util.List<ListJobScriptHistoryResponseBodyDataRecords> records;

        /**
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("Total")
        public String total;

        public static ListJobScriptHistoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListJobScriptHistoryResponseBodyData self = new ListJobScriptHistoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListJobScriptHistoryResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListJobScriptHistoryResponseBodyData setRecords(java.util.List<ListJobScriptHistoryResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListJobScriptHistoryResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListJobScriptHistoryResponseBodyData setTotal(String total) {
            this.total = total;
            return this;
        }
        public String getTotal() {
            return this.total;
        }

    }

}
