// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateTrafficMirrorSessionRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: prechecks the request without creating the traffic mirror session. The system checks whether the required parameters are specified, the request format, and the limits. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends the request. If the request passes the precheck, the traffic mirror session is created.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to enable the traffic mirror session. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): disables the traffic mirror session.</p>
     * </li>
     * <li><p><strong>true</strong>: enables the traffic mirror session.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The length of the original mirrored packet, excluding the length of the VXLAN packet. Default value: <strong>1500</strong>. Valid values: <strong>64</strong> to <strong>8500</strong>. Unit: bytes.</p>
     * <ul>
     * <li><p>The value of this parameter affects the length of the packet received by the traffic mirror destination. For more information, see the mirrored packet length and MTU limits in <a href="https://help.aliyun.com/document_detail/207513.html">Traffic mirroring overview</a>.</p>
     * </li>
     * <li><p>This parameter is available only in specific regions. For more information, see the description of the mirrored packet length parameter in <a href="https://help.aliyun.com/document_detail/207514.html">Create and manage traffic mirroring</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1500</p>
     */
    @NameInMap("PacketLength")
    public Integer packetLength;

    /**
     * <p>The priority of the traffic mirror session. Valid values: <strong>1</strong> to <strong>32766</strong>.</p>
     * <p>A smaller value indicates a higher priority. The priorities of traffic mirror sessions created by the same Alibaba Cloud account in the same region must be unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The region ID of the traffic mirror session. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list. For more information about the regions that support traffic mirroring, see <a href="https://help.aliyun.com/document_detail/207513.html">Traffic mirroring overview</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hongkong</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the traffic mirroring belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4ph****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags of the resource.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateTrafficMirrorSessionRequestTag> tag;

    /**
     * <p>The instance ID of the traffic mirror filter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tmf-j6cmls82xnc86vtpe****</p>
     */
    @NameInMap("TrafficMirrorFilterId")
    public String trafficMirrorFilterId;

    /**
     * <p>The description of the traffic mirror session.</p>
     * <p>The description must be 1 to 256 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a trafficmirrorsession.</p>
     */
    @NameInMap("TrafficMirrorSessionDescription")
    public String trafficMirrorSessionDescription;

    /**
     * <p>The name of the traffic mirror session.</p>
     * <p>The name must be 1 to 128 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TrafficMirrorSessionName")
    public String trafficMirrorSessionName;

    /**
     * <p>The instance ID of the traffic mirror source. Currently, network interface controllers (NICs) are supported as traffic mirror sources. The default value of <strong>N</strong> is <strong>1</strong>, which means that you can add only one traffic mirror source to a traffic mirror session.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-j6c2fp57q8rr47rp****</p>
     */
    @NameInMap("TrafficMirrorSourceIds")
    public java.util.List<String> trafficMirrorSourceIds;

    /**
     * <p>The instance ID of the traffic mirror destination. Currently, network interface controllers (NICs) and internal-facing SLB instances are supported as traffic mirror destinations.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-j6c8znm5l1yt4sox****</p>
     */
    @NameInMap("TrafficMirrorTargetId")
    public String trafficMirrorTargetId;

    /**
     * <p>The type of the traffic mirror destination. Valid values:</p>
     * <ul>
     * <li><p><strong>NetworkInterface</strong>: network interface controllers (NICs).</p>
     * </li>
     * <li><p><strong>SLB</strong>: internal-facing SLB instances.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NetworkInterface</p>
     */
    @NameInMap("TrafficMirrorTargetType")
    public String trafficMirrorTargetType;

    /**
     * <p>The VXLAN network identifier (VNI) that is used to distinguish different mirrored data. Valid values: <strong>0</strong> to <strong>16777215</strong>.</p>
     * <p>You can use the VNI to distinguish the mirrored data of different sessions at the traffic mirror destination. You can specify a custom VNI or let the system randomly allocate the value. If you want the system to randomly allocate the VNI, do not specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VirtualNetworkId")
    public Integer virtualNetworkId;

    public static CreateTrafficMirrorSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficMirrorSessionRequest self = new CreateTrafficMirrorSessionRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrafficMirrorSessionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTrafficMirrorSessionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTrafficMirrorSessionRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateTrafficMirrorSessionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTrafficMirrorSessionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTrafficMirrorSessionRequest setPacketLength(Integer packetLength) {
        this.packetLength = packetLength;
        return this;
    }
    public Integer getPacketLength() {
        return this.packetLength;
    }

    public CreateTrafficMirrorSessionRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateTrafficMirrorSessionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTrafficMirrorSessionRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateTrafficMirrorSessionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTrafficMirrorSessionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTrafficMirrorSessionRequest setTag(java.util.List<CreateTrafficMirrorSessionRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateTrafficMirrorSessionRequestTag> getTag() {
        return this.tag;
    }

    public CreateTrafficMirrorSessionRequest setTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
        return this;
    }
    public String getTrafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

    public CreateTrafficMirrorSessionRequest setTrafficMirrorSessionDescription(String trafficMirrorSessionDescription) {
        this.trafficMirrorSessionDescription = trafficMirrorSessionDescription;
        return this;
    }
    public String getTrafficMirrorSessionDescription() {
        return this.trafficMirrorSessionDescription;
    }

    public CreateTrafficMirrorSessionRequest setTrafficMirrorSessionName(String trafficMirrorSessionName) {
        this.trafficMirrorSessionName = trafficMirrorSessionName;
        return this;
    }
    public String getTrafficMirrorSessionName() {
        return this.trafficMirrorSessionName;
    }

    public CreateTrafficMirrorSessionRequest setTrafficMirrorSourceIds(java.util.List<String> trafficMirrorSourceIds) {
        this.trafficMirrorSourceIds = trafficMirrorSourceIds;
        return this;
    }
    public java.util.List<String> getTrafficMirrorSourceIds() {
        return this.trafficMirrorSourceIds;
    }

    public CreateTrafficMirrorSessionRequest setTrafficMirrorTargetId(String trafficMirrorTargetId) {
        this.trafficMirrorTargetId = trafficMirrorTargetId;
        return this;
    }
    public String getTrafficMirrorTargetId() {
        return this.trafficMirrorTargetId;
    }

    public CreateTrafficMirrorSessionRequest setTrafficMirrorTargetType(String trafficMirrorTargetType) {
        this.trafficMirrorTargetType = trafficMirrorTargetType;
        return this;
    }
    public String getTrafficMirrorTargetType() {
        return this.trafficMirrorTargetType;
    }

    public CreateTrafficMirrorSessionRequest setVirtualNetworkId(Integer virtualNetworkId) {
        this.virtualNetworkId = virtualNetworkId;
        return this;
    }
    public Integer getVirtualNetworkId() {
        return this.virtualNetworkId;
    }

    public static class CreateTrafficMirrorSessionRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>A tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>A tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateTrafficMirrorSessionRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateTrafficMirrorSessionRequestTag self = new CreateTrafficMirrorSessionRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateTrafficMirrorSessionRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTrafficMirrorSessionRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
