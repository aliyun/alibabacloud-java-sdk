// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListDataSourceTableFieldsRequest extends TeaModel {
    /**
     * <p>The parameters of the data source. The value of the params parameter is a JSON string. The value must be URL-encoded.</p>
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
