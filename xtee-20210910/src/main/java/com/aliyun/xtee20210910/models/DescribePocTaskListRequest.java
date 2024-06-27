// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribePocTaskListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("regId")
    public String regId;

    @NameInMap("type")
    public String type;

    public static DescribePocTaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePocTaskListRequest self = new DescribePocTaskListRequest();
        return TeaModel.build(map, self);
    }

    public DescribePocTaskListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePocTaskListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePocTaskListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePocTaskListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribePocTaskListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
