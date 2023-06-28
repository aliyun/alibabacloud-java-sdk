// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateRulesRequest extends TeaModel {
    /**
     * <p>The frontend protocol that is used by the SLB instance.</p>
     * <br>
     * <p>>  This parameter is required when listeners that use different protocols listen on the same port.</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The forwarding rules to be created. A maximum of 10 forwarding rules can be specified in each request. Each forwarding rule contains the following parameters:</p>
     * <br>
     * <p>*   **RuleName**: Required. The value must be of the STRING type. The name of the forwarding rule. The name must be 1 to 40 characters in length, and can contain only letters, digits, hyphens (-), forward slashes (/), periods (.),and underscores (\_). Forwarding rule names must be unique within each listener.</p>
     * <p>*   **Domain**: Optional. The value must be of the STRING type. The domain name to be associated with the forwarding rule. You must specify at least this parameter or **Url**.</p>
     * <p>*   **Url**: Optional. The URL to be specified in the forwarding rule. The value must be of the STRING type. The URL must be 1 to 80 characters in length, and can contain only letters, digits, hyphens (-), forward slashes (/), periods (.), percent signs (%), question marks (?), number signs (#), and ampersands (&). The URL must not be a single forward slash (/). However, it must start with a forward slash (/). You must specify at least the URL or **Domain**.</p>
     * <p>*   **VServerGroupId**: Required. The value must be of the STRING type. The ID of the vServer group to be specified in the forwarding rule.</p>
     * <br>
     * <p>>  You must specify at least `Domain` or `Url`. You can also specify both. The combination of `Domain` and `Url` must be unique within a listener.</p>
     */
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    /**
     * <p>The frontend port that is used by the Server Load Balancer (SLB) instance.</p>
     * <br>
     * <p>Valid values: **1 to 65535**.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the SLB instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RuleList")
    public String ruleList;

    public static CreateRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRulesRequest self = new CreateRulesRequest();
        return TeaModel.build(map, self);
    }

    public CreateRulesRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public CreateRulesRequest setListenerProtocol(String listenerProtocol) {
        this.listenerProtocol = listenerProtocol;
        return this;
    }
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    public CreateRulesRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public CreateRulesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateRulesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRulesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateRulesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateRulesRequest setRuleList(String ruleList) {
        this.ruleList = ruleList;
        return this;
    }
    public String getRuleList() {
        return this.ruleList;
    }

}
