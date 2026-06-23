// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class PublishMessageRequest extends TeaModel {
    @NameInMap("MessageAttributes")
    public PublishMessageRequestMessageAttributes messageAttributes;

    /**
     * <strong>example:</strong>
     * <p>hello topic</p>
     */
    @NameInMap("MessageBody")
    public String messageBody;

    /**
     * <strong>example:</strong>
     * <p>order-event</p>
     */
    @NameInMap("MessageTag")
    public String messageTag;

    public static PublishMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishMessageRequest self = new PublishMessageRequest();
        return TeaModel.build(map, self);
    }

    public PublishMessageRequest setMessageAttributes(PublishMessageRequestMessageAttributes messageAttributes) {
        this.messageAttributes = messageAttributes;
        return this;
    }
    public PublishMessageRequestMessageAttributes getMessageAttributes() {
        return this.messageAttributes;
    }

    public PublishMessageRequest setMessageBody(String messageBody) {
        this.messageBody = messageBody;
        return this;
    }
    public String getMessageBody() {
        return this.messageBody;
    }

    public PublishMessageRequest setMessageTag(String messageTag) {
        this.messageTag = messageTag;
        return this;
    }
    public String getMessageTag() {
        return this.messageTag;
    }

    public static class PublishMessageRequestMessageAttributes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>详见 <a href="https://help.aliyun.com/zh/direct-mail/singlesendmail">https://help.aliyun.com/zh/direct-mail/singlesendmail</a></p>
         */
        @NameInMap("DirectMail")
        public String directMail;

        /**
         * <strong>example:</strong>
         * <p>{&quot;FreeSignName&quot;:&quot;阿里云&quot;,&quot;TemplateCode&quot;:&quot;SMS_123456&quot;,&quot;Type&quot;:&quot;singleContent&quot;,&quot;Receiver&quot;:&quot;13800000000&quot;,&quot;SmsParams&quot;:&quot;{\&quot;code\&quot;:\&quot;1234\&quot;}&quot;}</p>
         */
        @NameInMap("DirectSMS")
        public String directSMS;

        /**
         * <strong>example:</strong>
         * <p>移动推送属性示例值</p>
         */
        @NameInMap("Push")
        public String push;

        public static PublishMessageRequestMessageAttributes build(java.util.Map<String, ?> map) throws Exception {
            PublishMessageRequestMessageAttributes self = new PublishMessageRequestMessageAttributes();
            return TeaModel.build(map, self);
        }

        public PublishMessageRequestMessageAttributes setDirectMail(String directMail) {
            this.directMail = directMail;
            return this;
        }
        public String getDirectMail() {
            return this.directMail;
        }

        public PublishMessageRequestMessageAttributes setDirectSMS(String directSMS) {
            this.directSMS = directSMS;
            return this;
        }
        public String getDirectSMS() {
            return this.directSMS;
        }

        public PublishMessageRequestMessageAttributes setPush(String push) {
            this.push = push;
            return this;
        }
        public String getPush() {
            return this.push;
        }

    }

}
