// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetLicenseInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LicenseId")
    public String licenseId;

    public static GetLicenseInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLicenseInfoRequest self = new GetLicenseInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetLicenseInfoRequest setLicenseId(String licenseId) {
        this.licenseId = licenseId;
        return this;
    }
    public String getLicenseId() {
        return this.licenseId;
    }

}
