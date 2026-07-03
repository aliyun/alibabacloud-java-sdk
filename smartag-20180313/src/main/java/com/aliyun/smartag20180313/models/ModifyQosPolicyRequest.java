// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyQosPolicyRequest extends TeaModel {
    /**
     * <p>The description of the stream classification rule.</p>
     * <p>The description must be 1 to 512 characters in length. It must start with a letter and can contain digits, underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination CIDR block.</p>
     * <p>The destination CIDR block must be in CIDR format. Example: 192.168.10.0/24.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.20.0/24</p>
     */
    @NameInMap("DestCidr")
    public String destCidr;

    /**
     * <p>The destination port range.</p>
     * <p>Valid values: <strong>-1</strong> or <strong>1</strong> to <strong>65535</strong>.</p>
     * <p>Examples of how to specify a port range:</p>
     * <ul>
     * <li><strong>1/200</strong>: ports 1 through 200.</li>
     * <li><strong>80/80</strong>: port 80.</li>
     * <li><strong>-1/-1</strong>: all ports.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>300/400</p>
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
     * <p>The time when the stream classification rule expires.</p>
     * <p>Specify the time in the ISO 8601 standard. The time must be in UTC+8. Format: YYYY-MM-DDThh:mm:ss+0800.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-14T16:41:33+0800</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The protocol.</p>
     * <p>For a list of supported protocols, see the information in the console.</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The name of the stream classification rule.</p>
     * <p>The name must be 2 to 100 characters in length. It must start with a letter and can contain digits, underscores (_), and hyphens (-).</p>
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
     * <p>The priority of the throttling rule to which the stream classification rule belongs.</p>
     * <p>Valid values: 1 to <strong>3</strong>. A smaller value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The ID of the QoS policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-xitd8690ucu8ro****</p>
     */
    @NameInMap("QosId")
    public String qosId;

    /**
     * <p>The ID of the stream classification rule in the QoS policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qospy-427m9fo6wkh****</p>
     */
    @NameInMap("QosPolicyId")
    public String qosPolicyId;

    /**
     * <p>The ID of the region where the QoS policy is created.</p>
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
     * <p>The source CIDR block must be in CIDR format. Example: 192.168.1.0/24.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.10.0/24</p>
     */
    @NameInMap("SourceCidr")
    public String sourceCidr;

    /**
     * <p>The source port range.</p>
     * <p>Valid values: <strong>-1</strong> or <strong>1</strong> to <strong>65535</strong>.</p>
     * <p>Examples of how to specify a port range:</p>
     * <ul>
     * <li><strong>1/200</strong>: ports 1 through 200.</li>
     * <li><strong>80/80</strong>: port 80.</li>
     * <li><strong>-1/-1</strong>: all ports.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1/200</p>
     */
    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    /**
     * <p>The time when the stream classification rule takes effect.</p>
     * <p>Specify the time in the ISO 8601 standard. The time must be in UTC+8. Format: YYYY-MM-DDThh:mm:ss+0800.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-07-14T16:41:33+0800</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ModifyQosPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyQosPolicyRequest self = new ModifyQosPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyQosPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyQosPolicyRequest setDestCidr(String destCidr) {
        this.destCidr = destCidr;
        return this;
    }
    public String getDestCidr() {
        return this.destCidr;
    }

    public ModifyQosPolicyRequest setDestPortRange(String destPortRange) {
        this.destPortRange = destPortRange;
        return this;
    }
    public String getDestPortRange() {
        return this.destPortRange;
    }

    public ModifyQosPolicyRequest setDpiGroupIds(java.util.List<String> dpiGroupIds) {
        this.dpiGroupIds = dpiGroupIds;
        return this;
    }
    public java.util.List<String> getDpiGroupIds() {
        return this.dpiGroupIds;
    }

    public ModifyQosPolicyRequest setDpiSignatureIds(java.util.List<String> dpiSignatureIds) {
        this.dpiSignatureIds = dpiSignatureIds;
        return this;
    }
    public java.util.List<String> getDpiSignatureIds() {
        return this.dpiSignatureIds;
    }

    public ModifyQosPolicyRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ModifyQosPolicyRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public ModifyQosPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyQosPolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyQosPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyQosPolicyRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public ModifyQosPolicyRequest setQosId(String qosId) {
        this.qosId = qosId;
        return this;
    }
    public String getQosId() {
        return this.qosId;
    }

    public ModifyQosPolicyRequest setQosPolicyId(String qosPolicyId) {
        this.qosPolicyId = qosPolicyId;
        return this;
    }
    public String getQosPolicyId() {
        return this.qosPolicyId;
    }

    public ModifyQosPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyQosPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyQosPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyQosPolicyRequest setSourceCidr(String sourceCidr) {
        this.sourceCidr = sourceCidr;
        return this;
    }
    public String getSourceCidr() {
        return this.sourceCidr;
    }

    public ModifyQosPolicyRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public ModifyQosPolicyRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
