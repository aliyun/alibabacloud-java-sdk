// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class UnbindAliasResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>159E4422-6624-4750-8943-DFD98D34858C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindAliasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindAliasResponseBody self = new UnbindAliasResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindAliasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
