// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyAccountMaskingPrivilegeResponseBody extends TeaModel {
    /**
     * <p>Returned data</p>
     */
    @NameInMap("Data")
    public java.util.Map<String, String> data;

    /**
     * <p>Return message</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>2144F5CC-10C5-3B72-8C74-E52C********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation succeeded</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static ModifyAccountMaskingPrivilegeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountMaskingPrivilegeResponseBody self = new ModifyAccountMaskingPrivilegeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAccountMaskingPrivilegeResponseBody setData(java.util.Map<String, String> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, String> getData() {
        return this.data;
    }

    public ModifyAccountMaskingPrivilegeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyAccountMaskingPrivilegeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyAccountMaskingPrivilegeResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
