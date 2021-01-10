// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportClriskTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ModelCodes")
    public java.util.List<String> modelCodes;

    public static ImportClriskTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportClriskTemplateResponseBody self = new ImportClriskTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportClriskTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportClriskTemplateResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportClriskTemplateResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ImportClriskTemplateResponseBody setModelCodes(java.util.List<String> modelCodes) {
        this.modelCodes = modelCodes;
        return this;
    }
    public java.util.List<String> getModelCodes() {
        return this.modelCodes;
    }

}
