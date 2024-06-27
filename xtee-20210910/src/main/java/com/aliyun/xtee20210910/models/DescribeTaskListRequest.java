// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTaskListRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public String currentPage;

    @NameInMap("IsPage")
    public Boolean isPage;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("regId")
    public String regId;

    public static DescribeTaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskListRequest self = new DescribeTaskListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTaskListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeTaskListRequest setIsPage(Boolean isPage) {
        this.isPage = isPage;
        return this;
    }
    public Boolean getIsPage() {
        return this.isPage;
    }

    public DescribeTaskListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeTaskListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeTaskListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
