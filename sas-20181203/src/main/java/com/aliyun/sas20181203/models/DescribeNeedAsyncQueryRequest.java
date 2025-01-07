// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeNeedAsyncQueryRequest extends TeaModel {
    /**
     * <p>The type of the query. Valid values:</p>
     * <ul>
     * <li><strong>suspicious</strong>: alerts</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>suspicious</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeNeedAsyncQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNeedAsyncQueryRequest self = new DescribeNeedAsyncQueryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNeedAsyncQueryRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
