// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class PauseWhiteBoardRecordingResponseBody extends TeaModel {
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
    public PauseWhiteBoardRecordingResponseBodyResult result;

    public static PauseWhiteBoardRecordingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PauseWhiteBoardRecordingResponseBody self = new PauseWhiteBoardRecordingResponseBody();
        return TeaModel.build(map, self);
    }

    public PauseWhiteBoardRecordingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PauseWhiteBoardRecordingResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

    public PauseWhiteBoardRecordingResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public PauseWhiteBoardRecordingResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public PauseWhiteBoardRecordingResponseBody setResult(PauseWhiteBoardRecordingResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public PauseWhiteBoardRecordingResponseBodyResult getResult() {
        return this.result;
    }

    public static class PauseWhiteBoardRecordingResponseBodyResult extends TeaModel {
        // 录制结束的UNIX时间戳
        @NameInMap("PauseTime")
        public Long pauseTime;

        public static PauseWhiteBoardRecordingResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            PauseWhiteBoardRecordingResponseBodyResult self = new PauseWhiteBoardRecordingResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public PauseWhiteBoardRecordingResponseBodyResult setPauseTime(Long pauseTime) {
            this.pauseTime = pauseTime;
            return this;
        }
        public Long getPauseTime() {
            return this.pauseTime;
        }

    }

}
