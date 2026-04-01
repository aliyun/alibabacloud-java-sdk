// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDatabaseConfigResponseBody extends TeaModel {
    /**
     * <p>The code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8B993DA9-5272-5414-94E3-4CA8BA0146C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDatabaseConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseConfigResponseBody self = new ModifyDatabaseConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyDatabaseConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyDatabaseConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
