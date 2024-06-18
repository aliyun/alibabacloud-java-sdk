// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHostGroupElasticStrategyParametersResponseBody extends TeaModel {
    /**
     * <p>The CPU utilization of the instance. Unit: percentage.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("CpuShar")
    public Integer cpuShar;

    /**
     * <p>The number of CPU cores used by the instance. Unit: cores.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("CpuZoom")
    public Integer cpuZoom;

    /**
     * <p>The number of I/O requests.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("IopsZoom")
    public Integer iopsZoom;

    /**
     * <p>The maximum number of concurrent connections supported by the instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxConnZoom")
    public Integer maxConnZoom;

    /**
     * <p>The total memory size of the instance in the dedicated cluster. Unit: MB.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MemoryZoom")
    public Integer memoryZoom;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>60F9A12A-16B8-4728-B099-4CA38D32C31C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHostGroupElasticStrategyParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostGroupElasticStrategyParametersResponseBody self = new DescribeHostGroupElasticStrategyParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHostGroupElasticStrategyParametersResponseBody setCpuShar(Integer cpuShar) {
        this.cpuShar = cpuShar;
        return this;
    }
    public Integer getCpuShar() {
        return this.cpuShar;
    }

    public DescribeHostGroupElasticStrategyParametersResponseBody setCpuZoom(Integer cpuZoom) {
        this.cpuZoom = cpuZoom;
        return this;
    }
    public Integer getCpuZoom() {
        return this.cpuZoom;
    }

    public DescribeHostGroupElasticStrategyParametersResponseBody setIopsZoom(Integer iopsZoom) {
        this.iopsZoom = iopsZoom;
        return this;
    }
    public Integer getIopsZoom() {
        return this.iopsZoom;
    }

    public DescribeHostGroupElasticStrategyParametersResponseBody setMaxConnZoom(Integer maxConnZoom) {
        this.maxConnZoom = maxConnZoom;
        return this;
    }
    public Integer getMaxConnZoom() {
        return this.maxConnZoom;
    }

    public DescribeHostGroupElasticStrategyParametersResponseBody setMemoryZoom(Integer memoryZoom) {
        this.memoryZoom = memoryZoom;
        return this;
    }
    public Integer getMemoryZoom() {
        return this.memoryZoom;
    }

    public DescribeHostGroupElasticStrategyParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
