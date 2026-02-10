// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCloudVendorProductTemplateConfigRequest extends TeaModel {
    /**
     * <p>Set the language type for request and response messages, default is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Cloud asset vendor. Values:</p>
     * <ul>
     * <li><strong>CHAITIN</strong>: Chaitin Technology</li>
     * <li><strong>FORTINET</strong>: Fortinet</li>
     * <li><strong>THREATBOOK</strong>: ThreatBook</li>
     * </ul>
     * 
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
