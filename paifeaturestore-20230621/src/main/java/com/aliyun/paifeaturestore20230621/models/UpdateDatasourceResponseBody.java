// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class UpdateDatasourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C33E160C-BFCA-5719-B958-942850E949F6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDatasourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasourceResponseBody self = new UpdateDatasourceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDatasourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
