// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListAdvanceConfigsRequest extends TeaModel {
    /**
     * <p>The data source name.</p>
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
     * <p>Specifies whether to use the new version of the page.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("newMode")
    public Boolean newMode;

    /**
     * <p>The page number. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries to return on each page. The default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>The type of the advanced configuration. Valid values:
     * \- online
     * \- offline (default)</p>
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

    public ListAdvanceConfigsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListAdvanceConfigsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListAdvanceConfigsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
