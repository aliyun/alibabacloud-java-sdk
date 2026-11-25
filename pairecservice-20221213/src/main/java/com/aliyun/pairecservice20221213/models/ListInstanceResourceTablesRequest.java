// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListInstanceResourceTablesRequest extends TeaModel {
    /**
     * <p>The MaxCompute schema.</p>
     * 
     * <strong>example:</strong>
     * <p>jackal</p>
     */
    @NameInMap("MaxcomputeSchema")
    public String maxcomputeSchema;

    /**
     * <p>The table type.</p>
     * 
     * <strong>example:</strong>
     * <p>ManagedTable</p>
     */
    @NameInMap("TableType")
    public String tableType;

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

    public ListInstanceResourceTablesRequest setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }
    public String getTableType() {
        return this.tableType;
    }

}
