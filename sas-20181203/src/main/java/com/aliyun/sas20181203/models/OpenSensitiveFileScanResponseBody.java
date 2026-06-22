// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OpenSensitiveFileScanResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of <strong>200</strong> indicates success. Any other value indicates failure. You can use this field to determine the cause of the failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned for modifying the sensitive file scan switch.</p>
     */
    @NameInMap("Data")
    public OpenSensitiveFileScanResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The detailed information of the error code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>B4A4C081-7F06-5481-9323-02A5419B9423</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result status of the API call. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The API call was successful.</li>
     * <li><strong>false</strong>: The API call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The switch operation. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: Enable.</li>
         * <li><strong>off</strong>: Disable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
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
