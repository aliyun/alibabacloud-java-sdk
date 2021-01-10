// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCasLoadbalanceListenerRequest extends TeaModel {
    @NameInMap("BackendServerPort")
    public Long backendServerPort;

    @NameInMap("Bandwidth")
    public Long bandwidth;

    @NameInMap("CertificateIaasId")
    public String certificateIaasId;

    @NameInMap("CertificateId")
    public String certificateId;

    @NameInMap("Cookie")
    public String cookie;

    @NameInMap("CookieTimeout")
    public Long cookieTimeout;

    @NameInMap("EstablishedTimeout")
    public Long establishedTimeout;

    @NameInMap("GmCryptoCertIaasId")
    public String gmCryptoCertIaasId;

    @NameInMap("GmSignCertIaasId")
    public String gmSignCertIaasId;

    @NameInMap("HealthMonitorJsonStr")
    public String healthMonitorJsonStr;

    @NameInMap("Id")
    public String id;

    @NameInMap("ListenerPort")
    public Long listenerPort;

    @NameInMap("PersistTimeout")
    public Long persistTimeout;

    @NameInMap("Scheduler")
    public String scheduler;

    @NameInMap("StickySessionType")
    public String stickySessionType;

    @NameInMap("TlsCipherPolicy")
    public String tlsCipherPolicy;

    @NameInMap("Type")
    public String type;

    @NameInMap("VComputerGroupId")
    public String VComputerGroupId;

    public static CreateCasLoadbalanceListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCasLoadbalanceListenerRequest self = new CreateCasLoadbalanceListenerRequest();
        return TeaModel.build(map, self);
    }

    public CreateCasLoadbalanceListenerRequest setBackendServerPort(Long backendServerPort) {
        this.backendServerPort = backendServerPort;
        return this;
    }
    public Long getBackendServerPort() {
        return this.backendServerPort;
    }

    public CreateCasLoadbalanceListenerRequest setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public CreateCasLoadbalanceListenerRequest setCertificateIaasId(String certificateIaasId) {
        this.certificateIaasId = certificateIaasId;
        return this;
    }
    public String getCertificateIaasId() {
        return this.certificateIaasId;
    }

    public CreateCasLoadbalanceListenerRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public CreateCasLoadbalanceListenerRequest setCookie(String cookie) {
        this.cookie = cookie;
        return this;
    }
    public String getCookie() {
        return this.cookie;
    }

    public CreateCasLoadbalanceListenerRequest setCookieTimeout(Long cookieTimeout) {
        this.cookieTimeout = cookieTimeout;
        return this;
    }
    public Long getCookieTimeout() {
        return this.cookieTimeout;
    }

    public CreateCasLoadbalanceListenerRequest setEstablishedTimeout(Long establishedTimeout) {
        this.establishedTimeout = establishedTimeout;
        return this;
    }
    public Long getEstablishedTimeout() {
        return this.establishedTimeout;
    }

    public CreateCasLoadbalanceListenerRequest setGmCryptoCertIaasId(String gmCryptoCertIaasId) {
        this.gmCryptoCertIaasId = gmCryptoCertIaasId;
        return this;
    }
    public String getGmCryptoCertIaasId() {
        return this.gmCryptoCertIaasId;
    }

    public CreateCasLoadbalanceListenerRequest setGmSignCertIaasId(String gmSignCertIaasId) {
        this.gmSignCertIaasId = gmSignCertIaasId;
        return this;
    }
    public String getGmSignCertIaasId() {
        return this.gmSignCertIaasId;
    }

    public CreateCasLoadbalanceListenerRequest setHealthMonitorJsonStr(String healthMonitorJsonStr) {
        this.healthMonitorJsonStr = healthMonitorJsonStr;
        return this;
    }
    public String getHealthMonitorJsonStr() {
        return this.healthMonitorJsonStr;
    }

    public CreateCasLoadbalanceListenerRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateCasLoadbalanceListenerRequest setListenerPort(Long listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Long getListenerPort() {
        return this.listenerPort;
    }

    public CreateCasLoadbalanceListenerRequest setPersistTimeout(Long persistTimeout) {
        this.persistTimeout = persistTimeout;
        return this;
    }
    public Long getPersistTimeout() {
        return this.persistTimeout;
    }

    public CreateCasLoadbalanceListenerRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public CreateCasLoadbalanceListenerRequest setStickySessionType(String stickySessionType) {
        this.stickySessionType = stickySessionType;
        return this;
    }
    public String getStickySessionType() {
        return this.stickySessionType;
    }

    public CreateCasLoadbalanceListenerRequest setTlsCipherPolicy(String tlsCipherPolicy) {
        this.tlsCipherPolicy = tlsCipherPolicy;
        return this;
    }
    public String getTlsCipherPolicy() {
        return this.tlsCipherPolicy;
    }

    public CreateCasLoadbalanceListenerRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateCasLoadbalanceListenerRequest setVComputerGroupId(String VComputerGroupId) {
        this.VComputerGroupId = VComputerGroupId;
        return this;
    }
    public String getVComputerGroupId() {
        return this.VComputerGroupId;
    }

}
