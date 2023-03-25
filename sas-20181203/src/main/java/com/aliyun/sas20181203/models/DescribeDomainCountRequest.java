// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainCountRequest extends TeaModel {
    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeDomainCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainCountRequest self = new DescribeDomainCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainCountRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
