// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDdrInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public String orderId;

    @NameInMap("ConnectionString")
    @Validation(required = true)
    public String connectionString;

    @NameInMap("Port")
    @Validation(required = true)
    public String port;

    public static CreateDdrInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDdrInstanceResponse self = new CreateDdrInstanceResponse();
        return TeaModel.build(map, self);
    }

}
