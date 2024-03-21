// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListTrademarkSearchForInnerResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Products")
    public java.util.List<String> products;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("TrademarkSearchContents")
    public java.util.List<ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents> trademarkSearchContents;

    public static ListTrademarkSearchForInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrademarkSearchForInnerResponseBody self = new ListTrademarkSearchForInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrademarkSearchForInnerResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListTrademarkSearchForInnerResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListTrademarkSearchForInnerResponseBody setProducts(java.util.List<String> products) {
        this.products = products;
        return this;
    }
    public java.util.List<String> getProducts() {
        return this.products;
    }

    public ListTrademarkSearchForInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTrademarkSearchForInnerResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public ListTrademarkSearchForInnerResponseBody setTrademarkSearchContents(java.util.List<ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents> trademarkSearchContents) {
        this.trademarkSearchContents = trademarkSearchContents;
        return this;
    }
    public java.util.List<ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents> getTrademarkSearchContents() {
        return this.trademarkSearchContents;
    }

    public static class ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents extends TeaModel {
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

        @NameInMap("NameCharSection")
        public String nameCharSection;

        @NameInMap("NameOrigin")
        public String nameOrigin;

        @NameInMap("NameSimplifiedChinese")
        public String nameSimplifiedChinese;

        @NameInMap("NameSort")
        public String nameSort;

        @NameInMap("OnSale")
        public String onSale;

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

        @NameInMap("ProductDel")
        public java.util.List<String> productDel;

        @NameInMap("ProductDescription")
        public String productDescription;

        @NameInMap("RegAnnNum")
        public String regAnnNum;

        @NameInMap("RegistrationNumber")
        public String registrationNumber;

        @NameInMap("Share")
        public String share;

        @NameInMap("SimilarGroupDel")
        public java.util.List<String> similarGroupDel;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("WellKnow")
        public String wellKnow;

        public static ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents build(java.util.Map<String, ?> map) throws Exception {
            ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents self = new ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents();
            return TeaModel.build(map, self);
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setApplyDate(String applyDate) {
            this.applyDate = applyDate;
            return this;
        }
        public String getApplyDate() {
            return this.applyDate;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setClassification(String classification) {
            this.classification = classification;
            return this;
        }
        public String getClassification() {
            return this.classification;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setExclusiveDateLimit(String exclusiveDateLimit) {
            this.exclusiveDateLimit = exclusiveDateLimit;
            return this;
        }
        public String getExclusiveDateLimit() {
            return this.exclusiveDateLimit;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setLastProcedureStatus(String lastProcedureStatus) {
            this.lastProcedureStatus = lastProcedureStatus;
            return this;
        }
        public String getLastProcedureStatus() {
            return this.lastProcedureStatus;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setNameCharSection(String nameCharSection) {
            this.nameCharSection = nameCharSection;
            return this;
        }
        public String getNameCharSection() {
            return this.nameCharSection;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setNameOrigin(String nameOrigin) {
            this.nameOrigin = nameOrigin;
            return this;
        }
        public String getNameOrigin() {
            return this.nameOrigin;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setNameSimplifiedChinese(String nameSimplifiedChinese) {
            this.nameSimplifiedChinese = nameSimplifiedChinese;
            return this;
        }
        public String getNameSimplifiedChinese() {
            return this.nameSimplifiedChinese;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setNameSort(String nameSort) {
            this.nameSort = nameSort;
            return this;
        }
        public String getNameSort() {
            return this.nameSort;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setOnSale(String onSale) {
            this.onSale = onSale;
            return this;
        }
        public String getOnSale() {
            return this.onSale;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setOwnerAddress(String ownerAddress) {
            this.ownerAddress = ownerAddress;
            return this;
        }
        public String getOwnerAddress() {
            return this.ownerAddress;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setOwnerEnAddress(String ownerEnAddress) {
            this.ownerEnAddress = ownerEnAddress;
            return this;
        }
        public String getOwnerEnAddress() {
            return this.ownerEnAddress;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setOwnerEnName(String ownerEnName) {
            this.ownerEnName = ownerEnName;
            return this;
        }
        public String getOwnerEnName() {
            return this.ownerEnName;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setPreAnnDate(String preAnnDate) {
            this.preAnnDate = preAnnDate;
            return this;
        }
        public String getPreAnnDate() {
            return this.preAnnDate;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setPreAnnNum(String preAnnNum) {
            this.preAnnNum = preAnnNum;
            return this;
        }
        public String getPreAnnNum() {
            return this.preAnnNum;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setProductDel(java.util.List<String> productDel) {
            this.productDel = productDel;
            return this;
        }
        public java.util.List<String> getProductDel() {
            return this.productDel;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setProductDescription(String productDescription) {
            this.productDescription = productDescription;
            return this;
        }
        public String getProductDescription() {
            return this.productDescription;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setRegAnnNum(String regAnnNum) {
            this.regAnnNum = regAnnNum;
            return this;
        }
        public String getRegAnnNum() {
            return this.regAnnNum;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setRegistrationNumber(String registrationNumber) {
            this.registrationNumber = registrationNumber;
            return this;
        }
        public String getRegistrationNumber() {
            return this.registrationNumber;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setShare(String share) {
            this.share = share;
            return this;
        }
        public String getShare() {
            return this.share;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setSimilarGroupDel(java.util.List<String> similarGroupDel) {
            this.similarGroupDel = similarGroupDel;
            return this;
        }
        public java.util.List<String> getSimilarGroupDel() {
            return this.similarGroupDel;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListTrademarkSearchForInnerResponseBodyTrademarkSearchContents setWellKnow(String wellKnow) {
            this.wellKnow = wellKnow;
            return this;
        }
        public String getWellKnow() {
            return this.wellKnow;
        }

    }

}
