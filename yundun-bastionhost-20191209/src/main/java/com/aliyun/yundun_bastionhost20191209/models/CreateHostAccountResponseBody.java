// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateHostAccountResponseBody extends TeaModel {
    /**
     * <p>The ID of the host account.</p>
     */
    @NameInMap("HostAccountId")
    public String hostAccountId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateHostAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHostAccountResponseBody self = new CreateHostAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHostAccountResponseBody setHostAccountId(String hostAccountId) {
        this.hostAccountId = hostAccountId;
        return this;
    }
    public String getHostAccountId() {
        return this.hostAccountId;
    }

    public CreateHostAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
