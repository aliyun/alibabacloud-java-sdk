// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class SetAccountAliasResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetAccountAliasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAccountAliasResponseBody self = new SetAccountAliasResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAccountAliasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
