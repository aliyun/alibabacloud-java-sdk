// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wfts20220212.models;

import com.aliyun.tea.*;

public class GetLjxAccountInfoResponseBody extends TeaModel {
    @NameInMap("Apple")
    public String apple;

    // 资源一级ID
    @NameInMap("LjxAccountInfoId")
    public String ljxAccountInfoId;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static GetLjxAccountInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLjxAccountInfoResponseBody self = new GetLjxAccountInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLjxAccountInfoResponseBody setApple(String apple) {
        this.apple = apple;
        return this;
    }
    public String getApple() {
        return this.apple;
    }

    public GetLjxAccountInfoResponseBody setLjxAccountInfoId(String ljxAccountInfoId) {
        this.ljxAccountInfoId = ljxAccountInfoId;
        return this;
    }
    public String getLjxAccountInfoId() {
        return this.ljxAccountInfoId;
    }

    public GetLjxAccountInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
