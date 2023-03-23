// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateIngressRequest extends TeaModel {
    /**
     * <p>188077086902\*\*\*\*\_176993d\*\*\*\*\_181437\*\*\*\*\_108724\*\*\*\*</p>
     */
    @NameInMap("CertId")
    public String certId;

    @NameInMap("CertIds")
    public String certIds;

    /**
     * <p>{"appId":"395b60e4-0550-458d-9c54-a265d036\*\*\*\*","containerPort":8080}</p>
     */
    @NameInMap("DefaultRule")
    public String defaultRule;

    /**
     * <p>ingress-sae-test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>87</p>
     */
    @NameInMap("IngressId")
    public Long ingressId;

    /**
     * <p>443</p>
     */
    @NameInMap("ListenerPort")
    public String listenerPort;

    /**
     * <p>HTTP</p>
     */
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    /**
     * <p>clb</p>
     */
    @NameInMap("LoadBalanceType")
    public String loadBalanceType;

    /**
     * <p>\[{"appId":"395b60e4-0550-458d-9c54-a265d036\*\*\*\*","containerPort":8080,"domain":"www.sae.site","path":"/path1"},{"appId":"666403ce-d25b-47cf-87fe-497565d2\*\*\*\*","containerPort":8080,"domain":"sae.site","path":"/path2"}]</p>
     */
    @NameInMap("Rules")
    public String rules;

    public static UpdateIngressRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIngressRequest self = new UpdateIngressRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIngressRequest setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

    public UpdateIngressRequest setCertIds(String certIds) {
        this.certIds = certIds;
        return this;
    }
    public String getCertIds() {
        return this.certIds;
    }

    public UpdateIngressRequest setDefaultRule(String defaultRule) {
        this.defaultRule = defaultRule;
        return this;
    }
    public String getDefaultRule() {
        return this.defaultRule;
    }

    public UpdateIngressRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateIngressRequest setIngressId(Long ingressId) {
        this.ingressId = ingressId;
        return this;
    }
    public Long getIngressId() {
        return this.ingressId;
    }

    public UpdateIngressRequest setListenerPort(String listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public String getListenerPort() {
        return this.listenerPort;
    }

    public UpdateIngressRequest setListenerProtocol(String listenerProtocol) {
        this.listenerProtocol = listenerProtocol;
        return this;
    }
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    public UpdateIngressRequest setLoadBalanceType(String loadBalanceType) {
        this.loadBalanceType = loadBalanceType;
        return this;
    }
    public String getLoadBalanceType() {
        return this.loadBalanceType;
    }

    public UpdateIngressRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

}
