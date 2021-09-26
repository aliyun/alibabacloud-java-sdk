// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20181029.models;

import com.aliyun.tea.*;

public class GrantServiceRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static GrantServiceRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantServiceRoleResponseBody self = new GrantServiceRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantServiceRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
