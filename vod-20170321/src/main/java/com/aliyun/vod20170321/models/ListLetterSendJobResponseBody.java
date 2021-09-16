// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListLetterSendJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LetterJobList")
    public java.util.List<ListLetterSendJobResponseBodyLetterJobList> letterJobList;

    public static ListLetterSendJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLetterSendJobResponseBody self = new ListLetterSendJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLetterSendJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLetterSendJobResponseBody setLetterJobList(java.util.List<ListLetterSendJobResponseBodyLetterJobList> letterJobList) {
        this.letterJobList = letterJobList;
        return this;
    }
    public java.util.List<ListLetterSendJobResponseBodyLetterJobList> getLetterJobList() {
        return this.letterJobList;
    }

    public static class ListLetterSendJobResponseBodyLetterJobList extends TeaModel {
        @NameInMap("CcAddress")
        public String ccAddress;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("SendTime")
        public String sendTime;

        @NameInMap("ToAddress")
        public String toAddress;

        @NameInMap("Body")
        public String body;

        @NameInMap("DetectionId")
        public String detectionId;

        @NameInMap("BccAddress")
        public String bccAddress;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Title")
        public String title;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("ModifyTime")
        public String modifyTime;

        public static ListLetterSendJobResponseBodyLetterJobList build(java.util.Map<String, ?> map) throws Exception {
            ListLetterSendJobResponseBodyLetterJobList self = new ListLetterSendJobResponseBodyLetterJobList();
            return TeaModel.build(map, self);
        }

        public ListLetterSendJobResponseBodyLetterJobList setCcAddress(String ccAddress) {
            this.ccAddress = ccAddress;
            return this;
        }
        public String getCcAddress() {
            return this.ccAddress;
        }

        public ListLetterSendJobResponseBodyLetterJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListLetterSendJobResponseBodyLetterJobList setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public ListLetterSendJobResponseBodyLetterJobList setSendTime(String sendTime) {
            this.sendTime = sendTime;
            return this;
        }
        public String getSendTime() {
            return this.sendTime;
        }

        public ListLetterSendJobResponseBodyLetterJobList setToAddress(String toAddress) {
            this.toAddress = toAddress;
            return this;
        }
        public String getToAddress() {
            return this.toAddress;
        }

        public ListLetterSendJobResponseBodyLetterJobList setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public ListLetterSendJobResponseBodyLetterJobList setDetectionId(String detectionId) {
            this.detectionId = detectionId;
            return this;
        }
        public String getDetectionId() {
            return this.detectionId;
        }

        public ListLetterSendJobResponseBodyLetterJobList setBccAddress(String bccAddress) {
            this.bccAddress = bccAddress;
            return this;
        }
        public String getBccAddress() {
            return this.bccAddress;
        }

        public ListLetterSendJobResponseBodyLetterJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListLetterSendJobResponseBodyLetterJobList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListLetterSendJobResponseBodyLetterJobList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListLetterSendJobResponseBodyLetterJobList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
