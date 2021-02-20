// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class GetMPUTaskStatusResponseBody extends TeaModel {
    @NameInMap("Status")
    public Integer status;

    @NameInMap("RequestId")
    public String requestId;

    public static GetMPUTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMPUTaskStatusResponseBody self = new GetMPUTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMPUTaskStatusResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public GetMPUTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
