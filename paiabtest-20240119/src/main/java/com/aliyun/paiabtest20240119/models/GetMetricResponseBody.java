// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class GetMetricResponseBody extends TeaModel {
    @NameInMap("Definition")
    public String definition;

    @NameInMap("Description")
    public String description;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("MetricGroupId")
    public String metricGroupId;

    @NameInMap("MetricId")
    public String metricId;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SourceTableMetaId")
    public String sourceTableMetaId;

    @NameInMap("SourceTableMetaName")
    public String sourceTableMetaName;

    public static GetMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetricResponseBody self = new GetMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetricResponseBody setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public GetMetricResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetMetricResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetMetricResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetMetricResponseBody setMetricGroupId(String metricGroupId) {
        this.metricGroupId = metricGroupId;
        return this;
    }
    public String getMetricGroupId() {
        return this.metricGroupId;
    }

    public GetMetricResponseBody setMetricId(String metricId) {
        this.metricId = metricId;
        return this;
    }
    public String getMetricId() {
        return this.metricId;
    }

    public GetMetricResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetricResponseBody setSourceTableMetaId(String sourceTableMetaId) {
        this.sourceTableMetaId = sourceTableMetaId;
        return this;
    }
    public String getSourceTableMetaId() {
        return this.sourceTableMetaId;
    }

    public GetMetricResponseBody setSourceTableMetaName(String sourceTableMetaName) {
        this.sourceTableMetaName = sourceTableMetaName;
        return this;
    }
    public String getSourceTableMetaName() {
        return this.sourceTableMetaName;
    }

}
