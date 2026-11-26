// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateTenantDirectoryResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success. If the request fails, a specific business error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The business ID of the updated directory. You can refresh the configuration content by calling the corresponding configuration read API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>kb-example</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The response message. The value is success if the request is successful. If the request fails, the message describes the cause of the error.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request tracking ID. You can use this ID to troubleshoot issues related to this call.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateTenantDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTenantDirectoryResponseBody self = new UpdateTenantDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTenantDirectoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateTenantDirectoryResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public UpdateTenantDirectoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateTenantDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
