// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class DeleteIpamResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>30A20EE2-6223-5D0F-BF49-D7C78F206063</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIpamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpamResponseBody self = new DeleteIpamResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIpamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
