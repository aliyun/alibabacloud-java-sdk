// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class SinkEventStoreConfiguration extends TeaModel {
    @NameInMap("enabled")
    public Boolean enabled;

    @NameInMap("endpoint")
    public String endpoint;

    @NameInMap("eventStore")
    public String eventStore;

    @NameInMap("project")
    public String project;

    @NameInMap("roleArn")
    public String roleArn;

    public static SinkEventStoreConfiguration build(java.util.Map<String, ?> map) throws Exception {
        SinkEventStoreConfiguration self = new SinkEventStoreConfiguration();
        return TeaModel.build(map, self);
    }

    public SinkEventStoreConfiguration setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public SinkEventStoreConfiguration setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public SinkEventStoreConfiguration setEventStore(String eventStore) {
        this.eventStore = eventStore;
        return this;
    }
    public String getEventStore() {
        return this.eventStore;
    }

    public SinkEventStoreConfiguration setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public SinkEventStoreConfiguration setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

}
