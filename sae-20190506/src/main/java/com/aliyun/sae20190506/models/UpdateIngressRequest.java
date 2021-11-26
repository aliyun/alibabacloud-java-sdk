// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateIngressRequest extends TeaModel {
    @NameInMap("CertId")
    public String certId;

    @NameInMap("DefaultRule")
    public String defaultRule;

    @NameInMap("Description")
    public String description;

    @NameInMap("IngressId")
    public Long ingressId;

    @NameInMap("ListenerPort")
    public String listenerPort;

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

    public UpdateIngressRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

}
