// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class SearchSimilarityListRequest extends TeaModel {
    @NameInMap("Classifications")
    public java.util.Map<String, ?> classifications;

    @NameInMap("Name")
    public String name;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SimilarGroups")
    public java.util.Map<String, ?> similarGroups;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("SuccessSearchType")
    public String successSearchType;

    @NameInMap("Umid")
    public String umid;

    @NameInMap("Uri")
    public String uri;

    public static SearchSimilarityListRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchSimilarityListRequest self = new SearchSimilarityListRequest();
        return TeaModel.build(map, self);
    }

    public SearchSimilarityListRequest setClassifications(java.util.Map<String, ?> classifications) {
        this.classifications = classifications;
        return this;
    }
    public java.util.Map<String, ?> getClassifications() {
        return this.classifications;
    }

    public SearchSimilarityListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SearchSimilarityListRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SearchSimilarityListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchSimilarityListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchSimilarityListRequest setSimilarGroups(java.util.Map<String, ?> similarGroups) {
        this.similarGroups = similarGroups;
        return this;
    }
    public java.util.Map<String, ?> getSimilarGroups() {
        return this.similarGroups;
    }

    public SearchSimilarityListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public SearchSimilarityListRequest setSuccessSearchType(String successSearchType) {
        this.successSearchType = successSearchType;
        return this;
    }
    public String getSuccessSearchType() {
        return this.successSearchType;
    }

    public SearchSimilarityListRequest setUmid(String umid) {
        this.umid = umid;
        return this;
    }
    public String getUmid() {
        return this.umid;
    }

    public SearchSimilarityListRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
