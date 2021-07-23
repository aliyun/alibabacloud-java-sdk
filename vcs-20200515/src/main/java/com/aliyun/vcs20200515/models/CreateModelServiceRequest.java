// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateModelServiceRequest extends TeaModel {
    @NameInMap("AlgorithmCode")
    public String algorithmCode;

    @NameInMap("QPSRequired")
    public Integer QPSRequired;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateModelServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelServiceRequest self = new CreateModelServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelServiceRequest setAlgorithmCode(String algorithmCode) {
        this.algorithmCode = algorithmCode;
        return this;
    }
    public String getAlgorithmCode() {
        return this.algorithmCode;
    }

    public CreateModelServiceRequest setQPSRequired(Integer QPSRequired) {
        this.QPSRequired = QPSRequired;
        return this;
    }
    public Integer getQPSRequired() {
        return this.QPSRequired;
    }

    public CreateModelServiceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateModelServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
