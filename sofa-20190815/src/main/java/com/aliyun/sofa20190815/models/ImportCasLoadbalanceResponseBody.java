// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportCasLoadbalanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("LoadbalanceIdMapping")
    public String loadbalanceIdMapping;

    public static ImportCasLoadbalanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportCasLoadbalanceResponseBody self = new ImportCasLoadbalanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportCasLoadbalanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportCasLoadbalanceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportCasLoadbalanceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ImportCasLoadbalanceResponseBody setLoadbalanceIdMapping(String loadbalanceIdMapping) {
        this.loadbalanceIdMapping = loadbalanceIdMapping;
        return this;
    }
    public String getLoadbalanceIdMapping() {
        return this.loadbalanceIdMapping;
    }

}
