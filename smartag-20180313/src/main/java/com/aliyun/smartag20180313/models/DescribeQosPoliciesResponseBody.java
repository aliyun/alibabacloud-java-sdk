// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeQosPoliciesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QosPolicies")
    public DescribeQosPoliciesResponseBodyQosPolicies qosPolicies;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>97862812-2C7E-4D25-B0D5-B26DAC7FA293</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeQosPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeQosPoliciesResponseBody self = new DescribeQosPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeQosPoliciesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeQosPoliciesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeQosPoliciesResponseBody setQosPolicies(DescribeQosPoliciesResponseBodyQosPolicies qosPolicies) {
        this.qosPolicies = qosPolicies;
        return this;
    }
    public DescribeQosPoliciesResponseBodyQosPolicies getQosPolicies() {
        return this.qosPolicies;
    }

    public DescribeQosPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeQosPoliciesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeQosPoliciesResponseBodyQosPoliciesQosPolicyDpiGroupIds extends TeaModel {
        @NameInMap("DpiGroupId")
        public java.util.List<String> dpiGroupId;

        public static DescribeQosPoliciesResponseBodyQosPoliciesQosPolicyDpiGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeQosPoliciesResponseBodyQosPoliciesQosPolicyDpiGroupIds self = new DescribeQosPoliciesResponseBodyQosPoliciesQosPolicyDpiGroupIds();
            return TeaModel.build(map, self);
        }

        public DescribeQosPoliciesResponseBodyQosPoliciesQosPolicyDpiGroupIds setDpiGroupId(java.util.List<String> dpiGroupId) {
            this.dpiGroupId = dpiGroupId;
            return this;
        }
        public java.util.List<String> getDpiGroupId() {
            return this.dpiGroupId;
        }

    }

    public static class DescribeQosPoliciesResponseBodyQosPoliciesQosPolicyDpiSignatureIds extends TeaModel {
        @NameInMap("DpiSignatureId")
        public java.util.List<String> dpiSignatureId;

        public static DescribeQosPoliciesResponseBodyQosPoliciesQosPolicyDpiSignatureIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeQosPoliciesResponseBodyQosPoliciesQosPolicyDpiSignatureIds self = new DescribeQosPoliciesResponseBodyQosPoliciesQosPolicyDpiSignatureIds();
            return TeaModel.build(map, self);
        }

        public DescribeQosPoliciesResponseBodyQosPoliciesQosPolicyDpiSignatureIds setDpiSignatureId(java.util.List<String> dpiSignatureId) {
            this.dpiSignatureId = dpiSignatureId;
            return this;
        }
        public java.util.List<String> getDpiSignatureId() {
            return this.dpiSignatureId;
        }

    }

    public static class DescribeQosPoliciesResponseBodyQosPoliciesQosPolicy extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DestCidr")
        public String destCidr;

        @NameInMap("DestPortRange")
        public String destPortRange;

        @NameInMap("DpiGroupIds")
        public DescribeQosPoliciesResponseBodyQosPoliciesQosPolicyDpiGroupIds dpiGroupIds;

        @NameInMap("DpiSignatureIds")
        public DescribeQosPoliciesResponseBodyQosPoliciesQosPolicyDpiSignatureIds dpiSignatureIds;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("Name")
        public String name;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("QosId")
        public String qosId;

        @NameInMap("QosPolicyId")
        public String qosPolicyId;

        @NameInMap("SourceCidr")
        public String sourceCidr;

        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        @NameInMap("StartTime")
        public String startTime;

        public static DescribeQosPoliciesResponseBodyQosPoliciesQosPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeQosPoliciesResponseBodyQosPoliciesQosPolicy self = new DescribeQosPoliciesResponseBodyQosPoliciesQosPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeQosPoliciesResponseBodyQosPoliciesQosPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeQosPoliciesResponseBodyQosPoliciesQosPolicy setDestCidr(String destCidr) {
            this.destCidr = destCidr;
            return this;
        }
        public String getDestCidr() {
            return this.destCidr;
        }

        public DescribeQosPoliciesResponseBodyQosPoliciesQosPolicy setDestPortRange(String destPortRange) {
            this.destPortRange = destPortRange;
            return this;
        }
        public String getDestPortRange() {
            return this.destPortRange;
        }

        public DescribeQosPoliciesResponseBodyQosPoliciesQosPolicy setDpiGroupIds(DescribeQosPoliciesResponseBodyQosPoliciesQosPolicyDpiGroupIds dpiGroupIds) {
            this.dpiGroupIds = dpiGroupIds;
            return this;
        }
        public DescribeQosPoliciesResponseBodyQosPoliciesQosPolicyDpiGroupIds getDpiGroupIds() {
            return this.dpiGroupIds;
        }

        public DescribeQosPoliciesResponseBodyQosPoliciesQosPolicy setDpiSignatureIds(DescribeQosPoliciesResponseBodyQosPoliciesQosPolicyDpiSignatureIds dpiSignatureIds) {
            this.dpiSignatureIds = dpiSignatureIds;
            return this;
        }
        public DescribeQosPoliciesResponseBodyQosPoliciesQosPolicyDpiSignatureIds getDpiSignatureIds() {
            return this.dpiSignatureIds;
        }

        public DescribeQosPoliciesResponseBodyQosPoliciesQosPolicy setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeQosPoliciesResponseBodyQosPoliciesQosPolicy setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeQosPoliciesResponseBodyQosPoliciesQosPolicy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeQosPoliciesResponseBodyQosPoliciesQosPolicy setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeQosPoliciesResponseBodyQosPoliciesQosPolicy setQosId(String qosId) {
            this.qosId = qosId;
            return this;
        }
        public String getQosId() {
            return this.qosId;
        }

        public DescribeQosPoliciesResponseBodyQosPoliciesQosPolicy setQosPolicyId(String qosPolicyId) {
            this.qosPolicyId = qosPolicyId;
            return this;
        }
        public String getQosPolicyId() {
            return this.qosPolicyId;
        }

        public DescribeQosPoliciesResponseBodyQosPoliciesQosPolicy setSourceCidr(String sourceCidr) {
            this.sourceCidr = sourceCidr;
            return this;
        }
        public String getSourceCidr() {
            return this.sourceCidr;
        }

        public DescribeQosPoliciesResponseBodyQosPoliciesQosPolicy setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        public DescribeQosPoliciesResponseBodyQosPoliciesQosPolicy setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeQosPoliciesResponseBodyQosPolicies extends TeaModel {
        @NameInMap("QosPolicy")
        public java.util.List<DescribeQosPoliciesResponseBodyQosPoliciesQosPolicy> qosPolicy;

        public static DescribeQosPoliciesResponseBodyQosPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeQosPoliciesResponseBodyQosPolicies self = new DescribeQosPoliciesResponseBodyQosPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeQosPoliciesResponseBodyQosPolicies setQosPolicy(java.util.List<DescribeQosPoliciesResponseBodyQosPoliciesQosPolicy> qosPolicy) {
            this.qosPolicy = qosPolicy;
            return this;
        }
        public java.util.List<DescribeQosPoliciesResponseBodyQosPoliciesQosPolicy> getQosPolicy() {
            return this.qosPolicy;
        }

    }

}
