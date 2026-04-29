// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RemoveApplicationEnvironmentVariablesResponseBody extends TeaModel {
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
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RemovedCount")
    public Integer removedCount;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
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
     * <p>0</p>
     */
    @NameInMap("TotalVariables")
    public Integer totalVariables;

    public static RemoveApplicationEnvironmentVariablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveApplicationEnvironmentVariablesResponseBody self = new RemoveApplicationEnvironmentVariablesResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveApplicationEnvironmentVariablesResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public RemoveApplicationEnvironmentVariablesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public RemoveApplicationEnvironmentVariablesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RemoveApplicationEnvironmentVariablesResponseBody setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }
    public Boolean getOk() {
        return this.ok;
    }

    public RemoveApplicationEnvironmentVariablesResponseBody setRemovedCount(Integer removedCount) {
        this.removedCount = removedCount;
        return this;
    }
    public Integer getRemovedCount() {
        return this.removedCount;
    }

    public RemoveApplicationEnvironmentVariablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveApplicationEnvironmentVariablesResponseBody setRestarted(Boolean restarted) {
        this.restarted = restarted;
        return this;
    }
    public Boolean getRestarted() {
        return this.restarted;
    }

    public RemoveApplicationEnvironmentVariablesResponseBody setTotalVariables(Integer totalVariables) {
        this.totalVariables = totalVariables;
        return this;
    }
    public Integer getTotalVariables() {
        return this.totalVariables;
    }

}
