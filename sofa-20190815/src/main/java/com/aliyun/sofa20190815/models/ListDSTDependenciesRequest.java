// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDSTDependenciesRequest extends TeaModel {
    @NameInMap("DependencyType")
    public String dependencyType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Relations")
    public java.util.List<ListDSTDependenciesRequestRelations> relations;

    @NameInMap("ResourceInfo")
    public java.util.List<ListDSTDependenciesRequestResourceInfo> resourceInfo;

    @NameInMap("ResourceType")
    public String resourceType;

    public static ListDSTDependenciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDSTDependenciesRequest self = new ListDSTDependenciesRequest();
        return TeaModel.build(map, self);
    }

    public ListDSTDependenciesRequest setDependencyType(String dependencyType) {
        this.dependencyType = dependencyType;
        return this;
    }
    public String getDependencyType() {
        return this.dependencyType;
    }

    public ListDSTDependenciesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDSTDependenciesRequest setRelations(java.util.List<ListDSTDependenciesRequestRelations> relations) {
        this.relations = relations;
        return this;
    }
    public java.util.List<ListDSTDependenciesRequestRelations> getRelations() {
        return this.relations;
    }

    public ListDSTDependenciesRequest setResourceInfo(java.util.List<ListDSTDependenciesRequestResourceInfo> resourceInfo) {
        this.resourceInfo = resourceInfo;
        return this;
    }
    public java.util.List<ListDSTDependenciesRequestResourceInfo> getResourceInfo() {
        return this.resourceInfo;
    }

    public ListDSTDependenciesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public static class ListDSTDependenciesRequestRelations extends TeaModel {
        @NameInMap("Value")
        public String value;

        public static ListDSTDependenciesRequestRelations build(java.util.Map<String, ?> map) throws Exception {
            ListDSTDependenciesRequestRelations self = new ListDSTDependenciesRequestRelations();
            return TeaModel.build(map, self);
        }

        public ListDSTDependenciesRequestRelations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDSTDependenciesRequestResourceInfo extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListDSTDependenciesRequestResourceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDSTDependenciesRequestResourceInfo self = new ListDSTDependenciesRequestResourceInfo();
            return TeaModel.build(map, self);
        }

        public ListDSTDependenciesRequestResourceInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListDSTDependenciesRequestResourceInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
