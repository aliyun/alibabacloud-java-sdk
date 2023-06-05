// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddAiotPersonTableItemsForTablesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddAiotPersonTableItemsForTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAiotPersonTableItemsForTablesResponseBody self = new AddAiotPersonTableItemsForTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAiotPersonTableItemsForTablesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddAiotPersonTableItemsForTablesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddAiotPersonTableItemsForTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
