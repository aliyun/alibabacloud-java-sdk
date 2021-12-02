// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribePodEventsRequest extends TeaModel {
    @NameInMap("AppInstId")
    public String appInstId;

    @NameInMap("DeployOrderId")
    public Long deployOrderId;

    public static DescribePodEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePodEventsRequest self = new DescribePodEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePodEventsRequest setAppInstId(String appInstId) {
        this.appInstId = appInstId;
        return this;
    }
    public String getAppInstId() {
        return this.appInstId;
    }

    public DescribePodEventsRequest setDeployOrderId(Long deployOrderId) {
        this.deployOrderId = deployOrderId;
        return this;
    }
    public Long getDeployOrderId() {
        return this.deployOrderId;
    }

}
