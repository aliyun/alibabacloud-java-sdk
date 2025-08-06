// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RegistDRMCertInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ask")
    public String ask;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CertName")
    public String certName;

    @NameInMap("Description")
    public String description;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PassPhrase")
    public String passPhrase;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServCert")
    public String servCert;

    public static RegistDRMCertInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        RegistDRMCertInfoRequest self = new RegistDRMCertInfoRequest();
        return TeaModel.build(map, self);
    }

    public RegistDRMCertInfoRequest setAsk(String ask) {
        this.ask = ask;
        return this;
    }
    public String getAsk() {
        return this.ask;
    }

    public RegistDRMCertInfoRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public RegistDRMCertInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RegistDRMCertInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RegistDRMCertInfoRequest setPassPhrase(String passPhrase) {
        this.passPhrase = passPhrase;
        return this;
    }
    public String getPassPhrase() {
        return this.passPhrase;
    }

    public RegistDRMCertInfoRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public RegistDRMCertInfoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RegistDRMCertInfoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RegistDRMCertInfoRequest setResourceRealOwnerId(Long resourceRealOwnerId) {
        this.resourceRealOwnerId = resourceRealOwnerId;
        return this;
    }
    public Long getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

    public RegistDRMCertInfoRequest setServCert(String servCert) {
        this.servCert = servCert;
        return this;
    }
    public String getServCert() {
        return this.servCert;
    }

}
