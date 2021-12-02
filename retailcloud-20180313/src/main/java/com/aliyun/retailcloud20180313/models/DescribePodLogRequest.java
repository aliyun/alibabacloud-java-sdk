// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribePodLogRequest extends TeaModel {
    @NameInMap("AppInstId")
    public String appInstId;

    @NameInMap("DeployOrderId")
    public Long deployOrderId;

    public static DescribePodLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePodLogRequest self = new DescribePodLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribePodLogRequest setAppInstId(String appInstId) {
        this.appInstId = appInstId;
        return this;
    }
    public String getAppInstId() {
        return this.appInstId;
    }

    public DescribePodLogRequest setDeployOrderId(Long deployOrderId) {
        this.deployOrderId = deployOrderId;
        return this;
    }
    public Long getDeployOrderId() {
        return this.deployOrderId;
    }

}
