// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class VerifyVodDomainOwnerRequest extends TeaModel {
    /**
     * <p>The domain name of which you want to verify the ownership. You can specify only one domain name in each call.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The DNS verification method that is used to verify the ownership of the specified domain name.</p>
     */
    @NameInMap("VerifyType")
    public String verifyType;

    public static VerifyVodDomainOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyVodDomainOwnerRequest self = new VerifyVodDomainOwnerRequest();
        return TeaModel.build(map, self);
    }

    public VerifyVodDomainOwnerRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public VerifyVodDomainOwnerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public VerifyVodDomainOwnerRequest setVerifyType(String verifyType) {
        this.verifyType = verifyType;
        return this;
    }
    public String getVerifyType() {
        return this.verifyType;
    }

}
