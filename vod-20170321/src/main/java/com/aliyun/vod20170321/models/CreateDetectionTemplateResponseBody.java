// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateDetectionTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DetectionTemplate")
    public CreateDetectionTemplateResponseBodyDetectionTemplate detectionTemplate;

    public static CreateDetectionTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDetectionTemplateResponseBody self = new CreateDetectionTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDetectionTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDetectionTemplateResponseBody setDetectionTemplate(CreateDetectionTemplateResponseBodyDetectionTemplate detectionTemplate) {
        this.detectionTemplate = detectionTemplate;
        return this;
    }
    public CreateDetectionTemplateResponseBodyDetectionTemplate getDetectionTemplate() {
        return this.detectionTemplate;
    }

    public static class CreateDetectionTemplateResponseBodyDetectionTemplate extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("Period")
        public String period;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("ModifyTime")
        public String modifyTime;

        public static CreateDetectionTemplateResponseBodyDetectionTemplate build(java.util.Map<String, ?> map) throws Exception {
            CreateDetectionTemplateResponseBodyDetectionTemplate self = new CreateDetectionTemplateResponseBodyDetectionTemplate();
            return TeaModel.build(map, self);
        }

        public CreateDetectionTemplateResponseBodyDetectionTemplate setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateDetectionTemplateResponseBodyDetectionTemplate setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public CreateDetectionTemplateResponseBodyDetectionTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public CreateDetectionTemplateResponseBodyDetectionTemplate setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public CreateDetectionTemplateResponseBodyDetectionTemplate setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public CreateDetectionTemplateResponseBodyDetectionTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public CreateDetectionTemplateResponseBodyDetectionTemplate setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
