// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateHostShareKeyResponseBody extends TeaModel {
    /**
     * <p>The ID of the shared key.</p>
     * 
     * <strong>example:</strong>
     * <p>10235</p>
     */
    @NameInMap("HostShareKeyId")
    public Long hostShareKeyId;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateHostShareKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHostShareKeyResponseBody self = new CreateHostShareKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHostShareKeyResponseBody setHostShareKeyId(Long hostShareKeyId) {
        this.hostShareKeyId = hostShareKeyId;
        return this;
    }
    public Long getHostShareKeyId() {
        return this.hostShareKeyId;
    }

    public CreateHostShareKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
