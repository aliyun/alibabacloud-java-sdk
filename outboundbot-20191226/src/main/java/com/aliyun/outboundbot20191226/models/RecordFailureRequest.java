// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class RecordFailureRequest extends TeaModel {
    @NameInMap("ActualTime")
    public Long actualTime;

    @NameInMap("CallId")
    public String callId;

    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("CallingNumber")
    public String callingNumber;

    @NameInMap("DispositionCode")
    public String dispositionCode;

    @NameInMap("ExceptionCodes")
    public String exceptionCodes;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TaskId")
    public String taskId;

    public static RecordFailureRequest build(java.util.Map<String, ?> map) throws Exception {
        RecordFailureRequest self = new RecordFailureRequest();
        return TeaModel.build(map, self);
    }

    public RecordFailureRequest setActualTime(Long actualTime) {
        this.actualTime = actualTime;
        return this;
    }
    public Long getActualTime() {
        return this.actualTime;
    }

    public RecordFailureRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public RecordFailureRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public RecordFailureRequest setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
    }

    public RecordFailureRequest setDispositionCode(String dispositionCode) {
        this.dispositionCode = dispositionCode;
        return this;
    }
    public String getDispositionCode() {
        return this.dispositionCode;
    }

    public RecordFailureRequest setExceptionCodes(String exceptionCodes) {
        this.exceptionCodes = exceptionCodes;
        return this;
    }
    public String getExceptionCodes() {
        return this.exceptionCodes;
    }

    public RecordFailureRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RecordFailureRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
