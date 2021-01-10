// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLDCFederationConfigmapRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("OverridesJsonStr")
    public String overridesJsonStr;

    @NameInMap("WorkspaceGroupName")
    public String workspaceGroupName;

    @NameInMap("CellsRepeatList")
    public java.util.List<String> cellsRepeatList;

    @NameInMap("Data")
    public java.util.List<CreateLDCFederationConfigmapRequestData> data;

    @NameInMap("Labels")
    public java.util.List<CreateLDCFederationConfigmapRequestLabels> labels;

    public static CreateLDCFederationConfigmapRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLDCFederationConfigmapRequest self = new CreateLDCFederationConfigmapRequest();
        return TeaModel.build(map, self);
    }

    public CreateLDCFederationConfigmapRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLDCFederationConfigmapRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateLDCFederationConfigmapRequest setOverridesJsonStr(String overridesJsonStr) {
        this.overridesJsonStr = overridesJsonStr;
        return this;
    }
    public String getOverridesJsonStr() {
        return this.overridesJsonStr;
    }

    public CreateLDCFederationConfigmapRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

    public CreateLDCFederationConfigmapRequest setCellsRepeatList(java.util.List<String> cellsRepeatList) {
        this.cellsRepeatList = cellsRepeatList;
        return this;
    }
    public java.util.List<String> getCellsRepeatList() {
        return this.cellsRepeatList;
    }

    public CreateLDCFederationConfigmapRequest setData(java.util.List<CreateLDCFederationConfigmapRequestData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CreateLDCFederationConfigmapRequestData> getData() {
        return this.data;
    }

    public CreateLDCFederationConfigmapRequest setLabels(java.util.List<CreateLDCFederationConfigmapRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<CreateLDCFederationConfigmapRequestLabels> getLabels() {
        return this.labels;
    }

    public static class CreateLDCFederationConfigmapRequestData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateLDCFederationConfigmapRequestData build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationConfigmapRequestData self = new CreateLDCFederationConfigmapRequestData();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationConfigmapRequestData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLDCFederationConfigmapRequestData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateLDCFederationConfigmapRequestLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateLDCFederationConfigmapRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationConfigmapRequestLabels self = new CreateLDCFederationConfigmapRequestLabels();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationConfigmapRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLDCFederationConfigmapRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
