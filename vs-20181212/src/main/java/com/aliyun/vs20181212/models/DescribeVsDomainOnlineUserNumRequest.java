// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainOnlineUserNumRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("QueryTime")
    public String queryTime;

    public static DescribeVsDomainOnlineUserNumRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainOnlineUserNumRequest self = new DescribeVsDomainOnlineUserNumRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainOnlineUserNumRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVsDomainOnlineUserNumRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVsDomainOnlineUserNumRequest setQueryTime(String queryTime) {
        this.queryTime = queryTime;
        return this;
    }
    public String getQueryTime() {
        return this.queryTime;
    }

}
