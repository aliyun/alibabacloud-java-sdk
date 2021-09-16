// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListDetectionTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DetectionTemplateList")
    public java.util.List<ListDetectionTemplateResponseBodyDetectionTemplateList> detectionTemplateList;

    public static ListDetectionTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDetectionTemplateResponseBody self = new ListDetectionTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDetectionTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDetectionTemplateResponseBody setDetectionTemplateList(java.util.List<ListDetectionTemplateResponseBodyDetectionTemplateList> detectionTemplateList) {
        this.detectionTemplateList = detectionTemplateList;
        return this;
    }
    public java.util.List<ListDetectionTemplateResponseBodyDetectionTemplateList> getDetectionTemplateList() {
        return this.detectionTemplateList;
    }

    public static class ListDetectionTemplateResponseBodyDetectionTemplateList extends TeaModel {
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

        public static ListDetectionTemplateResponseBodyDetectionTemplateList build(java.util.Map<String, ?> map) throws Exception {
            ListDetectionTemplateResponseBodyDetectionTemplateList self = new ListDetectionTemplateResponseBodyDetectionTemplateList();
            return TeaModel.build(map, self);
        }

        public ListDetectionTemplateResponseBodyDetectionTemplateList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDetectionTemplateResponseBodyDetectionTemplateList setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public ListDetectionTemplateResponseBodyDetectionTemplateList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListDetectionTemplateResponseBodyDetectionTemplateList setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public ListDetectionTemplateResponseBodyDetectionTemplateList setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListDetectionTemplateResponseBodyDetectionTemplateList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListDetectionTemplateResponseBodyDetectionTemplateList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
