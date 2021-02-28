// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnUserProtectInfoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeScdnUserProtectInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnUserProtectInfoRequest self = new DescribeScdnUserProtectInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScdnUserProtectInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
