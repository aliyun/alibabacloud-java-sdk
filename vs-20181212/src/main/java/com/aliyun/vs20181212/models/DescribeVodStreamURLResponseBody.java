// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVodStreamURLResponseBody extends TeaModel {
    @NameInMap("Url")
    public String url;

    @NameInMap("OutProtocol")
    public String outProtocol;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Port")
    public Long port;

    @NameInMap("TxId")
    public String txId;

    public static DescribeVodStreamURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodStreamURLResponseBody self = new DescribeVodStreamURLResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodStreamURLResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public DescribeVodStreamURLResponseBody setOutProtocol(String outProtocol) {
        this.outProtocol = outProtocol;
        return this;
    }
    public String getOutProtocol() {
        return this.outProtocol;
    }

    public DescribeVodStreamURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodStreamURLResponseBody setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public DescribeVodStreamURLResponseBody setTxId(String txId) {
        this.txId = txId;
        return this;
    }
    public String getTxId() {
        return this.txId;
    }

}
