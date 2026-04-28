// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListApiKeysResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListApiKeysResponseBodyData data;

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

    public static ListApiKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApiKeysResponseBody self = new ListApiKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApiKeysResponseBody setData(ListApiKeysResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListApiKeysResponseBodyData getData() {
        return this.data;
    }

    public ListApiKeysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApiKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApiKeysResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListApiKeysResponseBodyDataCustomKeyList extends TeaModel {
        /**
         * <p>API Key</p>
         * 
         * <strong>example:</strong>
         * <p>sk-rds-*****</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        @NameInMap("IsRateLimited")
        public Boolean isRateLimited;

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

        @NameInMap("ThresholdPercent")
        public Integer thresholdPercent;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("TokenQuota")
        public Long tokenQuota;

        public static ListApiKeysResponseBodyDataCustomKeyList build(java.util.Map<String, ?> map) throws Exception {
            ListApiKeysResponseBodyDataCustomKeyList self = new ListApiKeysResponseBodyDataCustomKeyList();
            return TeaModel.build(map, self);
        }

        public ListApiKeysResponseBodyDataCustomKeyList setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public ListApiKeysResponseBodyDataCustomKeyList setIsRateLimited(Boolean isRateLimited) {
            this.isRateLimited = isRateLimited;
            return this;
        }
        public Boolean getIsRateLimited() {
            return this.isRateLimited;
        }

        public ListApiKeysResponseBodyDataCustomKeyList setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public ListApiKeysResponseBodyDataCustomKeyList setLimitRate(Float limitRate) {
            this.limitRate = limitRate;
            return this;
        }
        public Float getLimitRate() {
            return this.limitRate;
        }

        public ListApiKeysResponseBodyDataCustomKeyList setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public ListApiKeysResponseBodyDataCustomKeyList setThresholdPercent(Integer thresholdPercent) {
            this.thresholdPercent = thresholdPercent;
            return this;
        }
        public Integer getThresholdPercent() {
            return this.thresholdPercent;
        }

        public ListApiKeysResponseBodyDataCustomKeyList setTokenQuota(Long tokenQuota) {
            this.tokenQuota = tokenQuota;
            return this;
        }
        public Long getTokenQuota() {
            return this.tokenQuota;
        }

    }

    public static class ListApiKeysResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx.yy/v1">http://xxx.yy/v1</a></p>
         */
        @NameInMap("BaseUrl")
        public String baseUrl;

        @NameInMap("CustomKeyList")
        public java.util.List<ListApiKeysResponseBodyDataCustomKeyList> customKeyList;

        @NameInMap("IsRateLimited")
        public Boolean isRateLimited;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>sk-rds-xxx</p>
         */
        @NameInMap("SystemApiKey")
        public String systemApiKey;

        @NameInMap("ThresholdPercent")
        public Integer thresholdPercent;

        /**
         * <strong>example:</strong>
         * <p>138</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListApiKeysResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListApiKeysResponseBodyData self = new ListApiKeysResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListApiKeysResponseBodyData setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
        public String getBaseUrl() {
            return this.baseUrl;
        }

        public ListApiKeysResponseBodyData setCustomKeyList(java.util.List<ListApiKeysResponseBodyDataCustomKeyList> customKeyList) {
            this.customKeyList = customKeyList;
            return this;
        }
        public java.util.List<ListApiKeysResponseBodyDataCustomKeyList> getCustomKeyList() {
            return this.customKeyList;
        }

        public ListApiKeysResponseBodyData setIsRateLimited(Boolean isRateLimited) {
            this.isRateLimited = isRateLimited;
            return this;
        }
        public Boolean getIsRateLimited() {
            return this.isRateLimited;
        }

        public ListApiKeysResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListApiKeysResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListApiKeysResponseBodyData setSystemApiKey(String systemApiKey) {
            this.systemApiKey = systemApiKey;
            return this;
        }
        public String getSystemApiKey() {
            return this.systemApiKey;
        }

        public ListApiKeysResponseBodyData setThresholdPercent(Integer thresholdPercent) {
            this.thresholdPercent = thresholdPercent;
            return this;
        }
        public Integer getThresholdPercent() {
            return this.thresholdPercent;
        }

        public ListApiKeysResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
