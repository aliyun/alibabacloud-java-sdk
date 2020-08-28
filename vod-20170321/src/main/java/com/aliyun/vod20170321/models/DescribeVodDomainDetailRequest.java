// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainDetailRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    public static DescribeVodDomainDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainDetailRequest self = new DescribeVodDomainDetailRequest();
        return TeaModel.build(map, self);
    }

}
