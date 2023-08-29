// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class DeleteLabelTableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLabelTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLabelTableResponseBody self = new DeleteLabelTableResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLabelTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
