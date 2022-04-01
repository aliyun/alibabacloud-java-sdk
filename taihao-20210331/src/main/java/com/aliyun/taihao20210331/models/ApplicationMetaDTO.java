// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ApplicationMetaDTO extends TeaModel {
    // appType
    @NameInMap("appType")
    public String appType;

    // applicationActions
    @NameInMap("applicationActions")
    public java.util.List<ApplicationAction> applicationActions;

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

    public static ApplicationMetaDTO build(java.util.Map<String, ?> map) throws Exception {
        ApplicationMetaDTO self = new ApplicationMetaDTO();
        return TeaModel.build(map, self);
    }

    public ApplicationMetaDTO setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public ApplicationMetaDTO setApplicationActions(java.util.List<ApplicationAction> applicationActions) {
        this.applicationActions = applicationActions;
        return this;
    }
    public java.util.List<ApplicationAction> getApplicationActions() {
        return this.applicationActions;
    }

    public ApplicationMetaDTO setComponentMetas(java.util.List<ComponentMeta> componentMetas) {
        this.componentMetas = componentMetas;
        return this;
    }
    public java.util.List<ComponentMeta> getComponentMetas() {
        return this.componentMetas;
    }

    public ApplicationMetaDTO setConfigFiles(java.util.List<ConfigFileMeta> configFiles) {
        this.configFiles = configFiles;
        return this;
    }
    public java.util.List<ConfigFileMeta> getConfigFiles() {
        return this.configFiles;
    }

    public ApplicationMetaDTO setDeployModeDependencies(java.util.List<DeployModeDependency> deployModeDependencies) {
        this.deployModeDependencies = deployModeDependencies;
        return this;
    }
    public java.util.List<DeployModeDependency> getDeployModeDependencies() {
        return this.deployModeDependencies;
    }

    public ApplicationMetaDTO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ApplicationMetaDTO setIaasType(String iaasType) {
        this.iaasType = iaasType;
        return this;
    }
    public String getIaasType() {
        return this.iaasType;
    }

    public ApplicationMetaDTO setMetaStoreTypes(java.util.List<String> metaStoreTypes) {
        this.metaStoreTypes = metaStoreTypes;
        return this;
    }
    public java.util.List<String> getMetaStoreTypes() {
        return this.metaStoreTypes;
    }

    public ApplicationMetaDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApplicationMetaDTO setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
