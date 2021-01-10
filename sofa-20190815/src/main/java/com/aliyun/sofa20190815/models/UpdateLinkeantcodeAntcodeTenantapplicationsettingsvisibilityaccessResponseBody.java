// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ProjectVisibilityLevel")
    public Long projectVisibilityLevel;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("RestrictedVisibilityLevels")
    public java.util.List<Long> restrictedVisibilityLevels;

    public static UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponseBody self = new UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponseBody setProjectVisibilityLevel(Long projectVisibilityLevel) {
        this.projectVisibilityLevel = projectVisibilityLevel;
        return this;
    }
    public Long getProjectVisibilityLevel() {
        return this.projectVisibilityLevel;
    }

    public UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponseBody setRestrictedVisibilityLevels(java.util.List<Long> restrictedVisibilityLevels) {
        this.restrictedVisibilityLevels = restrictedVisibilityLevels;
        return this;
    }
    public java.util.List<Long> getRestrictedVisibilityLevels() {
        return this.restrictedVisibilityLevels;
    }

}
