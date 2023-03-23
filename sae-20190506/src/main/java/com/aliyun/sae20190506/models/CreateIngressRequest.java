// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateIngressRequest extends TeaModel {
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
     * <p>ingress-for-sae-test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>80</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

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
     * <p>cn-beijing:sae-test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>\[{"appId":"395b60e4-0550-458d-9c54-a265d036\*\*\*\*","containerPort":8080,"domain":"www.sae.site","path":"/path1"},{"appId":"666403ce-d25b-47cf-87fe-497565d2\*\*\*\*","containerPort":8080,"domain":"sae.site","path":"/path2"}]</p>
     */
    @NameInMap("Rules")
    public String rules;

    /**
     * <p>lb-uf6hucc7inlqrtcq5\*\*\*\*</p>
     */
    @NameInMap("SlbId")
    public String slbId;

    public static CreateIngressRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIngressRequest self = new CreateIngressRequest();
        return TeaModel.build(map, self);
    }

    public CreateIngressRequest setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

    public CreateIngressRequest setCertIds(String certIds) {
        this.certIds = certIds;
        return this;
    }
    public String getCertIds() {
        return this.certIds;
    }

    public CreateIngressRequest setDefaultRule(String defaultRule) {
        this.defaultRule = defaultRule;
        return this;
    }
    public String getDefaultRule() {
        return this.defaultRule;
    }

    public CreateIngressRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateIngressRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public CreateIngressRequest setListenerProtocol(String listenerProtocol) {
        this.listenerProtocol = listenerProtocol;
        return this;
    }
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    public CreateIngressRequest setLoadBalanceType(String loadBalanceType) {
        this.loadBalanceType = loadBalanceType;
        return this;
    }
    public String getLoadBalanceType() {
        return this.loadBalanceType;
    }

    public CreateIngressRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreateIngressRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

    public CreateIngressRequest setSlbId(String slbId) {
        this.slbId = slbId;
        return this;
    }
    public String getSlbId() {
        return this.slbId;
    }

}
