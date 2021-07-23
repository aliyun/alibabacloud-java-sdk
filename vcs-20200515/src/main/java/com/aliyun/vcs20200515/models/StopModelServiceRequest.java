// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class StopModelServiceRequest extends TeaModel {
    @NameInMap("ModelServiceId")
    public String modelServiceId;

    public static StopModelServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopModelServiceRequest self = new StopModelServiceRequest();
        return TeaModel.build(map, self);
    }

    public StopModelServiceRequest setModelServiceId(String modelServiceId) {
        this.modelServiceId = modelServiceId;
        return this;
    }
    public String getModelServiceId() {
        return this.modelServiceId;
    }

}
