// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class DeletePublicParameterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    public static DeletePublicParameterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePublicParameterRequest self = new DeletePublicParameterRequest();
        return TeaModel.build(map, self);
    }

    public DeletePublicParameterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeletePublicParameterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
