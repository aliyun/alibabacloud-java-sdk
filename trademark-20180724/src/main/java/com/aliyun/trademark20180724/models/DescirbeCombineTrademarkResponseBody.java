// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class DescirbeCombineTrademarkResponseBody extends TeaModel {
    @NameInMap("NextPage")
    public Boolean nextPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalPageNumber")
    public Integer totalPageNumber;

    @NameInMap("PrePage")
    public Boolean prePage;

    @NameInMap("CurrentPageNumber")
    public Integer currentPageNumber;

    @NameInMap("TotalItemNumber")
    public Integer totalItemNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Data")
    public java.util.List<DescirbeCombineTrademarkResponseBodyData> data;

    public static DescirbeCombineTrademarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescirbeCombineTrademarkResponseBody self = new DescirbeCombineTrademarkResponseBody();
        return TeaModel.build(map, self);
    }

    public DescirbeCombineTrademarkResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public DescirbeCombineTrademarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescirbeCombineTrademarkResponseBody setTotalPageNumber(Integer totalPageNumber) {
        this.totalPageNumber = totalPageNumber;
        return this;
    }
    public Integer getTotalPageNumber() {
        return this.totalPageNumber;
    }

    public DescirbeCombineTrademarkResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public DescirbeCombineTrademarkResponseBody setCurrentPageNumber(Integer currentPageNumber) {
        this.currentPageNumber = currentPageNumber;
        return this;
    }
    public Integer getCurrentPageNumber() {
        return this.currentPageNumber;
    }

    public DescirbeCombineTrademarkResponseBody setTotalItemNumber(Integer totalItemNumber) {
        this.totalItemNumber = totalItemNumber;
        return this;
    }
    public Integer getTotalItemNumber() {
        return this.totalItemNumber;
    }

    public DescirbeCombineTrademarkResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescirbeCombineTrademarkResponseBody setData(java.util.List<DescirbeCombineTrademarkResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescirbeCombineTrademarkResponseBodyData> getData() {
        return this.data;
    }

    public static class DescirbeCombineTrademarkResponseBodyDataAnnouncementList extends TeaModel {
        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("AnnDate")
        public String annDate;

        @NameInMap("OriginalImageUrl")
        public String originalImageUrl;

        @NameInMap("AnnTypeName")
        public String annTypeName;

        @NameInMap("AnnNumber")
        public String annNumber;

        @NameInMap("AnnTypeCode")
        public String annTypeCode;

        public static DescirbeCombineTrademarkResponseBodyDataAnnouncementList build(java.util.Map<String, ?> map) throws Exception {
            DescirbeCombineTrademarkResponseBodyDataAnnouncementList self = new DescirbeCombineTrademarkResponseBodyDataAnnouncementList();
            return TeaModel.build(map, self);
        }

        public DescirbeCombineTrademarkResponseBodyDataAnnouncementList setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public DescirbeCombineTrademarkResponseBodyDataAnnouncementList setAnnDate(String annDate) {
            this.annDate = annDate;
            return this;
        }
        public String getAnnDate() {
            return this.annDate;
        }

        public DescirbeCombineTrademarkResponseBodyDataAnnouncementList setOriginalImageUrl(String originalImageUrl) {
            this.originalImageUrl = originalImageUrl;
            return this;
        }
        public String getOriginalImageUrl() {
            return this.originalImageUrl;
        }

        public DescirbeCombineTrademarkResponseBodyDataAnnouncementList setAnnTypeName(String annTypeName) {
            this.annTypeName = annTypeName;
            return this;
        }
        public String getAnnTypeName() {
            return this.annTypeName;
        }

        public DescirbeCombineTrademarkResponseBodyDataAnnouncementList setAnnNumber(String annNumber) {
            this.annNumber = annNumber;
            return this;
        }
        public String getAnnNumber() {
            return this.annNumber;
        }

        public DescirbeCombineTrademarkResponseBodyDataAnnouncementList setAnnTypeCode(String annTypeCode) {
            this.annTypeCode = annTypeCode;
            return this;
        }
        public String getAnnTypeCode() {
            return this.annTypeCode;
        }

    }

    public static class DescirbeCombineTrademarkResponseBodyDataProcedures extends TeaModel {
        @NameInMap("ProcedureStep")
        public String procedureStep;

        @NameInMap("ProcedureResult")
        public String procedureResult;

        @NameInMap("ProcedureCode")
        public String procedureCode;

        @NameInMap("ProcedureDate")
        public String procedureDate;

        @NameInMap("ProcedureName")
        public String procedureName;

        public static DescirbeCombineTrademarkResponseBodyDataProcedures build(java.util.Map<String, ?> map) throws Exception {
            DescirbeCombineTrademarkResponseBodyDataProcedures self = new DescirbeCombineTrademarkResponseBodyDataProcedures();
            return TeaModel.build(map, self);
        }

        public DescirbeCombineTrademarkResponseBodyDataProcedures setProcedureStep(String procedureStep) {
            this.procedureStep = procedureStep;
            return this;
        }
        public String getProcedureStep() {
            return this.procedureStep;
        }

        public DescirbeCombineTrademarkResponseBodyDataProcedures setProcedureResult(String procedureResult) {
            this.procedureResult = procedureResult;
            return this;
        }
        public String getProcedureResult() {
            return this.procedureResult;
        }

        public DescirbeCombineTrademarkResponseBodyDataProcedures setProcedureCode(String procedureCode) {
            this.procedureCode = procedureCode;
            return this;
        }
        public String getProcedureCode() {
            return this.procedureCode;
        }

        public DescirbeCombineTrademarkResponseBodyDataProcedures setProcedureDate(String procedureDate) {
            this.procedureDate = procedureDate;
            return this;
        }
        public String getProcedureDate() {
            return this.procedureDate;
        }

        public DescirbeCombineTrademarkResponseBodyDataProcedures setProcedureName(String procedureName) {
            this.procedureName = procedureName;
            return this;
        }
        public String getProcedureName() {
            return this.procedureName;
        }

    }

    public static class DescirbeCombineTrademarkResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("OwnerAddress")
        public String ownerAddress;

        @NameInMap("PreAnnDate")
        public String preAnnDate;

        @NameInMap("PreAnnNumber")
        public String preAnnNumber;

        @NameInMap("IntlRegDate")
        public String intlRegDate;

        @NameInMap("Share")
        public String share;

        @NameInMap("OwnerEnName")
        public String ownerEnName;

        @NameInMap("SubsequentDesignationDate")
        public String subsequentDesignationDate;

        @NameInMap("IndexId")
        public String indexId;

        @NameInMap("RegAnnNumber")
        public String regAnnNumber;

        @NameInMap("RegistrationNumber")
        public String registrationNumber;

        @NameInMap("SecondAnnoType")
        public String secondAnnoType;

        @NameInMap("Agency")
        public String agency;

        @NameInMap("OwnerEnAddress")
        public String ownerEnAddress;

        @NameInMap("Classification")
        public String classification;

        @NameInMap("Name")
        public String name;

        @NameInMap("ApplyDate")
        public String applyDate;

        @NameInMap("PriorityDate")
        public String priorityDate;

        @NameInMap("ProductDescription")
        public String productDescription;

        @NameInMap("Image")
        public String image;

        @NameInMap("SecondAnnoNumber")
        public String secondAnnoNumber;

        @NameInMap("RegistrationType")
        public String registrationType;

        @NameInMap("FirstAnnoNumber")
        public String firstAnnoNumber;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("RegAnnDate")
        public String regAnnDate;

        @NameInMap("SimilarGroup")
        public String similarGroup;

        @NameInMap("OnSale")
        public Integer onSale;

        @NameInMap("ExclusiveDateLimit")
        public String exclusiveDateLimit;

        @NameInMap("FirstAnnoType")
        public String firstAnnoType;

        @NameInMap("LastProcedureStatus")
        public String lastProcedureStatus;

        @NameInMap("LawFinalStatus")
        public String lawFinalStatus;

        @NameInMap("AnnouncementList")
        public java.util.List<DescirbeCombineTrademarkResponseBodyDataAnnouncementList> announcementList;

        @NameInMap("Procedures")
        public java.util.List<DescirbeCombineTrademarkResponseBodyDataProcedures> procedures;

        public static DescirbeCombineTrademarkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescirbeCombineTrademarkResponseBodyData self = new DescirbeCombineTrademarkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescirbeCombineTrademarkResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescirbeCombineTrademarkResponseBodyData setOwnerAddress(String ownerAddress) {
            this.ownerAddress = ownerAddress;
            return this;
        }
        public String getOwnerAddress() {
            return this.ownerAddress;
        }

        public DescirbeCombineTrademarkResponseBodyData setPreAnnDate(String preAnnDate) {
            this.preAnnDate = preAnnDate;
            return this;
        }
        public String getPreAnnDate() {
            return this.preAnnDate;
        }

        public DescirbeCombineTrademarkResponseBodyData setPreAnnNumber(String preAnnNumber) {
            this.preAnnNumber = preAnnNumber;
            return this;
        }
        public String getPreAnnNumber() {
            return this.preAnnNumber;
        }

        public DescirbeCombineTrademarkResponseBodyData setIntlRegDate(String intlRegDate) {
            this.intlRegDate = intlRegDate;
            return this;
        }
        public String getIntlRegDate() {
            return this.intlRegDate;
        }

        public DescirbeCombineTrademarkResponseBodyData setShare(String share) {
            this.share = share;
            return this;
        }
        public String getShare() {
            return this.share;
        }

        public DescirbeCombineTrademarkResponseBodyData setOwnerEnName(String ownerEnName) {
            this.ownerEnName = ownerEnName;
            return this;
        }
        public String getOwnerEnName() {
            return this.ownerEnName;
        }

        public DescirbeCombineTrademarkResponseBodyData setSubsequentDesignationDate(String subsequentDesignationDate) {
            this.subsequentDesignationDate = subsequentDesignationDate;
            return this;
        }
        public String getSubsequentDesignationDate() {
            return this.subsequentDesignationDate;
        }

        public DescirbeCombineTrademarkResponseBodyData setIndexId(String indexId) {
            this.indexId = indexId;
            return this;
        }
        public String getIndexId() {
            return this.indexId;
        }

        public DescirbeCombineTrademarkResponseBodyData setRegAnnNumber(String regAnnNumber) {
            this.regAnnNumber = regAnnNumber;
            return this;
        }
        public String getRegAnnNumber() {
            return this.regAnnNumber;
        }

        public DescirbeCombineTrademarkResponseBodyData setRegistrationNumber(String registrationNumber) {
            this.registrationNumber = registrationNumber;
            return this;
        }
        public String getRegistrationNumber() {
            return this.registrationNumber;
        }

        public DescirbeCombineTrademarkResponseBodyData setSecondAnnoType(String secondAnnoType) {
            this.secondAnnoType = secondAnnoType;
            return this;
        }
        public String getSecondAnnoType() {
            return this.secondAnnoType;
        }

        public DescirbeCombineTrademarkResponseBodyData setAgency(String agency) {
            this.agency = agency;
            return this;
        }
        public String getAgency() {
            return this.agency;
        }

        public DescirbeCombineTrademarkResponseBodyData setOwnerEnAddress(String ownerEnAddress) {
            this.ownerEnAddress = ownerEnAddress;
            return this;
        }
        public String getOwnerEnAddress() {
            return this.ownerEnAddress;
        }

        public DescirbeCombineTrademarkResponseBodyData setClassification(String classification) {
            this.classification = classification;
            return this;
        }
        public String getClassification() {
            return this.classification;
        }

        public DescirbeCombineTrademarkResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescirbeCombineTrademarkResponseBodyData setApplyDate(String applyDate) {
            this.applyDate = applyDate;
            return this;
        }
        public String getApplyDate() {
            return this.applyDate;
        }

        public DescirbeCombineTrademarkResponseBodyData setPriorityDate(String priorityDate) {
            this.priorityDate = priorityDate;
            return this;
        }
        public String getPriorityDate() {
            return this.priorityDate;
        }

        public DescirbeCombineTrademarkResponseBodyData setProductDescription(String productDescription) {
            this.productDescription = productDescription;
            return this;
        }
        public String getProductDescription() {
            return this.productDescription;
        }

        public DescirbeCombineTrademarkResponseBodyData setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescirbeCombineTrademarkResponseBodyData setSecondAnnoNumber(String secondAnnoNumber) {
            this.secondAnnoNumber = secondAnnoNumber;
            return this;
        }
        public String getSecondAnnoNumber() {
            return this.secondAnnoNumber;
        }

        public DescirbeCombineTrademarkResponseBodyData setRegistrationType(String registrationType) {
            this.registrationType = registrationType;
            return this;
        }
        public String getRegistrationType() {
            return this.registrationType;
        }

        public DescirbeCombineTrademarkResponseBodyData setFirstAnnoNumber(String firstAnnoNumber) {
            this.firstAnnoNumber = firstAnnoNumber;
            return this;
        }
        public String getFirstAnnoNumber() {
            return this.firstAnnoNumber;
        }

        public DescirbeCombineTrademarkResponseBodyData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public DescirbeCombineTrademarkResponseBodyData setRegAnnDate(String regAnnDate) {
            this.regAnnDate = regAnnDate;
            return this;
        }
        public String getRegAnnDate() {
            return this.regAnnDate;
        }

        public DescirbeCombineTrademarkResponseBodyData setSimilarGroup(String similarGroup) {
            this.similarGroup = similarGroup;
            return this;
        }
        public String getSimilarGroup() {
            return this.similarGroup;
        }

        public DescirbeCombineTrademarkResponseBodyData setOnSale(Integer onSale) {
            this.onSale = onSale;
            return this;
        }
        public Integer getOnSale() {
            return this.onSale;
        }

        public DescirbeCombineTrademarkResponseBodyData setExclusiveDateLimit(String exclusiveDateLimit) {
            this.exclusiveDateLimit = exclusiveDateLimit;
            return this;
        }
        public String getExclusiveDateLimit() {
            return this.exclusiveDateLimit;
        }

        public DescirbeCombineTrademarkResponseBodyData setFirstAnnoType(String firstAnnoType) {
            this.firstAnnoType = firstAnnoType;
            return this;
        }
        public String getFirstAnnoType() {
            return this.firstAnnoType;
        }

        public DescirbeCombineTrademarkResponseBodyData setLastProcedureStatus(String lastProcedureStatus) {
            this.lastProcedureStatus = lastProcedureStatus;
            return this;
        }
        public String getLastProcedureStatus() {
            return this.lastProcedureStatus;
        }

        public DescirbeCombineTrademarkResponseBodyData setLawFinalStatus(String lawFinalStatus) {
            this.lawFinalStatus = lawFinalStatus;
            return this;
        }
        public String getLawFinalStatus() {
            return this.lawFinalStatus;
        }

        public DescirbeCombineTrademarkResponseBodyData setAnnouncementList(java.util.List<DescirbeCombineTrademarkResponseBodyDataAnnouncementList> announcementList) {
            this.announcementList = announcementList;
            return this;
        }
        public java.util.List<DescirbeCombineTrademarkResponseBodyDataAnnouncementList> getAnnouncementList() {
            return this.announcementList;
        }

        public DescirbeCombineTrademarkResponseBodyData setProcedures(java.util.List<DescirbeCombineTrademarkResponseBodyDataProcedures> procedures) {
            this.procedures = procedures;
            return this;
        }
        public java.util.List<DescirbeCombineTrademarkResponseBodyDataProcedures> getProcedures() {
            return this.procedures;
        }

    }

}
