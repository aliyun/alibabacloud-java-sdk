// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifySecurityEventMarkMissIndividuallyResponseBody extends TeaModel {
    /**
     * <p>The status code of the alert event.</p>
     * <br>
     * <p>*   **200**: indicates that the alert event is successfully handled.</p>
     * <p>*   Other codes: indicates that the alert event fails to be handled.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The time that was consumed to process the request. Unit: milliseconds.</p>
     */
    @NameInMap("TimeCost")
    public Long timeCost;

    public static ModifySecurityEventMarkMissIndividuallyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityEventMarkMissIndividuallyResponseBody self = new ModifySecurityEventMarkMissIndividuallyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySecurityEventMarkMissIndividuallyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifySecurityEventMarkMissIndividuallyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifySecurityEventMarkMissIndividuallyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifySecurityEventMarkMissIndividuallyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySecurityEventMarkMissIndividuallyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ModifySecurityEventMarkMissIndividuallyResponseBody setTimeCost(Long timeCost) {
        this.timeCost = timeCost;
        return this;
    }
    public Long getTimeCost() {
        return this.timeCost;
    }

}
