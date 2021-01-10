// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMSDdcsAttributesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMSDdcsAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMSDdcsAttributesResponseBody self = new DeleteMSDdcsAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMSDdcsAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
