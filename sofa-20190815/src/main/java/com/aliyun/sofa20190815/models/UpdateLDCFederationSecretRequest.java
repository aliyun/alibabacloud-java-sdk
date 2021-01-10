// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCFederationSecretRequest extends TeaModel {
    @NameInMap("CellsRepeatList")
    public java.util.List<String> cellsRepeatList;

    @NameInMap("Data")
    public java.util.List<UpdateLDCFederationSecretRequestData> data;

    @NameInMap("Labels")
    public java.util.List<UpdateLDCFederationSecretRequestLabels> labels;

    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("OverridesJsonStr")
    public String overridesJsonStr;

    @NameInMap("WorkspaceGroupName")
    public String workspaceGroupName;

    public static UpdateLDCFederationSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCFederationSecretRequest self = new UpdateLDCFederationSecretRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLDCFederationSecretRequest setCellsRepeatList(java.util.List<String> cellsRepeatList) {
        this.cellsRepeatList = cellsRepeatList;
        return this;
    }
    public java.util.List<String> getCellsRepeatList() {
        return this.cellsRepeatList;
    }

    public UpdateLDCFederationSecretRequest setData(java.util.List<UpdateLDCFederationSecretRequestData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<UpdateLDCFederationSecretRequestData> getData() {
        return this.data;
    }

    public UpdateLDCFederationSecretRequest setLabels(java.util.List<UpdateLDCFederationSecretRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<UpdateLDCFederationSecretRequestLabels> getLabels() {
        return this.labels;
    }

    public UpdateLDCFederationSecretRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLDCFederationSecretRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateLDCFederationSecretRequest setOverridesJsonStr(String overridesJsonStr) {
        this.overridesJsonStr = overridesJsonStr;
        return this;
    }
    public String getOverridesJsonStr() {
        return this.overridesJsonStr;
    }

    public UpdateLDCFederationSecretRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

    public static class UpdateLDCFederationSecretRequestData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateLDCFederationSecretRequestData build(java.util.Map<String, ?> map) throws Exception {
            UpdateLDCFederationSecretRequestData self = new UpdateLDCFederationSecretRequestData();
            return TeaModel.build(map, self);
        }

        public UpdateLDCFederationSecretRequestData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateLDCFederationSecretRequestData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateLDCFederationSecretRequestLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateLDCFederationSecretRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            UpdateLDCFederationSecretRequestLabels self = new UpdateLDCFederationSecretRequestLabels();
            return TeaModel.build(map, self);
        }

        public UpdateLDCFederationSecretRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateLDCFederationSecretRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
