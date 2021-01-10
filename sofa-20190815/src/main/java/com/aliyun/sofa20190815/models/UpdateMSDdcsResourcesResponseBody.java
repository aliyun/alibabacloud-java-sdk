// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMSDdcsResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMSDdcsResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMSDdcsResourcesResponseBody self = new UpdateMSDdcsResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMSDdcsResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
