// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class UpgradeProxyRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1vgja77wl7pb****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The IDs of the proxy nodes to upgrade, separated by commas (,). This parameter is valid only for Classic Edition instances.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1vgja77wl7pb****-proxy-0</p>
     */
    @NameInMap("ProxyInstanceIds")
    public String proxyInstanceIds;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The time when the upgrade is performed. Valid values:</p>
     * <ul>
     * <li><strong>Immediately</strong>: The upgrade is immediately performed. This is the default value.</li>
     * <li><strong>MaintainTime</strong>: The upgrade is performed within the O&amp;M window of the instance.</li>
     * </ul>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/473775.html">ModifyInstanceMaintainTime</a> to modify the O&amp;M window of a Redis instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Immediately</p>
     */
    @NameInMap("SwitchTimeMode")
    public Integer switchTimeMode;

    public static UpgradeProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeProxyRequest self = new UpgradeProxyRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeProxyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpgradeProxyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpgradeProxyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpgradeProxyRequest setProxyInstanceIds(String proxyInstanceIds) {
        this.proxyInstanceIds = proxyInstanceIds;
        return this;
    }
    public String getProxyInstanceIds() {
        return this.proxyInstanceIds;
    }

    public UpgradeProxyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpgradeProxyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpgradeProxyRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public UpgradeProxyRequest setSwitchTimeMode(Integer switchTimeMode) {
        this.switchTimeMode = switchTimeMode;
        return this;
    }
    public Integer getSwitchTimeMode() {
        return this.switchTimeMode;
    }

}
