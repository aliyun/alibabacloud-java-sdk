// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ContinuousMoveResponseBody extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestId")
    public String requestId;

    public static ContinuousMoveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ContinuousMoveResponseBody self = new ContinuousMoveResponseBody();
        return TeaModel.build(map, self);
    }

    public ContinuousMoveResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ContinuousMoveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
