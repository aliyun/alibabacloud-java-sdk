// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetAccountAliasResponseBody extends TeaModel {
    /**
     * <p>The alias of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>myalias</p>
     */
    @NameInMap("AccountAlias")
    public String accountAlias;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAccountAliasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountAliasResponseBody self = new GetAccountAliasResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountAliasResponseBody setAccountAlias(String accountAlias) {
        this.accountAlias = accountAlias;
        return this;
    }
    public String getAccountAlias() {
        return this.accountAlias;
    }

    public GetAccountAliasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
