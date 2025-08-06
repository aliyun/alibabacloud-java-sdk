// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetCustomerConfigResponseBody extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AuditConfig")
    public String auditConfig;

    @NameInMap("DownloadSwitch")
    public String downloadSwitch;

    @NameInMap("MetricConfig")
    public String metricConfig;

    @NameInMap("RequestId")
    public String requestId;

    public static GetCustomerConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerConfigResponseBody self = new GetCustomerConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomerConfigResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetCustomerConfigResponseBody setAuditConfig(String auditConfig) {
        this.auditConfig = auditConfig;
        return this;
    }
    public String getAuditConfig() {
        return this.auditConfig;
    }

    public GetCustomerConfigResponseBody setDownloadSwitch(String downloadSwitch) {
        this.downloadSwitch = downloadSwitch;
        return this;
    }
    public String getDownloadSwitch() {
        return this.downloadSwitch;
    }

    public GetCustomerConfigResponseBody setMetricConfig(String metricConfig) {
        this.metricConfig = metricConfig;
        return this;
    }
    public String getMetricConfig() {
        return this.metricConfig;
    }

    public GetCustomerConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
