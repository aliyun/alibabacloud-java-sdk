// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyEncryptionDBSecretResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-***************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The message returned for the request.</p>
     * <blockquote>
     * <p>If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4CE6DF97-AEA4-484F-906F-C407EE******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request is successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request fails.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyEncryptionDBSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyEncryptionDBSecretResponseBody self = new ModifyEncryptionDBSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyEncryptionDBSecretResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyEncryptionDBSecretResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyEncryptionDBSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyEncryptionDBSecretResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
