// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class GetInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("CurrentKernelVersion")
    public String currentKernelVersion;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("KmsEncryptionSupported")
    public Boolean kmsEncryptionSupported;

    @NameInMap("MaintainEndTime")
    public Long maintainEndTime;

    @NameInMap("MaintainStartTime")
    public Long maintainStartTime;

    @NameInMap("RequestId")
    public String requestId;

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
