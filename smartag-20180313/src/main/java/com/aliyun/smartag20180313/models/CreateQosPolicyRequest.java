// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateQosPolicyRequest extends TeaModel {
    /**
     * <p>The description of the traffic classification rule for the QoS policy.</p>
     * <p>The description must be 1 to 512 characters in length and must start with a letter or a Chinese character. It can contain digits, underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination CIDR block.</p>
     * <p>The destination CIDR block is in CIDR notation. Example: 192.168.10.0/24.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.20.0/24</p>
     */
    @NameInMap("DestCidr")
    public String destCidr;

    /**
     * <p>The destination port range.</p>
     * <p>Valid values: <strong>-1</strong> or <strong>1</strong> to <strong>65535</strong>.</p>
     * <p>Examples of destination port range formats:</p>
     * <ul>
     * <li><strong>1/200</strong>: port range 1 to 200.</li>
     * <li><strong>80/80</strong>: port 80.</li>
     * <li><strong>-1/-1</strong>: all ports.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80/80</p>
     */
    @NameInMap("DestPortRange")
    public String destPortRange;

    /**
     * <p>The list of application group IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("DpiGroupIds")
    public java.util.List<String> dpiGroupIds;

    /**
     * <p>The list of application IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DpiSignatureIds")
    public java.util.List<String> dpiSignatureIds;

    /**
     * <p>The time when the traffic classification rule expires.</p>
     * <p>The time is expressed in ISO 8601 format and uses UTC+8. Format: <code>YYYY-MM-DDThh:mm:ss+0800</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-09-14T16:41:33+0800</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The protocol type to which the traffic classification rule applies.</p>
     * <p>For the protocol types supported by the traffic classification rule, refer to the console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The name of the traffic classification rule for the QoS policy.</p>
     * <p>The name must be 2 to 100 characters in length and must start with a letter or a Chinese character. It can contain digits, hyphens (-), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The priority of the rate limiting rule to which the traffic classification rule belongs.</p>
     * <p>Valid values: <strong>1</strong> to <strong>3</strong>. A smaller value indicates a higher priority.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The instance ID of the QoS policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-xitd8690ucu8ro****</p>
     */
    @NameInMap("QosId")
    public String qosId;

    /**
     * <p>The region ID of the QoS policy instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source CIDR block.</p>
     * <p>The source CIDR block is in CIDR notation. Example: 192.168.1.0/24.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.10.0/24</p>
     */
    @NameInMap("SourceCidr")
    public String sourceCidr;

    /**
     * <p>The source port range.</p>
     * <p>Valid values: <strong>-1</strong> or <strong>1</strong> to <strong>65535</strong>.</p>
     * <p>Examples of source port range formats:</p>
     * <ul>
     * <li><strong>1/200</strong>: port range 1 to 200.</li>
     * <li><strong>80/80</strong>: port 80.</li>
     * <li><strong>-1/-1</strong>: all ports.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80/80</p>
     */
    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    /**
     * <p>The effective period start time of the traffic categorization rule for the QoS policy.</p>
     * <p>The time is expressed in ISO 8601 format and uses UTC+8. Format: <code>YYYY-MM-DDThh:mm:ss+0800</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-14T16:41:33+0800</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static CreateQosPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQosPolicyRequest self = new CreateQosPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateQosPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateQosPolicyRequest setDestCidr(String destCidr) {
        this.destCidr = destCidr;
        return this;
    }
    public String getDestCidr() {
        return this.destCidr;
    }

    public CreateQosPolicyRequest setDestPortRange(String destPortRange) {
        this.destPortRange = destPortRange;
        return this;
    }
    public String getDestPortRange() {
        return this.destPortRange;
    }

    public CreateQosPolicyRequest setDpiGroupIds(java.util.List<String> dpiGroupIds) {
        this.dpiGroupIds = dpiGroupIds;
        return this;
    }
    public java.util.List<String> getDpiGroupIds() {
        return this.dpiGroupIds;
    }

    public CreateQosPolicyRequest setDpiSignatureIds(java.util.List<String> dpiSignatureIds) {
        this.dpiSignatureIds = dpiSignatureIds;
        return this;
    }
    public java.util.List<String> getDpiSignatureIds() {
        return this.dpiSignatureIds;
    }

    public CreateQosPolicyRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateQosPolicyRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public CreateQosPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateQosPolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateQosPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateQosPolicyRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateQosPolicyRequest setQosId(String qosId) {
        this.qosId = qosId;
        return this;
    }
    public String getQosId() {
        return this.qosId;
    }

    public CreateQosPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateQosPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateQosPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateQosPolicyRequest setSourceCidr(String sourceCidr) {
        this.sourceCidr = sourceCidr;
        return this;
    }
    public String getSourceCidr() {
        return this.sourceCidr;
    }

    public CreateQosPolicyRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public CreateQosPolicyRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
