// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMSDdcsAttributesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMSDdcsAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMSDdcsAttributesResponseBody self = new UpdateMSDdcsAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMSDdcsAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
