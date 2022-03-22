// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnCcInfoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeScdnCcInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnCcInfoRequest self = new DescribeScdnCcInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScdnCcInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
