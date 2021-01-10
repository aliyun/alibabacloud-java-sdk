// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectOneruleofdaydetailRequest extends TeaModel {
    @NameInMap("UnixTime")
    public Long unixTime;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static QueryHasInspectOneruleofdaydetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectOneruleofdaydetailRequest self = new QueryHasInspectOneruleofdaydetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectOneruleofdaydetailRequest setUnixTime(Long unixTime) {
        this.unixTime = unixTime;
        return this;
    }
    public Long getUnixTime() {
        return this.unixTime;
    }

    public QueryHasInspectOneruleofdaydetailRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public QueryHasInspectOneruleofdaydetailRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
