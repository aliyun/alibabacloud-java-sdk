// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLJobSettings extends TeaModel {
    /**
     * <p>沿用 DLC 的高级设置键值约定；运行时值须为字符串且键不能为空，具体选项是否生效取决于运行环境支持。</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;EnableDinD&quot;:&quot;true&quot;}</p>
     */
    @NameInMap("AdvancedSettings")
    public java.util.Map<String, ?> advancedSettings;

    /**
     * <p>作业关联用户 ID，沿用 DLC 的受信调用方规则。</p>
     * 
     * <strong>example:</strong>
     * <p>166924</p>
     */
    @NameInMap("BusinessUserId")
    public String businessUserId;

    /**
     * <p>调用方标识，与 DLC Settings.Caller 一致。</p>
     * 
     * <strong>example:</strong>
     * <p>pai-cli</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <p>沿用 DLC 的 RDMA 配置，是否生效取决于配额和运行环境。</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableRDMA")
    public Boolean enableRDMA;

    /**
     * <p>工作流 ID，与 DLC Settings.PipelineId 一致。</p>
     * 
     * <strong>example:</strong>
     * <p>pid-123456</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <p>DLC 作业标签，场景使用 rls.scene。</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;rls.scene&quot;:&quot;code-rl&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, String> tags;

    public static RLJobSettings build(java.util.Map<String, ?> map) throws Exception {
        RLJobSettings self = new RLJobSettings();
        return TeaModel.build(map, self);
    }

    public RLJobSettings setAdvancedSettings(java.util.Map<String, ?> advancedSettings) {
        this.advancedSettings = advancedSettings;
        return this;
    }
    public java.util.Map<String, ?> getAdvancedSettings() {
        return this.advancedSettings;
    }

    public RLJobSettings setBusinessUserId(String businessUserId) {
        this.businessUserId = businessUserId;
        return this;
    }
    public String getBusinessUserId() {
        return this.businessUserId;
    }

    public RLJobSettings setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public RLJobSettings setEnableRDMA(Boolean enableRDMA) {
        this.enableRDMA = enableRDMA;
        return this;
    }
    public Boolean getEnableRDMA() {
        return this.enableRDMA;
    }

    public RLJobSettings setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public RLJobSettings setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

}
