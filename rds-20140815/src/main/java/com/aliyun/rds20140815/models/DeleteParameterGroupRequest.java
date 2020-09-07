// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteParameterGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ParameterGroupId")
    @Validation(required = true)
    public String parameterGroupId;

    public static DeleteParameterGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteParameterGroupRequest self = new DeleteParameterGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteParameterGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteParameterGroupRequest setParameterGroupId(String parameterGroupId) {
        this.parameterGroupId = parameterGroupId;
        return this;
    }
    public String getParameterGroupId() {
        return this.parameterGroupId;
    }

}
