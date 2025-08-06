// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class HttpRequestVodTestToolShrinkRequest extends TeaModel {
    @NameInMap("Args")
    public String args;

    @NameInMap("Body")
    public String body;

    @NameInMap("Header")
    public String headerShrink;

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

    public static HttpRequestVodTestToolShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        HttpRequestVodTestToolShrinkRequest self = new HttpRequestVodTestToolShrinkRequest();
        return TeaModel.build(map, self);
    }

    public HttpRequestVodTestToolShrinkRequest setArgs(String args) {
        this.args = args;
        return this;
    }
    public String getArgs() {
        return this.args;
    }

    public HttpRequestVodTestToolShrinkRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public HttpRequestVodTestToolShrinkRequest setHeaderShrink(String headerShrink) {
        this.headerShrink = headerShrink;
        return this;
    }
    public String getHeaderShrink() {
        return this.headerShrink;
    }

    public HttpRequestVodTestToolShrinkRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public HttpRequestVodTestToolShrinkRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public HttpRequestVodTestToolShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public HttpRequestVodTestToolShrinkRequest setProxyIp(String proxyIp) {
        this.proxyIp = proxyIp;
        return this;
    }
    public String getProxyIp() {
        return this.proxyIp;
    }

    public HttpRequestVodTestToolShrinkRequest setScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }
    public String getScheme() {
        return this.scheme;
    }

    public HttpRequestVodTestToolShrinkRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
