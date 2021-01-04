// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GetQosAttributeResponseBody extends TeaModel {
    @NameInMap("QosPolicies")
    public java.util.List<GetQosAttributeResponseBodyQosPolicies> qosPolicies;

    @NameInMap("QosCars")
    public java.util.List<GetQosAttributeResponseBodyQosCars> qosCars;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorConfigSmartAGCount")
    public Integer errorConfigSmartAGCount;

    @NameInMap("QosName")
    public String qosName;

    @NameInMap("QosDescription")
    public String qosDescription;

    public static GetQosAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQosAttributeResponseBody self = new GetQosAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQosAttributeResponseBody setQosPolicies(java.util.List<GetQosAttributeResponseBodyQosPolicies> qosPolicies) {
        this.qosPolicies = qosPolicies;
        return this;
    }
    public java.util.List<GetQosAttributeResponseBodyQosPolicies> getQosPolicies() {
        return this.qosPolicies;
    }

    public GetQosAttributeResponseBody setQosCars(java.util.List<GetQosAttributeResponseBodyQosCars> qosCars) {
        this.qosCars = qosCars;
        return this;
    }
    public java.util.List<GetQosAttributeResponseBodyQosCars> getQosCars() {
        return this.qosCars;
    }

    public GetQosAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQosAttributeResponseBody setErrorConfigSmartAGCount(Integer errorConfigSmartAGCount) {
        this.errorConfigSmartAGCount = errorConfigSmartAGCount;
        return this;
    }
    public Integer getErrorConfigSmartAGCount() {
        return this.errorConfigSmartAGCount;
    }

    public GetQosAttributeResponseBody setQosName(String qosName) {
        this.qosName = qosName;
        return this;
    }
    public String getQosName() {
        return this.qosName;
    }

    public GetQosAttributeResponseBody setQosDescription(String qosDescription) {
        this.qosDescription = qosDescription;
        return this;
    }
    public String getQosDescription() {
        return this.qosDescription;
    }

    public static class GetQosAttributeResponseBodyQosPolicies extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("DestCidr")
        public String destCidr;

        @NameInMap("DestPortRange")
        public String destPortRange;

        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("QosPolicieDescription")
        public String qosPolicieDescription;

        @NameInMap("SourceCidr")
        public String sourceCidr;

        @NameInMap("QosPolicieName")
        public String qosPolicieName;

        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        public static GetQosAttributeResponseBodyQosPolicies build(java.util.Map<String, ?> map) throws Exception {
            GetQosAttributeResponseBodyQosPolicies self = new GetQosAttributeResponseBodyQosPolicies();
            return TeaModel.build(map, self);
        }

        public GetQosAttributeResponseBodyQosPolicies setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetQosAttributeResponseBodyQosPolicies setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
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

        public GetQosAttributeResponseBodyQosPolicies setSourceCidr(String sourceCidr) {
            this.sourceCidr = sourceCidr;
            return this;
        }
        public String getSourceCidr() {
            return this.sourceCidr;
        }

        public GetQosAttributeResponseBodyQosPolicies setQosPolicieName(String qosPolicieName) {
            this.qosPolicieName = qosPolicieName;
            return this;
        }
        public String getQosPolicieName() {
            return this.qosPolicieName;
        }

        public GetQosAttributeResponseBodyQosPolicies setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

    }

    public static class GetQosAttributeResponseBodyQosCars extends TeaModel {
        @NameInMap("MaxBandwidthAbs")
        public Integer maxBandwidthAbs;

        @NameInMap("QosCarName")
        public String qosCarName;

        @NameInMap("PercentSourceType")
        public String percentSourceType;

        @NameInMap("MinBandwidthAbs")
        public Integer minBandwidthAbs;

        @NameInMap("MaxBandwidthPercent")
        public Integer maxBandwidthPercent;

        @NameInMap("QosCarDescription")
        public String qosCarDescription;

        @NameInMap("LimitType")
        public String limitType;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("MinBandwidthPercent")
        public Integer minBandwidthPercent;

        @NameInMap("QosCarId")
        public String qosCarId;

        public static GetQosAttributeResponseBodyQosCars build(java.util.Map<String, ?> map) throws Exception {
            GetQosAttributeResponseBodyQosCars self = new GetQosAttributeResponseBodyQosCars();
            return TeaModel.build(map, self);
        }

        public GetQosAttributeResponseBodyQosCars setMaxBandwidthAbs(Integer maxBandwidthAbs) {
            this.maxBandwidthAbs = maxBandwidthAbs;
            return this;
        }
        public Integer getMaxBandwidthAbs() {
            return this.maxBandwidthAbs;
        }

        public GetQosAttributeResponseBodyQosCars setQosCarName(String qosCarName) {
            this.qosCarName = qosCarName;
            return this;
        }
        public String getQosCarName() {
            return this.qosCarName;
        }

        public GetQosAttributeResponseBodyQosCars setPercentSourceType(String percentSourceType) {
            this.percentSourceType = percentSourceType;
            return this;
        }
        public String getPercentSourceType() {
            return this.percentSourceType;
        }

        public GetQosAttributeResponseBodyQosCars setMinBandwidthAbs(Integer minBandwidthAbs) {
            this.minBandwidthAbs = minBandwidthAbs;
            return this;
        }
        public Integer getMinBandwidthAbs() {
            return this.minBandwidthAbs;
        }

        public GetQosAttributeResponseBodyQosCars setMaxBandwidthPercent(Integer maxBandwidthPercent) {
            this.maxBandwidthPercent = maxBandwidthPercent;
            return this;
        }
        public Integer getMaxBandwidthPercent() {
            return this.maxBandwidthPercent;
        }

        public GetQosAttributeResponseBodyQosCars setQosCarDescription(String qosCarDescription) {
            this.qosCarDescription = qosCarDescription;
            return this;
        }
        public String getQosCarDescription() {
            return this.qosCarDescription;
        }

        public GetQosAttributeResponseBodyQosCars setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public GetQosAttributeResponseBodyQosCars setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetQosAttributeResponseBodyQosCars setMinBandwidthPercent(Integer minBandwidthPercent) {
            this.minBandwidthPercent = minBandwidthPercent;
            return this;
        }
        public Integer getMinBandwidthPercent() {
            return this.minBandwidthPercent;
        }

        public GetQosAttributeResponseBodyQosCars setQosCarId(String qosCarId) {
            this.qosCarId = qosCarId;
            return this;
        }
        public String getQosCarId() {
            return this.qosCarId;
        }

    }

}
