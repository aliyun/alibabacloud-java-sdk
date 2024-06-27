// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("regId")
    public String regId;

    @NameInMap("sampleType")
    public String sampleType;

    @NameInMap("sampleValue")
    public String sampleValue;

    public static DescribeSampleListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleListRequest self = new DescribeSampleListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSampleListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSampleListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSampleListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSampleListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeSampleListRequest setSampleType(String sampleType) {
        this.sampleType = sampleType;
        return this;
    }
    public String getSampleType() {
        return this.sampleType;
    }

    public DescribeSampleListRequest setSampleValue(String sampleValue) {
        this.sampleValue = sampleValue;
        return this;
    }
    public String getSampleValue() {
        return this.sampleValue;
    }

}
