// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20210325.models;

import com.aliyun.tea.*;

public class DeleteSignatureResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    public static DeleteSignatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSignatureResponseBody self = new DeleteSignatureResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSignatureResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteSignatureResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DeleteSignatureResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
