// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class OpenDatasetProxyAppendDataRequest extends TeaModel {
    @NameInMap("BizCode")
    public String bizCode;

    /**
     * <p>A list of data records. A single invocation can contain up to 100 records. Each element in the array is a map.</p>
     */
    @NameInMap("DataMeta")
    public java.util.List<java.util.Map<String, String>> dataMeta;

    /**
     * <p>Task ID, indicating the task to which data is appended.</p>
     * 
     * <strong>example:</strong>
     * <p>154***518306500608</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>TraceId</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1ec3916825622257033399edb6b</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    /**
     * <p>Unique identifier ID, controlled by the business side.</p>
     * 
     * <strong>example:</strong>
     * <p>e5c9db3f-f27c-445e-a52b-06ba6d1ba00f</p>
     */
    @NameInMap("UUID")
    public String UUID;

    public static OpenDatasetProxyAppendDataRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenDatasetProxyAppendDataRequest self = new OpenDatasetProxyAppendDataRequest();
        return TeaModel.build(map, self);
    }

    public OpenDatasetProxyAppendDataRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
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
