// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeComputeBurstConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;cpuEnlargeThreshold&quot;: &quot;60&quot;,
     *     &quot;memoryEnlargeThreshold&quot;: &quot;60&quot;,
     *     &quot;scaleMaxMemory&quot;: &quot;4&quot;,
     *     &quot;memoryShrinkThreshold&quot;: &quot;50&quot;,
     *     &quot;scaleMaxCpus&quot;: &quot;2&quot;,
     *     &quot;cpuShrinkThreshold&quot;: &quot;30&quot;
     *   }</p>
     */
    @NameInMap("ComputeBurstConfig")
    public java.util.Map<String, ?> computeBurstConfig;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ComputeBurstEnabled")
    public Boolean computeBurstEnabled;

    /**
     * <strong>example:</strong>
     * <p>847BA085-B377-4BFA-8267-F82345ECE1D2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeComputeBurstConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComputeBurstConfigResponseBody self = new DescribeComputeBurstConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComputeBurstConfigResponseBody setComputeBurstConfig(java.util.Map<String, ?> computeBurstConfig) {
        this.computeBurstConfig = computeBurstConfig;
        return this;
    }
    public java.util.Map<String, ?> getComputeBurstConfig() {
        return this.computeBurstConfig;
    }

    public DescribeComputeBurstConfigResponseBody setComputeBurstEnabled(Boolean computeBurstEnabled) {
        this.computeBurstEnabled = computeBurstEnabled;
        return this;
    }
    public Boolean getComputeBurstEnabled() {
        return this.computeBurstEnabled;
    }

    public DescribeComputeBurstConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
