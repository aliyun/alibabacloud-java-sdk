// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class WorkloadVersionsValue extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Version")
    public String version;

    @NameInMap("State")
    public String state;

    public static WorkloadVersionsValue build(java.util.Map<String, ?> map) throws Exception {
        WorkloadVersionsValue self = new WorkloadVersionsValue();
        return TeaModel.build(map, self);
    }

    public WorkloadVersionsValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public WorkloadVersionsValue setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public WorkloadVersionsValue setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public WorkloadVersionsValue setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
