// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CheckDBNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CheckDBNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDBNameResponseBody self = new CheckDBNameResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDBNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
