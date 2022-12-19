// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleSimilarSecurityEventsRequest extends TeaModel {
    // The rule condition based on which the alerts are added to the whitelist. For example, if you want to add a file that contains the string a to the whitelist based on the MD5 hash value, set this parameter to {"field":"md5","operate":"contains","fieldValue":"aa"}.
    @NameInMap("MarkMissParam")
    public String markMissParam;

    // The operation that is performed to handle alerts of the same type at a time. Valid values: 
    // - **deal**: quarantines the source file of the malicious process.
    // - **killand_quara**: kills the malicious processes and quarantines the source file.
    // - **kill_virus**: deletes the source file of the malicious process.
    // - **block_ip**: blocks the source IP address.
    // - **ignore**: ignores the alerts.
    // - **advance\_mark\_mis_info**: marks the alerts as false positives by adding the alerts to the whitelist.
    // - **rm\_mark\_mis\_info**: cancels false positives by removing the alerts from the whitelist.
    // - **offline_handled**: marks the alerts as handled.
    @NameInMap("OperationCode")
    public String operationCode;

    // The configuration for a sub-operation to handle alerts. 
    // 
    // > If you set OperationCode to kill_and_quara or block_ip, you must specify OperationParams. If you set OperationCode to other values, you can leave OperationParams empty.
    @NameInMap("OperationParams")
    public String operationParams;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The ID of the task that handles multiple alerts of the same type at a time.
    @NameInMap("TaskId")
    public Long taskId;

    public static HandleSimilarSecurityEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        HandleSimilarSecurityEventsRequest self = new HandleSimilarSecurityEventsRequest();
        return TeaModel.build(map, self);
    }

    public HandleSimilarSecurityEventsRequest setMarkMissParam(String markMissParam) {
        this.markMissParam = markMissParam;
        return this;
    }
    public String getMarkMissParam() {
        return this.markMissParam;
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

    public HandleSimilarSecurityEventsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public HandleSimilarSecurityEventsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public HandleSimilarSecurityEventsRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
