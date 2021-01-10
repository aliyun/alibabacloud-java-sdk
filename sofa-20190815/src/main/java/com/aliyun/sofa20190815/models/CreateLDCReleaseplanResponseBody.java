// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLDCReleaseplanResponseBody extends TeaModel {
    @NameInMap("PlanUniqueId")
    public String planUniqueId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateLDCReleaseplanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLDCReleaseplanResponseBody self = new CreateLDCReleaseplanResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLDCReleaseplanResponseBody setPlanUniqueId(String planUniqueId) {
        this.planUniqueId = planUniqueId;
        return this;
    }
    public String getPlanUniqueId() {
        return this.planUniqueId;
    }

    public CreateLDCReleaseplanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLDCReleaseplanResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLDCReleaseplanResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
