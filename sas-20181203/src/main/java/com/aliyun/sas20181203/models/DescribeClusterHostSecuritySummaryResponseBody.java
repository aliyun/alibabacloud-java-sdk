// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterHostSecuritySummaryResponseBody extends TeaModel {
    /**
     * <p>The alert details of the hosts.</p>
     */
    @NameInMap("ClusterHostEvent")
    public DescribeClusterHostSecuritySummaryResponseBodyClusterHostEvent clusterHostEvent;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0B48AB3C-84FC-424D-A01D-B9270EF4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterHostSecuritySummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterHostSecuritySummaryResponseBody self = new DescribeClusterHostSecuritySummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterHostSecuritySummaryResponseBody setClusterHostEvent(DescribeClusterHostSecuritySummaryResponseBodyClusterHostEvent clusterHostEvent) {
        this.clusterHostEvent = clusterHostEvent;
        return this;
    }
    public DescribeClusterHostSecuritySummaryResponseBodyClusterHostEvent getClusterHostEvent() {
        return this.clusterHostEvent;
    }

    public DescribeClusterHostSecuritySummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventAlarmEvent extends TeaModel {
        /**
         * <p>The number of alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The alert level. Valid values:</p>
         * <ul>
         * <li><strong>serious</strong></li>
         * <li><strong>suspicious</strong></li>
         * <li><strong>remind</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>remind</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        public static DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventAlarmEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventAlarmEvent self = new DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventAlarmEvent();
            return TeaModel.build(map, self);
        }

        public DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventAlarmEvent setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventAlarmEvent setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventBaselineEvent extends TeaModel {
        /**
         * <p>The number of baselines.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The risk level of the baseline. Valid values:</p>
         * <ul>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        public static DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventBaselineEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventBaselineEvent self = new DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventBaselineEvent();
            return TeaModel.build(map, self);
        }

        public DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventBaselineEvent setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventBaselineEvent setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventVulEvent extends TeaModel {
        /**
         * <p>The number of vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The risk level of the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>asap</strong>: high. You must fix the vulnerability at the earliest opportunity.</li>
         * <li><strong>nntf</strong>: medium. You can fix the vulnerability based on your business requirements.</li>
         * <li><strong>later</strong>: low. You can ignore the vulnerability.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>later</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        public static DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventVulEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventVulEvent self = new DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventVulEvent();
            return TeaModel.build(map, self);
        }

        public DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventVulEvent setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventVulEvent setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class DescribeClusterHostSecuritySummaryResponseBodyClusterHostEvent extends TeaModel {
        /**
         * <p>The alert details of the host.</p>
         */
        @NameInMap("AlarmEvent")
        public java.util.List<DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventAlarmEvent> alarmEvent;

        /**
         * <p>The baseline details of the host.</p>
         */
        @NameInMap("BaselineEvent")
        public java.util.List<DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventBaselineEvent> baselineEvent;

        /**
         * <p>The vulnerability details of the host.</p>
         */
        @NameInMap("VulEvent")
        public java.util.List<DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventVulEvent> vulEvent;

        public static DescribeClusterHostSecuritySummaryResponseBodyClusterHostEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterHostSecuritySummaryResponseBodyClusterHostEvent self = new DescribeClusterHostSecuritySummaryResponseBodyClusterHostEvent();
            return TeaModel.build(map, self);
        }

        public DescribeClusterHostSecuritySummaryResponseBodyClusterHostEvent setAlarmEvent(java.util.List<DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventAlarmEvent> alarmEvent) {
            this.alarmEvent = alarmEvent;
            return this;
        }
        public java.util.List<DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventAlarmEvent> getAlarmEvent() {
            return this.alarmEvent;
        }

        public DescribeClusterHostSecuritySummaryResponseBodyClusterHostEvent setBaselineEvent(java.util.List<DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventBaselineEvent> baselineEvent) {
            this.baselineEvent = baselineEvent;
            return this;
        }
        public java.util.List<DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventBaselineEvent> getBaselineEvent() {
            return this.baselineEvent;
        }

        public DescribeClusterHostSecuritySummaryResponseBodyClusterHostEvent setVulEvent(java.util.List<DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventVulEvent> vulEvent) {
            this.vulEvent = vulEvent;
            return this;
        }
        public java.util.List<DescribeClusterHostSecuritySummaryResponseBodyClusterHostEventVulEvent> getVulEvent() {
            return this.vulEvent;
        }

    }

}
