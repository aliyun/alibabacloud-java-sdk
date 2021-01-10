// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPMetricsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MetricsQueryJsonStr")
    public String metricsQueryJsonStr;

    @NameInMap("MetricsType")
    public String metricsType;

    @NameInMap("ZdalproxyInstanceId")
    public String zdalproxyInstanceId;

    public static QueryODPMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryODPMetricsRequest self = new QueryODPMetricsRequest();
        return TeaModel.build(map, self);
    }

    public QueryODPMetricsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryODPMetricsRequest setMetricsQueryJsonStr(String metricsQueryJsonStr) {
        this.metricsQueryJsonStr = metricsQueryJsonStr;
        return this;
    }
    public String getMetricsQueryJsonStr() {
        return this.metricsQueryJsonStr;
    }

    public QueryODPMetricsRequest setMetricsType(String metricsType) {
        this.metricsType = metricsType;
        return this;
    }
    public String getMetricsType() {
        return this.metricsType;
    }

    public QueryODPMetricsRequest setZdalproxyInstanceId(String zdalproxyInstanceId) {
        this.zdalproxyInstanceId = zdalproxyInstanceId;
        return this;
    }
    public String getZdalproxyInstanceId() {
        return this.zdalproxyInstanceId;
    }

}
