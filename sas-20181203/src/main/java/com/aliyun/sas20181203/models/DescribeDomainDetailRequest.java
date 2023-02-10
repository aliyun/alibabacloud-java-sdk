// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainDetailRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeDomainDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainDetailRequest self = new DescribeDomainDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainDetailRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainDetailRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
