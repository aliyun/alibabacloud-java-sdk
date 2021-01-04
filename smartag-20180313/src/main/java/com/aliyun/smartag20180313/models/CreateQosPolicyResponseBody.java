// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateQosPolicyResponseBody extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("QosPolicyId")
    public String qosPolicyId;

    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    @NameInMap("SourceCidr")
    public String sourceCidr;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("DestPortRange")
    public String destPortRange;

    @NameInMap("DpiGroupIds")
    public CreateQosPolicyResponseBodyDpiGroupIds dpiGroupIds;

    @NameInMap("Name")
    public String name;

    @NameInMap("DestCidr")
    public String destCidr;

    @NameInMap("DpiSignatureIds")
    public CreateQosPolicyResponseBodyDpiSignatureIds dpiSignatureIds;

    @NameInMap("QosId")
    public String qosId;

    @NameInMap("IpProtocol")
    public String ipProtocol;

    public static CreateQosPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateQosPolicyResponseBody self = new CreateQosPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateQosPolicyResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateQosPolicyResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateQosPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateQosPolicyResponseBody setQosPolicyId(String qosPolicyId) {
        this.qosPolicyId = qosPolicyId;
        return this;
    }
    public String getQosPolicyId() {
        return this.qosPolicyId;
    }

    public CreateQosPolicyResponseBody setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public CreateQosPolicyResponseBody setSourceCidr(String sourceCidr) {
        this.sourceCidr = sourceCidr;
        return this;
    }
    public String getSourceCidr() {
        return this.sourceCidr;
    }

    public CreateQosPolicyResponseBody setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateQosPolicyResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateQosPolicyResponseBody setDestPortRange(String destPortRange) {
        this.destPortRange = destPortRange;
        return this;
    }
    public String getDestPortRange() {
        return this.destPortRange;
    }

    public CreateQosPolicyResponseBody setDpiGroupIds(CreateQosPolicyResponseBodyDpiGroupIds dpiGroupIds) {
        this.dpiGroupIds = dpiGroupIds;
        return this;
    }
    public CreateQosPolicyResponseBodyDpiGroupIds getDpiGroupIds() {
        return this.dpiGroupIds;
    }

    public CreateQosPolicyResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateQosPolicyResponseBody setDestCidr(String destCidr) {
        this.destCidr = destCidr;
        return this;
    }
    public String getDestCidr() {
        return this.destCidr;
    }

    public CreateQosPolicyResponseBody setDpiSignatureIds(CreateQosPolicyResponseBodyDpiSignatureIds dpiSignatureIds) {
        this.dpiSignatureIds = dpiSignatureIds;
        return this;
    }
    public CreateQosPolicyResponseBodyDpiSignatureIds getDpiSignatureIds() {
        return this.dpiSignatureIds;
    }

    public CreateQosPolicyResponseBody setQosId(String qosId) {
        this.qosId = qosId;
        return this;
    }
    public String getQosId() {
        return this.qosId;
    }

    public CreateQosPolicyResponseBody setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public static class CreateQosPolicyResponseBodyDpiGroupIds extends TeaModel {
        @NameInMap("DpiGroupId")
        public java.util.List<String> dpiGroupId;

        public static CreateQosPolicyResponseBodyDpiGroupIds build(java.util.Map<String, ?> map) throws Exception {
            CreateQosPolicyResponseBodyDpiGroupIds self = new CreateQosPolicyResponseBodyDpiGroupIds();
            return TeaModel.build(map, self);
        }

        public CreateQosPolicyResponseBodyDpiGroupIds setDpiGroupId(java.util.List<String> dpiGroupId) {
            this.dpiGroupId = dpiGroupId;
            return this;
        }
        public java.util.List<String> getDpiGroupId() {
            return this.dpiGroupId;
        }

    }

    public static class CreateQosPolicyResponseBodyDpiSignatureIds extends TeaModel {
        @NameInMap("DpiSignatureId")
        public java.util.List<String> dpiSignatureId;

        public static CreateQosPolicyResponseBodyDpiSignatureIds build(java.util.Map<String, ?> map) throws Exception {
            CreateQosPolicyResponseBodyDpiSignatureIds self = new CreateQosPolicyResponseBodyDpiSignatureIds();
            return TeaModel.build(map, self);
        }

        public CreateQosPolicyResponseBodyDpiSignatureIds setDpiSignatureId(java.util.List<String> dpiSignatureId) {
            this.dpiSignatureId = dpiSignatureId;
            return this;
        }
        public java.util.List<String> getDpiSignatureId() {
            return this.dpiSignatureId;
        }

    }

}
