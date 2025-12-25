// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListWorkflowVersionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListWorkflowVersionsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>eCKqVlS5FKF5EWGGOo8EgQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>3835AA29-2298-5434-BC53-9CC377CDFD2C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListWorkflowVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowVersionsResponseBody self = new ListWorkflowVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkflowVersionsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListWorkflowVersionsResponseBody setData(java.util.List<ListWorkflowVersionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListWorkflowVersionsResponseBodyData> getData() {
        return this.data;
    }

    public ListWorkflowVersionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkflowVersionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWorkflowVersionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkflowVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkflowVersionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListWorkflowVersionsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-10-29 15:56:36</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Current")
        public Boolean current;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("DagVersion")
        public String dagVersion;

        public static ListWorkflowVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowVersionsResponseBodyData self = new ListWorkflowVersionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWorkflowVersionsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListWorkflowVersionsResponseBodyData setCurrent(Boolean current) {
            this.current = current;
            return this;
        }
        public Boolean getCurrent() {
            return this.current;
        }

        public ListWorkflowVersionsResponseBodyData setDagVersion(String dagVersion) {
            this.dagVersion = dagVersion;
            return this;
        }
        public String getDagVersion() {
            return this.dagVersion;
        }

    }

}
