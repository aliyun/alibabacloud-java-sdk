// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateApiKeyResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateApiKeyResponseBodyData data;

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
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApiKeyResponseBody self = new CreateApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApiKeyResponseBody setData(CreateApiKeyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateApiKeyResponseBodyData getData() {
        return this.data;
    }

    public CreateApiKeyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateApiKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateApiKeyResponseBodyDataCustomKeyList extends TeaModel {
        /**
         * <p>Api Key</p>
         * 
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

        /**
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("LimitRate")
        public Float limitRate;

        /**
         * <strong>example:</strong>
         * <p>fixed</p>
         */
        @NameInMap("LimitType")
        public String limitType;

        /**
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("TokenQuota")
        public Long tokenQuota;

        public static CreateApiKeyResponseBodyDataCustomKeyList build(java.util.Map<String, ?> map) throws Exception {
            CreateApiKeyResponseBodyDataCustomKeyList self = new CreateApiKeyResponseBodyDataCustomKeyList();
            return TeaModel.build(map, self);
        }

        public CreateApiKeyResponseBodyDataCustomKeyList setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public CreateApiKeyResponseBodyDataCustomKeyList setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public CreateApiKeyResponseBodyDataCustomKeyList setLimitRate(Float limitRate) {
            this.limitRate = limitRate;
            return this;
        }
        public Float getLimitRate() {
            return this.limitRate;
        }

        public CreateApiKeyResponseBodyDataCustomKeyList setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public CreateApiKeyResponseBodyDataCustomKeyList setTokenQuota(Long tokenQuota) {
            this.tokenQuota = tokenQuota;
            return this;
        }
        public Long getTokenQuota() {
            return this.tokenQuota;
        }

    }

    public static class CreateApiKeyResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx.yy/v1">http://xxx.yy/v1</a></p>
         */
        @NameInMap("BaseUrl")
        public String baseUrl;

        @NameInMap("CustomKeyList")
        public java.util.List<CreateApiKeyResponseBodyDataCustomKeyList> customKeyList;

        /**
         * <strong>example:</strong>
         * <p>sk-rds-xxx</p>
         */
        @NameInMap("SystemApiKey")
        public String systemApiKey;

        public static CreateApiKeyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateApiKeyResponseBodyData self = new CreateApiKeyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateApiKeyResponseBodyData setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
        public String getBaseUrl() {
            return this.baseUrl;
        }

        public CreateApiKeyResponseBodyData setCustomKeyList(java.util.List<CreateApiKeyResponseBodyDataCustomKeyList> customKeyList) {
            this.customKeyList = customKeyList;
            return this;
        }
        public java.util.List<CreateApiKeyResponseBodyDataCustomKeyList> getCustomKeyList() {
            return this.customKeyList;
        }

        public CreateApiKeyResponseBodyData setSystemApiKey(String systemApiKey) {
            this.systemApiKey = systemApiKey;
            return this;
        }
        public String getSystemApiKey() {
            return this.systemApiKey;
        }

    }

}
