// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class DisassociateAdditionalCertificatesWithListenerRequest extends TeaModel {
    @NameInMap("AdditionalCertificateIds")
    public java.util.List<String> additionalCertificateIds;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("ListenerId")
    public String listenerId;

    @NameInMap("RegionId")
    public String regionId;

    public static DisassociateAdditionalCertificatesWithListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        DisassociateAdditionalCertificatesWithListenerRequest self = new DisassociateAdditionalCertificatesWithListenerRequest();
        return TeaModel.build(map, self);
    }

    public DisassociateAdditionalCertificatesWithListenerRequest setAdditionalCertificateIds(java.util.List<String> additionalCertificateIds) {
        this.additionalCertificateIds = additionalCertificateIds;
        return this;
    }
    public java.util.List<String> getAdditionalCertificateIds() {
        return this.additionalCertificateIds;
    }

    public DisassociateAdditionalCertificatesWithListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DisassociateAdditionalCertificatesWithListenerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DisassociateAdditionalCertificatesWithListenerRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public DisassociateAdditionalCertificatesWithListenerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
