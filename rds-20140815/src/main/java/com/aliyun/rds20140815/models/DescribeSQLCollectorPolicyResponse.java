// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLCollectorPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SQLCollectorStatus")
    @Validation(required = true)
    public String SQLCollectorStatus;

    @NameInMap("StoragePeriod")
    @Validation(required = true)
    public Integer storagePeriod;

    public static DescribeSQLCollectorPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLCollectorPolicyResponse self = new DescribeSQLCollectorPolicyResponse();
        return TeaModel.build(map, self);
    }

}
