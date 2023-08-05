// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCloudVendorRegionsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Vendor")
    public String vendor;

    public static ListCloudVendorRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudVendorRegionsRequest self = new ListCloudVendorRegionsRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudVendorRegionsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListCloudVendorRegionsRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
