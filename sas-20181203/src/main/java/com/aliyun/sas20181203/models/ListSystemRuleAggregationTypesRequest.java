// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListSystemRuleAggregationTypesRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static ListSystemRuleAggregationTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSystemRuleAggregationTypesRequest self = new ListSystemRuleAggregationTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListSystemRuleAggregationTypesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
