// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CheckBizAvailableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CheckBizAvailableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckBizAvailableResponseBody self = new CheckBizAvailableResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckBizAvailableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
