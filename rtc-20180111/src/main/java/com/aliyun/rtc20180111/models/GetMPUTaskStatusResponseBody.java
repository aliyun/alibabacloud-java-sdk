// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class GetMPUTaskStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public Integer status;

    public static GetMPUTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMPUTaskStatusResponseBody self = new GetMPUTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMPUTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMPUTaskStatusResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
