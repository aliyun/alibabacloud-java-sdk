// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAgentlessTaskUsedSizeEstimateRequest extends TeaModel {
    /**
     * <p>Asset selection identifier.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AGENTLESS_SCAN_ONCE_TASK_1720145******</p>
     */
    @NameInMap("AssetSelectionType")
    public String assetSelectionType;

    public static GetAgentlessTaskUsedSizeEstimateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentlessTaskUsedSizeEstimateRequest self = new GetAgentlessTaskUsedSizeEstimateRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentlessTaskUsedSizeEstimateRequest setAssetSelectionType(String assetSelectionType) {
        this.assetSelectionType = assetSelectionType;
        return this;
    }
    public String getAssetSelectionType() {
        return this.assetSelectionType;
    }

}
