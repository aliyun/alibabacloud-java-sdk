// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateHiveResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>hive-6c1418bf513e400bb697307c077a0ec3</p>
     */
    @NameInMap("HiveId")
    public String hiveId;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateHiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHiveResponseBody self = new CreateHiveResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHiveResponseBody setHiveId(String hiveId) {
        this.hiveId = hiveId;
        return this;
    }
    public String getHiveId() {
        return this.hiveId;
    }

    public CreateHiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
