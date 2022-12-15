// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_oxs_cross20200701.models;

import com.aliyun.tea.*;

public class QuerySDKInstancesRequest extends TeaModel {
    @NameInMap("CodeList")
    public String codeList;

    @NameInMap("CreatedAfterDate")
    public String createdAfterDate;

    @NameInMap("CreatedBeforeDate")
    public String createdBeforeDate;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Pk")
    public String pk;

    public static QuerySDKInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySDKInstancesRequest self = new QuerySDKInstancesRequest();
        return TeaModel.build(map, self);
    }

    public QuerySDKInstancesRequest setCodeList(String codeList) {
        this.codeList = codeList;
        return this;
    }
    public String getCodeList() {
        return this.codeList;
    }

    public QuerySDKInstancesRequest setCreatedAfterDate(String createdAfterDate) {
        this.createdAfterDate = createdAfterDate;
        return this;
    }
    public String getCreatedAfterDate() {
        return this.createdAfterDate;
    }

    public QuerySDKInstancesRequest setCreatedBeforeDate(String createdBeforeDate) {
        this.createdBeforeDate = createdBeforeDate;
        return this;
    }
    public String getCreatedBeforeDate() {
        return this.createdBeforeDate;
    }

    public QuerySDKInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QuerySDKInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySDKInstancesRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

}
