// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetParametersRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Names")
    public String names;

    public static GetParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        GetParametersRequest self = new GetParametersRequest();
        return TeaModel.build(map, self);
    }

    public GetParametersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetParametersRequest setNames(String names) {
        this.names = names;
        return this;
    }
    public String getNames() {
        return this.names;
    }

}
