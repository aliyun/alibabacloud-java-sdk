// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateBuildpackPackageSignUrlRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RegionNum")
    public String regionNum;

    public static CreateBuildpackPackageSignUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBuildpackPackageSignUrlRequest self = new CreateBuildpackPackageSignUrlRequest();
        return TeaModel.build(map, self);
    }

    public CreateBuildpackPackageSignUrlRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateBuildpackPackageSignUrlRequest setRegionNum(String regionNum) {
        this.regionNum = regionNum;
        return this;
    }
    public String getRegionNum() {
        return this.regionNum;
    }

}
