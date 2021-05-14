// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVolDingdingMessageResponseBody extends TeaModel {
    @NameInMap("DingdingUrl")
    public String dingdingUrl;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVolDingdingMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVolDingdingMessageResponseBody self = new DescribeVolDingdingMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVolDingdingMessageResponseBody setDingdingUrl(String dingdingUrl) {
        this.dingdingUrl = dingdingUrl;
        return this;
    }
    public String getDingdingUrl() {
        return this.dingdingUrl;
    }

    public DescribeVolDingdingMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
