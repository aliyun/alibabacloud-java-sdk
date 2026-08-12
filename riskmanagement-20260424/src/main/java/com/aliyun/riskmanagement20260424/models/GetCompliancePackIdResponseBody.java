// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetCompliancePackIdResponseBody extends TeaModel {
    /**
     * <p>The status code. Valid values:</p>
     * <ul>
     * <li><strong>200</strong>: Succeeded.</li>
     * <li><strong>Others (400, 500)</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The compliance package ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cp-9g78b15xxxd0005d5a7</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>855FCC89-0B13-5FC0-AAD2-120878081C1C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.                               </li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetCompliancePackIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCompliancePackIdResponseBody self = new GetCompliancePackIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCompliancePackIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCompliancePackIdResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetCompliancePackIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCompliancePackIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCompliancePackIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
