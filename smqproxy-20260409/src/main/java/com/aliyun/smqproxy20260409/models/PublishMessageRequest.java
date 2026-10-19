// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class PublishMessageRequest extends TeaModel {
    /**
     * <p><strong>Message attributes</strong>. You do not need to set this parameter when pushing messages to queues or HTTP endpoints.</p>
     */
    @NameInMap("MessageAttributes")
    public PublishMessageRequestMessageAttributes messageAttributes;

    /**
     * <p><strong>Message content</strong>. Base64-encode the content beforehand.
     * Maximum size: 64 KB.</p>
     * 
     * <strong>example:</strong>
     * <p>hello topic</p>
     */
    @NameInMap("MessageBody")
    public String messageBody;

    @NameInMap("MessageGroupId")
    public String messageGroupId;

    /**
     * <p><strong>Message tag</strong>, used for message filtering on subscriptions.
     * Maximum length: 64 characters.</p>
     * 
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

    public PublishMessageRequest setMessageGroupId(String messageGroupId) {
        this.messageGroupId = messageGroupId;
        return this;
    }
    public String getMessageGroupId() {
        return this.messageGroupId;
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
         * <p><strong>Email push attributes</strong> (JSON-formatted string).</p>
         * 
         * <strong>example:</strong>
         * <p>For more information, see <a href="https://www.alibabacloud.com/help/en/direct-mail/singlesendmail">https://www.alibabacloud.com/help/en/direct-mail/singlesendmail</a>.</p>
         */
        @NameInMap("DirectMail")
        public String directMail;

        /**
         * <p>SMS push attributes (JSON-formatted string), including <code>FreeSignName</code>, <code>TemplateCode</code>, <code>Type</code>, <code>Receiver</code>, and <code>SmsParams</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;FreeSignName&quot;:&quot;Alibaba Cloud&quot;,&quot;TemplateCode&quot;:&quot;SMS_123456&quot;,&quot;Type&quot;:&quot;singleContent&quot;,&quot;Receiver&quot;:&quot;13800000000&quot;,&quot;SmsParams&quot;:&quot;{\&quot;code\&quot;:\&quot;1234\&quot;}&quot;}</p>
         */
        @NameInMap("DirectSMS")
        public String directSMS;

        /**
         * <p>Mobile push attributes (JSON-formatted string).</p>
         * 
         * <strong>example:</strong>
         * <p>Sample mobile push attributes value.</p>
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
