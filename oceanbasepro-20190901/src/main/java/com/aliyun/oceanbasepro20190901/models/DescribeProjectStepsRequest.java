// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeProjectStepsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public String id;

    public static DescribeProjectStepsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectStepsRequest self = new DescribeProjectStepsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProjectStepsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
