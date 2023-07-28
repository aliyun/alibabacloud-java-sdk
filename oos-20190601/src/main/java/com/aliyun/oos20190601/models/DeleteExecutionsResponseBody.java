// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteExecutionsResponseBody extends TeaModel {
    /**
     * <p>Deletes multiple executions.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteExecutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteExecutionsResponseBody self = new DeleteExecutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteExecutionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
