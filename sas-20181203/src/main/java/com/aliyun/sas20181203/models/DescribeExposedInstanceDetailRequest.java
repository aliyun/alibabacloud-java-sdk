// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedInstanceDetailRequest extends TeaModel {
    /**
     * <p>The server group to which the server belongs.</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribeExposedInstanceDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedInstanceDetailRequest self = new DescribeExposedInstanceDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExposedInstanceDetailRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
