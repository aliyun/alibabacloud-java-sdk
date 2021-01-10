// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCasDatabaseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("DatabaseSequences")
    public java.util.List<String> databaseSequences;

    public static CreateCasDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCasDatabaseResponseBody self = new CreateCasDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCasDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCasDatabaseResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateCasDatabaseResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateCasDatabaseResponseBody setDatabaseSequences(java.util.List<String> databaseSequences) {
        this.databaseSequences = databaseSequences;
        return this;
    }
    public java.util.List<String> getDatabaseSequences() {
        return this.databaseSequences;
    }

}
