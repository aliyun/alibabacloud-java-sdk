// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetNodeMetricsRequest extends TeaModel {
    /**
     * <p>The end time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-07-10T10:17:06</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The GPU type. Valid values:</p>
     * <ul>
     * <li>V100</li>
     * <li>A100</li>
     * <li>A10</li>
     * <li>T4</li>
     * <li>P100</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>V100</p>
     */
    @NameInMap("GPUType")
    public String GPUType;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-07-08T02:23:30.292Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The time step. Default value: 5m. The supported time units are:</p>
     * <ul>
     * <li><p>h: hours.</p>
     * </li>
     * <li><p>m: minutes.</p>
     * </li>
     * <li><p>s: seconds.</p>
     * </li>
     * </ul>
     * <p>If the value does not contain a unit, the default unit is s (seconds).</p>
     * 
     * <strong>example:</strong>
     * <p>1h</p>
     */
    @NameInMap("TimeStep")
    public String timeStep;

    /**
     * <p>Specifies whether to display non-essential information. Non-essential information currently includes Labels.
     * Valid values:</p>
     * <p>false: does not display non-essential information (default value)
     * true: displays non-essential information</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Verbose")
    public Boolean verbose;

    public static GetNodeMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodeMetricsRequest self = new GetNodeMetricsRequest();
        return TeaModel.build(map, self);
    }

    public GetNodeMetricsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetNodeMetricsRequest setGPUType(String GPUType) {
        this.GPUType = GPUType;
        return this;
    }
    public String getGPUType() {
        return this.GPUType;
    }

    public GetNodeMetricsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetNodeMetricsRequest setTimeStep(String timeStep) {
        this.timeStep = timeStep;
        return this;
    }
    public String getTimeStep() {
        return this.timeStep;
    }

    public GetNodeMetricsRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

}
