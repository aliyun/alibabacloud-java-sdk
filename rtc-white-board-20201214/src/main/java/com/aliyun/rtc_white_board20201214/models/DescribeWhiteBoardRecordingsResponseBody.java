// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class DescribeWhiteBoardRecordingsResponseBody extends TeaModel {
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
    public DescribeWhiteBoardRecordingsResponseBodyResult result;

    public static DescribeWhiteBoardRecordingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteBoardRecordingsResponseBody self = new DescribeWhiteBoardRecordingsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteBoardRecordingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWhiteBoardRecordingsResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

    public DescribeWhiteBoardRecordingsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeWhiteBoardRecordingsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public DescribeWhiteBoardRecordingsResponseBody setResult(DescribeWhiteBoardRecordingsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeWhiteBoardRecordingsResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeWhiteBoardRecordingsResponseBodyResultRecordingList extends TeaModel {
        // 白板应用唯一标识符
        @NameInMap("AppID")
        public String appID;

        // 文档唯一标识符
        @NameInMap("DocKey")
        public String docKey;

        // 白板录制Session的唯一标识
        @NameInMap("RecordId")
        public String recordId;

        // 创建录制的用户ID
        @NameInMap("UserId")
        public String userId;

        // 白板录制操作列表
        @NameInMap("OperateList")
        public java.util.List<String> operateList;

        public static DescribeWhiteBoardRecordingsResponseBodyResultRecordingList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWhiteBoardRecordingsResponseBodyResultRecordingList self = new DescribeWhiteBoardRecordingsResponseBodyResultRecordingList();
            return TeaModel.build(map, self);
        }

        public DescribeWhiteBoardRecordingsResponseBodyResultRecordingList setAppID(String appID) {
            this.appID = appID;
            return this;
        }
        public String getAppID() {
            return this.appID;
        }

        public DescribeWhiteBoardRecordingsResponseBodyResultRecordingList setDocKey(String docKey) {
            this.docKey = docKey;
            return this;
        }
        public String getDocKey() {
            return this.docKey;
        }

        public DescribeWhiteBoardRecordingsResponseBodyResultRecordingList setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public DescribeWhiteBoardRecordingsResponseBodyResultRecordingList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeWhiteBoardRecordingsResponseBodyResultRecordingList setOperateList(java.util.List<String> operateList) {
            this.operateList = operateList;
            return this;
        }
        public java.util.List<String> getOperateList() {
            return this.operateList;
        }

    }

    public static class DescribeWhiteBoardRecordingsResponseBodyResult extends TeaModel {
        @NameInMap("TotalNum")
        public Long totalNum;

        @NameInMap("TotalPage")
        public Long totalPage;

        // 录制信息列表
        @NameInMap("RecordingList")
        public java.util.List<DescribeWhiteBoardRecordingsResponseBodyResultRecordingList> recordingList;

        public static DescribeWhiteBoardRecordingsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeWhiteBoardRecordingsResponseBodyResult self = new DescribeWhiteBoardRecordingsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeWhiteBoardRecordingsResponseBodyResult setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

        public DescribeWhiteBoardRecordingsResponseBodyResult setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

        public DescribeWhiteBoardRecordingsResponseBodyResult setRecordingList(java.util.List<DescribeWhiteBoardRecordingsResponseBodyResultRecordingList> recordingList) {
            this.recordingList = recordingList;
            return this;
        }
        public java.util.List<DescribeWhiteBoardRecordingsResponseBodyResultRecordingList> getRecordingList() {
            return this.recordingList;
        }

    }

}
