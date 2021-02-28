// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDDoSInfoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeScdnDDoSInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDDoSInfoRequest self = new DescribeScdnDDoSInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDDoSInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
