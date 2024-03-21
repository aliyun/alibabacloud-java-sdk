// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class SearchSimilarityListShrinkRequest extends TeaModel {
    @NameInMap("Classifications")
    public String classificationsShrink;

    @NameInMap("Name")
    public String name;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SimilarGroups")
    public String similarGroupsShrink;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("SuccessSearchType")
    public String successSearchType;

    @NameInMap("Umid")
    public String umid;

    @NameInMap("Uri")
    public String uri;

    public static SearchSimilarityListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchSimilarityListShrinkRequest self = new SearchSimilarityListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchSimilarityListShrinkRequest setClassificationsShrink(String classificationsShrink) {
        this.classificationsShrink = classificationsShrink;
        return this;
    }
    public String getClassificationsShrink() {
        return this.classificationsShrink;
    }

    public SearchSimilarityListShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SearchSimilarityListShrinkRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SearchSimilarityListShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchSimilarityListShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchSimilarityListShrinkRequest setSimilarGroupsShrink(String similarGroupsShrink) {
        this.similarGroupsShrink = similarGroupsShrink;
        return this;
    }
    public String getSimilarGroupsShrink() {
        return this.similarGroupsShrink;
    }

    public SearchSimilarityListShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public SearchSimilarityListShrinkRequest setSuccessSearchType(String successSearchType) {
        this.successSearchType = successSearchType;
        return this;
    }
    public String getSuccessSearchType() {
        return this.successSearchType;
    }

    public SearchSimilarityListShrinkRequest setUmid(String umid) {
        this.umid = umid;
        return this;
    }
    public String getUmid() {
        return this.umid;
    }

    public SearchSimilarityListShrinkRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
