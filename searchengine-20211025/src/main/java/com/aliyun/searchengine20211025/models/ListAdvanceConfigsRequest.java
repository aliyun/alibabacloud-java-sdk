// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListAdvanceConfigsRequest extends TeaModel {
    @NameInMap("dataSourceName")
    public String dataSourceName;

    @NameInMap("indexName")
    public String indexName;

    @NameInMap("newMode")
    public Boolean newMode;

    /**
     * <p>The type of the advanced configurations. Valid values: online and offline. - online The default value is offline.</p>
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
