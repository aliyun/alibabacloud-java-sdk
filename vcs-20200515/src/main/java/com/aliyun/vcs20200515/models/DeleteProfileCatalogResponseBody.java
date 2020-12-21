// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteProfileCatalogResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public Boolean data;

    @NameInMap("Code")
    public String code;

    public static DeleteProfileCatalogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProfileCatalogResponseBody self = new DeleteProfileCatalogResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProfileCatalogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteProfileCatalogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteProfileCatalogResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteProfileCatalogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
