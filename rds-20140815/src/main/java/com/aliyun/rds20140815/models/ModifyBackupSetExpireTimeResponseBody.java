// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyBackupSetExpireTimeResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the returned parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;SupportOnlineResizeDisk&quot;: true,
     *       &quot;DBInstanceName&quot;: &quot;rm-bp****&quot;,
     *       &quot;maxSupportDiskSizeGB&quot;: 6144
     * }</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The information about the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>76364A52-E0AB-5CC8-9818-CF1DC482C092</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyBackupSetExpireTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupSetExpireTimeResponseBody self = new ModifyBackupSetExpireTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBackupSetExpireTimeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyBackupSetExpireTimeResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ModifyBackupSetExpireTimeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyBackupSetExpireTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyBackupSetExpireTimeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
