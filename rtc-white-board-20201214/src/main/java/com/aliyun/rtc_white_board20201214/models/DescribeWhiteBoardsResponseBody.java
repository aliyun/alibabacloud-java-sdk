// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class DescribeWhiteBoardsResponseBody extends TeaModel {
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
    public DescribeWhiteBoardsResponseBodyResult result;

    public static DescribeWhiteBoardsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteBoardsResponseBody self = new DescribeWhiteBoardsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteBoardsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWhiteBoardsResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

    public DescribeWhiteBoardsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeWhiteBoardsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public DescribeWhiteBoardsResponseBody setResult(DescribeWhiteBoardsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeWhiteBoardsResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeWhiteBoardsResponseBodyResultDocList extends TeaModel {
        // 白板应用唯一标识符
        @NameInMap("AppID")
        public String appID;

        // 文档唯一标识符
        @NameInMap("DocKey")
        public String docKey;

        // 文档状态（取值：1:启用，2:停用）
        @NameInMap("Status")
        public Long status;

        // 创建白板的用户ID
        @NameInMap("CreateUserId")
        public String createUserId;

        // 白板应用创建时间
        @NameInMap("CreateTime")
        public String createTime;

        public static DescribeWhiteBoardsResponseBodyResultDocList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWhiteBoardsResponseBodyResultDocList self = new DescribeWhiteBoardsResponseBodyResultDocList();
            return TeaModel.build(map, self);
        }

        public DescribeWhiteBoardsResponseBodyResultDocList setAppID(String appID) {
            this.appID = appID;
            return this;
        }
        public String getAppID() {
            return this.appID;
        }

        public DescribeWhiteBoardsResponseBodyResultDocList setDocKey(String docKey) {
            this.docKey = docKey;
            return this;
        }
        public String getDocKey() {
            return this.docKey;
        }

        public DescribeWhiteBoardsResponseBodyResultDocList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public DescribeWhiteBoardsResponseBodyResultDocList setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public DescribeWhiteBoardsResponseBodyResultDocList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

    public static class DescribeWhiteBoardsResponseBodyResult extends TeaModel {
        @NameInMap("TotalNum")
        public Long totalNum;

        @NameInMap("TotalPage")
        public Long totalPage;

        // App信息列表
        @NameInMap("DocList")
        public java.util.List<DescribeWhiteBoardsResponseBodyResultDocList> docList;

        public static DescribeWhiteBoardsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeWhiteBoardsResponseBodyResult self = new DescribeWhiteBoardsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeWhiteBoardsResponseBodyResult setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

        public DescribeWhiteBoardsResponseBodyResult setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

        public DescribeWhiteBoardsResponseBodyResult setDocList(java.util.List<DescribeWhiteBoardsResponseBodyResultDocList> docList) {
            this.docList = docList;
            return this;
        }
        public java.util.List<DescribeWhiteBoardsResponseBodyResultDocList> getDocList() {
            return this.docList;
        }

    }

}
