// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class DeleteTableMetaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTableMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTableMetaResponseBody self = new DeleteTableMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTableMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
