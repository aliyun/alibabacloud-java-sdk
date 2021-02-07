// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeAppEnvStatusRequest extends TeaModel {
    @NameInMap("EnvId")
    public String envId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAppEnvStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppEnvStatusRequest self = new DescribeAppEnvStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppEnvStatusRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public DescribeAppEnvStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
