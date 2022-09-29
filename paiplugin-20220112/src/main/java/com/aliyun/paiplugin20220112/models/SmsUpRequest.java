// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class SmsUpRequest extends TeaModel {
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
        @NameInMap("content")
        public String content;

        @NameInMap("dest_code")
        public String destCode;

        @NameInMap("phone_number")
        public String phoneNumber;

        @NameInMap("send_time")
        public String sendTime;

        @NameInMap("sequence_id")
        public Integer sequenceId;

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
