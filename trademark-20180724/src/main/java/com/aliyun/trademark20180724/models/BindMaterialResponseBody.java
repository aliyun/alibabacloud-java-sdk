// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class BindMaterialResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BindMaterialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindMaterialResponseBody self = new BindMaterialResponseBody();
        return TeaModel.build(map, self);
    }

    public BindMaterialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
