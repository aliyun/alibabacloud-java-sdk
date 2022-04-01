// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ApplicationMeta extends TeaModel {
    // appType
    @NameInMap("appType")
    public String appType;

    // applicationActions
    @NameInMap("applicationActions")
    public java.util.List<ApplicationAction> applicationActions;

    // autoScalingConfig
    @NameInMap("autoScalingConfig")
    public AutoScalingConfig autoScalingConfig;

    // componentMetas
    @NameInMap("componentMetas")
    public java.util.List<ComponentMeta> componentMetas;

    // configFiles
    @NameInMap("configFiles")
    public java.util.List<ConfigFileMeta> configFiles;

    // deployModeDependencies
    @NameInMap("deployModeDependencies")
    public java.util.List<DeployModeDependency> deployModeDependencies;

    // description
    @NameInMap("description")
    public String description;

    // iaasType
    @NameInMap("iaasType")
    public String iaasType;

    // metaStoreTypes
    @NameInMap("metaStoreTypes")
    public java.util.List<String> metaStoreTypes;

    // name
    @NameInMap("name")
    public String name;

    // version
    @NameInMap("version")
    public String version;

    public static ApplicationMeta build(java.util.Map<String, ?> map) throws Exception {
        ApplicationMeta self = new ApplicationMeta();
        return TeaModel.build(map, self);
    }

    public ApplicationMeta setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public ApplicationMeta setApplicationActions(java.util.List<ApplicationAction> applicationActions) {
        this.applicationActions = applicationActions;
        return this;
    }
    public java.util.List<ApplicationAction> getApplicationActions() {
        return this.applicationActions;
    }

    public ApplicationMeta setAutoScalingConfig(AutoScalingConfig autoScalingConfig) {
        this.autoScalingConfig = autoScalingConfig;
        return this;
    }
    public AutoScalingConfig getAutoScalingConfig() {
        return this.autoScalingConfig;
    }

    public ApplicationMeta setComponentMetas(java.util.List<ComponentMeta> componentMetas) {
        this.componentMetas = componentMetas;
        return this;
    }
    public java.util.List<ComponentMeta> getComponentMetas() {
        return this.componentMetas;
    }

    public ApplicationMeta setConfigFiles(java.util.List<ConfigFileMeta> configFiles) {
        this.configFiles = configFiles;
        return this;
    }
    public java.util.List<ConfigFileMeta> getConfigFiles() {
        return this.configFiles;
    }

    public ApplicationMeta setDeployModeDependencies(java.util.List<DeployModeDependency> deployModeDependencies) {
        this.deployModeDependencies = deployModeDependencies;
        return this;
    }
    public java.util.List<DeployModeDependency> getDeployModeDependencies() {
        return this.deployModeDependencies;
    }

    public ApplicationMeta setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ApplicationMeta setIaasType(String iaasType) {
        this.iaasType = iaasType;
        return this;
    }
    public String getIaasType() {
        return this.iaasType;
    }

    public ApplicationMeta setMetaStoreTypes(java.util.List<String> metaStoreTypes) {
        this.metaStoreTypes = metaStoreTypes;
        return this;
    }
    public java.util.List<String> getMetaStoreTypes() {
        return this.metaStoreTypes;
    }

    public ApplicationMeta setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApplicationMeta setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
