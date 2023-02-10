// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OpenSensitiveFileScanResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public OpenSensitiveFileScanResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static OpenSensitiveFileScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenSensitiveFileScanResponseBody self = new OpenSensitiveFileScanResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenSensitiveFileScanResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OpenSensitiveFileScanResponseBody setData(OpenSensitiveFileScanResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OpenSensitiveFileScanResponseBodyData getData() {
        return this.data;
    }

    public OpenSensitiveFileScanResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public OpenSensitiveFileScanResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OpenSensitiveFileScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpenSensitiveFileScanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class OpenSensitiveFileScanResponseBodyData extends TeaModel {
        @NameInMap("SwitchOn")
        public String switchOn;

        public static OpenSensitiveFileScanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OpenSensitiveFileScanResponseBodyData self = new OpenSensitiveFileScanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OpenSensitiveFileScanResponseBodyData setSwitchOn(String switchOn) {
            this.switchOn = switchOn;
            return this;
        }
        public String getSwitchOn() {
            return this.switchOn;
        }

    }

}
