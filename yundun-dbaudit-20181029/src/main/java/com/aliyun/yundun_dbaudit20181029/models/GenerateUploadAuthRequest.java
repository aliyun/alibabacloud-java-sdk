// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20181029.models;

import com.aliyun.tea.*;

public class GenerateUploadAuthRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GenerateUploadAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadAuthRequest self = new GenerateUploadAuthRequest();
        return TeaModel.build(map, self);
    }

    public GenerateUploadAuthRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GenerateUploadAuthRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
