// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetStorageACLResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetStorageACLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetStorageACLResponseBody self = new SetStorageACLResponseBody();
        return TeaModel.build(map, self);
    }

    public SetStorageACLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
