// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class SmsReportRequest extends TeaModel {
    // 请求参数的主体信息。
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
        // 发送回执ID，即发送流水号。
        @NameInMap("biz_id")
        public String bizId;

        // 状态报告编码。
        @NameInMap("err_code")
        public String errCode;

        // 状态报告说明。
        @NameInMap("err_msg")
        public String errMsg;

        // 短信Id。调用发送接口SendMessage发送短信时，返回值中的Id字段。可使用短信Id在接口ListMessages查询具体的发送状态。
        @NameInMap("message_id")
        public String messageId;

        // 外部拓展字段。
        @NameInMap("out_id")
        public String outId;

        // 手机号码。
        @NameInMap("phone_number")
        public String phoneNumber;

        // 状态报告时间。
        @NameInMap("report_time")
        public String reportTime;

        // 短信批处理Id。调用发送接口SendMessage发送短信时，返回值中的RequestId字段。可使用短信批处理Id在接口ListMessages查询具体的发送状态。
        @NameInMap("request_id")
        public String requestId;

        // 发送时间。
        @NameInMap("send_time")
        public String sendTime;

        // 签名。
        @NameInMap("sign_name")
        public String signName;

        // 短信长度。短信长度不超过70个字，按照一条短信计费；超过70个字，即为长短信，按照67字/条拆分成多条计费。
        @NameInMap("sms_size")
        public String smsSize;

        // 是否接收成功。
        // - true : 接收成功。
        // - false : 接收失败。
        @NameInMap("success")
        public Boolean success;

        // 模板号。
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
