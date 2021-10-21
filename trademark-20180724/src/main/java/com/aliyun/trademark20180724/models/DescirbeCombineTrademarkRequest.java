// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class DescirbeCombineTrademarkRequest extends TeaModel {
    @NameInMap("RegistrationNumber")
    public String registrationNumber;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerName")
    public String ownerName;

    @NameInMap("Products")
    public String products;

    @NameInMap("AccurateMatch")
    public Boolean accurateMatch;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Classification")
    public String classification;

    @NameInMap("SimilarGroups")
    public String similarGroups;

    public static DescirbeCombineTrademarkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescirbeCombineTrademarkRequest self = new DescirbeCombineTrademarkRequest();
        return TeaModel.build(map, self);
    }

    public DescirbeCombineTrademarkRequest setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
        return this;
    }
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public DescirbeCombineTrademarkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescirbeCombineTrademarkRequest setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public DescirbeCombineTrademarkRequest setProducts(String products) {
        this.products = products;
        return this;
    }
    public String getProducts() {
        return this.products;
    }

    public DescirbeCombineTrademarkRequest setAccurateMatch(Boolean accurateMatch) {
        this.accurateMatch = accurateMatch;
        return this;
    }
    public Boolean getAccurateMatch() {
        return this.accurateMatch;
    }

    public DescirbeCombineTrademarkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescirbeCombineTrademarkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescirbeCombineTrademarkRequest setClassification(String classification) {
        this.classification = classification;
        return this;
    }
    public String getClassification() {
        return this.classification;
    }

    public DescirbeCombineTrademarkRequest setSimilarGroups(String similarGroups) {
        this.similarGroups = similarGroups;
        return this;
    }
    public String getSimilarGroups() {
        return this.similarGroups;
    }

}
