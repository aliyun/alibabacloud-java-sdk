// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListAdvanceConfigsRequest extends TeaModel {
    /**
     * <p>The name of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>ha-cn-pl32rf0****_test_api</p>
     */
    @NameInMap("dataSourceName")
    public String dataSourceName;

    /**
     * <p>The index name.</p>
     * 
     * <strong>example:</strong>
     * <p>test_api</p>
     */
    @NameInMap("indexName")
    public String indexName;

    /**
     * <p>Specifies whether the OpenSearch Vector Search Edition instance is of the new version.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("newMode")
    public Boolean newMode;

    /**
     * <p>The type of advanced configurations that you want to query. Valid values: - online -offline (default)</p>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("type")
    public String type;

    public static ListAdvanceConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAdvanceConfigsRequest self = new ListAdvanceConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListAdvanceConfigsRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public ListAdvanceConfigsRequest setIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }
    public String getIndexName() {
        return this.indexName;
    }

    public ListAdvanceConfigsRequest setNewMode(Boolean newMode) {
        this.newMode = newMode;
        return this;
    }
    public Boolean getNewMode() {
        return this.newMode;
    }

    public ListAdvanceConfigsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
