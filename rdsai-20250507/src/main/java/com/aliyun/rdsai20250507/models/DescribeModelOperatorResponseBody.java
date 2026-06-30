// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeModelOperatorResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public DescribeModelOperatorResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
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

    public static DescribeModelOperatorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelOperatorResponseBody self = new DescribeModelOperatorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeModelOperatorResponseBody setData(DescribeModelOperatorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeModelOperatorResponseBodyData getData() {
        return this.data;
    }

    public DescribeModelOperatorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeModelOperatorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeModelOperatorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeModelOperatorResponseBodyDataDailyUsage extends TeaModel {
        /**
         * <p>The date of the usage record.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-31</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>The number of tokens used on this date.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("Usage")
        public Long usage;

        public static DescribeModelOperatorResponseBodyDataDailyUsage build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelOperatorResponseBodyDataDailyUsage self = new DescribeModelOperatorResponseBodyDataDailyUsage();
            return TeaModel.build(map, self);
        }

        public DescribeModelOperatorResponseBodyDataDailyUsage setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeModelOperatorResponseBodyDataDailyUsage setUsage(Long usage) {
            this.usage = usage;
            return this;
        }
        public Long getUsage() {
            return this.usage;
        }

    }

    public static class DescribeModelOperatorResponseBodyDataKeyUsageListDailyUsage extends TeaModel {
        /**
         * <p>The date of the usage record.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-31</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>The number of tokens used by the API key on this date.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Usage")
        public String usage;

        public static DescribeModelOperatorResponseBodyDataKeyUsageListDailyUsage build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelOperatorResponseBodyDataKeyUsageListDailyUsage self = new DescribeModelOperatorResponseBodyDataKeyUsageListDailyUsage();
            return TeaModel.build(map, self);
        }

        public DescribeModelOperatorResponseBodyDataKeyUsageListDailyUsage setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeModelOperatorResponseBodyDataKeyUsageListDailyUsage setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

    public static class DescribeModelOperatorResponseBodyDataKeyUsageList extends TeaModel {
        /**
         * <p>The API key.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-rds-*****</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <p>The daily usage for the API key.</p>
         */
        @NameInMap("DailyUsage")
        public java.util.List<DescribeModelOperatorResponseBodyDataKeyUsageListDailyUsage> dailyUsage;

        /**
         * <p>Indicates whether the API key has been deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>fase</p>
         */
        @NameInMap("Deleted")
        public Boolean deleted;

        /**
         * <p>The name of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>api-*****</p>
         */
        @NameInMap("KeyName")
        public String keyName;

        /**
         * <p>The type of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>fixed</p>
         */
        @NameInMap("KeyType")
        public String keyType;

        /**
         * <p>The total number of tokens used by this API key.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("KeyUsed")
        public String keyUsed;

        /**
         * <p>The token usage for the current cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>2000000</p>
         */
        @NameInMap("UsedQuota")
        public String usedQuota;

        public static DescribeModelOperatorResponseBodyDataKeyUsageList build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelOperatorResponseBodyDataKeyUsageList self = new DescribeModelOperatorResponseBodyDataKeyUsageList();
            return TeaModel.build(map, self);
        }

        public DescribeModelOperatorResponseBodyDataKeyUsageList setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public DescribeModelOperatorResponseBodyDataKeyUsageList setDailyUsage(java.util.List<DescribeModelOperatorResponseBodyDataKeyUsageListDailyUsage> dailyUsage) {
            this.dailyUsage = dailyUsage;
            return this;
        }
        public java.util.List<DescribeModelOperatorResponseBodyDataKeyUsageListDailyUsage> getDailyUsage() {
            return this.dailyUsage;
        }

        public DescribeModelOperatorResponseBodyDataKeyUsageList setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public DescribeModelOperatorResponseBodyDataKeyUsageList setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public DescribeModelOperatorResponseBodyDataKeyUsageList setKeyType(String keyType) {
            this.keyType = keyType;
            return this;
        }
        public String getKeyType() {
            return this.keyType;
        }

        public DescribeModelOperatorResponseBodyDataKeyUsageList setKeyUsed(String keyUsed) {
            this.keyUsed = keyUsed;
            return this;
        }
        public String getKeyUsed() {
            return this.keyUsed;
        }

        public DescribeModelOperatorResponseBodyDataKeyUsageList setUsedQuota(String usedQuota) {
            this.usedQuota = usedQuota;
            return this;
        }
        public String getUsedQuota() {
            return this.usedQuota;
        }

    }

    public static class DescribeModelOperatorResponseBodyData extends TeaModel {
        /**
         * <p>The API key.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-rds-xxx</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <p>Indicates whether auto-renewal is enabled for the instance. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong> (default): Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        /**
         * <p>The endpoint URL for model requests.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx.yy/v1">http://xxx.yy/v1</a></p>
         */
        @NameInMap("BaseUrl")
        public String baseUrl;

        /**
         * <p>The billing method. Valid values: <code>PREPAY</code> (subscription) and <code>POSTPAY</code> (pay-as-you-go).</p>
         * 
         * <strong>example:</strong>
         * <p>PREPAY / POSTPAY</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The daily token usage.</p>
         */
        @NameInMap("DailyUsage")
        public java.util.List<DescribeModelOperatorResponseBodyDataDailyUsage> dailyUsage;

        /**
         * <p>The UNIX timestamp, in milliseconds, indicating when the instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>1775145600000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>xlarge</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_copilot***_public_cn-*********6</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The usage of each API key, including deleted keys.</p>
         */
        @NameInMap("KeyUsageList")
        public java.util.List<DescribeModelOperatorResponseBodyDataKeyUsageList> keyUsageList;

        /**
         * <p>Indicates whether prefix caching is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("PrefixCacheEnabled")
        public Boolean prefixCacheEnabled;

        @NameInMap("SessionIds")
        public java.util.List<String> sessionIds;

        /**
         * <p>The UNIX timestamp, in milliseconds, indicating when the instance started.</p>
         * 
         * <strong>example:</strong>
         * <p>1772439028000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>active/creating</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The total quota for the current cycle, such as the monthly quota.</p>
         * 
         * <strong>example:</strong>
         * <p>200000000</p>
         */
        @NameInMap("TotalQuota")
        public Long totalQuota;

        /**
         * <p>The usage in the current cycle, such as the monthly usage.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("UsedQuota")
        public Long usedQuota;

        public static DescribeModelOperatorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelOperatorResponseBodyData self = new DescribeModelOperatorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeModelOperatorResponseBodyData setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public DescribeModelOperatorResponseBodyData setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public DescribeModelOperatorResponseBodyData setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
        public String getBaseUrl() {
            return this.baseUrl;
        }

        public DescribeModelOperatorResponseBodyData setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeModelOperatorResponseBodyData setDailyUsage(java.util.List<DescribeModelOperatorResponseBodyDataDailyUsage> dailyUsage) {
            this.dailyUsage = dailyUsage;
            return this;
        }
        public java.util.List<DescribeModelOperatorResponseBodyDataDailyUsage> getDailyUsage() {
            return this.dailyUsage;
        }

        public DescribeModelOperatorResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeModelOperatorResponseBodyData setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeModelOperatorResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeModelOperatorResponseBodyData setKeyUsageList(java.util.List<DescribeModelOperatorResponseBodyDataKeyUsageList> keyUsageList) {
            this.keyUsageList = keyUsageList;
            return this;
        }
        public java.util.List<DescribeModelOperatorResponseBodyDataKeyUsageList> getKeyUsageList() {
            return this.keyUsageList;
        }

        public DescribeModelOperatorResponseBodyData setPrefixCacheEnabled(Boolean prefixCacheEnabled) {
            this.prefixCacheEnabled = prefixCacheEnabled;
            return this;
        }
        public Boolean getPrefixCacheEnabled() {
            return this.prefixCacheEnabled;
        }

        public DescribeModelOperatorResponseBodyData setSessionIds(java.util.List<String> sessionIds) {
            this.sessionIds = sessionIds;
            return this;
        }
        public java.util.List<String> getSessionIds() {
            return this.sessionIds;
        }

        public DescribeModelOperatorResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeModelOperatorResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeModelOperatorResponseBodyData setTotalQuota(Long totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }
        public Long getTotalQuota() {
            return this.totalQuota;
        }

        public DescribeModelOperatorResponseBodyData setUsedQuota(Long usedQuota) {
            this.usedQuota = usedQuota;
            return this;
        }
        public Long getUsedQuota() {
            return this.usedQuota;
        }

    }

}
