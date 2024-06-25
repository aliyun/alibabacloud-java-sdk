// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class SetHdMonitorRegionConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>hdmonitor-cn-hangzhou-223794579283657556</p>
     */
    @NameInMap("LogProject")
    public String logProject;

    /**
     * <strong>example:</strong>
     * <p>hdmonitor-cn-hangzhou-metricStore-1</p>
     */
    @NameInMap("MetricStore")
    public String metricStore;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetHdMonitorRegionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetHdMonitorRegionConfigResponseBody self = new SetHdMonitorRegionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetHdMonitorRegionConfigResponseBody setLogProject(String logProject) {
        this.logProject = logProject;
        return this;
    }
    public String getLogProject() {
        return this.logProject;
    }

    public SetHdMonitorRegionConfigResponseBody setMetricStore(String metricStore) {
        this.metricStore = metricStore;
        return this;
    }
    public String getMetricStore() {
        return this.metricStore;
    }

    public SetHdMonitorRegionConfigResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetHdMonitorRegionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
