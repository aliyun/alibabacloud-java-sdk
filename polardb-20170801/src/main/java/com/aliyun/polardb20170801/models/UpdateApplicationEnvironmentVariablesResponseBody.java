// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdateApplicationEnvironmentVariablesResponseBody extends TeaModel {
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

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6A2EE5B4-CC9F-46E1-A747-E43BC9******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Restarted")
    public Boolean restarted;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalVariables")
    public Integer totalVariables;

    @NameInMap("UpdatedKeys")
    public java.util.List<String> updatedKeys;

    public static UpdateApplicationEnvironmentVariablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationEnvironmentVariablesResponseBody self = new UpdateApplicationEnvironmentVariablesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationEnvironmentVariablesResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdateApplicationEnvironmentVariablesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateApplicationEnvironmentVariablesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateApplicationEnvironmentVariablesResponseBody setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }
    public Boolean getOk() {
        return this.ok;
    }

    public UpdateApplicationEnvironmentVariablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateApplicationEnvironmentVariablesResponseBody setRestarted(Boolean restarted) {
        this.restarted = restarted;
        return this;
    }
    public Boolean getRestarted() {
        return this.restarted;
    }

    public UpdateApplicationEnvironmentVariablesResponseBody setTotalVariables(Integer totalVariables) {
        this.totalVariables = totalVariables;
        return this;
    }
    public Integer getTotalVariables() {
        return this.totalVariables;
    }

    public UpdateApplicationEnvironmentVariablesResponseBody setUpdatedKeys(java.util.List<String> updatedKeys) {
        this.updatedKeys = updatedKeys;
        return this;
    }
    public java.util.List<String> getUpdatedKeys() {
        return this.updatedKeys;
    }

}
