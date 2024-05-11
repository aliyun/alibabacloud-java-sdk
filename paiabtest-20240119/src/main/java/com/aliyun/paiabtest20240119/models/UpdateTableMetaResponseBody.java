// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class UpdateTableMetaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTableMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableMetaResponseBody self = new UpdateTableMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTableMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
