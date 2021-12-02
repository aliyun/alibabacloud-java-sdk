// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateSlbAPRequest extends TeaModel {
    @NameInMap("CookieTimeout")
    public Integer cookieTimeout;

    @NameInMap("EnvId")
    public Long envId;

    @NameInMap("EstablishedTimeout")
    public Integer establishedTimeout;

    @NameInMap("ListenerPort")
    public Integer listenerPort;

    @NameInMap("Name")
    public String name;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("RealServerPort")
    public Integer realServerPort;

    @NameInMap("SlbId")
    public String slbId;

    @NameInMap("SslCertId")
    public String sslCertId;

    @NameInMap("StickySession")
    public Integer stickySession;

    public static CreateSlbAPRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSlbAPRequest self = new CreateSlbAPRequest();
        return TeaModel.build(map, self);
    }

    public CreateSlbAPRequest setCookieTimeout(Integer cookieTimeout) {
        this.cookieTimeout = cookieTimeout;
        return this;
    }
    public Integer getCookieTimeout() {
        return this.cookieTimeout;
    }

    public CreateSlbAPRequest setEnvId(Long envId) {
        this.envId = envId;
        return this;
    }
    public Long getEnvId() {
        return this.envId;
    }

    public CreateSlbAPRequest setEstablishedTimeout(Integer establishedTimeout) {
        this.establishedTimeout = establishedTimeout;
        return this;
    }
    public Integer getEstablishedTimeout() {
        return this.establishedTimeout;
    }

    public CreateSlbAPRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public CreateSlbAPRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSlbAPRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateSlbAPRequest setRealServerPort(Integer realServerPort) {
        this.realServerPort = realServerPort;
        return this;
    }
    public Integer getRealServerPort() {
        return this.realServerPort;
    }

    public CreateSlbAPRequest setSlbId(String slbId) {
        this.slbId = slbId;
        return this;
    }
    public String getSlbId() {
        return this.slbId;
    }

    public CreateSlbAPRequest setSslCertId(String sslCertId) {
        this.sslCertId = sslCertId;
        return this;
    }
    public String getSslCertId() {
        return this.sslCertId;
    }

    public CreateSlbAPRequest setStickySession(Integer stickySession) {
        this.stickySession = stickySession;
        return this;
    }
    public Integer getStickySession() {
        return this.stickySession;
    }

}
