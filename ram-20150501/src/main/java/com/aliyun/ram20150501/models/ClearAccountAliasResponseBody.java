// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ClearAccountAliasResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClearAccountAliasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearAccountAliasResponseBody self = new ClearAccountAliasResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearAccountAliasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
