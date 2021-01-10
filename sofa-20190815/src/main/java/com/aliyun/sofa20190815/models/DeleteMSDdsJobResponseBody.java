// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMSDdsJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMSDdsJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMSDdsJobResponseBody self = new DeleteMSDdsJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMSDdsJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
