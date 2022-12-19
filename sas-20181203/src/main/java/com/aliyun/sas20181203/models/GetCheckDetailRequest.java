// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckDetailRequest extends TeaModel {
    // The ID of the check item.
    @NameInMap("CheckId")
    public Long checkId;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    public static GetCheckDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCheckDetailRequest self = new GetCheckDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetCheckDetailRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public GetCheckDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
