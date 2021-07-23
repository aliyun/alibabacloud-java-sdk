// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteModelServiceRequest extends TeaModel {
    @NameInMap("ModelServiceId")
    public String modelServiceId;

    public static DeleteModelServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelServiceRequest self = new DeleteModelServiceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteModelServiceRequest setModelServiceId(String modelServiceId) {
        this.modelServiceId = modelServiceId;
        return this;
    }
    public String getModelServiceId() {
        return this.modelServiceId;
    }

}
