// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSummaryInfoRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ResourceDirectoryAccountId")
    public String resourceDirectoryAccountId;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeSummaryInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSummaryInfoRequest self = new DescribeSummaryInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSummaryInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSummaryInfoRequest setResourceDirectoryAccountId(String resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public String getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeSummaryInfoRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
