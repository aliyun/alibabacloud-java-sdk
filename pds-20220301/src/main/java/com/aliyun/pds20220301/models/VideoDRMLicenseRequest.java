// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class VideoDRMLicenseRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>widevine</p>
     */
    @NameInMap("drmType")
    public String drmType;

    /**
     * <strong>example:</strong>
     * <p>CAES6B8SQgpACioSENGxDhqCLIVwwCBOyPayyWoSENGxDhqCLIVwwCBOyPayyWpI88aJmwYQARoQdRV32</p>
     */
    @NameInMap("licenseRequest")
    public String licenseRequest;

    public static VideoDRMLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        VideoDRMLicenseRequest self = new VideoDRMLicenseRequest();
        return TeaModel.build(map, self);
    }

    public VideoDRMLicenseRequest setDrmType(String drmType) {
        this.drmType = drmType;
        return this;
    }
    public String getDrmType() {
        return this.drmType;
    }

    public VideoDRMLicenseRequest setLicenseRequest(String licenseRequest) {
        this.licenseRequest = licenseRequest;
        return this;
    }
    public String getLicenseRequest() {
        return this.licenseRequest;
    }

}
