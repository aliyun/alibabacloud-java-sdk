// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyUserPublicKeyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAB631FB-ABD0-5783-99F3-F29573B129E4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyUserPublicKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserPublicKeyResponseBody self = new ModifyUserPublicKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyUserPublicKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
