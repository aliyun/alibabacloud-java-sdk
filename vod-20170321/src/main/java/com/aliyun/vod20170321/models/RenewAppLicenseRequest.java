// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RenewAppLicenseRequest extends TeaModel {
    @NameInMap("LicenseItemIds")
    public String licenseItemIds;

    @NameInMap("OrderIds")
    public String orderIds;

    @NameInMap("PurchaseMethod")
    public String purchaseMethod;

    public static RenewAppLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewAppLicenseRequest self = new RenewAppLicenseRequest();
        return TeaModel.build(map, self);
    }

    public RenewAppLicenseRequest setLicenseItemIds(String licenseItemIds) {
        this.licenseItemIds = licenseItemIds;
        return this;
    }
    public String getLicenseItemIds() {
        return this.licenseItemIds;
    }

    public RenewAppLicenseRequest setOrderIds(String orderIds) {
        this.orderIds = orderIds;
        return this;
    }
    public String getOrderIds() {
        return this.orderIds;
    }

    public RenewAppLicenseRequest setPurchaseMethod(String purchaseMethod) {
        this.purchaseMethod = purchaseMethod;
        return this;
    }
    public String getPurchaseMethod() {
        return this.purchaseMethod;
    }

}
