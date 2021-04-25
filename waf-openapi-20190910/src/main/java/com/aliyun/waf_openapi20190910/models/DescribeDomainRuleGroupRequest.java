// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeDomainRuleGroupRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeDomainRuleGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRuleGroupRequest self = new DescribeDomainRuleGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRuleGroupRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeDomainRuleGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
