// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDetectionTemplateResponseBody extends TeaModel {
    @NameInMap("DetectionTemplate")
    public GetDetectionTemplateResponseBodyDetectionTemplate detectionTemplate;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDetectionTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDetectionTemplateResponseBody self = new GetDetectionTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDetectionTemplateResponseBody setDetectionTemplate(GetDetectionTemplateResponseBodyDetectionTemplate detectionTemplate) {
        this.detectionTemplate = detectionTemplate;
        return this;
    }
    public GetDetectionTemplateResponseBodyDetectionTemplate getDetectionTemplate() {
        return this.detectionTemplate;
    }

    public GetDetectionTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDetectionTemplateResponseBodyDetectionTemplate extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("Period")
        public String period;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("UserId")
        public Long userId;

        public static GetDetectionTemplateResponseBodyDetectionTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetDetectionTemplateResponseBodyDetectionTemplate self = new GetDetectionTemplateResponseBodyDetectionTemplate();
            return TeaModel.build(map, self);
        }

        public GetDetectionTemplateResponseBodyDetectionTemplate setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetDetectionTemplateResponseBodyDetectionTemplate setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetDetectionTemplateResponseBodyDetectionTemplate setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public GetDetectionTemplateResponseBodyDetectionTemplate setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public GetDetectionTemplateResponseBodyDetectionTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetDetectionTemplateResponseBodyDetectionTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public GetDetectionTemplateResponseBodyDetectionTemplate setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
