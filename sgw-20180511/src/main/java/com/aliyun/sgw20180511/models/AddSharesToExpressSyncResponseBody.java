// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class AddSharesToExpressSyncResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("MnsFullSyncDelay")
    public Long mnsFullSyncDelay;

    @NameInMap("MnsInnerEndpoint")
    public String mnsInnerEndpoint;

    @NameInMap("MnsPublicEndpoint")
    public String mnsPublicEndpoint;

    @NameInMap("MnsQueues")
    public String mnsQueues;

    @NameInMap("MnsTopic")
    public String mnsTopic;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskId")
    public String taskId;

    public static AddSharesToExpressSyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSharesToExpressSyncResponseBody self = new AddSharesToExpressSyncResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSharesToExpressSyncResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddSharesToExpressSyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddSharesToExpressSyncResponseBody setMnsFullSyncDelay(Long mnsFullSyncDelay) {
        this.mnsFullSyncDelay = mnsFullSyncDelay;
        return this;
    }
    public Long getMnsFullSyncDelay() {
        return this.mnsFullSyncDelay;
    }

    public AddSharesToExpressSyncResponseBody setMnsInnerEndpoint(String mnsInnerEndpoint) {
        this.mnsInnerEndpoint = mnsInnerEndpoint;
        return this;
    }
    public String getMnsInnerEndpoint() {
        return this.mnsInnerEndpoint;
    }

    public AddSharesToExpressSyncResponseBody setMnsPublicEndpoint(String mnsPublicEndpoint) {
        this.mnsPublicEndpoint = mnsPublicEndpoint;
        return this;
    }
    public String getMnsPublicEndpoint() {
        return this.mnsPublicEndpoint;
    }

    public AddSharesToExpressSyncResponseBody setMnsQueues(String mnsQueues) {
        this.mnsQueues = mnsQueues;
        return this;
    }
    public String getMnsQueues() {
        return this.mnsQueues;
    }

    public AddSharesToExpressSyncResponseBody setMnsTopic(String mnsTopic) {
        this.mnsTopic = mnsTopic;
        return this;
    }
    public String getMnsTopic() {
        return this.mnsTopic;
    }

    public AddSharesToExpressSyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddSharesToExpressSyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddSharesToExpressSyncResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
