// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckSummaryRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ResourceDirectoryAccountId")
    public String resourceDirectoryAccountId;

    public static GetCheckSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCheckSummaryRequest self = new GetCheckSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetCheckSummaryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetCheckSummaryRequest setResourceDirectoryAccountId(String resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public String getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

}
