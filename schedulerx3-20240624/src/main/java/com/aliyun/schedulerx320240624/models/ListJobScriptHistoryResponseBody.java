// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListJobScriptHistoryResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of <code>200</code> indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li>The response data.</li>
     * </ul>
     */
    @NameInMap("Data")
    public ListJobScriptHistoryResponseBodyData data;

    /**
     * <p>The maximum number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The response message.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>not support query script history, please upgrade engine version to 2.2.2+</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>A unique ID for the request. Use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>5EF879D0-3B43-5AD1-9BF7-52418F9C5E73</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
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
         * <p>The timestamp when the script version was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-29 15:56:36</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The creator of the script version.</p>
         * 
         * <strong>example:</strong>
         * <p>1963096506470832</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The content of the script.</p>
         * 
         * <strong>example:</strong>
         * <p>#!/bin/bash
         * echo &quot;xxl-job: hello shell&quot;</p>
         * <p>echo &quot;脚本位置: $0&quot;
         * echo &quot;任务参数: $1&quot;
         * echo &quot;分片序号 = $2&quot;
         * echo &quot;分片总数 = $3&quot;</p>
         * <p>echo &quot;Good bye!&quot;
         * exit 0</p>
         */
        @NameInMap("ScriptContent")
        public String scriptContent;

        /**
         * <p>The script version description.</p>
         * 
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
         * <p>The token to retrieve the next page of results. If this parameter is empty, no more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>eCKqVlS5FKF5EWGGOo8EgQ==</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <ul>
         * <li>A list of script history records.</li>
         * </ul>
         */
        @NameInMap("Records")
        public java.util.List<ListJobScriptHistoryResponseBodyDataRecords> records;

        /**
         * <p>The total count of entries.</p>
         * 
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
