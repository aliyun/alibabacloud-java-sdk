// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGraph4InvestigationOnlineRequest extends TeaModel {
    @NameInMap("AnomalyId")
    public String anomalyId;

    @NameInMap("AnomalyUuid")
    public String anomalyUuid;

    @NameInMap("Direction")
    public String direction;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PathLength")
    public Integer pathLength;

    @NameInMap("VertexId")
    public String vertexId;

    public static DescribeGraph4InvestigationOnlineRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGraph4InvestigationOnlineRequest self = new DescribeGraph4InvestigationOnlineRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGraph4InvestigationOnlineRequest setAnomalyId(String anomalyId) {
        this.anomalyId = anomalyId;
        return this;
    }
    public String getAnomalyId() {
        return this.anomalyId;
    }

    public DescribeGraph4InvestigationOnlineRequest setAnomalyUuid(String anomalyUuid) {
        this.anomalyUuid = anomalyUuid;
        return this;
    }
    public String getAnomalyUuid() {
        return this.anomalyUuid;
    }

    public DescribeGraph4InvestigationOnlineRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeGraph4InvestigationOnlineRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGraph4InvestigationOnlineRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeGraph4InvestigationOnlineRequest setPathLength(Integer pathLength) {
        this.pathLength = pathLength;
        return this;
    }
    public Integer getPathLength() {
        return this.pathLength;
    }

    public DescribeGraph4InvestigationOnlineRequest setVertexId(String vertexId) {
        this.vertexId = vertexId;
        return this;
    }
    public String getVertexId() {
        return this.vertexId;
    }

}
