// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetAllowIPRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("NetworkType")
    @Validation(required = true)
    public String networkType;

    @NameInMap("Product")
    public String product;

    public static GetAllowIPRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAllowIPRequest self = new GetAllowIPRequest();
        return TeaModel.build(map, self);
    }

    public GetAllowIPRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetAllowIPRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public GetAllowIPRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
