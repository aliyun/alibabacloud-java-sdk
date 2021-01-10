// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskTemplateContrastResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ModelDataNodeCodes")
    public java.util.List<String> modelDataNodeCodes;

    @NameInMap("ModelRuleCodes")
    public java.util.List<String> modelRuleCodes;

    @NameInMap("TemplateDataNodeCodes")
    public java.util.List<String> templateDataNodeCodes;

    @NameInMap("TemplateRuleCodes")
    public java.util.List<String> templateRuleCodes;

    public static GetClriskTemplateContrastResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClriskTemplateContrastResponseBody self = new GetClriskTemplateContrastResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClriskTemplateContrastResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClriskTemplateContrastResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetClriskTemplateContrastResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetClriskTemplateContrastResponseBody setModelDataNodeCodes(java.util.List<String> modelDataNodeCodes) {
        this.modelDataNodeCodes = modelDataNodeCodes;
        return this;
    }
    public java.util.List<String> getModelDataNodeCodes() {
        return this.modelDataNodeCodes;
    }

    public GetClriskTemplateContrastResponseBody setModelRuleCodes(java.util.List<String> modelRuleCodes) {
        this.modelRuleCodes = modelRuleCodes;
        return this;
    }
    public java.util.List<String> getModelRuleCodes() {
        return this.modelRuleCodes;
    }

    public GetClriskTemplateContrastResponseBody setTemplateDataNodeCodes(java.util.List<String> templateDataNodeCodes) {
        this.templateDataNodeCodes = templateDataNodeCodes;
        return this;
    }
    public java.util.List<String> getTemplateDataNodeCodes() {
        return this.templateDataNodeCodes;
    }

    public GetClriskTemplateContrastResponseBody setTemplateRuleCodes(java.util.List<String> templateRuleCodes) {
        this.templateRuleCodes = templateRuleCodes;
        return this;
    }
    public java.util.List<String> getTemplateRuleCodes() {
        return this.templateRuleCodes;
    }

}
