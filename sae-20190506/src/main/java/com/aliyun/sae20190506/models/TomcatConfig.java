// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class TomcatConfig extends TeaModel {
    @NameInMap("ContextPath")
    public String contextPath;

    @NameInMap("MaxThreads")
    public Integer maxThreads;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("UriEncoding")
    public String uriEncoding;

    @NameInMap("UseBodyEncodingForUri")
    public Boolean useBodyEncodingForUri;

    @NameInMap("Version")
    public String version;

    public static TomcatConfig build(java.util.Map<String, ?> map) throws Exception {
        TomcatConfig self = new TomcatConfig();
        return TeaModel.build(map, self);
    }

    public TomcatConfig setContextPath(String contextPath) {
        this.contextPath = contextPath;
        return this;
    }
    public String getContextPath() {
        return this.contextPath;
    }

    public TomcatConfig setMaxThreads(Integer maxThreads) {
        this.maxThreads = maxThreads;
        return this;
    }
    public Integer getMaxThreads() {
        return this.maxThreads;
    }

    public TomcatConfig setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public TomcatConfig setUriEncoding(String uriEncoding) {
        this.uriEncoding = uriEncoding;
        return this;
    }
    public String getUriEncoding() {
        return this.uriEncoding;
    }

    public TomcatConfig setUseBodyEncodingForUri(Boolean useBodyEncodingForUri) {
        this.useBodyEncodingForUri = useBodyEncodingForUri;
        return this;
    }
    public Boolean getUseBodyEncodingForUri() {
        return this.useBodyEncodingForUri;
    }

    public TomcatConfig setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
