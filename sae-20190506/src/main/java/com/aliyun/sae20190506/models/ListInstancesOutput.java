// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListInstancesOutput extends TeaModel {
    @NameInMap("currentError")
    public String currentError;

    @NameInMap("instances")
    public java.util.List<InstanceInfo> instances;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("versionStatus")
    public java.util.Map<String, VersionStatus> versionStatus;

    public static ListInstancesOutput build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesOutput self = new ListInstancesOutput();
        return TeaModel.build(map, self);
    }

    public ListInstancesOutput setCurrentError(String currentError) {
        this.currentError = currentError;
        return this;
    }
    public String getCurrentError() {
        return this.currentError;
    }

    public ListInstancesOutput setInstances(java.util.List<InstanceInfo> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<InstanceInfo> getInstances() {
        return this.instances;
    }

    public ListInstancesOutput setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesOutput setVersionStatus(java.util.Map<String, VersionStatus> versionStatus) {
        this.versionStatus = versionStatus;
        return this;
    }
    public java.util.Map<String, VersionStatus> getVersionStatus() {
        return this.versionStatus;
    }

}
