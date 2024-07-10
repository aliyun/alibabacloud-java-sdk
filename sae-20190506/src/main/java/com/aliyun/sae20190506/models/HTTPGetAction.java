// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class HTTPGetAction extends TeaModel {
    @NameInMap("Host")
    public String host;

    @NameInMap("HttpHeaders")
    public java.util.List<HTTPHeader> httpHeaders;

    @NameInMap("Path")
    public String path;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("Scheme")
    public String scheme;

    public static HTTPGetAction build(java.util.Map<String, ?> map) throws Exception {
        HTTPGetAction self = new HTTPGetAction();
        return TeaModel.build(map, self);
    }

    public HTTPGetAction setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public HTTPGetAction setHttpHeaders(java.util.List<HTTPHeader> httpHeaders) {
        this.httpHeaders = httpHeaders;
        return this;
    }
    public java.util.List<HTTPHeader> getHttpHeaders() {
        return this.httpHeaders;
    }

    public HTTPGetAction setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public HTTPGetAction setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public HTTPGetAction setScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }
    public String getScheme() {
        return this.scheme;
    }

}
