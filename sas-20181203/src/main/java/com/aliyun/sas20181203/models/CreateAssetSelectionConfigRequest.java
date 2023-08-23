// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAssetSelectionConfigRequest extends TeaModel {
    /**
     * <p>The business type that you want to select for the asset. Valid values:</p>
     * <br>
     * <p>*   **VIRUS_SCAN_CYCLE_CONFIG**: virus detection configuration</p>
     * <p>*   **VIRUS_SCAN_ONCE_TASK**: one-time scan for virus detection</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The dimension based on which you want to select the asset. Valid values:</p>
     * <br>
     * <p>*   **instance**: selects the asset by server.</p>
     * <p>*   **group**: selects the asset by group.</p>
     * <p>*   **vpc**: selects the asset by virtual private cloud (VPC).</p>
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
