// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class DetailDigitalTemplateResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetailDigitalTemplateResponseBodyData data;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("ErrorDesc")
    public String errorDesc;

    @NameInMap("RequestId")
    public String requestId;

    // 接口调用状态
    @NameInMap("Success")
    public Boolean success;

    // traceId
    @NameInMap("TraceId")
    public String traceId;

    public static DetailDigitalTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetailDigitalTemplateResponseBody self = new DetailDigitalTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DetailDigitalTemplateResponseBody setData(DetailDigitalTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetailDigitalTemplateResponseBodyData getData() {
        return this.data;
    }

    public DetailDigitalTemplateResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DetailDigitalTemplateResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public DetailDigitalTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetailDigitalTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DetailDigitalTemplateResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DetailDigitalTemplateResponseBodyDataDigitalSmsMaterialModels extends TeaModel {
        // 素材内容oss地址
        @NameInMap("Content")
        public String content;

        // 素材顺序
        @NameInMap("MaterialIndex")
        public Long materialIndex;

        // 素材大小
        @NameInMap("Size")
        public Long size;

        // 素材前缀
        @NameInMap("Suffix")
        public String suffix;

        // 素材类型
        @NameInMap("Type")
        public Long type;

        public static DetailDigitalTemplateResponseBodyDataDigitalSmsMaterialModels build(java.util.Map<String, ?> map) throws Exception {
            DetailDigitalTemplateResponseBodyDataDigitalSmsMaterialModels self = new DetailDigitalTemplateResponseBodyDataDigitalSmsMaterialModels();
            return TeaModel.build(map, self);
        }

        public DetailDigitalTemplateResponseBodyDataDigitalSmsMaterialModels setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DetailDigitalTemplateResponseBodyDataDigitalSmsMaterialModels setMaterialIndex(Long materialIndex) {
            this.materialIndex = materialIndex;
            return this;
        }
        public Long getMaterialIndex() {
            return this.materialIndex;
        }

        public DetailDigitalTemplateResponseBodyDataDigitalSmsMaterialModels setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DetailDigitalTemplateResponseBodyDataDigitalSmsMaterialModels setSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }
        public String getSuffix() {
            return this.suffix;
        }

        public DetailDigitalTemplateResponseBodyDataDigitalSmsMaterialModels setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

    public static class DetailDigitalTemplateResponseBodyData extends TeaModel {
        // 素材信息
        @NameInMap("DigitalSmsMaterialModels")
        public java.util.List<DetailDigitalTemplateResponseBodyDataDigitalSmsMaterialModels> digitalSmsMaterialModels;

        // 主键
        @NameInMap("Id")
        public String id;

        // 平台ID
        @NameInMap("PlatformId")
        public String platformId;

        // 平台名称
        @NameInMap("PlatformName")
        public String platformName;

        // 审核信息
        @NameInMap("Reason")
        public String reason;

        // 签名
        @NameInMap("Sign")
        public String sign;

        // 模板编号
        @NameInMap("SmsTemplateCode")
        public String smsTemplateCode;

        // 支持运营商
        @NameInMap("SupportProvider")
        public String supportProvider;

        // 模板名称
        @NameInMap("TemplateName")
        public String templateName;

        // 模板状态
        @NameInMap("TemplateStatus")
        public Long templateStatus;

        // 模板主题
        @NameInMap("TemplateTheme")
        public String templateTheme;

        public static DetailDigitalTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetailDigitalTemplateResponseBodyData self = new DetailDigitalTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetailDigitalTemplateResponseBodyData setDigitalSmsMaterialModels(java.util.List<DetailDigitalTemplateResponseBodyDataDigitalSmsMaterialModels> digitalSmsMaterialModels) {
            this.digitalSmsMaterialModels = digitalSmsMaterialModels;
            return this;
        }
        public java.util.List<DetailDigitalTemplateResponseBodyDataDigitalSmsMaterialModels> getDigitalSmsMaterialModels() {
            return this.digitalSmsMaterialModels;
        }

        public DetailDigitalTemplateResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DetailDigitalTemplateResponseBodyData setPlatformId(String platformId) {
            this.platformId = platformId;
            return this;
        }
        public String getPlatformId() {
            return this.platformId;
        }

        public DetailDigitalTemplateResponseBodyData setPlatformName(String platformName) {
            this.platformName = platformName;
            return this;
        }
        public String getPlatformName() {
            return this.platformName;
        }

        public DetailDigitalTemplateResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DetailDigitalTemplateResponseBodyData setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public DetailDigitalTemplateResponseBodyData setSmsTemplateCode(String smsTemplateCode) {
            this.smsTemplateCode = smsTemplateCode;
            return this;
        }
        public String getSmsTemplateCode() {
            return this.smsTemplateCode;
        }

        public DetailDigitalTemplateResponseBodyData setSupportProvider(String supportProvider) {
            this.supportProvider = supportProvider;
            return this;
        }
        public String getSupportProvider() {
            return this.supportProvider;
        }

        public DetailDigitalTemplateResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public DetailDigitalTemplateResponseBodyData setTemplateStatus(Long templateStatus) {
            this.templateStatus = templateStatus;
            return this;
        }
        public Long getTemplateStatus() {
            return this.templateStatus;
        }

        public DetailDigitalTemplateResponseBodyData setTemplateTheme(String templateTheme) {
            this.templateTheme = templateTheme;
            return this;
        }
        public String getTemplateTheme() {
            return this.templateTheme;
        }

    }

}
