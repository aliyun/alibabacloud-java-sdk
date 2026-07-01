// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class DeleteIpamResponseBody extends TeaModel {
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
