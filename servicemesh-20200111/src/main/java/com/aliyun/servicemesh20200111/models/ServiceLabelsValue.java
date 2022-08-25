// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ServiceLabelsValue extends TeaModel {
    @NameInMap("Labels")
    public java.util.Map<String, String> labels;

    @NameInMap("Success")
    public Boolean success;

    public static ServiceLabelsValue build(java.util.Map<String, ?> map) throws Exception {
        ServiceLabelsValue self = new ServiceLabelsValue();
        return TeaModel.build(map, self);
    }

    public ServiceLabelsValue setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public ServiceLabelsValue setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
