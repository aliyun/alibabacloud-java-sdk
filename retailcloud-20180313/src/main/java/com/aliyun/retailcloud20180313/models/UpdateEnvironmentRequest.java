// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class UpdateEnvironmentRequest extends TeaModel {
    @NameInMap("AppEnvId")
    public Long appEnvId;

    @NameInMap("AppId")
    public Long appId;

    @NameInMap("AppSchemaId")
    public Long appSchemaId;

    @NameInMap("Replicas")
    public Integer replicas;

    public static UpdateEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvironmentRequest self = new UpdateEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnvironmentRequest setAppEnvId(Long appEnvId) {
        this.appEnvId = appEnvId;
        return this;
    }
    public Long getAppEnvId() {
        return this.appEnvId;
    }

    public UpdateEnvironmentRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public UpdateEnvironmentRequest setAppSchemaId(Long appSchemaId) {
        this.appSchemaId = appSchemaId;
        return this;
    }
    public Long getAppSchemaId() {
        return this.appSchemaId;
    }

    public UpdateEnvironmentRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

}
