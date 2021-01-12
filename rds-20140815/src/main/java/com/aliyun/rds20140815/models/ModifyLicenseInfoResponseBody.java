// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyLicenseInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLicenseInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLicenseInfoResponseBody self = new ModifyLicenseInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLicenseInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
