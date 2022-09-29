// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class SmsReportRequest extends TeaModel {
    @NameInMap("body")
    public java.util.List<SmsReportRequestBody> body;

    public static SmsReportRequest build(java.util.Map<String, ?> map) throws Exception {
        SmsReportRequest self = new SmsReportRequest();
        return TeaModel.build(map, self);
    }

    public SmsReportRequest setBody(java.util.List<SmsReportRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<SmsReportRequestBody> getBody() {
        return this.body;
    }

    public static class SmsReportRequestBody extends TeaModel {
        @NameInMap("biz_id")
        public String bizId;

        @NameInMap("err_code")
        public String errCode;

        @NameInMap("err_msg")
        public String errMsg;

        @NameInMap("message_id")
        public String messageId;

        @NameInMap("out_id")
        public String outId;

        @NameInMap("phone_number")
        public String phoneNumber;

        @NameInMap("report_time")
        public String reportTime;

        @NameInMap("request_id")
        public String requestId;

        @NameInMap("send_time")
        public String sendTime;

        @NameInMap("sign_name")
        public String signName;

        @NameInMap("sms_size")
        public String smsSize;

        @NameInMap("success")
        public Boolean success;

        @NameInMap("template_code")
        public String templateCode;

        public static SmsReportRequestBody build(java.util.Map<String, ?> map) throws Exception {
            SmsReportRequestBody self = new SmsReportRequestBody();
            return TeaModel.build(map, self);
        }

        public SmsReportRequestBody setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public SmsReportRequestBody setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public SmsReportRequestBody setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public SmsReportRequestBody setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public SmsReportRequestBody setOutId(String outId) {
            this.outId = outId;
            return this;
        }
        public String getOutId() {
            return this.outId;
        }

        public SmsReportRequestBody setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public SmsReportRequestBody setReportTime(String reportTime) {
            this.reportTime = reportTime;
            return this;
        }
        public String getReportTime() {
            return this.reportTime;
        }

        public SmsReportRequestBody setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public SmsReportRequestBody setSendTime(String sendTime) {
            this.sendTime = sendTime;
            return this;
        }
        public String getSendTime() {
            return this.sendTime;
        }

        public SmsReportRequestBody setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public SmsReportRequestBody setSmsSize(String smsSize) {
            this.smsSize = smsSize;
            return this;
        }
        public String getSmsSize() {
            return this.smsSize;
        }

        public SmsReportRequestBody setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public SmsReportRequestBody setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

}
