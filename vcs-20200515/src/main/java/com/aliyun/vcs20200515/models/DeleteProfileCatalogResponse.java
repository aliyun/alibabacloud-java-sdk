// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteProfileCatalogResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public Boolean data;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteProfileCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProfileCatalogResponse self = new DeleteProfileCatalogResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProfileCatalogResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteProfileCatalogResponse setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteProfileCatalogResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteProfileCatalogResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
