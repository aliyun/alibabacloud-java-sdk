// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class SmsUpRequest extends TeaModel {
    /**
     * <p>请求参数的主体信息。</p>
     */
    @NameInMap("body")
    public java.util.List<SmsUpRequestBody> body;

    public static SmsUpRequest build(java.util.Map<String, ?> map) throws Exception {
        SmsUpRequest self = new SmsUpRequest();
        return TeaModel.build(map, self);
    }

    public SmsUpRequest setBody(java.util.List<SmsUpRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<SmsUpRequestBody> getBody() {
        return this.body;
    }

    public static class SmsUpRequestBody extends TeaModel {
        /**
         * <p>发送内容。</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>上行短信扩展号码，系统后台自动生成，不支持自定义传入。</p>
         */
        @NameInMap("dest_code")
        public String destCode;

        /**
         * <p>手机号码。</p>
         */
        @NameInMap("phone_number")
        public String phoneNumber;

        /**
         * <p>发送时间。</p>
         */
        @NameInMap("send_time")
        public String sendTime;

        /**
         * <p>序列号。</p>
         */
        @NameInMap("sequence_id")
        public Integer sequenceId;

        /**
         * <p>签名信息。</p>
         */
        @NameInMap("sign_name")
        public String signName;

        public static SmsUpRequestBody build(java.util.Map<String, ?> map) throws Exception {
            SmsUpRequestBody self = new SmsUpRequestBody();
            return TeaModel.build(map, self);
        }

        public SmsUpRequestBody setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SmsUpRequestBody setDestCode(String destCode) {
            this.destCode = destCode;
            return this;
        }
        public String getDestCode() {
            return this.destCode;
        }

        public SmsUpRequestBody setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public SmsUpRequestBody setSendTime(String sendTime) {
            this.sendTime = sendTime;
            return this;
        }
        public String getSendTime() {
            return this.sendTime;
        }

        public SmsUpRequestBody setSequenceId(Integer sequenceId) {
            this.sequenceId = sequenceId;
            return this;
        }
        public Integer getSequenceId() {
            return this.sequenceId;
        }

        public SmsUpRequestBody setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

    }

}
