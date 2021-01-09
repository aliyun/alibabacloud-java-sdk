// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sms_intl20180501.models;

import com.aliyun.tea.*;

public class SendMessageToGlobeResponseBody extends TeaModel {
    @NameInMap("ResponseCode")
    public String responseCode;

    @NameInMap("NumberDetail")
    public SendMessageToGlobeResponseBodyNumberDetail numberDetail;

    @NameInMap("Segments")
    public String segments;

    @NameInMap("ResponseDescription")
    public String responseDescription;

    @NameInMap("From")
    public String from;

    @NameInMap("To")
    public String to;

    @NameInMap("MessageId")
    public String messageId;

    public static SendMessageToGlobeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendMessageToGlobeResponseBody self = new SendMessageToGlobeResponseBody();
        return TeaModel.build(map, self);
    }

    public SendMessageToGlobeResponseBody setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public SendMessageToGlobeResponseBody setNumberDetail(SendMessageToGlobeResponseBodyNumberDetail numberDetail) {
        this.numberDetail = numberDetail;
        return this;
    }
    public SendMessageToGlobeResponseBodyNumberDetail getNumberDetail() {
        return this.numberDetail;
    }

    public SendMessageToGlobeResponseBody setSegments(String segments) {
        this.segments = segments;
        return this;
    }
    public String getSegments() {
        return this.segments;
    }

    public SendMessageToGlobeResponseBody setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
        return this;
    }
    public String getResponseDescription() {
        return this.responseDescription;
    }

    public SendMessageToGlobeResponseBody setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public SendMessageToGlobeResponseBody setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public SendMessageToGlobeResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public static class SendMessageToGlobeResponseBodyNumberDetail extends TeaModel {
        @NameInMap("Carrier")
        public String carrier;

        @NameInMap("Region")
        public String region;

        @NameInMap("Country")
        public String country;

        public static SendMessageToGlobeResponseBodyNumberDetail build(java.util.Map<String, ?> map) throws Exception {
            SendMessageToGlobeResponseBodyNumberDetail self = new SendMessageToGlobeResponseBodyNumberDetail();
            return TeaModel.build(map, self);
        }

        public SendMessageToGlobeResponseBodyNumberDetail setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public SendMessageToGlobeResponseBodyNumberDetail setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public SendMessageToGlobeResponseBodyNumberDetail setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

    }

}
