// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetUserConfigV2ResponseBody extends TeaModel {
    // 用户账号金额是否充足
    @NameInMap("AccountSufficient")
    public Boolean accountSufficient;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static GetUserConfigV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserConfigV2ResponseBody self = new GetUserConfigV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserConfigV2ResponseBody setAccountSufficient(Boolean accountSufficient) {
        this.accountSufficient = accountSufficient;
        return this;
    }
    public Boolean getAccountSufficient() {
        return this.accountSufficient;
    }

    public GetUserConfigV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
