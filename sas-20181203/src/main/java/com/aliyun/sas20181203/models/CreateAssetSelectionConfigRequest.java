// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAssetSelectionConfigRequest extends TeaModel {
    /**
     * <p>The feature that you want to select for the asset. Valid values:</p>
     * <br>
     * <p>*   **VIRUS_SCAN_CYCLE_CONFIG**: virus detection and removal</p>
     * <p>*   **VIRUS_SCAN_ONCE_TASK**: one-time scan for viruses</p>
     * <p>*   **AGENTLESS_MALICIOUS_WHITE_LIST_[ID]**: a whitelist rule for alerts that are detected by using the agentless detection feature</p>
     * <p>*   **AGENTLESS_VUL_WHITE_LIST_[ID]**: a whitelist rule for vulnerabilities that are detected by using the agentless detection feature</p>
     * <p>*   **FILE_PROTECT_RULE_SWITCH_TYPE_[ID]**: core file protection</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The dimension based on which you want to select the asset. Valid values:</p>
     * <br>
     * <p>*   **instance**: selects the asset by server.</p>
     * <p>*   **group**: selects the asset by group.</p>
     * <p>*   **vpc**: selects the asset by virtual private cloud (VPC).</p>
     * <br>
     * <p>This parameter is required.</p>
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

    public CreateAssetSelectionConfigRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
