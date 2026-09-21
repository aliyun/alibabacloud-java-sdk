// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAssetSelectionConfigRequest extends TeaModel {
    /**
     * <p>The business type of the asset selection. Valid values:</p>
     * <ul>
     * <li><strong>VIRUS_SCAN_CYCLE_CONFIG</strong>: trojan scan configuration.</li>
     * <li><strong>VIRUS_SCAN_ONCE_TASK</strong>: trojan scan one-time scan.</li>
     * <li><strong>AGENTLESS_MALICIOUS_WHITE_LIST_[ID]</strong>: agentless detection alert whitelisting rule.</li>
     * <li><strong>AGENTLESS_VUL_WHITE_LIST_[ID]</strong>: agentless detection vulnerability whitelisting rule.</li>
     * <li><strong>FILE_PROTECT_RULE_SWITCH_TYPE_[ID]</strong>: core file protection.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VIRUS_SCAN_CYCLE_CONFIG</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. Use a different token for each request. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values: true: performs only a dry run without performing the actual operation. false: performs the actual request. Default value: false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The operating system of the target asset. Valid values:</p>
     * <ul>
     * <li><strong>all</strong>: all operating systems.</li>
     * <li><strong>windows</strong>: Windows operating system.</li>
     * <li><strong>linux</strong>: Linux operating system.<blockquote>
     * <p>If this parameter is left empty, the default value is determined based on the <strong>BusinessType</strong> value.</p>
     * <ul>
     * <li><strong>VIRUS_SCAN_CYCLE_CONFIG</strong>: the value is <strong>all</strong>.</li>
     * <li><strong>VIRUS_SCAN_ONCE_TASK</strong>: the value is <strong>all</strong>.</li>
     * <li><strong>AGENTLESS_MALICIOUS_WHITE_LIST_[ID]</strong>: the value is <strong>all</strong>.</li>
     * <li><strong>AGENTLESS_VUL_WHITE_LIST_[ID]</strong>: the value is <strong>all</strong>.</li>
     * <li><strong>FILE_PROTECT_RULE_SWITCH_TYPE_[ID]</strong>: the value is <strong>linux</strong>.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>linux</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The Asset Type of the target. Valid values:</p>
     * <ul>
     * <li><strong>all_instance</strong>: all servers.</li>
     * <li><strong>instance</strong>: selected by server.</li>
     * <li><strong>group</strong>: selected by group.</li>
     * <li><strong>vpc</strong>: selected by VPC.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static CreateAssetSelectionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAssetSelectionConfigRequest self = new CreateAssetSelectionConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateAssetSelectionConfigRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public CreateAssetSelectionConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAssetSelectionConfigRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateAssetSelectionConfigRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateAssetSelectionConfigRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
