// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetUserConfigResponseBody extends TeaModel {
    // 用户账号金额是否充足
    @NameInMap("AccountSufficient")
    public Boolean accountSufficient;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static GetUserConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserConfigResponseBody self = new GetUserConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserConfigResponseBody setAccountSufficient(Boolean accountSufficient) {
        this.accountSufficient = accountSufficient;
        return this;
    }
    public Boolean getAccountSufficient() {
        return this.accountSufficient;
    }

    public GetUserConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
