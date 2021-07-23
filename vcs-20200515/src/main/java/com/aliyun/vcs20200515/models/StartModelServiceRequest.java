// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class StartModelServiceRequest extends TeaModel {
    @NameInMap("ModelServiceId")
    public String modelServiceId;

    public static StartModelServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartModelServiceRequest self = new StartModelServiceRequest();
        return TeaModel.build(map, self);
    }

    public StartModelServiceRequest setModelServiceId(String modelServiceId) {
        this.modelServiceId = modelServiceId;
        return this;
    }
    public String getModelServiceId() {
        return this.modelServiceId;
    }

}
