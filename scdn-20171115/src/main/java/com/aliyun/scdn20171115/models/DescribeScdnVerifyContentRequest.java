// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnVerifyContentRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    public static DescribeScdnVerifyContentRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnVerifyContentRequest self = new DescribeScdnVerifyContentRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScdnVerifyContentRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
