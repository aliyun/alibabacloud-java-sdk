// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLDCFederationImagepullsecretRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("OverridesJsonStr")
    public String overridesJsonStr;

    @NameInMap("RegistryAccountJsonStr")
    public String registryAccountJsonStr;

    @NameInMap("WorkspaceGroupName")
    public String workspaceGroupName;

    @NameInMap("CellsRepeatList")
    public java.util.List<String> cellsRepeatList;

    @NameInMap("Labels")
    public java.util.List<CreateLDCFederationImagepullsecretRequestLabels> labels;

    public static CreateLDCFederationImagepullsecretRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLDCFederationImagepullsecretRequest self = new CreateLDCFederationImagepullsecretRequest();
        return TeaModel.build(map, self);
    }

    public CreateLDCFederationImagepullsecretRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLDCFederationImagepullsecretRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateLDCFederationImagepullsecretRequest setOverridesJsonStr(String overridesJsonStr) {
        this.overridesJsonStr = overridesJsonStr;
        return this;
    }
    public String getOverridesJsonStr() {
        return this.overridesJsonStr;
    }

    public CreateLDCFederationImagepullsecretRequest setRegistryAccountJsonStr(String registryAccountJsonStr) {
        this.registryAccountJsonStr = registryAccountJsonStr;
        return this;
    }
    public String getRegistryAccountJsonStr() {
        return this.registryAccountJsonStr;
    }

    public CreateLDCFederationImagepullsecretRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

    public CreateLDCFederationImagepullsecretRequest setCellsRepeatList(java.util.List<String> cellsRepeatList) {
        this.cellsRepeatList = cellsRepeatList;
        return this;
    }
    public java.util.List<String> getCellsRepeatList() {
        return this.cellsRepeatList;
    }

    public CreateLDCFederationImagepullsecretRequest setLabels(java.util.List<CreateLDCFederationImagepullsecretRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<CreateLDCFederationImagepullsecretRequestLabels> getLabels() {
        return this.labels;
    }

    public static class CreateLDCFederationImagepullsecretRequestLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateLDCFederationImagepullsecretRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationImagepullsecretRequestLabels self = new CreateLDCFederationImagepullsecretRequestLabels();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationImagepullsecretRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLDCFederationImagepullsecretRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
