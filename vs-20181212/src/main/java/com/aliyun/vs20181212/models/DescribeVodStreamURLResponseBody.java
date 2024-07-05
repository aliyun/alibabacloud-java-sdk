// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVodStreamURLResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rtsp</p>
     */
    @NameInMap("OutProtocol")
    public String outProtocol;

    /**
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("Port")
    public Long port;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>rtsp://domain/live/stream?sign=xxxxxx</p>
     */
    @NameInMap("Url")
    public String url;

    public static DescribeVodStreamURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodStreamURLResponseBody self = new DescribeVodStreamURLResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodStreamURLResponseBody setOutProtocol(String outProtocol) {
        this.outProtocol = outProtocol;
        return this;
    }
    public String getOutProtocol() {
        return this.outProtocol;
    }

    public DescribeVodStreamURLResponseBody setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public DescribeVodStreamURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodStreamURLResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
