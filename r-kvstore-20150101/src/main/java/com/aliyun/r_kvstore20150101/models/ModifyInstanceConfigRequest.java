// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceConfigRequest extends TeaModel {
    /**
     * <p>需修改的实例参数，格式为JSON，修改后的值会覆盖原来的值。例如您只希望修改<strong>maxmemory-policy</strong>参数为<strong>noeviction</strong>，您可以传入<code>{&quot;maxmemory-policy&quot;:&quot;noeviction&quot;}</code>。</p>
     * <blockquote>
     * <p>关于各参数的详细说明，请参见<a href="https://help.aliyun.com/document_detail/259681.html">参数说明</a>。</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;maxmemory-policy&quot;:&quot;volatile-lru&quot;,&quot;zset-max-ziplist-entries&quot;:128,&quot;zset-max-ziplist-value&quot;:64,&quot;hash-max-ziplist-entries&quot;:512,&quot;set-max-intset-entries&quot;:512}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>实例ID。</p>
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
     * <p>哨兵兼容模式，适用于非集群实例。取值说明：</p>
     * <ul>
     * <li><strong>no</strong>（默认）：未开启</li>
     * <li><strong>yes</strong>：开启<blockquote>
     * <p>更多信息请参见<a href="https://help.aliyun.com/document_detail/178911.html">Sentinel兼容模式</a>。</p>
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
     * <p>开启哨兵模式时，是否允许免密执行Sentinel相关命令，取值说明：</p>
     * <ul>
     * <li><strong>no</strong>（默认）：关闭。</li>
     * <li><strong>yes</strong>：开启。开启后，可以在任意连接上免密执行Sentinel命令以及使用SENTINEL命令监听+switch-master通道。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ParamNoLooseSentinelPasswordFreeAccess")
    public String paramNoLooseSentinelPasswordFreeAccess;

    /**
     * <p>启用哨兵模式及ParamNoLooseSentinelPasswordFreeAccess参数后，可通过本参数添加额外的免密命令列表（默认为空）。</p>
     * <blockquote>
     * <ul>
     * <li>设置后可在任意连接上无需密码执行对应命令，请谨慎操作。</li>
     * <li>命令需使用小写字母，多个命令以英文逗号(,)分隔。</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ParamNoLooseSentinelPasswordFreeCommands")
    public String paramNoLooseSentinelPasswordFreeCommands;

    /**
     * <p>同步模式：</p>
     * <ul>
     * <li><strong>async</strong>（默认）：异步</li>
     * <li><strong>semisync</strong>：半同步</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>async</p>
     */
    @NameInMap("ParamReplMode")
    public String paramReplMode;

    /**
     * <p>半同步模式的降级阈值。仅半同步支持配置该参数，单位为ms，取值范围为10~60000，默认为500。</p>
     * <blockquote>
     * <ul>
     * <li>当同步延迟超出该阈值时，同步模式会自动转为异步，当同步延迟消除后，同步模式会自动转换为半同步。</li>
     * <li>仅Tair企业版实例支持，该功能公测中。</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("ParamSemisyncReplTimeout")
    public String paramSemisyncReplTimeout;

    /**
     * <p>哨兵兼容模式，适用于集群架构代理连接模式或读写分离架构的实例，取值说明：</p>
     * <ul>
     * <li><strong>0</strong>（默认）：未开启</li>
     * <li><strong>1</strong>：开启<blockquote>
     * <p>更多信息请参见<a href="https://help.aliyun.com/document_detail/178911.html">Sentinel兼容模式</a>。</p>
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
