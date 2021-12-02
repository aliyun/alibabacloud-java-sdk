// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateEnvironmentRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("AppSchemaId")
    public Long appSchemaId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("EnvName")
    public String envName;

    @NameInMap("EnvType")
    public Integer envType;

    @NameInMap("Region")
    public String region;

    @NameInMap("Replicas")
    public Integer replicas;

    public static CreateEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentRequest self = new CreateEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public CreateEnvironmentRequest setAppSchemaId(Long appSchemaId) {
        this.appSchemaId = appSchemaId;
        return this;
    }
    public Long getAppSchemaId() {
        return this.appSchemaId;
    }

    public CreateEnvironmentRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateEnvironmentRequest setEnvName(String envName) {
        this.envName = envName;
        return this;
    }
    public String getEnvName() {
        return this.envName;
    }

    public CreateEnvironmentRequest setEnvType(Integer envType) {
        this.envType = envType;
        return this;
    }
    public Integer getEnvType() {
        return this.envType;
    }

    public CreateEnvironmentRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateEnvironmentRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

}
