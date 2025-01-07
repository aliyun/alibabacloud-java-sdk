// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAssetSelectionConfigRequest extends TeaModel {
    /**
     * <p>The feature that you want to select for the asset. Valid values:</p>
     * <ul>
     * <li><strong>VIRUS_SCAN_CYCLE_CONFIG</strong>: virus detection and removal</li>
     * <li><strong>VIRUS_SCAN_ONCE_TASK</strong>: one-time scan for viruses</li>
     * <li><strong>AGENTLESS_MALICIOUS_WHITE_LIST_[ID]</strong>: a whitelist rule for alerts that are detected by using the agentless detection feature</li>
     * <li><strong>AGENTLESS_VUL_WHITE_LIST_[ID]</strong>: a whitelist rule for vulnerabilities that are detected by using the agentless detection feature</li>
     * <li><strong>FILE_PROTECT_RULE_SWITCH_TYPE_[ID]</strong>: core file protection</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VIRUS_SCAN_CYCLE_CONFIG</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The operating system of the asset. Valid values:</p>
     * <ul>
     * <li><strong>all</strong>: all operating systems</li>
     * <li><strong>windows</strong>: the Windows operating system</li>
     * <li><strong>linux</strong>: the Linux operating system</li>
     * </ul>
     * <blockquote>
     * <p> If you leave this parameter empty, the system automatically selects a value for the parameter based on the value of the <strong>BusinessType</strong> parameter.</p>
     * </blockquote>
     * <ul>
     * <li><p>If the BusinessType parameter is set to <strong>VIRUS_SCAN_CYCLE_CONFIG</strong>, the value of the Platform parameter is <strong>all</strong>.</p>
     * </li>
     * <li><p>If the BusinessType parameter is set to <strong>VIRUS_SCAN_ONCE_TASK</strong>, the value of the Platform parameter is <strong>all</strong>.</p>
     * </li>
     * <li><p>If the BusinessType parameter is set to <strong>AGENTLESS_MALICIOUS_WHITE_LIST_[ID]</strong>, the value of the Platform parameter is <strong>all</strong>.</p>
     * </li>
     * <li><p>If the BusinessType parameter is set to <strong>AGENTLESS_VUL_WHITE_LIST_[ID]</strong> the value of the Platform parameter is <strong>all</strong>.</p>
     * </li>
     * <li><p>If the BusinessType parameter is set to <strong>FILE_PROTECT_RULE_SWITCH_TYPE_[ID]</strong>, the value of the Platform parameter is <strong>linux</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>linux</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The dimension based on which you want to select the asset. Valid values:</p>
     * <ul>
     * <li><strong>instance</strong>: selects the asset by server.</li>
     * <li><strong>group</strong>: selects the asset by group.</li>
     * <li><strong>vpc</strong>: selects the asset by virtual private cloud (VPC).</li>
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
