// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportMsGuardianRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ImportResult")
    public String importResult;

    public static ImportMsGuardianRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportMsGuardianRulesResponseBody self = new ImportMsGuardianRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportMsGuardianRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportMsGuardianRulesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportMsGuardianRulesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ImportMsGuardianRulesResponseBody setImportResult(String importResult) {
        this.importResult = importResult;
        return this;
    }
    public String getImportResult() {
        return this.importResult;
    }

}
