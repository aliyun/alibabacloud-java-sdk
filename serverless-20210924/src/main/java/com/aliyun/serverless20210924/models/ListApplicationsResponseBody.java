// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class ListApplicationsResponseBody extends TeaModel {
    @NameInMap("currentPage")
    public String currentPage;

    @NameInMap("result")
    public java.util.List<Application> result;

    @NameInMap("totalCount")
    public String totalCount;

    public static ListApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsResponseBody self = new ListApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationsResponseBody setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public ListApplicationsResponseBody setResult(java.util.List<Application> result) {
        this.result = result;
        return this;
    }
    public java.util.List<Application> getResult() {
        return this.result;
    }

    public ListApplicationsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

}
