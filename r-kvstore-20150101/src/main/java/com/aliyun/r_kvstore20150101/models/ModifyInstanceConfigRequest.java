// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceConfigRequest extends TeaModel {
    /**
     * <p>The instance parameter settings that you want to modify. Specify this parameter in the JSON format. The new value of a parameter overwrites the original value.</p>
     * <p>**</p>
     * <p><strong>Description</strong> For more information, see <a href="https://help.aliyun.com/document_detail/259681.html">Supported parameters</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;maxmemory-policy&quot;:&quot;volatile-lru&quot;,&quot;zset-max-ziplist-entries&quot;:128,&quot;zset-max-ziplist-value&quot;:64,&quot;hash-max-ziplist-entries&quot;:512,&quot;set-max-intset-entries&quot;:512}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ParamNoLooseSentinelEnabled")
    public String paramNoLooseSentinelEnabled;

    @NameInMap("ParamNoLooseSentinelPasswordFreeAccess")
    public String paramNoLooseSentinelPasswordFreeAccess;

    @NameInMap("ParamNoLooseSentinelPasswordFreeCommands")
    public String paramNoLooseSentinelPasswordFreeCommands;

    @NameInMap("ParamReplMode")
    public String paramReplMode;

    @NameInMap("ParamSemisyncReplTimeout")
    public String paramSemisyncReplTimeout;

    @NameInMap("ParamSentinelCompatEnable")
    public String paramSentinelCompatEnable;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifyInstanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceConfigRequest self = new ModifyInstanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ModifyInstanceConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceConfigRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyInstanceConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceConfigRequest setParamNoLooseSentinelEnabled(String paramNoLooseSentinelEnabled) {
        this.paramNoLooseSentinelEnabled = paramNoLooseSentinelEnabled;
        return this;
    }
    public String getParamNoLooseSentinelEnabled() {
        return this.paramNoLooseSentinelEnabled;
    }

    public ModifyInstanceConfigRequest setParamNoLooseSentinelPasswordFreeAccess(String paramNoLooseSentinelPasswordFreeAccess) {
        this.paramNoLooseSentinelPasswordFreeAccess = paramNoLooseSentinelPasswordFreeAccess;
        return this;
    }
    public String getParamNoLooseSentinelPasswordFreeAccess() {
        return this.paramNoLooseSentinelPasswordFreeAccess;
    }

    public ModifyInstanceConfigRequest setParamNoLooseSentinelPasswordFreeCommands(String paramNoLooseSentinelPasswordFreeCommands) {
        this.paramNoLooseSentinelPasswordFreeCommands = paramNoLooseSentinelPasswordFreeCommands;
        return this;
    }
    public String getParamNoLooseSentinelPasswordFreeCommands() {
        return this.paramNoLooseSentinelPasswordFreeCommands;
    }

    public ModifyInstanceConfigRequest setParamReplMode(String paramReplMode) {
        this.paramReplMode = paramReplMode;
        return this;
    }
    public String getParamReplMode() {
        return this.paramReplMode;
    }

    public ModifyInstanceConfigRequest setParamSemisyncReplTimeout(String paramSemisyncReplTimeout) {
        this.paramSemisyncReplTimeout = paramSemisyncReplTimeout;
        return this;
    }
    public String getParamSemisyncReplTimeout() {
        return this.paramSemisyncReplTimeout;
    }

    public ModifyInstanceConfigRequest setParamSentinelCompatEnable(String paramSentinelCompatEnable) {
        this.paramSentinelCompatEnable = paramSentinelCompatEnable;
        return this;
    }
    public String getParamSentinelCompatEnable() {
        return this.paramSentinelCompatEnable;
    }

    public ModifyInstanceConfigRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyInstanceConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
