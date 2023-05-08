// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAssetSelectionConfigRequest extends TeaModel {
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
