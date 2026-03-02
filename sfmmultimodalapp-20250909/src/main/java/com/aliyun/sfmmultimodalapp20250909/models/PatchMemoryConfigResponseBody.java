// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class PatchMemoryConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PatchMemoryConfigResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>82296D89-6895-574B-8AA1-64959957CB41</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PatchMemoryConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PatchMemoryConfigResponseBody self = new PatchMemoryConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public PatchMemoryConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PatchMemoryConfigResponseBody setData(PatchMemoryConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PatchMemoryConfigResponseBodyData getData() {
        return this.data;
    }

    public PatchMemoryConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public PatchMemoryConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PatchMemoryConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PatchMemoryConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PatchMemoryConfigResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1020d93c-9f17-4a39-9fe8-50b1fb1198d7</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoUpdate")
        public Boolean autoUpdate;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ExpirationTime")
        public Integer expirationTime;

        @NameInMap("Prompt")
        public String prompt;

        /**
         * <strong>example:</strong>
         * <p>0.03</p>
         */
        @NameInMap("Threshold")
        public Double threshold;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TopK")
        public Integer topK;

        /**
         * <strong>example:</strong>
         * <p>4a39-9fe8-50b1fb1</p>
         */
        @NameInMap("UserDefinedId")
        public String userDefinedId;

        /**
         * <strong>example:</strong>
         * <p>llm-ycc5m37pi2if9nwu</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static PatchMemoryConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PatchMemoryConfigResponseBodyData self = new PatchMemoryConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PatchMemoryConfigResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public PatchMemoryConfigResponseBodyData setAutoUpdate(Boolean autoUpdate) {
            this.autoUpdate = autoUpdate;
            return this;
        }
        public Boolean getAutoUpdate() {
            return this.autoUpdate;
        }

        public PatchMemoryConfigResponseBodyData setExpirationTime(Integer expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Integer getExpirationTime() {
            return this.expirationTime;
        }

        public PatchMemoryConfigResponseBodyData setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public PatchMemoryConfigResponseBodyData setThreshold(Double threshold) {
            this.threshold = threshold;
            return this;
        }
        public Double getThreshold() {
            return this.threshold;
        }

        public PatchMemoryConfigResponseBodyData setTopK(Integer topK) {
            this.topK = topK;
            return this;
        }
        public Integer getTopK() {
            return this.topK;
        }

        public PatchMemoryConfigResponseBodyData setUserDefinedId(String userDefinedId) {
            this.userDefinedId = userDefinedId;
            return this;
        }
        public String getUserDefinedId() {
            return this.userDefinedId;
        }

        public PatchMemoryConfigResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
