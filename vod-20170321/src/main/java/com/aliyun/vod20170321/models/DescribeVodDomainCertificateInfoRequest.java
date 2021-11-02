// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainCertificateInfoRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeVodDomainCertificateInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainCertificateInfoRequest self = new DescribeVodDomainCertificateInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainCertificateInfoRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainCertificateInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
