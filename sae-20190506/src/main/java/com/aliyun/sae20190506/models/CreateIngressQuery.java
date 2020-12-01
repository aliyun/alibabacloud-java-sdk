// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateIngressQuery extends TeaModel {
    @NameInMap("NamespaceId")
    @Validation(required = true)
    public String namespaceId;

    @NameInMap("Description")
    public String description;

    @NameInMap("SlbId")
    @Validation(required = true)
    public String slbId;

    @NameInMap("ListenerPort")
    @Validation(required = true)
    public Integer listenerPort;

    @NameInMap("CertId")
    public String certId;

    @NameInMap("DefaultRule")
    public String defaultRule;

    public static CreateIngressQuery build(java.util.Map<String, ?> map) throws Exception {
        CreateIngressQuery self = new CreateIngressQuery();
        return TeaModel.build(map, self);
    }

    public CreateIngressQuery setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreateIngressQuery setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateIngressQuery setSlbId(String slbId) {
        this.slbId = slbId;
        return this;
    }
    public String getSlbId() {
        return this.slbId;
    }

    public CreateIngressQuery setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public CreateIngressQuery setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

    public CreateIngressQuery setDefaultRule(String defaultRule) {
        this.defaultRule = defaultRule;
        return this;
    }
    public String getDefaultRule() {
        return this.defaultRule;
    }

}
