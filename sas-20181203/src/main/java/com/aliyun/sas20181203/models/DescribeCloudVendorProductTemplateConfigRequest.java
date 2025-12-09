// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCloudVendorProductTemplateConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>CHAITIN</p>
     */
    @NameInMap("Vendor")
    public String vendor;

    public static DescribeCloudVendorProductTemplateConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudVendorProductTemplateConfigRequest self = new DescribeCloudVendorProductTemplateConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudVendorProductTemplateConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCloudVendorProductTemplateConfigRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
