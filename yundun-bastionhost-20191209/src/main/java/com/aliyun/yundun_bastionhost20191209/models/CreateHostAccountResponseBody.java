// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateHostAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HostAccountId")
    public String hostAccountId;

    public static CreateHostAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHostAccountResponseBody self = new CreateHostAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHostAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHostAccountResponseBody setHostAccountId(String hostAccountId) {
        this.hostAccountId = hostAccountId;
        return this;
    }
    public String getHostAccountId() {
        return this.hostAccountId;
    }

}
