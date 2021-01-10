// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddAKSDeploymentSidecarResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FormattedDeployTemplate")
    public String formattedDeployTemplate;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static AddAKSDeploymentSidecarResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAKSDeploymentSidecarResponseBody self = new AddAKSDeploymentSidecarResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAKSDeploymentSidecarResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddAKSDeploymentSidecarResponseBody setFormattedDeployTemplate(String formattedDeployTemplate) {
        this.formattedDeployTemplate = formattedDeployTemplate;
        return this;
    }
    public String getFormattedDeployTemplate() {
        return this.formattedDeployTemplate;
    }

    public AddAKSDeploymentSidecarResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddAKSDeploymentSidecarResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
