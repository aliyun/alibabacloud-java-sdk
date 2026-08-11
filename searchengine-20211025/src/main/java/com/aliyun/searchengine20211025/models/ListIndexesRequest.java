// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListIndexesRequest extends TeaModel {
    /**
     * <p>The ID of the data catalog for the Data Lake Formation (DLF) data source.</p>
     * 
     * <strong>example:</strong>
     * <p>clg-paimon-765e9e2d43ab4fccbf095853a661eafc</p>
     */
    @NameInMap("catalog")
    public String catalog;

    /**
     * <p>The database of the DLF data source.</p>
     * 
     * <strong>example:</strong>
     * <p>dlf_test</p>
     */
    @NameInMap("database")
    public String database;

    /**
     * <p>Specifies whether to use the new version of the console page.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("newMode")
    public Boolean newMode;

    /**
     * <p>The data table of the DLF data source.</p>
     * 
     * <strong>example:</strong>
     * <p>rag</p>
     */
    @NameInMap("table")
    public String table;

    public static ListIndexesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIndexesRequest self = new ListIndexesRequest();
        return TeaModel.build(map, self);
    }

    public ListIndexesRequest setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public ListIndexesRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public ListIndexesRequest setNewMode(Boolean newMode) {
        this.newMode = newMode;
        return this;
    }
    public Boolean getNewMode() {
        return this.newMode;
    }

    public ListIndexesRequest setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

}
