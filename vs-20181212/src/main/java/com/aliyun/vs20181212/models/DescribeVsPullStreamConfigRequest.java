// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsPullStreamConfigRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeVsPullStreamConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsPullStreamConfigRequest self = new DescribeVsPullStreamConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVsPullStreamConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVsPullStreamConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
