// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCFederationConfigmapRequest extends TeaModel {
    @NameInMap("CellsRepeatList")
    public java.util.List<String> cellsRepeatList;

    @NameInMap("Data")
    public java.util.List<UpdateLDCFederationConfigmapRequestData> data;

    @NameInMap("Labels")
    public java.util.List<UpdateLDCFederationConfigmapRequestLabels> labels;

    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("OverridesJsonStr")
    public String overridesJsonStr;

    @NameInMap("WorkspaceGroupName")
    public String workspaceGroupName;

    public static UpdateLDCFederationConfigmapRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCFederationConfigmapRequest self = new UpdateLDCFederationConfigmapRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLDCFederationConfigmapRequest setCellsRepeatList(java.util.List<String> cellsRepeatList) {
        this.cellsRepeatList = cellsRepeatList;
        return this;
    }
    public java.util.List<String> getCellsRepeatList() {
        return this.cellsRepeatList;
    }

    public UpdateLDCFederationConfigmapRequest setData(java.util.List<UpdateLDCFederationConfigmapRequestData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<UpdateLDCFederationConfigmapRequestData> getData() {
        return this.data;
    }

    public UpdateLDCFederationConfigmapRequest setLabels(java.util.List<UpdateLDCFederationConfigmapRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<UpdateLDCFederationConfigmapRequestLabels> getLabels() {
        return this.labels;
    }

    public UpdateLDCFederationConfigmapRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLDCFederationConfigmapRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateLDCFederationConfigmapRequest setOverridesJsonStr(String overridesJsonStr) {
        this.overridesJsonStr = overridesJsonStr;
        return this;
    }
    public String getOverridesJsonStr() {
        return this.overridesJsonStr;
    }

    public UpdateLDCFederationConfigmapRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

    public static class UpdateLDCFederationConfigmapRequestData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateLDCFederationConfigmapRequestData build(java.util.Map<String, ?> map) throws Exception {
            UpdateLDCFederationConfigmapRequestData self = new UpdateLDCFederationConfigmapRequestData();
            return TeaModel.build(map, self);
        }

        public UpdateLDCFederationConfigmapRequestData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateLDCFederationConfigmapRequestData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateLDCFederationConfigmapRequestLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateLDCFederationConfigmapRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            UpdateLDCFederationConfigmapRequestLabels self = new UpdateLDCFederationConfigmapRequestLabels();
            return TeaModel.build(map, self);
        }

        public UpdateLDCFederationConfigmapRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateLDCFederationConfigmapRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
