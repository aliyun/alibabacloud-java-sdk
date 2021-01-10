// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLDCFederationNamespaceRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("WorkspaceGroupName")
    public String workspaceGroupName;

    @NameInMap("Labels")
    public java.util.List<CreateLDCFederationNamespaceRequestLabels> labels;

    public static CreateLDCFederationNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLDCFederationNamespaceRequest self = new CreateLDCFederationNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateLDCFederationNamespaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLDCFederationNamespaceRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

    public CreateLDCFederationNamespaceRequest setLabels(java.util.List<CreateLDCFederationNamespaceRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<CreateLDCFederationNamespaceRequestLabels> getLabels() {
        return this.labels;
    }

    public static class CreateLDCFederationNamespaceRequestLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateLDCFederationNamespaceRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationNamespaceRequestLabels self = new CreateLDCFederationNamespaceRequestLabels();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationNamespaceRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLDCFederationNamespaceRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
