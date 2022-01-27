// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaAlarmsRequest extends TeaModel {
    @NameInMap("AlarmName")
    public String alarmName;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

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
        @NameInMap("Key")
        public String key;

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
