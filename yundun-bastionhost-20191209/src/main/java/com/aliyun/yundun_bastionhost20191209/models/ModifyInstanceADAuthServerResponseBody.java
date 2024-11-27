// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyInstanceADAuthServerResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>C9E97677-BD74-584B-AFCE-948C2A70BB82</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceADAuthServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceADAuthServerResponseBody self = new ModifyInstanceADAuthServerResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceADAuthServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
