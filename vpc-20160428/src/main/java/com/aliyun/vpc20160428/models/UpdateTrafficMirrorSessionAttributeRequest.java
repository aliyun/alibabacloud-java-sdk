// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateTrafficMirrorSessionAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may differ for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the configuration of the traffic mirror session is modified.</p>
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
     * <li><p><strong>false</strong> (default): does not enable the traffic mirror session.</p>
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
     * <p>The maximum length of the mirrored original packet, excluding the VXLAN header. Default value: <strong>1500</strong>. Valid values: <strong>64</strong> to <strong>8500</strong>. Unit: bytes.</p>
     * <ul>
     * <li><p>The value of this parameter affects the length of packets received at the traffic mirror destination. For more information, see the mirrored packet length and MTU limits in <a href="https://help.aliyun.com/document_detail/207513.html">Traffic mirroring overview</a>.</p>
     * </li>
     * <li><p>This parameter is available only in specific regions. For more information, see the mirrored packet length parameter description in <a href="https://help.aliyun.com/document_detail/207514.html">Create and manage traffic mirror sessions</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1500</p>
     */
    @NameInMap("PacketLength")
    public Integer packetLength;

    /**
     * <p>The new priority of traffic mirror session. Valid values: <strong>1</strong> to <strong>32766</strong>.
     * A smaller value indicates a higher priority. The priorities of traffic mirror sessions created by the same account in the same region must be unique.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The region ID of the traffic mirror session. You can call <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> to query the most recent region list. For information about the regions that support traffic mirroring, see <a href="https://help.aliyun.com/document_detail/207513.html">Traffic mirroring overview</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hongkong</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The instance ID of the new traffic mirror filter.</p>
     * 
     * <strong>example:</strong>
     * <p>tmf-j6cmls82xnc86vtpe****</p>
     */
    @NameInMap("TrafficMirrorFilterId")
    public String trafficMirrorFilterId;

    /**
     * <p>The new description of the traffic mirror session.</p>
     * <p>The description must be 1 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a new session.</p>
     */
    @NameInMap("TrafficMirrorSessionDescription")
    public String trafficMirrorSessionDescription;

    /**
     * <p>The instance ID of the traffic mirror session to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tms-j6cla50buc44ap8tu****</p>
     */
    @NameInMap("TrafficMirrorSessionId")
    public String trafficMirrorSessionId;

    /**
     * <p>The new name of the traffic mirror session.</p>
     * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("TrafficMirrorSessionName")
    public String trafficMirrorSessionName;

    /**
     * <p>The instance ID of the new traffic mirror destination.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-j6c2fp57q8rr47rp*****</p>
     */
    @NameInMap("TrafficMirrorTargetId")
    public String trafficMirrorTargetId;

    /**
     * <p>The new traffic mirror destination type. Valid values:</p>
     * <ul>
     * <li><p><strong>NetworkInterface</strong>: network interface controller (NIC).</p>
     * </li>
     * <li><p><strong>SLB</strong>: private network load balancing instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NetworkInterface</p>
     */
    @NameInMap("TrafficMirrorTargetType")
    public String trafficMirrorTargetType;

    /**
     * <p>The new VXLAN network identifier (VNI) that is used to distinguish mirrored data from different traffic mirror sessions. Valid values: <strong>0</strong> to <strong>16777215</strong>.
     * You can use the VNI to identify mirrored data from different sessions at the traffic mirror destination. You can specify a custom VNI or use a system-allocated value. If you want the system to randomly allocate a VNI, do not configure this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("VirtualNetworkId")
    public Integer virtualNetworkId;

    public static UpdateTrafficMirrorSessionAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrafficMirrorSessionAttributeRequest self = new UpdateTrafficMirrorSessionAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTrafficMirrorSessionAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTrafficMirrorSessionAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateTrafficMirrorSessionAttributeRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateTrafficMirrorSessionAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateTrafficMirrorSessionAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateTrafficMirrorSessionAttributeRequest setPacketLength(Integer packetLength) {
        this.packetLength = packetLength;
        return this;
    }
    public Integer getPacketLength() {
        return this.packetLength;
    }

    public UpdateTrafficMirrorSessionAttributeRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdateTrafficMirrorSessionAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateTrafficMirrorSessionAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateTrafficMirrorSessionAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateTrafficMirrorSessionAttributeRequest setTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
        return this;
    }
    public String getTrafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

    public UpdateTrafficMirrorSessionAttributeRequest setTrafficMirrorSessionDescription(String trafficMirrorSessionDescription) {
        this.trafficMirrorSessionDescription = trafficMirrorSessionDescription;
        return this;
    }
    public String getTrafficMirrorSessionDescription() {
        return this.trafficMirrorSessionDescription;
    }

    public UpdateTrafficMirrorSessionAttributeRequest setTrafficMirrorSessionId(String trafficMirrorSessionId) {
        this.trafficMirrorSessionId = trafficMirrorSessionId;
        return this;
    }
    public String getTrafficMirrorSessionId() {
        return this.trafficMirrorSessionId;
    }

    public UpdateTrafficMirrorSessionAttributeRequest setTrafficMirrorSessionName(String trafficMirrorSessionName) {
        this.trafficMirrorSessionName = trafficMirrorSessionName;
        return this;
    }
    public String getTrafficMirrorSessionName() {
        return this.trafficMirrorSessionName;
    }

    public UpdateTrafficMirrorSessionAttributeRequest setTrafficMirrorTargetId(String trafficMirrorTargetId) {
        this.trafficMirrorTargetId = trafficMirrorTargetId;
        return this;
    }
    public String getTrafficMirrorTargetId() {
        return this.trafficMirrorTargetId;
    }

    public UpdateTrafficMirrorSessionAttributeRequest setTrafficMirrorTargetType(String trafficMirrorTargetType) {
        this.trafficMirrorTargetType = trafficMirrorTargetType;
        return this;
    }
    public String getTrafficMirrorTargetType() {
        return this.trafficMirrorTargetType;
    }

    public UpdateTrafficMirrorSessionAttributeRequest setVirtualNetworkId(Integer virtualNetworkId) {
        this.virtualNetworkId = virtualNetworkId;
        return this;
    }
    public Integer getVirtualNetworkId() {
        return this.virtualNetworkId;
    }

}
