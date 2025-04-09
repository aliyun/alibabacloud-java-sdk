// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyOutboundCallNumberResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("OutboundCallNumber")
    public ModifyOutboundCallNumberResponseBodyOutboundCallNumber outboundCallNumber;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>10088</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <strong>example:</strong>
         * <p>fa0e21e9-caab-4629-9121-1e341243d599</p>
         */
        @NameInMap("OutboundCallNumberId")
        public String outboundCallNumberId;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RateLimitCount")
        public String rateLimitCount;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
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
