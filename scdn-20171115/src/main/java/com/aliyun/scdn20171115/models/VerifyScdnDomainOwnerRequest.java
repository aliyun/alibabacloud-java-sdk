// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class VerifyScdnDomainOwnerRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("VerifyType")
    public String verifyType;

    public static VerifyScdnDomainOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyScdnDomainOwnerRequest self = new VerifyScdnDomainOwnerRequest();
        return TeaModel.build(map, self);
    }

    public VerifyScdnDomainOwnerRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public VerifyScdnDomainOwnerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public VerifyScdnDomainOwnerRequest setVerifyType(String verifyType) {
        this.verifyType = verifyType;
        return this;
    }
    public String getVerifyType() {
        return this.verifyType;
    }

}
