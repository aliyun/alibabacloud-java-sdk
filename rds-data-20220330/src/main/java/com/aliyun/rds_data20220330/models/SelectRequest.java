// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class SelectRequest extends TeaModel {
    @NameInMap("Database")
    public String database;

    @NameInMap("Filter")
    public java.util.Map<String, Selector> filter;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResourceArn")
    public String resourceArn;

    @NameInMap("SecretArn")
    public String secretArn;

    @NameInMap("Table")
    public String table;

    @NameInMap("TransactionId")
    public String transactionId;

    public static SelectRequest build(java.util.Map<String, ?> map) throws Exception {
        SelectRequest self = new SelectRequest();
        return TeaModel.build(map, self);
    }

    public SelectRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public SelectRequest setFilter(java.util.Map<String, Selector> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.Map<String, Selector> getFilter() {
        return this.filter;
    }

    public SelectRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public SelectRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SelectRequest setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public SelectRequest setSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }
    public String getSecretArn() {
        return this.secretArn;
    }

    public SelectRequest setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

    public SelectRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
