// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRTCAppKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AppKey")
    public String appKey;

    public static DescribeRTCAppKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRTCAppKeyResponseBody self = new DescribeRTCAppKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRTCAppKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRTCAppKeyResponseBody setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

}
