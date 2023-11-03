// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateSelectionKeyByTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSelectionKeyByTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSelectionKeyByTypeResponseBody self = new UpdateSelectionKeyByTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSelectionKeyByTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
