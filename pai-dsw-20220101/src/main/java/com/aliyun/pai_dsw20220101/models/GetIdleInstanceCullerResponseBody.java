// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetIdleInstanceCullerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ValidationError</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("CpuPercentThreshold")
    public Integer cpuPercentThreshold;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("GpuPercentThreshold")
    public Integer gpuPercentThreshold;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("IdleTimeInMinutes")
    public Integer idleTimeInMinutes;

    /**
     * <strong>example:</strong>
     * <p>dsw-730xxxxxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("MaxIdleTimeInMinutes")
    public Integer maxIdleTimeInMinutes;

    /**
     * <strong>example:</strong>
     * <p>&quot;XXX&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>E7D55162-4489-1619-AAF5-3F97D5FCA948</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetIdleInstanceCullerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIdleInstanceCullerResponseBody self = new GetIdleInstanceCullerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIdleInstanceCullerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetIdleInstanceCullerResponseBody setCpuPercentThreshold(Integer cpuPercentThreshold) {
        this.cpuPercentThreshold = cpuPercentThreshold;
        return this;
    }
    public Integer getCpuPercentThreshold() {
        return this.cpuPercentThreshold;
    }

    public GetIdleInstanceCullerResponseBody setGpuPercentThreshold(Integer gpuPercentThreshold) {
        this.gpuPercentThreshold = gpuPercentThreshold;
        return this;
    }
    public Integer getGpuPercentThreshold() {
        return this.gpuPercentThreshold;
    }

    public GetIdleInstanceCullerResponseBody setIdleTimeInMinutes(Integer idleTimeInMinutes) {
        this.idleTimeInMinutes = idleTimeInMinutes;
        return this;
    }
    public Integer getIdleTimeInMinutes() {
        return this.idleTimeInMinutes;
    }

    public GetIdleInstanceCullerResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetIdleInstanceCullerResponseBody setMaxIdleTimeInMinutes(Integer maxIdleTimeInMinutes) {
        this.maxIdleTimeInMinutes = maxIdleTimeInMinutes;
        return this;
    }
    public Integer getMaxIdleTimeInMinutes() {
        return this.maxIdleTimeInMinutes;
    }

    public GetIdleInstanceCullerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetIdleInstanceCullerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIdleInstanceCullerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
