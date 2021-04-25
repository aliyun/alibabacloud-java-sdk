// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DeleteDomainRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Domain")
    public String domain;

    public static DeleteDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainRequest self = new DeleteDomainRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDomainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
