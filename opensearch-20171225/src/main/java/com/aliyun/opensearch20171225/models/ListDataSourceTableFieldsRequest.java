// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListDataSourceTableFieldsRequest extends TeaModel {
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
     * <p>{}</p>
     */
    @NameInMap("params")
    public String params;

    /**
     * <p>Specifies whether to return the original field types of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("rawType")
    public Boolean rawType;

    public static ListDataSourceTableFieldsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceTableFieldsRequest self = new ListDataSourceTableFieldsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataSourceTableFieldsRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public ListDataSourceTableFieldsRequest setRawType(Boolean rawType) {
        this.rawType = rawType;
        return this;
    }
    public Boolean getRawType() {
        return this.rawType;
    }

}
