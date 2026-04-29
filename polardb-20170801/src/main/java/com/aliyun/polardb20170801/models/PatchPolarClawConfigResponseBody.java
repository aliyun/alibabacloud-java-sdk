// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class PatchPolarClawConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Ok")
    public Boolean ok;

    @NameInMap("PatchedKeys")
    public java.util.List<String> patchedKeys;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Restarted")
    public Boolean restarted;

    public static PatchPolarClawConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PatchPolarClawConfigResponseBody self = new PatchPolarClawConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public PatchPolarClawConfigResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public PatchPolarClawConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public PatchPolarClawConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PatchPolarClawConfigResponseBody setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }
    public Boolean getOk() {
        return this.ok;
    }

    public PatchPolarClawConfigResponseBody setPatchedKeys(java.util.List<String> patchedKeys) {
        this.patchedKeys = patchedKeys;
        return this;
    }
    public java.util.List<String> getPatchedKeys() {
        return this.patchedKeys;
    }

    public PatchPolarClawConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PatchPolarClawConfigResponseBody setRestarted(Boolean restarted) {
        this.restarted = restarted;
        return this;
    }
    public Boolean getRestarted() {
        return this.restarted;
    }

}
