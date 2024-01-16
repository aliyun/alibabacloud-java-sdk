// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaAlarmsRequest extends TeaModel {
    /**
     * <p>The name of the alert.</p>
     */
    @NameInMap("AlarmName")
    public String alarmName;

    /**
     * <p>The maximum number of records that you want to return for the query.</p>
     * <br>
     * <p>Valid values: 1 to 200. Default value: 30.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the position from which you want to start the query.</p>
     * <br>
     * <p>> An empty value indicates that the query starts from the beginning.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The abbreviation of the Alibaba Cloud service name.</p>
     * <br>
     * <p>> For more information, see [Alibaba Cloud services that support Quota Center](~~182368~~).</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the quota.</p>
     * <br>
     * <p>> The `ProductCode` parameter is required if you specify this parameter.</p>
     */
    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    /**
     * <p>The quota dimensions.</p>
     */
    @NameInMap("QuotaDimensions")
    public java.util.List<ListQuotaAlarmsRequestQuotaDimensions> quotaDimensions;

    public static ListQuotaAlarmsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaAlarmsRequest self = new ListQuotaAlarmsRequest();
        return TeaModel.build(map, self);
    }

    public ListQuotaAlarmsRequest setAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }
    public String getAlarmName() {
        return this.alarmName;
    }

    public ListQuotaAlarmsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListQuotaAlarmsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListQuotaAlarmsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListQuotaAlarmsRequest setQuotaActionCode(String quotaActionCode) {
        this.quotaActionCode = quotaActionCode;
        return this;
    }
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    public ListQuotaAlarmsRequest setQuotaDimensions(java.util.List<ListQuotaAlarmsRequestQuotaDimensions> quotaDimensions) {
        this.quotaDimensions = quotaDimensions;
        return this;
    }
    public java.util.List<ListQuotaAlarmsRequestQuotaDimensions> getQuotaDimensions() {
        return this.quotaDimensions;
    }

    public static class ListQuotaAlarmsRequestQuotaDimensions extends TeaModel {
        /**
         * <p>The key of the dimension.</p>
         * <br>
         * <p>> The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the dimension.</p>
         * <br>
         * <p>> The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListQuotaAlarmsRequestQuotaDimensions build(java.util.Map<String, ?> map) throws Exception {
            ListQuotaAlarmsRequestQuotaDimensions self = new ListQuotaAlarmsRequestQuotaDimensions();
            return TeaModel.build(map, self);
        }

        public ListQuotaAlarmsRequestQuotaDimensions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListQuotaAlarmsRequestQuotaDimensions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
