// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddCheckInstanceResultWhiteListResponseBody extends TeaModel {
    /**
     * <p>The data returned. This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ADE57832-9666-511C-9A80-B87DE2E8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the whitelist rule.</p>
     * 
     * <strong>example:</strong>
     * <p>381049</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static AddCheckInstanceResultWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCheckInstanceResultWhiteListResponseBody self = new AddCheckInstanceResultWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCheckInstanceResultWhiteListResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public AddCheckInstanceResultWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddCheckInstanceResultWhiteListResponseBody setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
