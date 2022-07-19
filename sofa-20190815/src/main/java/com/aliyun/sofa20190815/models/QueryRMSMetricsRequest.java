// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRMSMetricsRequest extends TeaModel {
    @NameInMap("ContentType")
    public String contentType;

    @NameInMap("DsId")
    public String dsId;

    @NameInMap("End")
    public Long end;

    @NameInMap("FieldsRepeatList")
    public java.util.List<String> fieldsRepeatList;

    @NameInMap("Plugin")
    public String plugin;

    @NameInMap("Start")
    public Long start;

    @NameInMap("Where")
    public java.util.List<QueryRMSMetricsRequestWhere> where;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static QueryRMSMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRMSMetricsRequest self = new QueryRMSMetricsRequest();
        return TeaModel.build(map, self);
    }

    public QueryRMSMetricsRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public QueryRMSMetricsRequest setDsId(String dsId) {
        this.dsId = dsId;
        return this;
    }
    public String getDsId() {
        return this.dsId;
    }

    public QueryRMSMetricsRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public QueryRMSMetricsRequest setFieldsRepeatList(java.util.List<String> fieldsRepeatList) {
        this.fieldsRepeatList = fieldsRepeatList;
        return this;
    }
    public java.util.List<String> getFieldsRepeatList() {
        return this.fieldsRepeatList;
    }

    public QueryRMSMetricsRequest setPlugin(String plugin) {
        this.plugin = plugin;
        return this;
    }
    public String getPlugin() {
        return this.plugin;
    }

    public QueryRMSMetricsRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public QueryRMSMetricsRequest setWhere(java.util.List<QueryRMSMetricsRequestWhere> where) {
        this.where = where;
        return this;
    }
    public java.util.List<QueryRMSMetricsRequestWhere> getWhere() {
        return this.where;
    }

    public QueryRMSMetricsRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static class QueryRMSMetricsRequestWhere extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryRMSMetricsRequestWhere build(java.util.Map<String, ?> map) throws Exception {
            QueryRMSMetricsRequestWhere self = new QueryRMSMetricsRequestWhere();
            return TeaModel.build(map, self);
        }

        public QueryRMSMetricsRequestWhere setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryRMSMetricsRequestWhere setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
