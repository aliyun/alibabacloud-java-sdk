// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetUserAuthorizationResponseBody extends TeaModel {
    // 是否通过鉴权
    @NameInMap("IsPassed")
    public Boolean isPassed;

    // 请求ID
    @NameInMap("RequestId")
    public Integer requestId;

    public static GetUserAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserAuthorizationResponseBody self = new GetUserAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserAuthorizationResponseBody setIsPassed(Boolean isPassed) {
        this.isPassed = isPassed;
        return this;
    }
    public Boolean getIsPassed() {
        return this.isPassed;
    }

    public GetUserAuthorizationResponseBody setRequestId(Integer requestId) {
        this.requestId = requestId;
        return this;
    }
    public Integer getRequestId() {
        return this.requestId;
    }

}
