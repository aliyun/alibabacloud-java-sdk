// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateIngressRequest extends TeaModel {
    @NameInMap("CertId")
    public String certId;

    @NameInMap("DefaultRule")
    public String defaultRule;

    @NameInMap("Description")
    public String description;

    @NameInMap("ListenerPort")
    public Integer listenerPort;

    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("Rules")
    public String rules;

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
