// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeDomainRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Domain")
    public String domain;

    public static DescribeDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRequest self = new DescribeDomainRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
