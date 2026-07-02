// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class AuthDiagnosisResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <ul>
     * <li><code>code == Success</code> indicates that the authorization is successful.</li>
     * <li>Other status codes indicate that the authorization failed. Check the <code>message</code> field for the detailed fault information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>This operation does not return data.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public Object data;

    /**
     * <p>The error message.</p>
     * <ul>
     * <li>If <code>code == Success</code>, this field is empty.</li>
     * <li>Otherwise, this field contains the error information of the request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SysomOpenAPIAssumeRoleException: EntityNotExist.Role The role not exists: acs:ram::xxxxx:role/aliyunserviceroleforsysom</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>35F91AAB-5FDF-5A22-B211-C7C6B00817D0</p>
     */
    @NameInMap("request_id")
    public String requestId;

    public static AuthDiagnosisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthDiagnosisResponseBody self = new AuthDiagnosisResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthDiagnosisResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AuthDiagnosisResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public AuthDiagnosisResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AuthDiagnosisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
