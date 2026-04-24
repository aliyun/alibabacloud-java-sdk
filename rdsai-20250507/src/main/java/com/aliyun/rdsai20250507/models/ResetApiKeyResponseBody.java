// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ResetApiKeyResponseBody extends TeaModel {
    @NameInMap("Data")
    public ResetApiKeyResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ResetApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetApiKeyResponseBody self = new ResetApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetApiKeyResponseBody setData(ResetApiKeyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ResetApiKeyResponseBodyData getData() {
        return this.data;
    }

    public ResetApiKeyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResetApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetApiKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ResetApiKeyResponseBodyDataCustomKeyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>sk-rds-*****</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <strong>example:</strong>
         * <p>api-*****</p>
         */
        @NameInMap("KeyName")
        public String keyName;

        public static ResetApiKeyResponseBodyDataCustomKeyList build(java.util.Map<String, ?> map) throws Exception {
            ResetApiKeyResponseBodyDataCustomKeyList self = new ResetApiKeyResponseBodyDataCustomKeyList();
            return TeaModel.build(map, self);
        }

        public ResetApiKeyResponseBodyDataCustomKeyList setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public ResetApiKeyResponseBodyDataCustomKeyList setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

    }

    public static class ResetApiKeyResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>sk-rds-*****</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx.yy/v1">http://xxx.yy/v1</a></p>
         */
        @NameInMap("BaseUrl")
        public String baseUrl;

        @NameInMap("CustomKeyList")
        public java.util.List<ResetApiKeyResponseBodyDataCustomKeyList> customKeyList;

        public static ResetApiKeyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ResetApiKeyResponseBodyData self = new ResetApiKeyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ResetApiKeyResponseBodyData setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public ResetApiKeyResponseBodyData setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
        public String getBaseUrl() {
            return this.baseUrl;
        }

        public ResetApiKeyResponseBodyData setCustomKeyList(java.util.List<ResetApiKeyResponseBodyDataCustomKeyList> customKeyList) {
            this.customKeyList = customKeyList;
            return this;
        }
        public java.util.List<ResetApiKeyResponseBodyDataCustomKeyList> getCustomKeyList() {
            return this.customKeyList;
        }

    }

}
