// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateRMSUnifiedAlarmRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static UpdateRMSUnifiedAlarmRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRMSUnifiedAlarmRuleResponseBody self = new UpdateRMSUnifiedAlarmRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRMSUnifiedAlarmRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRMSUnifiedAlarmRuleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateRMSUnifiedAlarmRuleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

}
