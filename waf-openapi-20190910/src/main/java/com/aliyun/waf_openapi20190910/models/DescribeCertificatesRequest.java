// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeCertificatesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Domain")
    public String domain;

    public static DescribeCertificatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificatesRequest self = new DescribeCertificatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCertificatesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCertificatesRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
