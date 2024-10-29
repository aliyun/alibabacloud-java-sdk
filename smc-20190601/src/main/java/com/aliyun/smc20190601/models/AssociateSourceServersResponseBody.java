// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class AssociateSourceServersResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C8B26B44-0189-443E-9816-D951F59623A9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateSourceServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateSourceServersResponseBody self = new AssociateSourceServersResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateSourceServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
