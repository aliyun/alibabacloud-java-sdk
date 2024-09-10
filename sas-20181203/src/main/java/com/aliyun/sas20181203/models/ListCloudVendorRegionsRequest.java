// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCloudVendorRegionsRequest extends TeaModel {
    /**
     * <p>The language of the content in the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The service provider of cloud assets. Valid values:</p>
     * <ul>
     * <li><strong>Tencent</strong>, <strong>HUAWEICLOUD</strong>, <strong>Azure</strong>, and <strong>AWS</strong>: other service providers of cloud assets.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Tencent</p>
     */
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
