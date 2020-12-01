// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateIngressQuery extends TeaModel {
    @NameInMap("IngressId")
    @Validation(required = true)
    public Long ingressId;

    @NameInMap("CertId")
    public String certId;

    @NameInMap("Description")
    public String description;

    @NameInMap("ListenerPort")
    public String listenerPort;

    @NameInMap("DefaultRule")
    public String defaultRule;

    public static UpdateIngressQuery build(java.util.Map<String, ?> map) throws Exception {
        UpdateIngressQuery self = new UpdateIngressQuery();
        return TeaModel.build(map, self);
    }

    public UpdateIngressQuery setIngressId(Long ingressId) {
        this.ingressId = ingressId;
        return this;
    }
    public Long getIngressId() {
        return this.ingressId;
    }

    public UpdateIngressQuery setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

    public UpdateIngressQuery setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateIngressQuery setListenerPort(String listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public String getListenerPort() {
        return this.listenerPort;
    }

    public UpdateIngressQuery setDefaultRule(String defaultRule) {
        this.defaultRule = defaultRule;
        return this;
    }
    public String getDefaultRule() {
        return this.defaultRule;
    }

}
