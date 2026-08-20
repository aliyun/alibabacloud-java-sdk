// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetInstanceExpireTimeResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Indicates whether a standard package instance is found.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("found")
    public Boolean found;

    /**
     * <p>The expiration time of the instance in ISO format.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-10-01T12:00:00Z</p>
     */
    @NameInMap("instanceExpireTime")
    public String instanceExpireTime;

    /**
     * <p>The instance ID. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleInstanceId</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The instance status. Valid values:</p>
     * <ul>
     * <li>RUNNING: Running.</li>
     * <li>TERMINATED: Terminated.</li>
     * <li>COMPLETED: Completed.</li>
     * <li>ERROR: Error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("instanceStatus")
    public String instanceStatus;

    /**
     * <p>The prompt message.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The effective tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public Long tenantId;

    public static GetInstanceExpireTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceExpireTimeResponseBody self = new GetInstanceExpireTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceExpireTimeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceExpireTimeResponseBody setFound(Boolean found) {
        this.found = found;
        return this;
    }
    public Boolean getFound() {
        return this.found;
    }

    public GetInstanceExpireTimeResponseBody setInstanceExpireTime(String instanceExpireTime) {
        this.instanceExpireTime = instanceExpireTime;
        return this;
    }
    public String getInstanceExpireTime() {
        return this.instanceExpireTime;
    }

    public GetInstanceExpireTimeResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceExpireTimeResponseBody setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public GetInstanceExpireTimeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceExpireTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceExpireTimeResponseBody setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
