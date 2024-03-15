// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ReleaseInstancePublicConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseInstancePublicConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstancePublicConnectionResponseBody self = new ReleaseInstancePublicConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseInstancePublicConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
