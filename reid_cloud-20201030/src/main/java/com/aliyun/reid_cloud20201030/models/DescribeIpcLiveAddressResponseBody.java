// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class DescribeIpcLiveAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ExpiredTime")
    public String expiredTime;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("IpcId")
    public Long ipcId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RtmpUrl")
    public String rtmpUrl;

    public static DescribeIpcLiveAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpcLiveAddressResponseBody self = new DescribeIpcLiveAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpcLiveAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpcLiveAddressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeIpcLiveAddressResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeIpcLiveAddressResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeIpcLiveAddressResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeIpcLiveAddressResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeIpcLiveAddressResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeIpcLiveAddressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeIpcLiveAddressResponseBody setIpcId(Long ipcId) {
        this.ipcId = ipcId;
        return this;
    }
    public Long getIpcId() {
        return this.ipcId;
    }

    public DescribeIpcLiveAddressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeIpcLiveAddressResponseBody setRtmpUrl(String rtmpUrl) {
        this.rtmpUrl = rtmpUrl;
        return this;
    }
    public String getRtmpUrl() {
        return this.rtmpUrl;
    }

}
