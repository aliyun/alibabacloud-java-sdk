// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyInstanceTwoFactorResponseBody extends TeaModel {
    /**
     * <p>The duration within which two-factor authentication is not required after a local user passes two-factor authentication. Valid values: 0 to 168. Unit: hours. If you set this parameter to 0, the local user must pass two-factor authentication every time the local user logs on to the bastion host.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceTwoFactorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceTwoFactorResponseBody self = new ModifyInstanceTwoFactorResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceTwoFactorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
