// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteFailoverTestJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFailoverTestJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFailoverTestJobResponseBody self = new DeleteFailoverTestJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFailoverTestJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
