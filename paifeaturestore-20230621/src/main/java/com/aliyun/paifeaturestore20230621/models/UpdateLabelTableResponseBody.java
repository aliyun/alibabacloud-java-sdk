// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class UpdateLabelTableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLabelTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLabelTableResponseBody self = new UpdateLabelTableResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLabelTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
