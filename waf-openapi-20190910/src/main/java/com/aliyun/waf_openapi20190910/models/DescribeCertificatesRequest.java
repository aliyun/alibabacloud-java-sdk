// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeCertificatesRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeCertificatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificatesRequest self = new DescribeCertificatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCertificatesRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeCertificatesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
