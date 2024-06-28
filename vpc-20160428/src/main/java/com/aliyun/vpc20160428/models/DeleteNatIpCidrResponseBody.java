// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteNatIpCidrResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7021BEB1-210F-48A9-AB82-BE9A9110BB89</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNatIpCidrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNatIpCidrResponseBody self = new DeleteNatIpCidrResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNatIpCidrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
