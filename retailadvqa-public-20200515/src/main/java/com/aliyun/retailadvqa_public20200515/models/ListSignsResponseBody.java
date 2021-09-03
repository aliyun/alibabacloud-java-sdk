// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListSignsResponseBody extends TeaModel {
    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 错误信息描述
    @NameInMap("ErrorDesc")
    public String errorDesc;

    // 接口调用状态
    @NameInMap("Success")
    public Boolean success;

    // traceId
    @NameInMap("TraceId")
    public String traceId;

    @NameInMap("Data")
    public ListSignsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListSignsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSignsResponseBody self = new ListSignsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSignsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListSignsResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public ListSignsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSignsResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public ListSignsResponseBody setData(ListSignsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSignsResponseBodyData getData() {
        return this.data;
    }

    public ListSignsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSignsResponseBodyDataContent extends TeaModel {
        // 主键
        @NameInMap("Id")
        public String id;

        // 平台名称
        @NameInMap("PlatformName")
        public String platformName;

        // 创建时间
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        // 签名状态
        @NameInMap("SignStatus")
        public Long signStatus;

        // qa账号
        @NameInMap("QaAccountId")
        public String qaAccountId;

        // 创建者
        @NameInMap("CreateUserName")
        public String createUserName;

        // 签名名称
        @NameInMap("SignName")
        public String signName;

        // 错误描述
        @NameInMap("ErrDescription")
        public String errDescription;

        public static ListSignsResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListSignsResponseBodyDataContent self = new ListSignsResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListSignsResponseBodyDataContent setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSignsResponseBodyDataContent setPlatformName(String platformName) {
            this.platformName = platformName;
            return this;
        }
        public String getPlatformName() {
            return this.platformName;
        }

        public ListSignsResponseBodyDataContent setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListSignsResponseBodyDataContent setSignStatus(Long signStatus) {
            this.signStatus = signStatus;
            return this;
        }
        public Long getSignStatus() {
            return this.signStatus;
        }

        public ListSignsResponseBodyDataContent setQaAccountId(String qaAccountId) {
            this.qaAccountId = qaAccountId;
            return this;
        }
        public String getQaAccountId() {
            return this.qaAccountId;
        }

        public ListSignsResponseBodyDataContent setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public ListSignsResponseBodyDataContent setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public ListSignsResponseBodyDataContent setErrDescription(String errDescription) {
            this.errDescription = errDescription;
            return this;
        }
        public String getErrDescription() {
            return this.errDescription;
        }

    }

    public static class ListSignsResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalNum")
        public Long totalNum;

        @NameInMap("Content")
        public java.util.List<ListSignsResponseBodyDataContent> content;

        public static ListSignsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSignsResponseBodyData self = new ListSignsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSignsResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public ListSignsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListSignsResponseBodyData setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

        public ListSignsResponseBodyData setContent(java.util.List<ListSignsResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListSignsResponseBodyDataContent> getContent() {
            return this.content;
        }

    }

}
