// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class GetTemplateResponseBody extends TeaModel {
    // 返回数据
    @NameInMap("Data")
    public GetTemplateResponseBodyData data;

    // 错误码。
    @NameInMap("ErrorCode")
    public Integer errorCode;

    // 错误信息。
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static GetTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateResponseBody self = new GetTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateResponseBody setData(GetTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTemplateResponseBodyData getData() {
        return this.data;
    }

    public GetTemplateResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GetTemplateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTemplateResponseBodyData extends TeaModel {
        // 模板内容。
        @NameInMap("Content")
        public String content;

        // 创建时间 (UTC+8)。
        @NameInMap("CreatedTime")
        public String createdTime;

        // 申请说明。
        @NameInMap("Description")
        public String description;

        // Id。
        @NameInMap("Id")
        public String id;

        // 签名名称。
        @NameInMap("Name")
        public String name;

        // 审核意见。
        @NameInMap("Reason")
        public String reason;

        // 签名Id。
        @NameInMap("SignatureId")
        public String signatureId;

        // 审核状态。
        // - 0 : 审核中。
        // - 1 : 审核通过。
        // - 2 : 审核不通过。
        @NameInMap("Status")
        public Integer status;

        // 模板Code。
        @NameInMap("TemplateCode")
        public String templateCode;

        // 模板类型。
        // 0：验证码。
        // 1：短信通知。
        // 2：推广短信。
        @NameInMap("Type")
        public Integer type;

        // 更新时间 (UTC+8)。
        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static GetTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateResponseBodyData self = new GetTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTemplateResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetTemplateResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetTemplateResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTemplateResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetTemplateResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTemplateResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetTemplateResponseBodyData setSignatureId(String signatureId) {
            this.signatureId = signatureId;
            return this;
        }
        public String getSignatureId() {
            return this.signatureId;
        }

        public GetTemplateResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetTemplateResponseBodyData setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public GetTemplateResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public GetTemplateResponseBodyData setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
