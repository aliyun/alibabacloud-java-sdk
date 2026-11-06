// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSearchParametersRequest extends TeaModel {
    /**
     * <p>The ID of the PolarDB primary cluster, which is used to locate the Search cluster associated with the current account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-xxxxxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static DescribeSearchParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSearchParametersRequest self = new DescribeSearchParametersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSearchParametersRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
