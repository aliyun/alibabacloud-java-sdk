// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateTemplateResponseBody extends TeaModel {
    /**
     * <p>返回数据。</p>
     */
    @NameInMap("Data")
    public CreateTemplateResponseBodyData data;

    /**
     * <p>错误码。</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <p>错误信息。</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateResponseBody self = new CreateTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTemplateResponseBody setData(CreateTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTemplateResponseBodyData getData() {
        return this.data;
    }

    public CreateTemplateResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateTemplateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateTemplateResponseBodyData extends TeaModel {
        /**
         * <p>模板内容。</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>创建时间 (UTC+8)。</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>申请说明。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>模板ID。</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>模板名称。</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>审核意见。</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>签名。</p>
         */
        @NameInMap("Signature")
        public String signature;

        /**
         * <p>签名ID。</p>
         */
        @NameInMap("SignatureId")
        public String signatureId;

        /**
         * <p>审核状态。</p>
         * <p>- 0 : 审核中。</p>
         * <p>- 1 : 审核通过。</p>
         * <p>- 2 : 审核不通过。</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>模板Code。</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        /**
         * <p>模板类型。</p>
         * <p>- 0 : 验证码。</p>
         * <p>- 1 : 短信通知。</p>
         * <p>- 2 : 推广短信。</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>更新时间 (UTC+8)。</p>
         */
        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static CreateTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateResponseBodyData self = new CreateTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTemplateResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateTemplateResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public CreateTemplateResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateTemplateResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateTemplateResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTemplateResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public CreateTemplateResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public CreateTemplateResponseBodyData setSignatureId(String signatureId) {
            this.signatureId = signatureId;
            return this;
        }
        public String getSignatureId() {
            return this.signatureId;
        }

        public CreateTemplateResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateTemplateResponseBodyData setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public CreateTemplateResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public CreateTemplateResponseBodyData setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
