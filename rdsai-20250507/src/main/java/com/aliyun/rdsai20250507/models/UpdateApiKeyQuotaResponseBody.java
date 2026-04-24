// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateApiKeyQuotaResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpdateApiKeyQuotaResponseBodyData data;

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

    public static UpdateApiKeyQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiKeyQuotaResponseBody self = new UpdateApiKeyQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApiKeyQuotaResponseBody setData(UpdateApiKeyQuotaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateApiKeyQuotaResponseBodyData getData() {
        return this.data;
    }

    public UpdateApiKeyQuotaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateApiKeyQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateApiKeyQuotaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateApiKeyQuotaResponseBodyDataCustomKeyList extends TeaModel {
        /**
         * <p>Api Key</p>
         * 
         * <strong>example:</strong>
         * <p>sk-rds-xxx</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

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
         * <p>10000</p>
         */
        @NameInMap("TokenQuota")
        public Long tokenQuota;

        public static UpdateApiKeyQuotaResponseBodyDataCustomKeyList build(java.util.Map<String, ?> map) throws Exception {
            UpdateApiKeyQuotaResponseBodyDataCustomKeyList self = new UpdateApiKeyQuotaResponseBodyDataCustomKeyList();
            return TeaModel.build(map, self);
        }

        public UpdateApiKeyQuotaResponseBodyDataCustomKeyList setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public UpdateApiKeyQuotaResponseBodyDataCustomKeyList setLimitRate(Float limitRate) {
            this.limitRate = limitRate;
            return this;
        }
        public Float getLimitRate() {
            return this.limitRate;
        }

        public UpdateApiKeyQuotaResponseBodyDataCustomKeyList setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public UpdateApiKeyQuotaResponseBodyDataCustomKeyList setTokenQuota(Long tokenQuota) {
            this.tokenQuota = tokenQuota;
            return this;
        }
        public Long getTokenQuota() {
            return this.tokenQuota;
        }

    }

    public static class UpdateApiKeyQuotaResponseBodyData extends TeaModel {
        @NameInMap("CustomKeyList")
        public java.util.List<UpdateApiKeyQuotaResponseBodyDataCustomKeyList> customKeyList;

        public static UpdateApiKeyQuotaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateApiKeyQuotaResponseBodyData self = new UpdateApiKeyQuotaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateApiKeyQuotaResponseBodyData setCustomKeyList(java.util.List<UpdateApiKeyQuotaResponseBodyDataCustomKeyList> customKeyList) {
            this.customKeyList = customKeyList;
            return this;
        }
        public java.util.List<UpdateApiKeyQuotaResponseBodyDataCustomKeyList> getCustomKeyList() {
            return this.customKeyList;
        }

    }

}
