// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class AdminTestSeviceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static AdminTestSeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AdminTestSeviceResponseBody self = new AdminTestSeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public AdminTestSeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
