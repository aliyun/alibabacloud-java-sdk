// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteGadInstanceRequest extends TeaModel {
    @NameInMap("GadInstanceName")
    public String gadInstanceName;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteGadInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGadInstanceRequest self = new DeleteGadInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGadInstanceRequest setGadInstanceName(String gadInstanceName) {
        this.gadInstanceName = gadInstanceName;
        return this;
    }
    public String getGadInstanceName() {
        return this.gadInstanceName;
    }

    public DeleteGadInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
