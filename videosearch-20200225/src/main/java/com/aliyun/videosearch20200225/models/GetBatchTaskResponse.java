// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class GetBatchTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("BatchTaskId")
    @Validation(required = true)
    public Long batchTaskId;

    @NameInMap("Status")
    @Validation(required = true)
    public Integer status;

    @NameInMap("ModifiedTime")
    @Validation(required = true)
    public Long modifiedTime;

    @NameInMap("ProcessMessage")
    @Validation(required = true)
    public String processMessage;

    @NameInMap("SubTaskDetail")
    @Validation(required = true)
    public String subTaskDetail;

    public static GetBatchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBatchTaskResponse self = new GetBatchTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetBatchTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBatchTaskResponse setBatchTaskId(Long batchTaskId) {
        this.batchTaskId = batchTaskId;
        return this;
    }
    public Long getBatchTaskId() {
        return this.batchTaskId;
    }

    public GetBatchTaskResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public GetBatchTaskResponse setModifiedTime(Long modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public Long getModifiedTime() {
        return this.modifiedTime;
    }

    public GetBatchTaskResponse setProcessMessage(String processMessage) {
        this.processMessage = processMessage;
        return this;
    }
    public String getProcessMessage() {
        return this.processMessage;
    }

    public GetBatchTaskResponse setSubTaskDetail(String subTaskDetail) {
        this.subTaskDetail = subTaskDetail;
        return this;
    }
    public String getSubTaskDetail() {
        return this.subTaskDetail;
    }

}
