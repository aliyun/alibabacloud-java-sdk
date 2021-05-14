// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleSimilarSecurityEventsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("OperationCode")
    public String operationCode;

    @NameInMap("OperationParams")
    public String operationParams;

    @NameInMap("MarkMissParam")
    public String markMissParam;

    public static HandleSimilarSecurityEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        HandleSimilarSecurityEventsRequest self = new HandleSimilarSecurityEventsRequest();
        return TeaModel.build(map, self);
    }

    public HandleSimilarSecurityEventsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public HandleSimilarSecurityEventsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public HandleSimilarSecurityEventsRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public HandleSimilarSecurityEventsRequest setOperationCode(String operationCode) {
        this.operationCode = operationCode;
        return this;
    }
    public String getOperationCode() {
        return this.operationCode;
    }

    public HandleSimilarSecurityEventsRequest setOperationParams(String operationParams) {
        this.operationParams = operationParams;
        return this;
    }
    public String getOperationParams() {
        return this.operationParams;
    }

    public HandleSimilarSecurityEventsRequest setMarkMissParam(String markMissParam) {
        this.markMissParam = markMissParam;
        return this;
    }
    public String getMarkMissParam() {
        return this.markMissParam;
    }

}
