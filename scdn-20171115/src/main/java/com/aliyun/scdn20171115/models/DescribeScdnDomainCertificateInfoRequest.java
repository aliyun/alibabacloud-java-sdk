// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainCertificateInfoRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    public static DescribeScdnDomainCertificateInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainCertificateInfoRequest self = new DescribeScdnDomainCertificateInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainCertificateInfoRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
