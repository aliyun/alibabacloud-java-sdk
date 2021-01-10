// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDWSMetadataTablesRequest extends TeaModel {
    @NameInMap("DbType")
    public String dbType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LogicTableArn")
    public String logicTableArn;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PageToken")
    public String pageToken;

    @NameInMap("TableName")
    public String tableName;

    public static QueryDWSMetadataTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDWSMetadataTablesRequest self = new QueryDWSMetadataTablesRequest();
        return TeaModel.build(map, self);
    }

    public QueryDWSMetadataTablesRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public QueryDWSMetadataTablesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryDWSMetadataTablesRequest setLogicTableArn(String logicTableArn) {
        this.logicTableArn = logicTableArn;
        return this;
    }
    public String getLogicTableArn() {
        return this.logicTableArn;
    }

    public QueryDWSMetadataTablesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDWSMetadataTablesRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public String getPageToken() {
        return this.pageToken;
    }

    public QueryDWSMetadataTablesRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
