// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CpuHighAgentStreamResponseResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <ul>
     * <li>If code is Success, the authorization is successful.</li>
     * <li>Other status codes indicate authorization failed. Check the message field for the detailed fault information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     * 
     * <strong>example:</strong>
     * <SSEResponse>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>The error message.</p>
     * <ul>
     * <li>If code is Success, this field is empty.</li>
     * <li>Otherwise, this field contains the request error information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SysomOpenAPIAssumeRoleException: EntityNotExist.Role The role not exists: acs:ram::xxxxx:role/aliyunserviceroleforsysom</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CpuHighAgentStreamResponseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CpuHighAgentStreamResponseResponseBody self = new CpuHighAgentStreamResponseResponseBody();
        return TeaModel.build(map, self);
    }

    public CpuHighAgentStreamResponseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CpuHighAgentStreamResponseResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CpuHighAgentStreamResponseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CpuHighAgentStreamResponseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
