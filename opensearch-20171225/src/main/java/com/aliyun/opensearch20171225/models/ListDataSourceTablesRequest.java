// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListDataSourceTablesRequest extends TeaModel {
    /**
     * <p>The parameters of the data source. The value is a JSON string which must be encoded in the urlencode format.</p>
     * <p>Different types of data sources use different parameters. For more information, see the following sections of the &quot;DataSource&quot; topic:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/170005.html">rds</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/170005.html">polardb</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/170005.html">odps</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/173627.html">mysql</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/173627.html">drds</a></li>
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
