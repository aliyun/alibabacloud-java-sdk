// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class AddVMIntoServiceMeshResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4b2c0fe0-6705-4614-8521-6b9d289163c8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddVMIntoServiceMeshResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddVMIntoServiceMeshResponseBody self = new AddVMIntoServiceMeshResponseBody();
        return TeaModel.build(map, self);
    }

    public AddVMIntoServiceMeshResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
