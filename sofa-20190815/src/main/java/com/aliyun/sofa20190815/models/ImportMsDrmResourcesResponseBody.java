// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportMsDrmResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ImportResult")
    public String importResult;

    public static ImportMsDrmResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportMsDrmResourcesResponseBody self = new ImportMsDrmResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportMsDrmResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportMsDrmResourcesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportMsDrmResourcesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ImportMsDrmResourcesResponseBody setImportResult(String importResult) {
        this.importResult = importResult;
        return this;
    }
    public String getImportResult() {
        return this.importResult;
    }

}
