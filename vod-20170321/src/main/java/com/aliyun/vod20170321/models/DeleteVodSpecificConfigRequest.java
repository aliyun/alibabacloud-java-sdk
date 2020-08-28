// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVodSpecificConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("ConfigId")
    @Validation(required = true)
    public String configId;

    public static DeleteVodSpecificConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodSpecificConfigRequest self = new DeleteVodSpecificConfigRequest();
        return TeaModel.build(map, self);
    }

}
