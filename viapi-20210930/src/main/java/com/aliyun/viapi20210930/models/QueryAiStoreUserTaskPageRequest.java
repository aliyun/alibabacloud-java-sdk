// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class QueryAiStoreUserTaskPageRequest extends TeaModel {
    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Product")
    public String product;

    @NameInMap("Status")
    public String status;

    public static QueryAiStoreUserTaskPageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAiStoreUserTaskPageRequest self = new QueryAiStoreUserTaskPageRequest();
        return TeaModel.build(map, self);
    }

    public QueryAiStoreUserTaskPageRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public QueryAiStoreUserTaskPageRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public QueryAiStoreUserTaskPageRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryAiStoreUserTaskPageRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryAiStoreUserTaskPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAiStoreUserTaskPageRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public QueryAiStoreUserTaskPageRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
