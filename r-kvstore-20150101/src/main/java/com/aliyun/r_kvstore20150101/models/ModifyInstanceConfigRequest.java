// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceConfigRequest extends TeaModel {
    /**
     * <p>The instance parameters to modify, in JSON format. The new values overwrite the existing values. For example, if you want to set only the <strong>maxmemory-policy</strong> parameter to <strong>noeviction</strong>, pass in <code>{&quot;maxmemory-policy&quot;:&quot;noeviction&quot;}</code>.</p>
     * <blockquote>
     * <p>For more information about each parameter, see <a href="https://help.aliyun.com/document_detail/259681.html">Metric description</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;maxmemory-policy&quot;:&quot;volatile-lru&quot;,&quot;zset-max-ziplist-entries&quot;:128,&quot;zset-max-ziplist-value&quot;:64,&quot;hash-max-ziplist-entries&quot;:512,&quot;set-max-intset-entries&quot;:512}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The instance ID.</p>
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

    /**
     * <p>The Sentinel compatibility mode. This parameter applies to non-cluster instances. Valid values:</p>
     * <ul>
     * <li><strong>no</strong> (default): disabled.</li>
     * <li><strong>yes</strong>: enabled.<blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/178911.html">Sentinel compatibility mode</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>yes</p>
     */
    @NameInMap("ParamNoLooseSentinelEnabled")
    public String paramNoLooseSentinelEnabled;

    /**
     * <p>Specifies whether to allow password-free execution of Sentinel-related commands when Sentinel mode is enabled. Valid values:</p>
     * <ul>
     * <li><strong>no</strong> (default): disabled.</li>
     * <li><strong>yes</strong>: enabled. After this parameter is enabled, you can run Sentinel commands without a password on any connection and use the SENTINEL command to listen on the +switch-master channel.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ParamNoLooseSentinelPasswordFreeAccess")
    public String paramNoLooseSentinelPasswordFreeAccess;

    /**
     * <p>After Sentinel mode and the ParamNoLooseSentinelPasswordFreeAccess parameter are enabled, use this parameter to add additional password-free commands (empty by default).</p>
     * <blockquote>
     * <ul>
     * <li>After this parameter is set, the specified commands can be run without a password on any connection. Proceed with caution.</li>
     * <li>Commands must be in lowercase letters. Separate multiple commands with commas (,).</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ParamNoLooseSentinelPasswordFreeCommands")
    public String paramNoLooseSentinelPasswordFreeCommands;

    /**
     * <p>The synchronization pattern. Valid values:</p>
     * <ul>
     * <li><strong>async</strong> (default): asynchronous</li>
     * <li><strong>semisync</strong>: semi-synchronous.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>async</p>
     */
    @NameInMap("ParamReplMode")
    public String paramReplMode;

    /**
     * <p>The degradation threshold for semi-synchronous mode. This parameter is supported only in semi-synchronous mode. Unit: ms. Valid values: 10 to 60000. Default value: 500.</p>
     * <blockquote>
     * <ul>
     * <li>When the synchronization latency exceeds this threshold, the synchronous mode automatically transforms to asynchronous. When the latency is eliminated, the synchronous mode automatically transforms back to semi-synchronous.</li>
     * <li>This parameter is supported only by Tair Enterprise instances. This feature is in public preview.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("ParamSemisyncReplTimeout")
    public String paramSemisyncReplTimeout;

    /**
     * <p>The Sentinel compatibility mode. This parameter applies to instances that use the proxy connection mode in cluster architecture or instances that use the read/write splitting architecture. Valid values:</p>
     * <ul>
     * <li><strong>0</strong> (default): disabled.</li>
     * <li><strong>1</strong>: enabled.<blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/178911.html">Sentinel compatibility mode</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
