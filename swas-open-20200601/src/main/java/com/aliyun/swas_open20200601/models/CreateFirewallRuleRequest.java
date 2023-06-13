// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateFirewallRuleRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. ****For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the simple application server.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The port range. Valid values: 1 to 65535. Specify a port range in the format of \<start port number>/\<end port number>. Example: `1024/1055`, which indicates that the port range of 1024 to 1055.</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The region ID of the simple application server.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The remarks of the firewall rule.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The transport layer protocol. Valid values:</p>
     * <br>
     * <p>*   TCP: the TCP protocol</p>
     * <p>*   UDP: the UDP protocol</p>
     * <p>*   TCP+UDP: the TCP and UDP protocols</p>
     */
    @NameInMap("RuleProtocol")
    public String ruleProtocol;

    public static CreateFirewallRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFirewallRuleRequest self = new CreateFirewallRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateFirewallRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateFirewallRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateFirewallRuleRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public CreateFirewallRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateFirewallRuleRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateFirewallRuleRequest setRuleProtocol(String ruleProtocol) {
        this.ruleProtocol = ruleProtocol;
        return this;
    }
    public String getRuleProtocol() {
        return this.ruleProtocol;
    }

}
