// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20181029.models;

import com.aliyun.tea.*;

public class EnableInstancePublicAccessResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableInstancePublicAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableInstancePublicAccessResponseBody self = new EnableInstancePublicAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableInstancePublicAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
