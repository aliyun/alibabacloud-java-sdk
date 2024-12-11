// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateInstancePackageStateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2597E94B-5346-42D1-BB58-XXXXXXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateInstancePackageStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstancePackageStateResponseBody self = new UpdateInstancePackageStateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstancePackageStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
