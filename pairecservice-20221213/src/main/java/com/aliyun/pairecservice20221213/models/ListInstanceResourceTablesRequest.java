// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListInstanceResourceTablesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>jackal</p>
     */
    @NameInMap("MaxcomputeSchema")
    public String maxcomputeSchema;

    public static ListInstanceResourceTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceResourceTablesRequest self = new ListInstanceResourceTablesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceResourceTablesRequest setMaxcomputeSchema(String maxcomputeSchema) {
        this.maxcomputeSchema = maxcomputeSchema;
        return this;
    }
    public String getMaxcomputeSchema() {
        return this.maxcomputeSchema;
    }

}
