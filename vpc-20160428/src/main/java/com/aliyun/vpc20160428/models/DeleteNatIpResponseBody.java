// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteNatIpResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E9AD97A0-5338-43F8-8A80-5E274CCBA11B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNatIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNatIpResponseBody self = new DeleteNatIpResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNatIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
