// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainCnameRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    public static DescribeScdnDomainCnameRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainCnameRequest self = new DescribeScdnDomainCnameRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainCnameRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeScdnDomainCnameRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
