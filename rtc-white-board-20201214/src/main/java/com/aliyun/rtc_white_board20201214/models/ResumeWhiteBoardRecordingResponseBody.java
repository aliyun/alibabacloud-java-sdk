// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class ResumeWhiteBoardRecordingResponseBody extends TeaModel {
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
    public ResumeWhiteBoardRecordingResponseBodyResult result;

    public static ResumeWhiteBoardRecordingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResumeWhiteBoardRecordingResponseBody self = new ResumeWhiteBoardRecordingResponseBody();
        return TeaModel.build(map, self);
    }

    public ResumeWhiteBoardRecordingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResumeWhiteBoardRecordingResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

    public ResumeWhiteBoardRecordingResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ResumeWhiteBoardRecordingResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ResumeWhiteBoardRecordingResponseBody setResult(ResumeWhiteBoardRecordingResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ResumeWhiteBoardRecordingResponseBodyResult getResult() {
        return this.result;
    }

    public static class ResumeWhiteBoardRecordingResponseBodyResult extends TeaModel {
        // 录制结束的UNIX时间戳
        @NameInMap("ResumeTime")
        public Long resumeTime;

        public static ResumeWhiteBoardRecordingResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ResumeWhiteBoardRecordingResponseBodyResult self = new ResumeWhiteBoardRecordingResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ResumeWhiteBoardRecordingResponseBodyResult setResumeTime(Long resumeTime) {
            this.resumeTime = resumeTime;
            return this;
        }
        public Long getResumeTime() {
            return this.resumeTime;
        }

    }

}
