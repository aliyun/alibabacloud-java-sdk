// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListLogStoresRequest extends TeaModel {
    @NameInMap("logstoreName")
    public String logstoreName;

    @NameInMap("offset")
    public Integer offset;

    @NameInMap("size")
    public Integer size;

    @NameInMap("telemetryType")
    public String telemetryType;

    public static ListLogStoresRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLogStoresRequest self = new ListLogStoresRequest();
        return TeaModel.build(map, self);
    }

    public ListLogStoresRequest setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public ListLogStoresRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListLogStoresRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListLogStoresRequest setTelemetryType(String telemetryType) {
        this.telemetryType = telemetryType;
        return this;
    }
    public String getTelemetryType() {
        return this.telemetryType;
    }

}
