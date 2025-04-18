// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetIdleInstanceCullerResponseBody extends TeaModel {
    /**
     * <p>The status code. Valid values:</p>
     * <ul>
     * <li>InternalError: an internal error. All errors, except for parameter validation errors, are classified as internal errors.</li>
     * <li>ValidationError: a parameter validation error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ValidationError</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The CPU utilization threshold. Unit: percentage. Valid values: 1 to 100. If the CPU utilization of the instance is lower than this threshold, the instance is considered idle.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("CpuPercentThreshold")
    public Integer cpuPercentThreshold;

    /**
     * <p>The GPU utilization threshold. Unit: percentage. Valid values: 1 to 100. This parameter takes effect only if the instance is of the GPU instance type. If both CPU and GPU utilization is lower than the thresholds, the instance is considered idle.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("GpuPercentThreshold")
    public Integer gpuPercentThreshold;

    /**
     * <p>The time duration for which the instance is idle. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("IdleTimeInMinutes")
    public Integer idleTimeInMinutes;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dsw-730xxxxxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum time duration for which the instance is idle. Unit: minutes. If the time duration for which the instance is idle exceeds this value, the system automatically stops the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("MaxIdleTimeInMinutes")
    public Integer maxIdleTimeInMinutes;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;XXX&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E7D55162-4489-1619-AAF5-3F97D5FCA948</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
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
