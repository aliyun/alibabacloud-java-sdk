// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class UpdateDeployConfigRequest extends TeaModel {
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

    @NameInMap("Id")
    public Long id;

    @NameInMap("SecretList")
    public java.util.List<String> secretList;

    @NameInMap("StatefulSet")
    public String statefulSet;

    public static UpdateDeployConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeployConfigRequest self = new UpdateDeployConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeployConfigRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public UpdateDeployConfigRequest setCodePath(String codePath) {
        this.codePath = codePath;
        return this;
    }
    public String getCodePath() {
        return this.codePath;
    }

    public UpdateDeployConfigRequest setConfigMap(String configMap) {
        this.configMap = configMap;
        return this;
    }
    public String getConfigMap() {
        return this.configMap;
    }

    public UpdateDeployConfigRequest setConfigMapList(java.util.List<String> configMapList) {
        this.configMapList = configMapList;
        return this;
    }
    public java.util.List<String> getConfigMapList() {
        return this.configMapList;
    }

    public UpdateDeployConfigRequest setCronJob(String cronJob) {
        this.cronJob = cronJob;
        return this;
    }
    public String getCronJob() {
        return this.cronJob;
    }

    public UpdateDeployConfigRequest setDeployment(String deployment) {
        this.deployment = deployment;
        return this;
    }
    public String getDeployment() {
        return this.deployment;
    }

    public UpdateDeployConfigRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateDeployConfigRequest setSecretList(java.util.List<String> secretList) {
        this.secretList = secretList;
        return this;
    }
    public java.util.List<String> getSecretList() {
        return this.secretList;
    }

    public UpdateDeployConfigRequest setStatefulSet(String statefulSet) {
        this.statefulSet = statefulSet;
        return this;
    }
    public String getStatefulSet() {
        return this.statefulSet;
    }

}
