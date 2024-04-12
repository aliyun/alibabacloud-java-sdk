// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListOperationDatabasesRequest extends TeaModel {
    @NameInMap("DatabaseAddress")
    public String databaseAddress;

    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("DatabaseType")
    public String databaseType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Source")
    public String source;

    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    @NameInMap("SourceInstanceState")
    public String sourceInstanceState;

    public static ListOperationDatabasesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOperationDatabasesRequest self = new ListOperationDatabasesRequest();
        return TeaModel.build(map, self);
    }

    public ListOperationDatabasesRequest setDatabaseAddress(String databaseAddress) {
        this.databaseAddress = databaseAddress;
        return this;
    }
    public String getDatabaseAddress() {
        return this.databaseAddress;
    }

    public ListOperationDatabasesRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public ListOperationDatabasesRequest setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
        return this;
    }
    public String getDatabaseType() {
        return this.databaseType;
    }

    public ListOperationDatabasesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListOperationDatabasesRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListOperationDatabasesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListOperationDatabasesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListOperationDatabasesRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListOperationDatabasesRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public ListOperationDatabasesRequest setSourceInstanceState(String sourceInstanceState) {
        this.sourceInstanceState = sourceInstanceState;
        return this;
    }
    public String getSourceInstanceState() {
        return this.sourceInstanceState;
    }

}
