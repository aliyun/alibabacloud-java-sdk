// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeStreamURLResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1557977029</p>
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
     * <p>rtmp://demo.aliyundoc.com/live/310101<em><strong><strong>7542007?auth_key=1639130258-0-0-b2b04fe85ece6</strong></strong></em>a6b1a42bc7e</p>
     */
    @NameInMap("Url")
    public String url;

    public static DescribeStreamURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamURLResponseBody self = new DescribeStreamURLResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStreamURLResponseBody setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public DescribeStreamURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStreamURLResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
