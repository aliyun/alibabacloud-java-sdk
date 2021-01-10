// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDSTBizLogsRequest extends TeaModel {
    @NameInMap("BizLogConfigId")
    public Long bizLogConfigId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LogType")
    public String logType;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SpanId")
    public String spanId;

    @NameInMap("TraceId")
    public String traceId;

    public static ListDSTBizLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDSTBizLogsRequest self = new ListDSTBizLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListDSTBizLogsRequest setBizLogConfigId(Long bizLogConfigId) {
        this.bizLogConfigId = bizLogConfigId;
        return this;
    }
    public Long getBizLogConfigId() {
        return this.bizLogConfigId;
    }

    public ListDSTBizLogsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDSTBizLogsRequest setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

    public ListDSTBizLogsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDSTBizLogsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDSTBizLogsRequest setSpanId(String spanId) {
        this.spanId = spanId;
        return this;
    }
    public String getSpanId() {
        return this.spanId;
    }

    public ListDSTBizLogsRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
