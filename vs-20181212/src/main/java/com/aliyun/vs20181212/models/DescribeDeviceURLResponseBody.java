// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeDeviceURLResponseBody extends TeaModel {
    @NameInMap("Url")
    public String url;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ExpireTime")
    public Long expireTime;

    public static DescribeDeviceURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceURLResponseBody self = new DescribeDeviceURLResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceURLResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public DescribeDeviceURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeviceURLResponseBody setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

}
