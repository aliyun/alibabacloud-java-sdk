// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class MainVersionApplicationDTO extends TeaModel {
    // applicationMetaDTO
    @NameInMap("applicationMetaDTO")
    public ApplicationMetaDTO applicationMetaDTO;

    // applicationName
    @NameInMap("applicationName")
    public String applicationName;

    // applicationType
    @NameInMap("applicationType")
    public String applicationType;

    // applicationVersion
    @NameInMap("applicationVersion")
    public String applicationVersion;

    // componentDTOs
    @NameInMap("componentDTOs")
    public java.util.List<ComponentDTO> componentDTOs;

    // deployModeDependencies
    @NameInMap("deployModeDependencies")
    public java.util.List<DeployModeDependency> deployModeDependencies;

    // iaasType
    @NameInMap("iaasType")
    public String iaasType;

    // mandatory
    @NameInMap("mandatory")
    public Boolean mandatory;

    public static MainVersionApplicationDTO build(java.util.Map<String, ?> map) throws Exception {
        MainVersionApplicationDTO self = new MainVersionApplicationDTO();
        return TeaModel.build(map, self);
    }

    public MainVersionApplicationDTO setApplicationMetaDTO(ApplicationMetaDTO applicationMetaDTO) {
        this.applicationMetaDTO = applicationMetaDTO;
        return this;
    }
    public ApplicationMetaDTO getApplicationMetaDTO() {
        return this.applicationMetaDTO;
    }

    public MainVersionApplicationDTO setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public MainVersionApplicationDTO setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public MainVersionApplicationDTO setApplicationVersion(String applicationVersion) {
        this.applicationVersion = applicationVersion;
        return this;
    }
    public String getApplicationVersion() {
        return this.applicationVersion;
    }

    public MainVersionApplicationDTO setComponentDTOs(java.util.List<ComponentDTO> componentDTOs) {
        this.componentDTOs = componentDTOs;
        return this;
    }
    public java.util.List<ComponentDTO> getComponentDTOs() {
        return this.componentDTOs;
    }

    public MainVersionApplicationDTO setDeployModeDependencies(java.util.List<DeployModeDependency> deployModeDependencies) {
        this.deployModeDependencies = deployModeDependencies;
        return this;
    }
    public java.util.List<DeployModeDependency> getDeployModeDependencies() {
        return this.deployModeDependencies;
    }

    public MainVersionApplicationDTO setIaasType(String iaasType) {
        this.iaasType = iaasType;
        return this;
    }
    public String getIaasType() {
        return this.iaasType;
    }

    public MainVersionApplicationDTO setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
        return this;
    }
    public Boolean getMandatory() {
        return this.mandatory;
    }

}
