// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCloudAssetSummaryRequest extends TeaModel {
    /**
     * <p>The asset type by service provider.</p>
     */
    @NameInMap("Vendors")
    public java.util.List<Integer> vendors;

    public static GetCloudAssetSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAssetSummaryRequest self = new GetCloudAssetSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetCloudAssetSummaryRequest setVendors(java.util.List<Integer> vendors) {
        this.vendors = vendors;
        return this;
    }
    public java.util.List<Integer> getVendors() {
        return this.vendors;
    }

}
