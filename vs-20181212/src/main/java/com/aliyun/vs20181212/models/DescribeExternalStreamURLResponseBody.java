// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeExternalStreamURLResponseBody extends TeaModel {
    @NameInMap("Ip")
    public String ip;

    @NameInMap("OutProtocol")
    public String outProtocol;

    @NameInMap("Port")
    public Long port;

    @NameInMap("Profile")
    public String profile;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TxId")
    public String txId;

    @NameInMap("Url")
    public String url;

    public static DescribeExternalStreamURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExternalStreamURLResponseBody self = new DescribeExternalStreamURLResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExternalStreamURLResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeExternalStreamURLResponseBody setOutProtocol(String outProtocol) {
        this.outProtocol = outProtocol;
        return this;
    }
    public String getOutProtocol() {
        return this.outProtocol;
    }

    public DescribeExternalStreamURLResponseBody setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public DescribeExternalStreamURLResponseBody setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

    public DescribeExternalStreamURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExternalStreamURLResponseBody setTxId(String txId) {
        this.txId = txId;
        return this;
    }
    public String getTxId() {
        return this.txId;
    }

    public DescribeExternalStreamURLResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
