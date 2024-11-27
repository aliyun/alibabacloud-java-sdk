// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyInstanceTwoFactorResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9CE1A352-15E9-5EB4-B589-87A8DEECB20D</p>
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
