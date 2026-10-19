// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyAccountParameterRequest extends TeaModel {
    /**
     * <p>The account name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demoaccount</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1s4h3oosz5y8ilc7</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The account parameters to modify, in JSON format. The modified values overwrite the original values. For example, if you want to modify only the access-db-id parameter to 1, pass in {&quot;access-db-id&quot;:&quot;1&quot;}.
     * Only two parameters are supported: access-db-id (accessible DB ID) and cu-limit (CU Limit).</p>
     * <blockquote>
     * <p>Notice: Currently, only Tair Serverless KV instances are supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;access-db-id&quot;:&quot;1&quot;,&quot;cu-limit&quot;:&quot;10&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifyAccountParameterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountParameterRequest self = new ModifyAccountParameterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccountParameterRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ModifyAccountParameterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyAccountParameterRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public ModifyAccountParameterRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
