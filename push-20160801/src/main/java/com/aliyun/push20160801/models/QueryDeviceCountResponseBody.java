// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryDeviceCountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeviceCount")
    public Long deviceCount;

    public static QueryDeviceCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceCountResponseBody self = new QueryDeviceCountResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceCountResponseBody setDeviceCount(Long deviceCount) {
        this.deviceCount = deviceCount;
        return this;
    }
    public Long getDeviceCount() {
        return this.deviceCount;
    }

}
