// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class CreateStorageRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static CreateStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageRequest self = new CreateStorageRequest();
        return TeaModel.build(map, self);
    }

    public CreateStorageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
