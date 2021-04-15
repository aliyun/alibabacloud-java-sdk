// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class DescribeAppsResponseBody extends TeaModel {
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
    public DescribeAppsResponseBodyResult result;

    public static DescribeAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppsResponseBody self = new DescribeAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppsResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

    public DescribeAppsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeAppsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public DescribeAppsResponseBody setResult(DescribeAppsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAppsResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAppsResponseBodyResultAppList extends TeaModel {
        // 白板应用唯一标识符
        @NameInMap("AppID")
        public String appID;

        // 白板应用名
        @NameInMap("AppName")
        public String appName;

        // 白板应用状态（取值：1:启用，2:停用）
        @NameInMap("Status")
        public Long status;

        // 白板应用回调地址URL
        @NameInMap("CallbackUrl")
        public String callbackUrl;

        // 合法域名列表，使用英文逗号(,)分隔
        @NameInMap("DomainNames")
        public String domainNames;

        // 白板应用创建时间
        @NameInMap("CreateTime")
        public String createTime;

        public static DescribeAppsResponseBodyResultAppList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyResultAppList self = new DescribeAppsResponseBodyResultAppList();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyResultAppList setAppID(String appID) {
            this.appID = appID;
            return this;
        }
        public String getAppID() {
            return this.appID;
        }

        public DescribeAppsResponseBodyResultAppList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeAppsResponseBodyResultAppList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public DescribeAppsResponseBodyResultAppList setCallbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }
        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        public DescribeAppsResponseBodyResultAppList setDomainNames(String domainNames) {
            this.domainNames = domainNames;
            return this;
        }
        public String getDomainNames() {
            return this.domainNames;
        }

        public DescribeAppsResponseBodyResultAppList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

    public static class DescribeAppsResponseBodyResult extends TeaModel {
        @NameInMap("TotalNum")
        public Long totalNum;

        @NameInMap("TotalPage")
        public Long totalPage;

        // App信息列表
        @NameInMap("AppList")
        public java.util.List<DescribeAppsResponseBodyResultAppList> appList;

        public static DescribeAppsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyResult self = new DescribeAppsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyResult setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

        public DescribeAppsResponseBodyResult setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

        public DescribeAppsResponseBodyResult setAppList(java.util.List<DescribeAppsResponseBodyResultAppList> appList) {
            this.appList = appList;
            return this;
        }
        public java.util.List<DescribeAppsResponseBodyResultAppList> getAppList() {
            return this.appList;
        }

    }

}
