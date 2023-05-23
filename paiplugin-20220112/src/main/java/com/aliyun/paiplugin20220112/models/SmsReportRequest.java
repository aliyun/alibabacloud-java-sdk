// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class SmsReportRequest extends TeaModel {
    /**
     * <p>请求参数的主体信息。</p>
     */
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
        /**
         * <p>发送回执ID，即发送流水号。</p>
         */
        @NameInMap("biz_id")
        public String bizId;

        /**
         * <p>状态报告编码。</p>
         */
        @NameInMap("err_code")
        public String errCode;

        /**
         * <p>状态报告说明。</p>
         */
        @NameInMap("err_msg")
        public String errMsg;

        /**
         * <p>短信Id。调用发送接口SendMessage发送短信时，返回值中的Id字段。可使用短信Id在接口ListMessages查询具体的发送状态。</p>
         */
        @NameInMap("message_id")
        public String messageId;

        /**
         * <p>外部拓展字段。</p>
         */
        @NameInMap("out_id")
        public String outId;

        /**
         * <p>手机号码。</p>
         */
        @NameInMap("phone_number")
        public String phoneNumber;

        /**
         * <p>状态报告时间。</p>
         */
        @NameInMap("report_time")
        public String reportTime;

        /**
         * <p>短信批处理Id。调用发送接口SendMessage发送短信时，返回值中的RequestId字段。可使用短信批处理Id在接口ListMessages查询具体的发送状态。</p>
         */
        @NameInMap("request_id")
        public String requestId;

        /**
         * <p>发送时间。</p>
         */
        @NameInMap("send_time")
        public String sendTime;

        /**
         * <p>签名。</p>
         */
        @NameInMap("sign_name")
        public String signName;

        /**
         * <p>短信长度。短信长度不超过70个字，按照一条短信计费；超过70个字，即为长短信，按照67字/条拆分成多条计费。</p>
         */
        @NameInMap("sms_size")
        public String smsSize;

        /**
         * <p>是否接收成功。</p>
         * <p>- true : 接收成功。</p>
         * <p>- false : 接收失败。</p>
         */
        @NameInMap("success")
        public Boolean success;

        /**
         * <p>模板号。</p>
         */
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
