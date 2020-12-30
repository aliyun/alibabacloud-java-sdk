// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class BindAliasResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BindAliasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindAliasResponseBody self = new BindAliasResponseBody();
        return TeaModel.build(map, self);
    }

    public BindAliasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
