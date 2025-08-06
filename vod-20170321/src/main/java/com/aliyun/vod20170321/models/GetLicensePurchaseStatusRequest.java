// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetLicensePurchaseStatusRequest extends TeaModel {
    @NameInMap("LicenseItemIds")
    public String licenseItemIds;

    public static GetLicensePurchaseStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLicensePurchaseStatusRequest self = new GetLicensePurchaseStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetLicensePurchaseStatusRequest setLicenseItemIds(String licenseItemIds) {
        this.licenseItemIds = licenseItemIds;
        return this;
    }
    public String getLicenseItemIds() {
        return this.licenseItemIds;
    }

}
