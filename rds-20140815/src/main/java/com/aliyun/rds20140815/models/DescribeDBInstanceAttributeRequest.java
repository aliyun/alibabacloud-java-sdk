// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceAttributeRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("Expired")
    public String expired;

    public static DescribeDBInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceAttributeRequest self = new DescribeDBInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

}
