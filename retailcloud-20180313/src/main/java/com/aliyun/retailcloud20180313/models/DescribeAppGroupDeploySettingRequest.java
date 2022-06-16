// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeAppGroupDeploySettingRequest extends TeaModel {
    @NameInMap("AppGroupId")
    public Long appGroupId;

    @NameInMap("EnvType")
    public String envType;

    public static DescribeAppGroupDeploySettingRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppGroupDeploySettingRequest self = new DescribeAppGroupDeploySettingRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppGroupDeploySettingRequest setAppGroupId(Long appGroupId) {
        this.appGroupId = appGroupId;
        return this;
    }
    public Long getAppGroupId() {
        return this.appGroupId;
    }

    public DescribeAppGroupDeploySettingRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

}
