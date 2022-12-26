// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyLogMetaStatusRequest extends TeaModel {
    @NameInMap("From")
    public String from;

    @NameInMap("LogStore")
    public String logStore;

    @NameInMap("Project")
    public String project;

    @NameInMap("Status")
    public String status;

    public static ModifyLogMetaStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogMetaStatusRequest self = new ModifyLogMetaStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLogMetaStatusRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public ModifyLogMetaStatusRequest setLogStore(String logStore) {
        this.logStore = logStore;
        return this;
    }
    public String getLogStore() {
        return this.logStore;
    }

    public ModifyLogMetaStatusRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public ModifyLogMetaStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
