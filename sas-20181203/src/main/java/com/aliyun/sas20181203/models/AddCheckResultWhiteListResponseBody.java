// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddCheckResultWhiteListResponseBody extends TeaModel {
    /**
     * <p>The data returned. This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>C699E4E4-F2F4-58FC-A949-457FFE59****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The IDs of the whitelist rules that are generated.</p>
     */
    @NameInMap("RuleIds")
    public java.util.List<Long> ruleIds;

    public static AddCheckResultWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCheckResultWhiteListResponseBody self = new AddCheckResultWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCheckResultWhiteListResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public AddCheckResultWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddCheckResultWhiteListResponseBody setRuleIds(java.util.List<Long> ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public java.util.List<Long> getRuleIds() {
        return this.ruleIds;
    }

}
