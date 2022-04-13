// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.partnerintl20181227.models;

import com.aliyun.tea.*;

public class ResultValue extends TeaModel {
    @NameInMap("SupplierName")
    public String supplierName;

    @NameInMap("SupplierWebSite")
    public String supplierWebSite;

    @NameInMap("SupplierDescription")
    public String supplierDescription;

    public static ResultValue build(java.util.Map<String, ?> map) throws Exception {
        ResultValue self = new ResultValue();
        return TeaModel.build(map, self);
    }

    public ResultValue setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

    public ResultValue setSupplierWebSite(String supplierWebSite) {
        this.supplierWebSite = supplierWebSite;
        return this;
    }
    public String getSupplierWebSite() {
        return this.supplierWebSite;
    }

    public ResultValue setSupplierDescription(String supplierDescription) {
        this.supplierDescription = supplierDescription;
        return this;
    }
    public String getSupplierDescription() {
        return this.supplierDescription;
    }

}
