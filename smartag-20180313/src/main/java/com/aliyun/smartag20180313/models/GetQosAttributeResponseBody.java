// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GetQosAttributeResponseBody extends TeaModel {
    /**
     * <p>The number of Smart Access Gateway (SAG) instances that have exceptional configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ErrorConfigSmartAGCount")
    public Integer errorConfigSmartAGCount;

    /**
     * <p>The traffic throttling rule applied to the QoS policies that have exceptional configurations.</p>
     */
    @NameInMap("QosCars")
    public java.util.List<GetQosAttributeResponseBodyQosCars> qosCars;

    /**
     * <p>The description of the QoS policy.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("QosDescription")
    public String qosDescription;

    /**
     * <p>The name of the QoS policy.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("QosName")
    public String qosName;

    /**
     * <p>List of QoS policies based on 5-tuple.</p>
     */
    @NameInMap("QosPolicies")
    public java.util.List<GetQosAttributeResponseBodyQosPolicies> qosPolicies;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>91058E01-1806-45D5-B305-19E4D0A5CE04</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetQosAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQosAttributeResponseBody self = new GetQosAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQosAttributeResponseBody setErrorConfigSmartAGCount(Integer errorConfigSmartAGCount) {
        this.errorConfigSmartAGCount = errorConfigSmartAGCount;
        return this;
    }
    public Integer getErrorConfigSmartAGCount() {
        return this.errorConfigSmartAGCount;
    }

    public GetQosAttributeResponseBody setQosCars(java.util.List<GetQosAttributeResponseBodyQosCars> qosCars) {
        this.qosCars = qosCars;
        return this;
    }
    public java.util.List<GetQosAttributeResponseBodyQosCars> getQosCars() {
        return this.qosCars;
    }

    public GetQosAttributeResponseBody setQosDescription(String qosDescription) {
        this.qosDescription = qosDescription;
        return this;
    }
    public String getQosDescription() {
        return this.qosDescription;
    }

    public GetQosAttributeResponseBody setQosName(String qosName) {
        this.qosName = qosName;
        return this;
    }
    public String getQosName() {
        return this.qosName;
    }

    public GetQosAttributeResponseBody setQosPolicies(java.util.List<GetQosAttributeResponseBodyQosPolicies> qosPolicies) {
        this.qosPolicies = qosPolicies;
        return this;
    }
    public java.util.List<GetQosAttributeResponseBodyQosPolicies> getQosPolicies() {
        return this.qosPolicies;
    }

    public GetQosAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetQosAttributeResponseBodyQosCars extends TeaModel {
        /**
         * <p>The type of traffic throttling. Valid values:</p>
         * <ul>
         * <li><strong>Absolute</strong>: throttles traffic based on a specific range of bandwidth.</li>
         * <li><strong>Percent</strong>: throttles traffic based on a specific range of bandwidth percentage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Absolute</p>
         */
        @NameInMap("LimitType")
        public String limitType;

        /**
         * <p>The maximum bandwidth. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxBandwidthAbs")
        public Integer maxBandwidthAbs;

        /**
         * <p>The maximum bandwidth percentage that the traffic is throttled to.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxBandwidthPercent")
        public Integer maxBandwidthPercent;

        /**
         * <p>The minimum bandwidth. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinBandwidthAbs")
        public Integer minBandwidthAbs;

        /**
         * <p>The minimum bandwidth percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MinBandwidthPercent")
        public Integer minBandwidthPercent;

        /**
         * <p>Bandwidth type when traffic is throttled to a percentage of the total bandwidth of the network.</p>
         * <ul>
         * <li><strong>CcnBandwidth</strong>: Cloud Connect Network (CCN) bandwidth.</li>
         * <li><strong>InternetUpBandwidth</strong>: Internet upstream bandwidth.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InternetUpBandwidth</p>
         */
        @NameInMap("PercentSourceType")
        public String percentSourceType;

        /**
         * <p>The priority of the traffic throttling rule.</p>
         * <p>Valid values are from <strong>1</strong> to <strong>3</strong>. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The description of the traffic throttling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("QosCarDescription")
        public String qosCarDescription;

        /**
         * <p>The ID of the traffic throttling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>qoscar-xir1apa8ayjp56ei****</p>
         */
        @NameInMap("QosCarId")
        public String qosCarId;

        /**
         * <p>The name of the traffic throttling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("QosCarName")
        public String qosCarName;

        public static GetQosAttributeResponseBodyQosCars build(java.util.Map<String, ?> map) throws Exception {
            GetQosAttributeResponseBodyQosCars self = new GetQosAttributeResponseBodyQosCars();
            return TeaModel.build(map, self);
        }

        public GetQosAttributeResponseBodyQosCars setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public GetQosAttributeResponseBodyQosCars setMaxBandwidthAbs(Integer maxBandwidthAbs) {
            this.maxBandwidthAbs = maxBandwidthAbs;
            return this;
        }
        public Integer getMaxBandwidthAbs() {
            return this.maxBandwidthAbs;
        }

        public GetQosAttributeResponseBodyQosCars setMaxBandwidthPercent(Integer maxBandwidthPercent) {
            this.maxBandwidthPercent = maxBandwidthPercent;
            return this;
        }
        public Integer getMaxBandwidthPercent() {
            return this.maxBandwidthPercent;
        }

        public GetQosAttributeResponseBodyQosCars setMinBandwidthAbs(Integer minBandwidthAbs) {
            this.minBandwidthAbs = minBandwidthAbs;
            return this;
        }
        public Integer getMinBandwidthAbs() {
            return this.minBandwidthAbs;
        }

        public GetQosAttributeResponseBodyQosCars setMinBandwidthPercent(Integer minBandwidthPercent) {
            this.minBandwidthPercent = minBandwidthPercent;
            return this;
        }
        public Integer getMinBandwidthPercent() {
            return this.minBandwidthPercent;
        }

        public GetQosAttributeResponseBodyQosCars setPercentSourceType(String percentSourceType) {
            this.percentSourceType = percentSourceType;
            return this;
        }
        public String getPercentSourceType() {
            return this.percentSourceType;
        }

        public GetQosAttributeResponseBodyQosCars setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetQosAttributeResponseBodyQosCars setQosCarDescription(String qosCarDescription) {
            this.qosCarDescription = qosCarDescription;
            return this;
        }
        public String getQosCarDescription() {
            return this.qosCarDescription;
        }

        public GetQosAttributeResponseBodyQosCars setQosCarId(String qosCarId) {
            this.qosCarId = qosCarId;
            return this;
        }
        public String getQosCarId() {
            return this.qosCarId;
        }

        public GetQosAttributeResponseBodyQosCars setQosCarName(String qosCarName) {
            this.qosCarName = qosCarName;
            return this;
        }
        public String getQosCarName() {
            return this.qosCarName;
        }

    }

    public static class GetQosAttributeResponseBodyQosPolicies extends TeaModel {
        /**
         * <p>The range of the destination CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("DestCidr")
        public String destCidr;

        /**
         * <p>The range of destination ports.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65535</strong> and <strong>-1</strong>.</p>
         * <p>Examples of the format of the destination port range:</p>
         * <ul>
         * <li><strong>1/200</strong>: a port range from 1 to 200.</li>
         * <li><strong>80/80</strong>: port 80.</li>
         * <li><strong>-1/-1</strong>: all ports.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1/-1</p>
         */
        @NameInMap("DestPortRange")
        public String destPortRange;

        /**
         * <p>The end time of the valid time of the 5-tuple.</p>
         * <p>The time must be in UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-29T00:00:00+0800</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The type of the protocol that is applied to the 5-tuple rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The priority of the traffic throttling rule that is applied to the 5-tuple.rule.</p>
         * <p>A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The description of the 5-tuple.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("QosPolicieDescription")
        public String qosPolicieDescription;

        /**
         * <p>The name of the 5-tuple.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("QosPolicieName")
        public String qosPolicieName;

        /**
         * <p>The range of the source CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("SourceCidr")
        public String sourceCidr;

        /**
         * <p>The range of source ports.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65535</strong> and <strong>-1</strong>.</p>
         * <p>Examples of the format of the source port range:</p>
         * <ul>
         * <li><strong>1/200</strong>: a port range from 1 to 200.</li>
         * <li><strong>80/80</strong>: port 80.</li>
         * <li><strong>-1/-1</strong>: all ports.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1/-1</p>
         */
        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        /**
         * <p>The start time of the valid time of the 5-tuple.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-21T00:00:00+0800</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static GetQosAttributeResponseBodyQosPolicies build(java.util.Map<String, ?> map) throws Exception {
            GetQosAttributeResponseBodyQosPolicies self = new GetQosAttributeResponseBodyQosPolicies();
            return TeaModel.build(map, self);
        }

        public GetQosAttributeResponseBodyQosPolicies setDestCidr(String destCidr) {
            this.destCidr = destCidr;
            return this;
        }
        public String getDestCidr() {
            return this.destCidr;
        }

        public GetQosAttributeResponseBodyQosPolicies setDestPortRange(String destPortRange) {
            this.destPortRange = destPortRange;
            return this;
        }
        public String getDestPortRange() {
            return this.destPortRange;
        }

        public GetQosAttributeResponseBodyQosPolicies setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetQosAttributeResponseBodyQosPolicies setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public GetQosAttributeResponseBodyQosPolicies setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetQosAttributeResponseBodyQosPolicies setQosPolicieDescription(String qosPolicieDescription) {
            this.qosPolicieDescription = qosPolicieDescription;
            return this;
        }
        public String getQosPolicieDescription() {
            return this.qosPolicieDescription;
        }

        public GetQosAttributeResponseBodyQosPolicies setQosPolicieName(String qosPolicieName) {
            this.qosPolicieName = qosPolicieName;
            return this;
        }
        public String getQosPolicieName() {
            return this.qosPolicieName;
        }

        public GetQosAttributeResponseBodyQosPolicies setSourceCidr(String sourceCidr) {
            this.sourceCidr = sourceCidr;
            return this;
        }
        public String getSourceCidr() {
            return this.sourceCidr;
        }

        public GetQosAttributeResponseBodyQosPolicies setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        public GetQosAttributeResponseBodyQosPolicies setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
