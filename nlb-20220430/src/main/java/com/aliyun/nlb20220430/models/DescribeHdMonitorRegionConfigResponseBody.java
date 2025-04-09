// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class DescribeHdMonitorRegionConfigResponseBody extends TeaModel {
    /**
     * <p>The name of the Log Service project.</p>
     * 
     * <strong>example:</strong>
     * <p>hdmonitor-cn-hangzhou-223794579283657556</p>
     */
    @NameInMap("LogProject")
    public String logProject;

    /**
     * <p>The name of the Metricstore in Simple Log Service.</p>
     * 
     * <strong>example:</strong>
     * <p>hdmonitor-cn-hangzhou-metricStore-1</p>
     */
    @NameInMap("MetricStore")
    public String metricStore;

    /**
     * <p>The region ID of the NLB instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to obtain the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>54B48E3D-DF70-471B-AA93-08E683A1B45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHdMonitorRegionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHdMonitorRegionConfigResponseBody self = new DescribeHdMonitorRegionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHdMonitorRegionConfigResponseBody setLogProject(String logProject) {
        this.logProject = logProject;
        return this;
    }
    public String getLogProject() {
        return this.logProject;
    }

    public DescribeHdMonitorRegionConfigResponseBody setMetricStore(String metricStore) {
        this.metricStore = metricStore;
        return this;
    }
    public String getMetricStore() {
        return this.metricStore;
    }

    public DescribeHdMonitorRegionConfigResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeHdMonitorRegionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
