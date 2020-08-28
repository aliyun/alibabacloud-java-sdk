// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainConfigsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("FunctionNames")
    @Validation(required = true)
    public String functionNames;

    public static DescribeVodDomainConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainConfigsRequest self = new DescribeVodDomainConfigsRequest();
        return TeaModel.build(map, self);
    }

}
