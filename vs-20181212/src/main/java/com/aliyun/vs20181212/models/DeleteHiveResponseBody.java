// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteHiveResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxxx-xxx-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteHiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHiveResponseBody self = new DeleteHiveResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
