// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateHostResponseBody extends TeaModel {
    /**
     * <p>The ID of the host that was created.</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHostResponseBody self = new CreateHostResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHostResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public CreateHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
