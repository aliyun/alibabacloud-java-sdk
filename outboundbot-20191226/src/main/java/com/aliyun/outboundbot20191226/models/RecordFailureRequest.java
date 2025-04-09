// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class RecordFailureRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1579055782000</p>
     */
    @NameInMap("ActualTime")
    public Long actualTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4f21446e-324e-46f2-bf62-7f341fb004ea</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>135815****</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10086</p>
     */
    @NameInMap("CallingNumber")
    public String callingNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OutOfService</p>
     */
    @NameInMap("DispositionCode")
    public String dispositionCode;

    @NameInMap("ExceptionCodes")
    public String exceptionCodes;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9ab43460-c0b9-40e2-8447-48d82c97fc67</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d2295c0e-3bc3-48a5-9f56-b185db2be909</p>
     */
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
