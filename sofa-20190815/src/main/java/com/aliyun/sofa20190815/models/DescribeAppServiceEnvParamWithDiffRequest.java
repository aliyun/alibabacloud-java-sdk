// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeAppServiceEnvParamWithDiffRequest extends TeaModel {
    @NameInMap("AppServiceId")
    public String appServiceId;

    @NameInMap("BuildpackId")
    public String buildpackId;

    public static DescribeAppServiceEnvParamWithDiffRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppServiceEnvParamWithDiffRequest self = new DescribeAppServiceEnvParamWithDiffRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppServiceEnvParamWithDiffRequest setAppServiceId(String appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public String getAppServiceId() {
        return this.appServiceId;
    }

    public DescribeAppServiceEnvParamWithDiffRequest setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

}
