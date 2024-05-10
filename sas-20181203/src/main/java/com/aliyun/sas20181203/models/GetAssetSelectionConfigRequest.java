// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAssetSelectionConfigRequest extends TeaModel {
    /**
     * <p>The feature that is selected for the asset. Valid values:</p>
     * <br>
     * <p>*   **VIRUS_SCAN_CYCLE_CONFIG**: virus detection and removal</p>
     * <p>*   **VIRUS_SCAN_ONCE_TASK**: one-time scan for viruses</p>
     * <p>*   **AGENTLESS_MALICIOUS_WHITE_LIST_[ID]**: a whitelist rule for alerts that are detected by using the agentless detection feature</p>
     * <p>*   **AGENTLESS_VUL_WHITE_LIST_[ID]**: a whitelist rule for vulnerabilities that are detected by using the agentless detection feature</p>
     * <p>*   **FILE_PROTECT_RULE_SWITCH_TYPE_[ID]**: core file protectioion</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    public static GetAssetSelectionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAssetSelectionConfigRequest self = new GetAssetSelectionConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetAssetSelectionConfigRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

}
