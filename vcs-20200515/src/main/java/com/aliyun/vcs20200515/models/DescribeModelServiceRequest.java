// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeModelServiceRequest extends TeaModel {
    @NameInMap("ModelServiceId")
    public String modelServiceId;

    public static DescribeModelServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelServiceRequest self = new DescribeModelServiceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeModelServiceRequest setModelServiceId(String modelServiceId) {
        this.modelServiceId = modelServiceId;
        return this;
    }
    public String getModelServiceId() {
        return this.modelServiceId;
    }

}
