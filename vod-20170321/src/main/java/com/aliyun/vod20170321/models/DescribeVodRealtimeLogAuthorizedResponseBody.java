// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodRealtimeLogAuthorizedResponseBody extends TeaModel {
    @NameInMap("AuthorizedStatus")
    public String authorizedStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVodRealtimeLogAuthorizedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodRealtimeLogAuthorizedResponseBody self = new DescribeVodRealtimeLogAuthorizedResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodRealtimeLogAuthorizedResponseBody setAuthorizedStatus(String authorizedStatus) {
        this.authorizedStatus = authorizedStatus;
        return this;
    }
    public String getAuthorizedStatus() {
        return this.authorizedStatus;
    }

    public DescribeVodRealtimeLogAuthorizedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
