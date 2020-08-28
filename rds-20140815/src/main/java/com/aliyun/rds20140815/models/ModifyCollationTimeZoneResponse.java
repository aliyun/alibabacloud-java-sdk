// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyCollationTimeZoneResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("Timezone")
    @Validation(required = true)
    public String timezone;

    @NameInMap("Collation")
    @Validation(required = true)
    public String collation;

    public static ModifyCollationTimeZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCollationTimeZoneResponse self = new ModifyCollationTimeZoneResponse();
        return TeaModel.build(map, self);
    }

}
