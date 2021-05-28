// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class StopWhiteBoardRecordingResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 请求结果
    @NameInMap("ResponseSuccess")
    public Boolean responseSuccess;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("ErrorMsg")
    public String errorMsg;

    // 返回结果体
    @NameInMap("Result")
    public StopWhiteBoardRecordingResponseBodyResult result;

    public static StopWhiteBoardRecordingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopWhiteBoardRecordingResponseBody self = new StopWhiteBoardRecordingResponseBody();
        return TeaModel.build(map, self);
    }

    public StopWhiteBoardRecordingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopWhiteBoardRecordingResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

    public StopWhiteBoardRecordingResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public StopWhiteBoardRecordingResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public StopWhiteBoardRecordingResponseBody setResult(StopWhiteBoardRecordingResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public StopWhiteBoardRecordingResponseBodyResult getResult() {
        return this.result;
    }

    public static class StopWhiteBoardRecordingResponseBodyResult extends TeaModel {
        // 录制结束的UNIX时间戳
        @NameInMap("StopTime")
        public Long stopTime;

        public static StopWhiteBoardRecordingResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            StopWhiteBoardRecordingResponseBodyResult self = new StopWhiteBoardRecordingResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public StopWhiteBoardRecordingResponseBodyResult setStopTime(Long stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public Long getStopTime() {
            return this.stopTime;
        }

    }

}
