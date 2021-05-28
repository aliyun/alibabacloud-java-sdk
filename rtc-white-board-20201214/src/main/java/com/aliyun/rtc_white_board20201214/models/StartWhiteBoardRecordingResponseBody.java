// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class StartWhiteBoardRecordingResponseBody extends TeaModel {
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
    public StartWhiteBoardRecordingResponseBodyResult result;

    public static StartWhiteBoardRecordingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartWhiteBoardRecordingResponseBody self = new StartWhiteBoardRecordingResponseBody();
        return TeaModel.build(map, self);
    }

    public StartWhiteBoardRecordingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartWhiteBoardRecordingResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

    public StartWhiteBoardRecordingResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public StartWhiteBoardRecordingResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public StartWhiteBoardRecordingResponseBody setResult(StartWhiteBoardRecordingResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public StartWhiteBoardRecordingResponseBodyResult getResult() {
        return this.result;
    }

    public static class StartWhiteBoardRecordingResponseBodyResult extends TeaModel {
        // 白板录制Session的唯一标识
        @NameInMap("RecordId")
        public String recordId;

        // 录制开始的UNIX时间戳
        @NameInMap("StartTime")
        public Long startTime;

        public static StartWhiteBoardRecordingResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            StartWhiteBoardRecordingResponseBodyResult self = new StartWhiteBoardRecordingResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public StartWhiteBoardRecordingResponseBodyResult setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public StartWhiteBoardRecordingResponseBodyResult setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
