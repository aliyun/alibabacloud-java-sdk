// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyLicenseInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyLicenseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLicenseInfoResponse self = new ModifyLicenseInfoResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLicenseInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
