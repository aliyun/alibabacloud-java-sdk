// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class VerifyVsDomainOwnerRequest extends TeaModel {
    /**
     * <p>The domain name of Visual Edge Computing Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The verification method. Valid values:</p>
     * <ul>
     * <li><strong>dnsCheck</strong>: DNS verification.</li>
     * <li><strong>fileCheck</strong>: File verification.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dnsCheck</p>
     */
    @NameInMap("VerifyType")
    public String verifyType;

    public static VerifyVsDomainOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyVsDomainOwnerRequest self = new VerifyVsDomainOwnerRequest();
        return TeaModel.build(map, self);
    }

    public VerifyVsDomainOwnerRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public VerifyVsDomainOwnerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public VerifyVsDomainOwnerRequest setVerifyType(String verifyType) {
        this.verifyType = verifyType;
        return this;
    }
    public String getVerifyType() {
        return this.verifyType;
    }

}
