// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMSDdcsResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMSDdcsResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMSDdcsResourcesResponseBody self = new DeleteMSDdcsResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMSDdcsResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
