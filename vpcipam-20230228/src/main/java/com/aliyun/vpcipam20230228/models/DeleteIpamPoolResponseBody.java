// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class DeleteIpamPoolResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>57B7DCCA-F192-5528-8AF3-2FE1413228C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIpamPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpamPoolResponseBody self = new DeleteIpamPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIpamPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
