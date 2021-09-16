// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateDetectionTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DetectionTemplate")
    public UpdateDetectionTemplateResponseBodyDetectionTemplate detectionTemplate;

    public static UpdateDetectionTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDetectionTemplateResponseBody self = new UpdateDetectionTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDetectionTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDetectionTemplateResponseBody setDetectionTemplate(UpdateDetectionTemplateResponseBodyDetectionTemplate detectionTemplate) {
        this.detectionTemplate = detectionTemplate;
        return this;
    }
    public UpdateDetectionTemplateResponseBodyDetectionTemplate getDetectionTemplate() {
        return this.detectionTemplate;
    }

    public static class UpdateDetectionTemplateResponseBodyDetectionTemplate extends TeaModel {
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

        public static UpdateDetectionTemplateResponseBodyDetectionTemplate build(java.util.Map<String, ?> map) throws Exception {
            UpdateDetectionTemplateResponseBodyDetectionTemplate self = new UpdateDetectionTemplateResponseBodyDetectionTemplate();
            return TeaModel.build(map, self);
        }

        public UpdateDetectionTemplateResponseBodyDetectionTemplate setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateDetectionTemplateResponseBodyDetectionTemplate setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public UpdateDetectionTemplateResponseBodyDetectionTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public UpdateDetectionTemplateResponseBodyDetectionTemplate setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public UpdateDetectionTemplateResponseBodyDetectionTemplate setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public UpdateDetectionTemplateResponseBodyDetectionTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public UpdateDetectionTemplateResponseBodyDetectionTemplate setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
