// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeDeviceURLResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1639130258</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>rtmp://demo.aliyundoc.com/live/live001?auth_key=1639130258-0-0-b2b04fe85ece6*****a6b1a42bc7e</p>
     */
    @NameInMap("Url")
    public String url;

    public static DescribeDeviceURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceURLResponseBody self = new DescribeDeviceURLResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceURLResponseBody setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public DescribeDeviceURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeviceURLResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
