// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class HTTPGetAction extends TeaModel {
    /**
     * <p>The hostname to which you want to connect. The default value is the IP address of the pod. You may need to specify Host in HttpHeaders.</p>
     * 
     * <strong>example:</strong>
     * <p>172.22.XX.XX</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The custom headers that you need to specify in the request. Duplicate headers are allowed in an HTTP request.</p>
     */
    @NameInMap("HttpHeaders")
    public java.util.List<HTTPHeader> httpHeaders;

    /**
     * <p>The path of a URL.</p>
     * 
     * <strong>example:</strong>
     * <p>/path1</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The port range. Valid values: 1 to 65535.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The scheme that you want to use to connect to the host. Default value: http.</p>
     * 
     * <strong>example:</strong>
     * <p>http</p>
     */
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
