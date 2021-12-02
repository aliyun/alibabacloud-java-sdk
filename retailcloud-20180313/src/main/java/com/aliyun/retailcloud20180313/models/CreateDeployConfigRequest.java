// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateDeployConfigRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("CodePath")
    public String codePath;

    @NameInMap("ConfigMap")
    public String configMap;

    @NameInMap("ConfigMapList")
    public java.util.List<String> configMapList;

    @NameInMap("CronJob")
    public String cronJob;

    @NameInMap("Deployment")
    public String deployment;

    @NameInMap("EnvType")
    public String envType;

    @NameInMap("Name")
    public String name;

    @NameInMap("SecretList")
    public java.util.List<String> secretList;

    @NameInMap("StatefulSet")
    public String statefulSet;

    public static CreateDeployConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeployConfigRequest self = new CreateDeployConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeployConfigRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public CreateDeployConfigRequest setCodePath(String codePath) {
        this.codePath = codePath;
        return this;
    }
    public String getCodePath() {
        return this.codePath;
    }

    public CreateDeployConfigRequest setConfigMap(String configMap) {
        this.configMap = configMap;
        return this;
    }
    public String getConfigMap() {
        return this.configMap;
    }

    public CreateDeployConfigRequest setConfigMapList(java.util.List<String> configMapList) {
        this.configMapList = configMapList;
        return this;
    }
    public java.util.List<String> getConfigMapList() {
        return this.configMapList;
    }

    public CreateDeployConfigRequest setCronJob(String cronJob) {
        this.cronJob = cronJob;
        return this;
    }
    public String getCronJob() {
        return this.cronJob;
    }

    public CreateDeployConfigRequest setDeployment(String deployment) {
        this.deployment = deployment;
        return this;
    }
    public String getDeployment() {
        return this.deployment;
    }

    public CreateDeployConfigRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public CreateDeployConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDeployConfigRequest setSecretList(java.util.List<String> secretList) {
        this.secretList = secretList;
        return this;
    }
    public java.util.List<String> getSecretList() {
        return this.secretList;
    }

    public CreateDeployConfigRequest setStatefulSet(String statefulSet) {
        this.statefulSet = statefulSet;
        return this;
    }
    public String getStatefulSet() {
        return this.statefulSet;
    }

}
