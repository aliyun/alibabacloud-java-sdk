// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class UnbindInstance2VpcResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>18DD77BF-F967-576D-80D1-79121399AB53</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindInstance2VpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindInstance2VpcResponseBody self = new UnbindInstance2VpcResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindInstance2VpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
