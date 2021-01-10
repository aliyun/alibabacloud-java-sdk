// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateCasLoadbalanceListenerRequest extends TeaModel {
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

    @NameInMap("ListenerPort")
    public Long listenerPort;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("PersistTimeout")
    public Long persistTimeout;

    @NameInMap("Scheduler")
    public String scheduler;

    @NameInMap("StickySessionType")
    public String stickySessionType;

    @NameInMap("TlsCipherPolicy")
    public String tlsCipherPolicy;

    @NameInMap("UseVComputerGroup")
    public Boolean useVComputerGroup;

    @NameInMap("VComputerGroupId")
    public String VComputerGroupId;

    public static UpdateCasLoadbalanceListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCasLoadbalanceListenerRequest self = new UpdateCasLoadbalanceListenerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCasLoadbalanceListenerRequest setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public UpdateCasLoadbalanceListenerRequest setCertificateIaasId(String certificateIaasId) {
        this.certificateIaasId = certificateIaasId;
        return this;
    }
    public String getCertificateIaasId() {
        return this.certificateIaasId;
    }

    public UpdateCasLoadbalanceListenerRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public UpdateCasLoadbalanceListenerRequest setCookie(String cookie) {
        this.cookie = cookie;
        return this;
    }
    public String getCookie() {
        return this.cookie;
    }

    public UpdateCasLoadbalanceListenerRequest setCookieTimeout(Long cookieTimeout) {
        this.cookieTimeout = cookieTimeout;
        return this;
    }
    public Long getCookieTimeout() {
        return this.cookieTimeout;
    }

    public UpdateCasLoadbalanceListenerRequest setEstablishedTimeout(Long establishedTimeout) {
        this.establishedTimeout = establishedTimeout;
        return this;
    }
    public Long getEstablishedTimeout() {
        return this.establishedTimeout;
    }

    public UpdateCasLoadbalanceListenerRequest setGmCryptoCertIaasId(String gmCryptoCertIaasId) {
        this.gmCryptoCertIaasId = gmCryptoCertIaasId;
        return this;
    }
    public String getGmCryptoCertIaasId() {
        return this.gmCryptoCertIaasId;
    }

    public UpdateCasLoadbalanceListenerRequest setGmSignCertIaasId(String gmSignCertIaasId) {
        this.gmSignCertIaasId = gmSignCertIaasId;
        return this;
    }
    public String getGmSignCertIaasId() {
        return this.gmSignCertIaasId;
    }

    public UpdateCasLoadbalanceListenerRequest setHealthMonitorJsonStr(String healthMonitorJsonStr) {
        this.healthMonitorJsonStr = healthMonitorJsonStr;
        return this;
    }
    public String getHealthMonitorJsonStr() {
        return this.healthMonitorJsonStr;
    }

    public UpdateCasLoadbalanceListenerRequest setListenerPort(Long listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Long getListenerPort() {
        return this.listenerPort;
    }

    public UpdateCasLoadbalanceListenerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public UpdateCasLoadbalanceListenerRequest setPersistTimeout(Long persistTimeout) {
        this.persistTimeout = persistTimeout;
        return this;
    }
    public Long getPersistTimeout() {
        return this.persistTimeout;
    }

    public UpdateCasLoadbalanceListenerRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public UpdateCasLoadbalanceListenerRequest setStickySessionType(String stickySessionType) {
        this.stickySessionType = stickySessionType;
        return this;
    }
    public String getStickySessionType() {
        return this.stickySessionType;
    }

    public UpdateCasLoadbalanceListenerRequest setTlsCipherPolicy(String tlsCipherPolicy) {
        this.tlsCipherPolicy = tlsCipherPolicy;
        return this;
    }
    public String getTlsCipherPolicy() {
        return this.tlsCipherPolicy;
    }

    public UpdateCasLoadbalanceListenerRequest setUseVComputerGroup(Boolean useVComputerGroup) {
        this.useVComputerGroup = useVComputerGroup;
        return this;
    }
    public Boolean getUseVComputerGroup() {
        return this.useVComputerGroup;
    }

    public UpdateCasLoadbalanceListenerRequest setVComputerGroupId(String VComputerGroupId) {
        this.VComputerGroupId = VComputerGroupId;
        return this;
    }
    public String getVComputerGroupId() {
        return this.VComputerGroupId;
    }

}
