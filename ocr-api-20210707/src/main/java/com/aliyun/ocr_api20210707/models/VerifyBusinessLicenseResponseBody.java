// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class VerifyBusinessLicenseResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>43A29C77-405E-4CC0-BC55-EE694AD00655</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static VerifyBusinessLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyBusinessLicenseResponseBody self = new VerifyBusinessLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyBusinessLicenseResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public VerifyBusinessLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
