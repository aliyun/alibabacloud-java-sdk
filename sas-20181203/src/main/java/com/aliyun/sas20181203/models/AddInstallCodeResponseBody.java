// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddInstallCodeResponseBody extends TeaModel {
    /**
     * <p>The validity period of the installation command. The value is a 13-digit timestamp.</p>
     * <br>
     * <p>>  The installation command is valid only within the validity period. An expired installation command cannot be used to install the Security Center agent.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddInstallCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddInstallCodeResponseBody self = new AddInstallCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public AddInstallCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
