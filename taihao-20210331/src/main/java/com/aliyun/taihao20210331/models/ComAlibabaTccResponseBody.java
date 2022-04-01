// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ComAlibabaTccResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ComAlibabaTccResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ComAlibabaTccResponseBody self = new ComAlibabaTccResponseBody();
        return TeaModel.build(map, self);
    }

    public ComAlibabaTccResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
