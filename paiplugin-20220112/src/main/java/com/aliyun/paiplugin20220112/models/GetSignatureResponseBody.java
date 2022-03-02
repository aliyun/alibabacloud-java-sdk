// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class GetSignatureResponseBody extends TeaModel {
    // 返回数据
    @NameInMap("Data")
    public GetSignatureResponseBodyData data;

    // 错误码。
    @NameInMap("ErrorCode")
    public Integer errorCode;

    // 错误信息。
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static GetSignatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSignatureResponseBody self = new GetSignatureResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSignatureResponseBody setData(GetSignatureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSignatureResponseBodyData getData() {
        return this.data;
    }

    public GetSignatureResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GetSignatureResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetSignatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSignatureResponseBodyData extends TeaModel {
        // 创建时间 (UTC+8)。
        @NameInMap("CreatedTime")
        public String createdTime;

        // 申请说明。
        @NameInMap("Description")
        public String description;

        // 签名Id。
        @NameInMap("Id")
        public String id;

        // 签名名称。
        @NameInMap("Name")
        public String name;

        // 审核建议。
        @NameInMap("Reason")
        public String reason;

        // 签名审核状态。
        // - 0：审核中。
        // - 1：审核通过。
        // - 2：审核不通过。
        @NameInMap("Status")
        public Integer status;

        // 更新时间 (UTC+8)。
        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static GetSignatureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSignatureResponseBodyData self = new GetSignatureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSignatureResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetSignatureResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSignatureResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetSignatureResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSignatureResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetSignatureResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetSignatureResponseBodyData setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
