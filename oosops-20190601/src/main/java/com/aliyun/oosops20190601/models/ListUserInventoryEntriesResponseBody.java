// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListUserInventoryEntriesResponseBody extends TeaModel {
    @NameInMap("CaptureTime")
    public String captureTime;

    @NameInMap("Entries")
    public java.util.List<java.util.Map<String, ?>> entries;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SchemaVersion")
    public String schemaVersion;

    @NameInMap("TypeName")
    public String typeName;

    public static ListUserInventoryEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserInventoryEntriesResponseBody self = new ListUserInventoryEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserInventoryEntriesResponseBody setCaptureTime(String captureTime) {
        this.captureTime = captureTime;
        return this;
    }
    public String getCaptureTime() {
        return this.captureTime;
    }

    public ListUserInventoryEntriesResponseBody setEntries(java.util.List<java.util.Map<String, ?>> entries) {
        this.entries = entries;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getEntries() {
        return this.entries;
    }

    public ListUserInventoryEntriesResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListUserInventoryEntriesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserInventoryEntriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserInventoryEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserInventoryEntriesResponseBody setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public ListUserInventoryEntriesResponseBody setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public String getTypeName() {
        return this.typeName;
    }

}
