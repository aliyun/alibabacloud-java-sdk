// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateQosPolicyResponseBody extends TeaModel {
    /**
     * <p>The description of the traffic classification rule.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.10.0/24</p>
     */
    @NameInMap("DestCidr")
    public String destCidr;

    /**
     * <p>The destination port range.</p>
     * 
     * <strong>example:</strong>
     * <p>80/80</p>
     */
    @NameInMap("DestPortRange")
    public String destPortRange;

    @NameInMap("DpiGroupIds")
    public CreateQosPolicyResponseBodyDpiGroupIds dpiGroupIds;

    @NameInMap("DpiSignatureIds")
    public CreateQosPolicyResponseBodyDpiSignatureIds dpiSignatureIds;

    /**
     * <p>The time when the traffic classification rule expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-09-14T16:41:33+0800</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The protocol that applies to the traffic classification rule.</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The name of the traffic classification rule.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The priority of the traffic throttling policy to which the traffic classification rule belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The ID of the QoS policy.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-xitd8690ucu8ro****</p>
     */
    @NameInMap("QosId")
    public String qosId;

    /**
     * <p>The ID of the traffic classification rule.</p>
     * 
     * <strong>example:</strong>
     * <p>qospy-xhwhyuo43l********</p>
     */
    @NameInMap("QosPolicyId")
    public String qosPolicyId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>97862812-2C7E-4D25-B0D5-B26DAC7FA293</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The source CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.10.0/24</p>
     */
    @NameInMap("SourceCidr")
    public String sourceCidr;

    /**
     * <p>The source port range.</p>
     * 
     * <strong>example:</strong>
     * <p>80/80</p>
     */
    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    /**
     * <p>The time when the traffic classification rule takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-14T16:41:33+0800</p>
     */
    @NameInMap("StartTime")
    public String startTime;

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

    public CreateQosPolicyResponseBody setDestCidr(String destCidr) {
        this.destCidr = destCidr;
        return this;
    }
    public String getDestCidr() {
        return this.destCidr;
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

    public CreateQosPolicyResponseBody setDpiSignatureIds(CreateQosPolicyResponseBodyDpiSignatureIds dpiSignatureIds) {
        this.dpiSignatureIds = dpiSignatureIds;
        return this;
    }
    public CreateQosPolicyResponseBodyDpiSignatureIds getDpiSignatureIds() {
        return this.dpiSignatureIds;
    }

    public CreateQosPolicyResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateQosPolicyResponseBody setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public CreateQosPolicyResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateQosPolicyResponseBody setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateQosPolicyResponseBody setQosId(String qosId) {
        this.qosId = qosId;
        return this;
    }
    public String getQosId() {
        return this.qosId;
    }

    public CreateQosPolicyResponseBody setQosPolicyId(String qosPolicyId) {
        this.qosPolicyId = qosPolicyId;
        return this;
    }
    public String getQosPolicyId() {
        return this.qosPolicyId;
    }

    public CreateQosPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateQosPolicyResponseBody setSourceCidr(String sourceCidr) {
        this.sourceCidr = sourceCidr;
        return this;
    }
    public String getSourceCidr() {
        return this.sourceCidr;
    }

    public CreateQosPolicyResponseBody setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public CreateQosPolicyResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
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
