// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateModelServiceRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ModelServiceId")
    public String modelServiceId;

    @NameInMap("ModelServiceName")
    public String modelServiceName;

    @NameInMap("QpsRequired")
    public Integer qpsRequired;

    public static UpdateModelServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelServiceRequest self = new UpdateModelServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateModelServiceRequest setModelServiceId(String modelServiceId) {
        this.modelServiceId = modelServiceId;
        return this;
    }
    public String getModelServiceId() {
        return this.modelServiceId;
    }

    public UpdateModelServiceRequest setModelServiceName(String modelServiceName) {
        this.modelServiceName = modelServiceName;
        return this;
    }
    public String getModelServiceName() {
        return this.modelServiceName;
    }

    public UpdateModelServiceRequest setQpsRequired(Integer qpsRequired) {
        this.qpsRequired = qpsRequired;
        return this;
    }
    public Integer getQpsRequired() {
        return this.qpsRequired;
    }

}
