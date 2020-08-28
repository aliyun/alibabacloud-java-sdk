// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class BatchStopVodDomainRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainNames")
    @Validation(required = true)
    public String domainNames;

    public static BatchStopVodDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchStopVodDomainRequest self = new BatchStopVodDomainRequest();
        return TeaModel.build(map, self);
    }

}
