// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ModifySlbAPRequest extends TeaModel {
    @NameInMap("CookieTimeout")
    public Integer cookieTimeout;

    @NameInMap("EstablishedTimeout")
    public Integer establishedTimeout;

    @NameInMap("Name")
    public String name;

    @NameInMap("RealServerPort")
    public Integer realServerPort;

    @NameInMap("SlbAPId")
    public Long slbAPId;

    @NameInMap("SslCertId")
    public String sslCertId;

    @NameInMap("StickySession")
    public Integer stickySession;

    public static ModifySlbAPRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySlbAPRequest self = new ModifySlbAPRequest();
        return TeaModel.build(map, self);
    }

    public ModifySlbAPRequest setCookieTimeout(Integer cookieTimeout) {
        this.cookieTimeout = cookieTimeout;
        return this;
    }
    public Integer getCookieTimeout() {
        return this.cookieTimeout;
    }

    public ModifySlbAPRequest setEstablishedTimeout(Integer establishedTimeout) {
        this.establishedTimeout = establishedTimeout;
        return this;
    }
    public Integer getEstablishedTimeout() {
        return this.establishedTimeout;
    }

    public ModifySlbAPRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifySlbAPRequest setRealServerPort(Integer realServerPort) {
        this.realServerPort = realServerPort;
        return this;
    }
    public Integer getRealServerPort() {
        return this.realServerPort;
    }

    public ModifySlbAPRequest setSlbAPId(Long slbAPId) {
        this.slbAPId = slbAPId;
        return this;
    }
    public Long getSlbAPId() {
        return this.slbAPId;
    }

    public ModifySlbAPRequest setSslCertId(String sslCertId) {
        this.sslCertId = sslCertId;
        return this;
    }
    public String getSslCertId() {
        return this.sslCertId;
    }

    public ModifySlbAPRequest setStickySession(Integer stickySession) {
        this.stickySession = stickySession;
        return this;
    }
    public Integer getStickySession() {
        return this.stickySession;
    }

}
