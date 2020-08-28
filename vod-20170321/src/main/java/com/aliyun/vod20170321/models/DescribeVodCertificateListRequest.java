// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodCertificateListRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainName")
    public String domainName;

    public static DescribeVodCertificateListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodCertificateListRequest self = new DescribeVodCertificateListRequest();
        return TeaModel.build(map, self);
    }

}
