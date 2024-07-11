// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListInventoryEntriesResponseBody extends TeaModel {
    /**
     * <p>The time when the request was sent.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-09-17T12:28:13Z</p>
     */
    @NameInMap("CaptureTime")
    public String captureTime;

    /**
     * <p>The configurations of the component.</p>
     */
    @NameInMap("Entries")
    public java.util.List<java.util.Map<String, ?>> entries;

    /**
     * <p>The ID of the ECS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1cpoxxxwxxxxxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>gAAAAABfTgv5ewUWmNdJ3g7JVLvX70sPH90GZOVGC</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A81E4B2E-6B33-4BAE-9856-55DB7C893E01</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The version number of the component.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("SchemaVersion")
    public String schemaVersion;

    /**
     * <p>The name of the component.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS:InstanceInformation</p>
     */
    @NameInMap("TypeName")
    public String typeName;

    public static ListInventoryEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInventoryEntriesResponseBody self = new ListInventoryEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInventoryEntriesResponseBody setCaptureTime(String captureTime) {
        this.captureTime = captureTime;
        return this;
    }
    public String getCaptureTime() {
        return this.captureTime;
    }

    public ListInventoryEntriesResponseBody setEntries(java.util.List<java.util.Map<String, ?>> entries) {
        this.entries = entries;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getEntries() {
        return this.entries;
    }

    public ListInventoryEntriesResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInventoryEntriesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
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

    public ListInventoryEntriesResponseBody setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public String getTypeName() {
        return this.typeName;
    }

}
