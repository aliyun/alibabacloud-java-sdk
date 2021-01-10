// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCASSlsLogRequest extends TeaModel {
    @NameInMap("From")
    public Long from;

    @NameInMap("Line")
    public Long line;

    @NameInMap("LogstoreName")
    public String logstoreName;

    @NameInMap("Offset")
    public Long offset;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Query")
    public String query;

    @NameInMap("Reverse")
    public Boolean reverse;

    @NameInMap("SlsRegionId")
    public String slsRegionId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("To")
    public Long to;

    @NameInMap("Topic")
    public String topic;

    @NameInMap("Type")
    public String type;

    public static QueryCASSlsLogRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCASSlsLogRequest self = new QueryCASSlsLogRequest();
        return TeaModel.build(map, self);
    }

    public QueryCASSlsLogRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public QueryCASSlsLogRequest setLine(Long line) {
        this.line = line;
        return this;
    }
    public Long getLine() {
        return this.line;
    }

    public QueryCASSlsLogRequest setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public QueryCASSlsLogRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public QueryCASSlsLogRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public QueryCASSlsLogRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public QueryCASSlsLogRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public QueryCASSlsLogRequest setSlsRegionId(String slsRegionId) {
        this.slsRegionId = slsRegionId;
        return this;
    }
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    public QueryCASSlsLogRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryCASSlsLogRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

    public QueryCASSlsLogRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public QueryCASSlsLogRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
