// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeployApplicationsRequest extends TeaModel {
    // deployApplicationParam
    @NameInMap("deployApplicationParam")
    public DeployApplicationParam deployApplicationParam;

    public static DeployApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployApplicationsRequest self = new DeployApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public DeployApplicationsRequest setDeployApplicationParam(DeployApplicationParam deployApplicationParam) {
        this.deployApplicationParam = deployApplicationParam;
        return this;
    }
    public DeployApplicationParam getDeployApplicationParam() {
        return this.deployApplicationParam;
    }

}
