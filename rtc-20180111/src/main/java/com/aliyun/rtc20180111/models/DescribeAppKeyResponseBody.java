// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppKeyResponseBody extends TeaModel {
    /**
     * <p>AppKey。</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAppKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppKeyResponseBody self = new DescribeAppKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppKeyResponseBody setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DescribeAppKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
