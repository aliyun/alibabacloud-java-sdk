// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListDataSourceTablesRequest extends TeaModel {
    /**
     * <p>The parameters for the data source. The value must be a URL-encoded JSON string.</p>
     * <p>The parameters vary based on the data source type. For more information, see:</p>
     * <ul>
     * <li><p><a href="https://help.aliyun.com/document_detail/170005.html">rds</a></p>
     * </li>
     * <li><p><a href="https://help.aliyun.com/document_detail/170005.html">polardb</a></p>
     * </li>
     * <li><p><a href="https://help.aliyun.com/document_detail/170005.html">odps</a></p>
     * </li>
     * <li><p><a href="https://help.aliyun.com/document_detail/173627.html">mysql</a></p>
     * </li>
     * <li><p><a href="https://help.aliyun.com/document_detail/173627.html">drds</a></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("params")
    public String params;

    public static ListDataSourceTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceTablesRequest self = new ListDataSourceTablesRequest();
        return TeaModel.build(map, self);
    }

    public ListDataSourceTablesRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
