// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyOutboundCallNumberResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("OutboundCallNumber")
    public ModifyOutboundCallNumberResponseBodyOutboundCallNumber outboundCallNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ModifyOutboundCallNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyOutboundCallNumberResponseBody self = new ModifyOutboundCallNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyOutboundCallNumberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyOutboundCallNumberResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyOutboundCallNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyOutboundCallNumberResponseBody setOutboundCallNumber(ModifyOutboundCallNumberResponseBodyOutboundCallNumber outboundCallNumber) {
        this.outboundCallNumber = outboundCallNumber;
        return this;
    }
    public ModifyOutboundCallNumberResponseBodyOutboundCallNumber getOutboundCallNumber() {
        return this.outboundCallNumber;
    }

    public ModifyOutboundCallNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyOutboundCallNumberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifyOutboundCallNumberResponseBodyOutboundCallNumber extends TeaModel {
        @NameInMap("Number")
        public String number;

        @NameInMap("OutboundCallNumberId")
        public String outboundCallNumberId;

        @NameInMap("RateLimitCount")
        public String rateLimitCount;

        @NameInMap("RateLimitPeriod")
        public String rateLimitPeriod;

        public static ModifyOutboundCallNumberResponseBodyOutboundCallNumber build(java.util.Map<String, ?> map) throws Exception {
            ModifyOutboundCallNumberResponseBodyOutboundCallNumber self = new ModifyOutboundCallNumberResponseBodyOutboundCallNumber();
            return TeaModel.build(map, self);
        }

        public ModifyOutboundCallNumberResponseBodyOutboundCallNumber setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ModifyOutboundCallNumberResponseBodyOutboundCallNumber setOutboundCallNumberId(String outboundCallNumberId) {
            this.outboundCallNumberId = outboundCallNumberId;
            return this;
        }
        public String getOutboundCallNumberId() {
            return this.outboundCallNumberId;
        }

        public ModifyOutboundCallNumberResponseBodyOutboundCallNumber setRateLimitCount(String rateLimitCount) {
            this.rateLimitCount = rateLimitCount;
            return this;
        }
        public String getRateLimitCount() {
            return this.rateLimitCount;
        }

        public ModifyOutboundCallNumberResponseBodyOutboundCallNumber setRateLimitPeriod(String rateLimitPeriod) {
            this.rateLimitPeriod = rateLimitPeriod;
            return this;
        }
        public String getRateLimitPeriod() {
            return this.rateLimitPeriod;
        }

    }

}
