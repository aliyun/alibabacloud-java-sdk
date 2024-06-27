// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSafOrderRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("endDate")
    public String endDate;

    @NameInMap("exactProductCode")
    public String exactProductCode;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("regId")
    public String regId;

    @NameInMap("startDate")
    public String startDate;

    public static DescribeSafOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSafOrderRequest self = new DescribeSafOrderRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSafOrderRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSafOrderRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSafOrderRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeSafOrderRequest setExactProductCode(String exactProductCode) {
        this.exactProductCode = exactProductCode;
        return this;
    }
    public String getExactProductCode() {
        return this.exactProductCode;
    }

    public DescribeSafOrderRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSafOrderRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeSafOrderRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
