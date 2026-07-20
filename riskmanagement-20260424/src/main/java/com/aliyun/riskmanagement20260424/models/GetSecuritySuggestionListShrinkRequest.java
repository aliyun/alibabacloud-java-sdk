// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetSecuritySuggestionListShrinkRequest extends TeaModel {
    @NameInMap("ListConfigRulesRequest")
    public String listConfigRulesRequestShrink;

    public static GetSecuritySuggestionListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSecuritySuggestionListShrinkRequest self = new GetSecuritySuggestionListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetSecuritySuggestionListShrinkRequest setListConfigRulesRequestShrink(String listConfigRulesRequestShrink) {
        this.listConfigRulesRequestShrink = listConfigRulesRequestShrink;
        return this;
    }
    public String getListConfigRulesRequestShrink() {
        return this.listConfigRulesRequestShrink;
    }

}
