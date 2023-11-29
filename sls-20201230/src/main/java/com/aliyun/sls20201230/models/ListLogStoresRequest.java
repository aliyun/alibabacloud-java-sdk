// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListLogStoresRequest extends TeaModel {
    /**
     * <p>The name of the Logstore. Fuzzy match is supported. For example, if you enter test, Logstores whose name contains test are returned.</p>
     */
    @NameInMap("logstoreName")
    public String logstoreName;

    /**
     * <p>The type of the Logstore. Valid values: standard and query.</p>
     * <br>
     * <p>*   **standard**: Standard Logstore. This type of Logstore supports the log analysis feature and is suitable for scenarios such as real-time monitoring and interactive analysis. You can also use this type of Logstore to build a comprehensive observability system.</p>
     * <p>*   **query**: Query Logstore. This type of Logstore supports high-performance queries. The index traffic fee of a Query Logstore is approximately half that of a Standard Logstore. Query Logstores do not support SQL analysis. Query Logstores are suitable for scenarios in which the volume of data is large, the log retention period is long, or log analysis is not required. Log retention periods of weeks or months are considered long.</p>
     */
    @NameInMap("mode")
    public String mode;

    /**
     * <p>The line from which the query starts. Default value: 0.</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <p>The number of entries per page. Maximum value: 500. Default value: 500.</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>The type of the data that you want to query. Valid values:</p>
     * <br>
     * <p>*   None: logs</p>
     * <p>*   Metrics: metrics</p>
     */
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

    public ListLogStoresRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
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
