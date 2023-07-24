// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sasti20200512.models;

import com.aliyun.tea.*;

public class DescribeDomainReportRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("Field")
    public String field;

    @NameInMap("ServiceLang")
    public String serviceLang;

    public static DescribeDomainReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainReportRequest self = new DescribeDomainReportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainReportRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeDomainReportRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public DescribeDomainReportRequest setServiceLang(String serviceLang) {
        this.serviceLang = serviceLang;
        return this;
    }
    public String getServiceLang() {
        return this.serviceLang;
    }

}
