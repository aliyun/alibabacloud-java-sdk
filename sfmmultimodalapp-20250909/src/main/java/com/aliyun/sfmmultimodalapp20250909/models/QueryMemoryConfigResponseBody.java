// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class QueryMemoryConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryMemoryConfigResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryMemoryConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMemoryConfigResponseBody self = new QueryMemoryConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMemoryConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMemoryConfigResponseBody setData(QueryMemoryConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMemoryConfigResponseBodyData getData() {
        return this.data;
    }

    public QueryMemoryConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryMemoryConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMemoryConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMemoryConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMemoryConfigResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AutoUpdate")
        public Boolean autoUpdate;

        @NameInMap("ExpirationTime")
        public Integer expirationTime;

        @NameInMap("Prompt")
        public String prompt;

        @NameInMap("Threshold")
        public Double threshold;

        @NameInMap("TopK")
        public Integer topK;

        @NameInMap("UserDefinedId")
        public String userDefinedId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static QueryMemoryConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMemoryConfigResponseBodyData self = new QueryMemoryConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMemoryConfigResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryMemoryConfigResponseBodyData setAutoUpdate(Boolean autoUpdate) {
            this.autoUpdate = autoUpdate;
            return this;
        }
        public Boolean getAutoUpdate() {
            return this.autoUpdate;
        }

        public QueryMemoryConfigResponseBodyData setExpirationTime(Integer expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Integer getExpirationTime() {
            return this.expirationTime;
        }

        public QueryMemoryConfigResponseBodyData setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public QueryMemoryConfigResponseBodyData setThreshold(Double threshold) {
            this.threshold = threshold;
            return this;
        }
        public Double getThreshold() {
            return this.threshold;
        }

        public QueryMemoryConfigResponseBodyData setTopK(Integer topK) {
            this.topK = topK;
            return this;
        }
        public Integer getTopK() {
            return this.topK;
        }

        public QueryMemoryConfigResponseBodyData setUserDefinedId(String userDefinedId) {
            this.userDefinedId = userDefinedId;
            return this;
        }
        public String getUserDefinedId() {
            return this.userDefinedId;
        }

        public QueryMemoryConfigResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
