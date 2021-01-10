// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeDeleteprojectkeyResponseBody extends TeaModel {
    @NameInMap("DeployKeyId")
    public Long deployKeyId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DeleteLinkeantcodeAntcodeDeleteprojectkeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeDeleteprojectkeyResponseBody self = new DeleteLinkeantcodeAntcodeDeleteprojectkeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeDeleteprojectkeyResponseBody setDeployKeyId(Long deployKeyId) {
        this.deployKeyId = deployKeyId;
        return this;
    }
    public Long getDeployKeyId() {
        return this.deployKeyId;
    }

    public DeleteLinkeantcodeAntcodeDeleteprojectkeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteLinkeantcodeAntcodeDeleteprojectkeyResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public DeleteLinkeantcodeAntcodeDeleteprojectkeyResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public DeleteLinkeantcodeAntcodeDeleteprojectkeyResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DeleteLinkeantcodeAntcodeDeleteprojectkeyResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteLinkeantcodeAntcodeDeleteprojectkeyResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteLinkeantcodeAntcodeDeleteprojectkeyResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public DeleteLinkeantcodeAntcodeDeleteprojectkeyResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
