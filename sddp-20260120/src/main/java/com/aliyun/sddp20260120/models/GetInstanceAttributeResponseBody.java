// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class GetInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The current kernel version of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_20220731</p>
     */
    @NameInMap("CurrentKernelVersion")
    public String currentKernelVersion;

    /**
     * <p>The database engine type.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The major version of the database engine.</p>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The business error code for the record or operation. This parameter can be empty when no error occurs. You should evaluate this parameter together with ErrorMessage.</p>
     * 
     * <strong>example:</strong>
     * <p>data_masking_not_running</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The business error message for the record or operation.</p>
     * 
     * <strong>example:</strong>
     * <p>The instance is not in the running state</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Indicates whether the instance supports using KMS keys for column encryption.</p>
     */
    @NameInMap("KmsEncryptionSupported")
    public Boolean kmsEncryptionSupported;

    /**
     * <p>The end time of the maintenance window. The value is a UNIX timestamp in milliseconds that have elapsed since 1970-01-01 00:00:00 UTC. The returned value combines the UTC time of the maintenance window with the date of the query day.</p>
     * 
     * <strong>example:</strong>
     * <p>1788570000000</p>
     */
    @NameInMap("MaintainEndTime")
    public Long maintainEndTime;

    /**
     * <p>The start time of the maintenance window. The value is a UNIX timestamp in milliseconds that have elapsed since 1970-01-01 00:00:00 UTC. The returned value combines the UTC time of the maintenance window with the date of the query day.</p>
     * 
     * <strong>example:</strong>
     * <p>1788566400000</p>
     */
    @NameInMap("MaintainStartTime")
    public Long maintainStartTime;

    /**
     * <p>The request ID, which can be used to locate this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The current running status of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceAttributeResponseBody self = new GetInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceAttributeResponseBody setCurrentKernelVersion(String currentKernelVersion) {
        this.currentKernelVersion = currentKernelVersion;
        return this;
    }
    public String getCurrentKernelVersion() {
        return this.currentKernelVersion;
    }

    public GetInstanceAttributeResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public GetInstanceAttributeResponseBody setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public GetInstanceAttributeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetInstanceAttributeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetInstanceAttributeResponseBody setKmsEncryptionSupported(Boolean kmsEncryptionSupported) {
        this.kmsEncryptionSupported = kmsEncryptionSupported;
        return this;
    }
    public Boolean getKmsEncryptionSupported() {
        return this.kmsEncryptionSupported;
    }

    public GetInstanceAttributeResponseBody setMaintainEndTime(Long maintainEndTime) {
        this.maintainEndTime = maintainEndTime;
        return this;
    }
    public Long getMaintainEndTime() {
        return this.maintainEndTime;
    }

    public GetInstanceAttributeResponseBody setMaintainStartTime(Long maintainStartTime) {
        this.maintainStartTime = maintainStartTime;
        return this;
    }
    public Long getMaintainStartTime() {
        return this.maintainStartTime;
    }

    public GetInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
