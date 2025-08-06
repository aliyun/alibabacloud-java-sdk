// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddStorageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddStorageResponseBody self = new AddStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public AddStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
