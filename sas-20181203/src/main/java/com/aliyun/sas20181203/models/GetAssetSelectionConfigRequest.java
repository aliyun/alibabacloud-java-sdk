// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAssetSelectionConfigRequest extends TeaModel {
    /**
     * <p>The business type that you want to select for the asset. Valid values:</p>
     * <br>
     * <p>*   **VIRUS_SCAN_CYCLE_CONFIG**: virus detection configuration</p>
     * <p>*   **VIRUS_SCAN_ONCE_TASK**: one-time scan for virus detection</p>
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
