// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class OpenDatasetProxyAppendDataRequest extends TeaModel {
    @NameInMap("DataMeta")
    public java.util.List<java.util.Map<String, String>> dataMeta;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TraceId")
    public String traceId;

    @NameInMap("UUID")
    public String UUID;

    public static OpenDatasetProxyAppendDataRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenDatasetProxyAppendDataRequest self = new OpenDatasetProxyAppendDataRequest();
        return TeaModel.build(map, self);
    }

    public OpenDatasetProxyAppendDataRequest setDataMeta(java.util.List<java.util.Map<String, String>> dataMeta) {
        this.dataMeta = dataMeta;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getDataMeta() {
        return this.dataMeta;
    }

    public OpenDatasetProxyAppendDataRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public OpenDatasetProxyAppendDataRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public OpenDatasetProxyAppendDataRequest setUUID(String UUID) {
        this.UUID = UUID;
        return this;
    }
    public String getUUID() {
        return this.UUID;
    }

}
