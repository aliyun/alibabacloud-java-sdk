// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sms_intl20180501.models;

import com.aliyun.tea.*;

public class QueryMessageResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("ErrorDescription")
    public String errorDescription;

    @NameInMap("ResponseCode")
    public String responseCode;

    @NameInMap("ReceiveDate")
    public String receiveDate;

    @NameInMap("NumberDetail")
    public QueryMessageResponseBodyNumberDetail numberDetail;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseDescription")
    public String responseDescription;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("SendDate")
    public String sendDate;

    @NameInMap("To")
    public String to;

    public static QueryMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMessageResponseBody self = new QueryMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMessageResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryMessageResponseBody setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
        return this;
    }
    public String getErrorDescription() {
        return this.errorDescription;
    }

    public QueryMessageResponseBody setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public QueryMessageResponseBody setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
        return this;
    }
    public String getReceiveDate() {
        return this.receiveDate;
    }

    public QueryMessageResponseBody setNumberDetail(QueryMessageResponseBodyNumberDetail numberDetail) {
        this.numberDetail = numberDetail;
        return this;
    }
    public QueryMessageResponseBodyNumberDetail getNumberDetail() {
        return this.numberDetail;
    }

    public QueryMessageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMessageResponseBody setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
        return this;
    }
    public String getResponseDescription() {
        return this.responseDescription;
    }

    public QueryMessageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryMessageResponseBody setSendDate(String sendDate) {
        this.sendDate = sendDate;
        return this;
    }
    public String getSendDate() {
        return this.sendDate;
    }

    public QueryMessageResponseBody setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public static class QueryMessageResponseBodyNumberDetail extends TeaModel {
        @NameInMap("Carrier")
        public String carrier;

        @NameInMap("Region")
        public String region;

        @NameInMap("Country")
        public String country;

        public static QueryMessageResponseBodyNumberDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryMessageResponseBodyNumberDetail self = new QueryMessageResponseBodyNumberDetail();
            return TeaModel.build(map, self);
        }

        public QueryMessageResponseBodyNumberDetail setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public QueryMessageResponseBodyNumberDetail setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryMessageResponseBodyNumberDetail setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

    }

}
