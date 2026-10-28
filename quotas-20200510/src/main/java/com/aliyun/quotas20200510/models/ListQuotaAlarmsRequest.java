// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaAlarmsRequest extends TeaModel {
    /**
     * <p>The name of the quota usage alert.</p>
     * 
     * <strong>example:</strong>
     * <p>q_hvnoqv alarm</p>
     */
    @NameInMap("AlarmName")
    public String alarmName;

    /**
     * <p>The maximum number of records to return.</p>
     * <p>Valid values: 1 to 200. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that specifies the start point of the query.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the query starts from the beginning.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The abbreviation of the Alibaba Cloud service name.</p>
     * <blockquote>
     * <p>To obtain the abbreviation of an Alibaba Cloud service name, see the <code>ProductCode</code> parameter in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The quota ID.</p>
     * <blockquote>
     * <ul>
     * <li><p>To obtain the quota ID of an Alibaba Cloud service, see the <code>QuotaActionCode</code> parameter in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</p>
     * </li>
     * <li><p>If you specify this parameter, you must also specify <code>ProductCode</code>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>q_hvnoqv</p>
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
         * <p>The key of the quota dimension.</p>
         * <blockquote>
         * <ul>
         * <li><p>The number of key-value pairs that you can specify for the quota dimensions varies based on the Alibaba Cloud service.</p>
         * </li>
         * <li><p>If you set <code>ProductCode</code> to <code>ecs</code>, <code>ecs-spec</code>, <code>actiontrail</code>, or <code>ess</code>, you must specify both the key and value for the quota dimension.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>regionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the quota dimension.</p>
         * <blockquote>
         * <ul>
         * <li><p>The number of key-value pairs that you can specify for the quota dimensions varies based on the Alibaba Cloud service.</p>
         * </li>
         * <li><p>If you set <code>ProductCode</code> to <code>ecs</code>, <code>ecs-spec</code>, <code>actiontrail</code>, or <code>ess</code>, you must specify both the key and value for the quota dimension.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
