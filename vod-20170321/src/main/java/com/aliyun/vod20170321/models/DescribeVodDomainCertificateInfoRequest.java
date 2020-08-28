// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainCertificateInfoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    public static DescribeVodDomainCertificateInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainCertificateInfoRequest self = new DescribeVodDomainCertificateInfoRequest();
        return TeaModel.build(map, self);
    }

}
