// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAssetSelectionConfigRequest extends TeaModel {
    /**
     * <p>The business type of the asset selection. Valid values:</p>
     * <ul>
     * <li><strong>VIRUS_SCAN_CYCLE_CONFIG</strong>: Virus scan configuration.</li>
     * <li><strong>VIRUS_SCAN_ONCE_TASK</strong>: One-time virus scan.</li>
     * <li><strong>AGENTLESS_MALICIOUS_WHITE_LIST_[ID]</strong>: Whitelist rule for agentless detection alerts.</li>
     * <li><strong>AGENTLESS_VUL_WHITE_LIST_[ID]</strong>: Whitelist rule for agentless detection vulnerabilities.</li>
     * <li><strong>FILE_PROTECT_RULE_SWITCH_TYPE_[ID]</strong>: Core file protection.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VIRUS_SCAN_CYCLE_CONFIG</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use different tokens for different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li>true: Prechecks the request without performing the actual operation.</li>
     * <li>false: Performs the request.
     * Default value: false.</li>
     * </ul>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The operating system of the target asset. Valid values:</p>
     * <ul>
     * <li><strong>all</strong>: All operating systems.</li>
     * <li><strong>windows</strong>: Windows operating system.</li>
     * <li><strong>linux</strong>: Linux operating system.<blockquote>
     * <p>If this parameter is left empty, the default value is matched based on the <strong>BusinessType</strong> value.</p>
     * <ul>
     * <li><strong>VIRUS_SCAN_CYCLE_CONFIG</strong>: The value is <strong>all</strong>.</li>
     * <li><strong>VIRUS_SCAN_ONCE_TASK</strong>: The value is <strong>all</strong>.</li>
     * <li><strong>AGENTLESS_MALICIOUS_WHITE_LIST_[ID]</strong>: The value is <strong>all</strong>.</li>
     * <li><strong>AGENTLESS_VUL_WHITE_LIST_[ID]</strong>: The value is <strong>all</strong>.</li>
     * <li><strong>FILE_PROTECT_RULE_SWITCH_TYPE_[ID]</strong>: The value is <strong>linux</strong>.</li>
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
     * <p>The target Asset Type. Valid values:</p>
     * <ul>
     * <li><strong>all_instance</strong>: All servers.</li>
     * <li><strong>instance</strong>: By server.</li>
     * <li><strong>group</strong>: By group.</li>
     * <li><strong>vpc</strong>: By VPC.</li>
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
