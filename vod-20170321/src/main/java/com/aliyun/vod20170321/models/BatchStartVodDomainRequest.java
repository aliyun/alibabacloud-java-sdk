// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class BatchStartVodDomainRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainNames")
    @Validation(required = true)
    public String domainNames;

    public static BatchStartVodDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchStartVodDomainRequest self = new BatchStartVodDomainRequest();
        return TeaModel.build(map, self);
    }

}
