// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExportMsSgAuthRuleGroupsResponseBody extends TeaModel {
    @NameInMap("AuthRuleJson")
    public String authRuleJson;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static ExportMsSgAuthRuleGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportMsSgAuthRuleGroupsResponseBody self = new ExportMsSgAuthRuleGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportMsSgAuthRuleGroupsResponseBody setAuthRuleJson(String authRuleJson) {
        this.authRuleJson = authRuleJson;
        return this;
    }
    public String getAuthRuleJson() {
        return this.authRuleJson;
    }

    public ExportMsSgAuthRuleGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportMsSgAuthRuleGroupsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExportMsSgAuthRuleGroupsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
