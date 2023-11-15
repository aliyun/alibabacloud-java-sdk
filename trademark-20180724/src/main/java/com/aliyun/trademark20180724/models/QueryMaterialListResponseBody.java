// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryMaterialListResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public QueryMaterialListResponseBodyData data;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryMaterialListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMaterialListResponseBody self = new QueryMaterialListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMaterialListResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryMaterialListResponseBody setData(QueryMaterialListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMaterialListResponseBodyData getData() {
        return this.data;
    }

    public QueryMaterialListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMaterialListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMaterialListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryMaterialListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryMaterialListResponseBodyDataTrademark extends TeaModel {
        @NameInMap("CardNumber")
        public String cardNumber;

        @NameInMap("ContactName")
        public String contactName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LoaKey")
        public String loaKey;

        @NameInMap("LoaStatus")
        public Integer loaStatus;

        @NameInMap("MaterialVersion")
        public String materialVersion;

        @NameInMap("Name")
        public String name;

        @NameInMap("PrincipalDescription")
        public String principalDescription;

        @NameInMap("PrincipalName")
        public Integer principalName;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Region")
        public Integer region;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SystemVersion")
        public String systemVersion;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("ValidDate")
        public Long validDate;

        public static QueryMaterialListResponseBodyDataTrademark build(java.util.Map<String, ?> map) throws Exception {
            QueryMaterialListResponseBodyDataTrademark self = new QueryMaterialListResponseBodyDataTrademark();
            return TeaModel.build(map, self);
        }

        public QueryMaterialListResponseBodyDataTrademark setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }
        public String getCardNumber() {
            return this.cardNumber;
        }

        public QueryMaterialListResponseBodyDataTrademark setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public QueryMaterialListResponseBodyDataTrademark setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMaterialListResponseBodyDataTrademark setLoaKey(String loaKey) {
            this.loaKey = loaKey;
            return this;
        }
        public String getLoaKey() {
            return this.loaKey;
        }

        public QueryMaterialListResponseBodyDataTrademark setLoaStatus(Integer loaStatus) {
            this.loaStatus = loaStatus;
            return this;
        }
        public Integer getLoaStatus() {
            return this.loaStatus;
        }

        public QueryMaterialListResponseBodyDataTrademark setMaterialVersion(String materialVersion) {
            this.materialVersion = materialVersion;
            return this;
        }
        public String getMaterialVersion() {
            return this.materialVersion;
        }

        public QueryMaterialListResponseBodyDataTrademark setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMaterialListResponseBodyDataTrademark setPrincipalDescription(String principalDescription) {
            this.principalDescription = principalDescription;
            return this;
        }
        public String getPrincipalDescription() {
            return this.principalDescription;
        }

        public QueryMaterialListResponseBodyDataTrademark setPrincipalName(Integer principalName) {
            this.principalName = principalName;
            return this;
        }
        public Integer getPrincipalName() {
            return this.principalName;
        }

        public QueryMaterialListResponseBodyDataTrademark setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public QueryMaterialListResponseBodyDataTrademark setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

        public QueryMaterialListResponseBodyDataTrademark setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryMaterialListResponseBodyDataTrademark setSystemVersion(String systemVersion) {
            this.systemVersion = systemVersion;
            return this;
        }
        public String getSystemVersion() {
            return this.systemVersion;
        }

        public QueryMaterialListResponseBodyDataTrademark setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QueryMaterialListResponseBodyDataTrademark setValidDate(Long validDate) {
            this.validDate = validDate;
            return this;
        }
        public Long getValidDate() {
            return this.validDate;
        }

    }

    public static class QueryMaterialListResponseBodyData extends TeaModel {
        @NameInMap("Trademark")
        public java.util.List<QueryMaterialListResponseBodyDataTrademark> trademark;

        public static QueryMaterialListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMaterialListResponseBodyData self = new QueryMaterialListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMaterialListResponseBodyData setTrademark(java.util.List<QueryMaterialListResponseBodyDataTrademark> trademark) {
            this.trademark = trademark;
            return this;
        }
        public java.util.List<QueryMaterialListResponseBodyDataTrademark> getTrademark() {
            return this.trademark;
        }

    }

}
