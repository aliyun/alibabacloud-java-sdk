// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class RebootProxyRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1ymwrhvq79zj****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The IDs of the proxy nodes that you want to restart or rebuild. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>90310144,90310144</p>
     */
    @NameInMap("ProxyList")
    public String proxyList;

    /**
     * <p>The IDs of the hosts on which the proxy nodes are deployed. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>36912280,36912282</p>
     */
    @NameInMap("ProxyNodeList")
    public String proxyNodeList;

    /**
     * <p>The type of operation that you want to perform. Valid values:</p>
     * <ul>
     * <li><strong>reboot</strong>: restarts the proxy node.</li>
     * <li><strong>rebuild</strong>: rebuilds the proxy node.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>reboot</p>
     */
    @NameInMap("RebootMode")
    public String rebootMode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static RebootProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootProxyRequest self = new RebootProxyRequest();
        return TeaModel.build(map, self);
    }

    public RebootProxyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RebootProxyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RebootProxyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RebootProxyRequest setProxyList(String proxyList) {
        this.proxyList = proxyList;
        return this;
    }
    public String getProxyList() {
        return this.proxyList;
    }

    public RebootProxyRequest setProxyNodeList(String proxyNodeList) {
        this.proxyNodeList = proxyNodeList;
        return this;
    }
    public String getProxyNodeList() {
        return this.proxyNodeList;
    }

    public RebootProxyRequest setRebootMode(String rebootMode) {
        this.rebootMode = rebootMode;
        return this;
    }
    public String getRebootMode() {
        return this.rebootMode;
    }

    public RebootProxyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RebootProxyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RebootProxyRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
