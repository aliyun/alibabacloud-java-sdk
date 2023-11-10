// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHostGroupElasticStrategyParametersResponseBody extends TeaModel {
    /**
     * <p>The CPU utilization of the instance. Unit: percentage.</p>
     */
    @NameInMap("CpuShar")
    public Integer cpuShar;

    /**
     * <p>The number of CPU cores used by the instance. Unit: cores.</p>
     */
    @NameInMap("CpuZoom")
    public Integer cpuZoom;

    /**
     * <p>The number of I/O requests.</p>
     */
    @NameInMap("IopsZoom")
    public Integer iopsZoom;

    /**
     * <p>The maximum number of concurrent connections supported by the instance type.</p>
     */
    @NameInMap("MaxConnZoom")
    public Integer maxConnZoom;

    /**
     * <p>The total memory size of the instance in the dedicated cluster. Unit: MB.</p>
     */
    @NameInMap("MemoryZoom")
    public Integer memoryZoom;

    /**
     * <p>The request ID.</p>
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
