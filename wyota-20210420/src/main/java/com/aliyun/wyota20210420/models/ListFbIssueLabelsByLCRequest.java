// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListFbIssueLabelsByLCRequest extends TeaModel {
    @NameInMap("Caller")
    public String caller;

    @NameInMap("LanguageType")
    public String languageType;

    public static ListFbIssueLabelsByLCRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFbIssueLabelsByLCRequest self = new ListFbIssueLabelsByLCRequest();
        return TeaModel.build(map, self);
    }

    public ListFbIssueLabelsByLCRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public ListFbIssueLabelsByLCRequest setLanguageType(String languageType) {
        this.languageType = languageType;
        return this;
    }
    public String getLanguageType() {
        return this.languageType;
    }

}
