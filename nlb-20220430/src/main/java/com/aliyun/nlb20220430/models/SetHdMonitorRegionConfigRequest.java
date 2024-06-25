// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class SetHdMonitorRegionConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hdmonitor-cn-hangzhou-223794579283657556</p>
     */
    @NameInMap("LogProject")
    public String logProject;

    /**
     * <p>This parameter is required.</p>
     * 
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

    public static SetHdMonitorRegionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetHdMonitorRegionConfigRequest self = new SetHdMonitorRegionConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetHdMonitorRegionConfigRequest setLogProject(String logProject) {
        this.logProject = logProject;
        return this;
    }
    public String getLogProject() {
        return this.logProject;
    }

    public SetHdMonitorRegionConfigRequest setMetricStore(String metricStore) {
        this.metricStore = metricStore;
        return this;
    }
    public String getMetricStore() {
        return this.metricStore;
    }

    public SetHdMonitorRegionConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
