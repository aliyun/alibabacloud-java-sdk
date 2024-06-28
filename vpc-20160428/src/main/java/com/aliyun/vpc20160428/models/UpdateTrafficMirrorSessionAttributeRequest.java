// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateTrafficMirrorSessionAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run, without performing the actual request. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong>: sends the request. If the request passes the check, a 2xx HTTP status code is returned and the operation is performed. This is the default value.</li>
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
     * <li><strong>false</strong> (default)</li>
     * <li><strong>true</strong></li>
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
     * <p>The maximum transmission unit (MTU).</p>
     * <p>Valid values: <strong>64 to 9600</strong>. Default value: <strong>1500</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1500</p>
     */
    @NameInMap("PacketLength")
    public Integer packetLength;

    /**
     * <p>The new priority of the traffic mirror session. Valid values: <strong>1</strong> to <strong>32766</strong>.</p>
     * <p>A smaller value indicates a higher priority. You cannot specify identical priorities for traffic mirror sessions that are created in the same region by using the same account.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The region ID of the traffic mirror session. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list. For more information about the regions that support traffic mirroring, see <a href="https://help.aliyun.com/document_detail/207513.html">Overview of traffic mirroring</a>.</p>
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
     * <p>The ID of the traffic mirror filter.</p>
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
     * <p>The ID of the traffic mirror session.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tms-j6cla50buc44ap8tu****</p>
     */
    @NameInMap("TrafficMirrorSessionId")
    public String trafficMirrorSessionId;

    /**
     * <p>The new name of the traffic mirror session.</p>
     * <p>The name must be 1 to 128 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("TrafficMirrorSessionName")
    public String trafficMirrorSessionName;

    /**
     * <p>The ID of the traffic mirror destination.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-j6c2fp57q8rr47rp*****</p>
     */
    @NameInMap("TrafficMirrorTargetId")
    public String trafficMirrorTargetId;

    /**
     * <p>The new type of the traffic mirror destination. Valid values:</p>
     * <ul>
     * <li><strong>NetworkInterface</strong>: an elastic network interface (ENI)</li>
     * <li><strong>SLB</strong>: an internal-facing Server Load Balancer (SLB) instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NetworkInterface</p>
     */
    @NameInMap("TrafficMirrorTargetType")
    public String trafficMirrorTargetType;

    /**
     * <p>The VXLAN network identifier (VNI) that is used to distinguish different mirrored traffic. Valid values: <strong>0</strong> to <strong>16777215</strong>.</p>
     * <p>You can use VNIs to identify mirrored traffic from different sessions at the traffic mirror destination. If you do not specify a VNI, the system randomly allocates a VNI. If you want the system to randomly allocate a VNI, ignore this parameter.</p>
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
