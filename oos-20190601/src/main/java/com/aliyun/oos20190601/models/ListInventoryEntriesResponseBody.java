// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListInventoryEntriesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SchemaVersion")
    public String schemaVersion;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("CaptureTime")
    public String captureTime;

    @NameInMap("TypeName")
    public String typeName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Entries")
    public java.util.List<java.util.Map<String, ?>> entries;

    public static ListInventoryEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInventoryEntriesResponseBody self = new ListInventoryEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInventoryEntriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInventoryEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInventoryEntriesResponseBody setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public ListInventoryEntriesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInventoryEntriesResponseBody setCaptureTime(String captureTime) {
        this.captureTime = captureTime;
        return this;
    }
    public String getCaptureTime() {
        return this.captureTime;
    }

    public ListInventoryEntriesResponseBody setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public String getTypeName() {
        return this.typeName;
    }

    public ListInventoryEntriesResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInventoryEntriesResponseBody setEntries(java.util.List<java.util.Map<String, ?>> entries) {
        this.entries = entries;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getEntries() {
        return this.entries;
    }

}
