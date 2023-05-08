// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainDetailRequest extends TeaModel {
    /**
     * <p>The domain name or the name of website that you want to query.</p>
     * <br>
     * <p>>  Fuzzy match is not supported. You must enter a complete domain name or a website.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The type of the domain asset. Valid values:</p>
     * <br>
     * <p>*   **0**: an Elastic Compute Service (ECS) instance</p>
     * <p>*   **1**: a Server Load Balancer (SLB) instance</p>
     * <p>*   **2**: a Network Address Translation (NAT) gateway</p>
     * <p>*   **3**: an ApsaraDB RDS instance</p>
     * <p>*   **4**: an ApsaraDB for MongoDB instance</p>
     */
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
