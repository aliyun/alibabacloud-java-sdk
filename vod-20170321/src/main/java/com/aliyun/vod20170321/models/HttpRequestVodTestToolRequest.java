// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class HttpRequestVodTestToolRequest extends TeaModel {
    @NameInMap("Args")
    public String args;

    @NameInMap("Body")
    public String body;

    @NameInMap("Header")
    public java.util.Map<String, ?> header;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Method")
    public String method;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProxyIp")
    public String proxyIp;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Scheme")
    public String scheme;

    @NameInMap("Uri")
    public String uri;

    public static HttpRequestVodTestToolRequest build(java.util.Map<String, ?> map) throws Exception {
        HttpRequestVodTestToolRequest self = new HttpRequestVodTestToolRequest();
        return TeaModel.build(map, self);
    }

    public HttpRequestVodTestToolRequest setArgs(String args) {
        this.args = args;
        return this;
    }
    public String getArgs() {
        return this.args;
    }

    public HttpRequestVodTestToolRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public HttpRequestVodTestToolRequest setHeader(java.util.Map<String, ?> header) {
        this.header = header;
        return this;
    }
    public java.util.Map<String, ?> getHeader() {
        return this.header;
    }

    public HttpRequestVodTestToolRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public HttpRequestVodTestToolRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public HttpRequestVodTestToolRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public HttpRequestVodTestToolRequest setProxyIp(String proxyIp) {
        this.proxyIp = proxyIp;
        return this;
    }
    public String getProxyIp() {
        return this.proxyIp;
    }

    public HttpRequestVodTestToolRequest setScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }
    public String getScheme() {
        return this.scheme;
    }

    public HttpRequestVodTestToolRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
