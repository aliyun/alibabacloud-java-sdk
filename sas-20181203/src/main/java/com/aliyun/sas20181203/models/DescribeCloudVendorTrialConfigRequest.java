// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCloudVendorTrialConfigRequest extends TeaModel {
    /**
     * <p>Unique ID of the AK.</p>
     * <blockquote>
     * <h2>You can call <a href="~~DescribeCloudVendorAccountAKList~~">DescribeCloudVendorAccountAKList</a> to get the AuthId.</h2>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23**</p>
     */
    @NameInMap("AuthId")
    public Long authId;

    /**
     * <p>Cloud asset vendor. Values:</p>
     * <ul>
     * <li><strong>Tencent</strong>: Tencent Cloud</li>
     * <li><strong>AWS</strong>: Amazon Web Services</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AWS</p>
     */
    @NameInMap("Vendor")
    public String vendor;

    public static DescribeCloudVendorTrialConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudVendorTrialConfigRequest self = new DescribeCloudVendorTrialConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudVendorTrialConfigRequest setAuthId(Long authId) {
        this.authId = authId;
        return this;
    }
    public Long getAuthId() {
        return this.authId;
    }

    public DescribeCloudVendorTrialConfigRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
