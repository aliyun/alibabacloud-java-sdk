// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ContinuousAdjustResponseBody extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestId")
    public String requestId;

    public static ContinuousAdjustResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ContinuousAdjustResponseBody self = new ContinuousAdjustResponseBody();
        return TeaModel.build(map, self);
    }

    public ContinuousAdjustResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ContinuousAdjustResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
