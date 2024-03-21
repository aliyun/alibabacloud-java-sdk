// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class SearchSimilarityListResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<SearchSimilarityListResponseBodyData> data;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static SearchSimilarityListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchSimilarityListResponseBody self = new SearchSimilarityListResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchSimilarityListResponseBody setData(java.util.List<SearchSimilarityListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SearchSimilarityListResponseBodyData> getData() {
        return this.data;
    }

    public SearchSimilarityListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchSimilarityListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchSimilarityListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchSimilarityListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class SearchSimilarityListResponseBodyData extends TeaModel {
        @NameInMap("ApplyDate")
        public String applyDate;

        @NameInMap("Classification")
        public String classification;

        @NameInMap("ExclusiveDateLimit")
        public String exclusiveDateLimit;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Image")
        public String image;

        @NameInMap("LastProcedureStatus")
        public String lastProcedureStatus;

        @NameInMap("Name")
        public String name;

        @NameInMap("OnSale")
        public Integer onSale;

        @NameInMap("OwnerAddress")
        public String ownerAddress;

        @NameInMap("OwnerEnAddress")
        public String ownerEnAddress;

        @NameInMap("OwnerEnName")
        public String ownerEnName;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("PreAnnDate")
        public String preAnnDate;

        @NameInMap("PreAnnNum")
        public String preAnnNum;

        @NameInMap("Product")
        public String product;

        @NameInMap("ProductDesc")
        public String productDesc;

        @NameInMap("RegAnnDate")
        public String regAnnDate;

        @NameInMap("RegAnnNum")
        public String regAnnNum;

        @NameInMap("RegistrationNumber")
        public String registrationNumber;

        @NameInMap("Share")
        public String share;

        @NameInMap("Status")
        public String status;

        @NameInMap("Uid")
        public String uid;

        public static SearchSimilarityListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchSimilarityListResponseBodyData self = new SearchSimilarityListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchSimilarityListResponseBodyData setApplyDate(String applyDate) {
            this.applyDate = applyDate;
            return this;
        }
        public String getApplyDate() {
            return this.applyDate;
        }

        public SearchSimilarityListResponseBodyData setClassification(String classification) {
            this.classification = classification;
            return this;
        }
        public String getClassification() {
            return this.classification;
        }

        public SearchSimilarityListResponseBodyData setExclusiveDateLimit(String exclusiveDateLimit) {
            this.exclusiveDateLimit = exclusiveDateLimit;
            return this;
        }
        public String getExclusiveDateLimit() {
            return this.exclusiveDateLimit;
        }

        public SearchSimilarityListResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SearchSimilarityListResponseBodyData setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public SearchSimilarityListResponseBodyData setLastProcedureStatus(String lastProcedureStatus) {
            this.lastProcedureStatus = lastProcedureStatus;
            return this;
        }
        public String getLastProcedureStatus() {
            return this.lastProcedureStatus;
        }

        public SearchSimilarityListResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchSimilarityListResponseBodyData setOnSale(Integer onSale) {
            this.onSale = onSale;
            return this;
        }
        public Integer getOnSale() {
            return this.onSale;
        }

        public SearchSimilarityListResponseBodyData setOwnerAddress(String ownerAddress) {
            this.ownerAddress = ownerAddress;
            return this;
        }
        public String getOwnerAddress() {
            return this.ownerAddress;
        }

        public SearchSimilarityListResponseBodyData setOwnerEnAddress(String ownerEnAddress) {
            this.ownerEnAddress = ownerEnAddress;
            return this;
        }
        public String getOwnerEnAddress() {
            return this.ownerEnAddress;
        }

        public SearchSimilarityListResponseBodyData setOwnerEnName(String ownerEnName) {
            this.ownerEnName = ownerEnName;
            return this;
        }
        public String getOwnerEnName() {
            return this.ownerEnName;
        }

        public SearchSimilarityListResponseBodyData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public SearchSimilarityListResponseBodyData setPreAnnDate(String preAnnDate) {
            this.preAnnDate = preAnnDate;
            return this;
        }
        public String getPreAnnDate() {
            return this.preAnnDate;
        }

        public SearchSimilarityListResponseBodyData setPreAnnNum(String preAnnNum) {
            this.preAnnNum = preAnnNum;
            return this;
        }
        public String getPreAnnNum() {
            return this.preAnnNum;
        }

        public SearchSimilarityListResponseBodyData setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public SearchSimilarityListResponseBodyData setProductDesc(String productDesc) {
            this.productDesc = productDesc;
            return this;
        }
        public String getProductDesc() {
            return this.productDesc;
        }

        public SearchSimilarityListResponseBodyData setRegAnnDate(String regAnnDate) {
            this.regAnnDate = regAnnDate;
            return this;
        }
        public String getRegAnnDate() {
            return this.regAnnDate;
        }

        public SearchSimilarityListResponseBodyData setRegAnnNum(String regAnnNum) {
            this.regAnnNum = regAnnNum;
            return this;
        }
        public String getRegAnnNum() {
            return this.regAnnNum;
        }

        public SearchSimilarityListResponseBodyData setRegistrationNumber(String registrationNumber) {
            this.registrationNumber = registrationNumber;
            return this;
        }
        public String getRegistrationNumber() {
            return this.registrationNumber;
        }

        public SearchSimilarityListResponseBodyData setShare(String share) {
            this.share = share;
            return this;
        }
        public String getShare() {
            return this.share;
        }

        public SearchSimilarityListResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SearchSimilarityListResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
