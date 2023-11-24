// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListDataSourceTableFieldsRequest extends TeaModel {
    /**
     * <p>The parameters of the data source. The value of the params parameter is a JSON string. The value must be URL-encoded.</p>
     * <br>
     * <p>Different types of data sources use different parameters. For more information, see the following sections of the "DataSource" topic:</p>
     * <br>
     * <p>*   [rds](~~170005~~)</p>
     * <p>*   [polardb](~~170005~~)</p>
     * <p>*   [odps](~~170005~~)</p>
     * <p>*   [mysql](~~173627~~)</p>
     * <p>*   [drds](~~173627~~)</p>
     */
    @NameInMap("params")
    public String params;

    /**
     * <p>Whether to return the original field type of the data source</p>
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
