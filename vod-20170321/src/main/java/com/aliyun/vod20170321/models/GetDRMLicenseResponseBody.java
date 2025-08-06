// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDRMLicenseResponseBody extends TeaModel {
    @NameInMap("License")
    public String license;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDRMLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDRMLicenseResponseBody self = new GetDRMLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDRMLicenseResponseBody setLicense(String license) {
        this.license = license;
        return this;
    }
    public String getLicense() {
        return this.license;
    }

    public GetDRMLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
