// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLDCFederationSecretRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("OverridesJsonStr")
    public String overridesJsonStr;

    @NameInMap("Type")
    public String type;

    @NameInMap("WorkspaceGroupName")
    public String workspaceGroupName;

    @NameInMap("CellsRepeatList")
    public java.util.List<String> cellsRepeatList;

    @NameInMap("Data")
    public java.util.List<CreateLDCFederationSecretRequestData> data;

    @NameInMap("Labels")
    public java.util.List<CreateLDCFederationSecretRequestLabels> labels;

    public static CreateLDCFederationSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLDCFederationSecretRequest self = new CreateLDCFederationSecretRequest();
        return TeaModel.build(map, self);
    }

    public CreateLDCFederationSecretRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLDCFederationSecretRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateLDCFederationSecretRequest setOverridesJsonStr(String overridesJsonStr) {
        this.overridesJsonStr = overridesJsonStr;
        return this;
    }
    public String getOverridesJsonStr() {
        return this.overridesJsonStr;
    }

    public CreateLDCFederationSecretRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateLDCFederationSecretRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

    public CreateLDCFederationSecretRequest setCellsRepeatList(java.util.List<String> cellsRepeatList) {
        this.cellsRepeatList = cellsRepeatList;
        return this;
    }
    public java.util.List<String> getCellsRepeatList() {
        return this.cellsRepeatList;
    }

    public CreateLDCFederationSecretRequest setData(java.util.List<CreateLDCFederationSecretRequestData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CreateLDCFederationSecretRequestData> getData() {
        return this.data;
    }

    public CreateLDCFederationSecretRequest setLabels(java.util.List<CreateLDCFederationSecretRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<CreateLDCFederationSecretRequestLabels> getLabels() {
        return this.labels;
    }

    public static class CreateLDCFederationSecretRequestData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateLDCFederationSecretRequestData build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationSecretRequestData self = new CreateLDCFederationSecretRequestData();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationSecretRequestData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLDCFederationSecretRequestData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateLDCFederationSecretRequestLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateLDCFederationSecretRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationSecretRequestLabels self = new CreateLDCFederationSecretRequestLabels();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationSecretRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLDCFederationSecretRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
