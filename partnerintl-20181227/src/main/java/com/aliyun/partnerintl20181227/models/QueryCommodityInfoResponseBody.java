// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.partnerintl20181227.models;

import com.aliyun.tea.*;

public class QueryCommodityInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ForceFatal")
    public Boolean forceFatal;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryCommodityInfoResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCommodityInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCommodityInfoResponseBody self = new QueryCommodityInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCommodityInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCommodityInfoResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public QueryCommodityInfoResponseBody setForceFatal(Boolean forceFatal) {
        this.forceFatal = forceFatal;
        return this;
    }
    public Boolean getForceFatal() {
        return this.forceFatal;
    }

    public QueryCommodityInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCommodityInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCommodityInfoResponseBody setResult(QueryCommodityInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryCommodityInfoResponseBodyResult getResult() {
        return this.result;
    }

    public QueryCommodityInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecListModuleList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CommodityId")
        public Long commodityId;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Properties")
        public java.util.Map<String, String> properties;

        @NameInMap("SaleWay")
        public Integer saleWay;

        @NameInMap("SortIndex")
        public Integer sortIndex;

        @NameInMap("SpecId")
        public Long specId;

        public static QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecListModuleList build(java.util.Map<String, ?> map) throws Exception {
            QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecListModuleList self = new QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecListModuleList();
            return TeaModel.build(map, self);
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecListModuleList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecListModuleList setCommodityId(Long commodityId) {
            this.commodityId = commodityId;
            return this;
        }
        public Long getCommodityId() {
            return this.commodityId;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecListModuleList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecListModuleList setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecListModuleList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecListModuleList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecListModuleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecListModuleList setProperties(java.util.Map<String, String> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, String> getProperties() {
            return this.properties;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecListModuleList setSaleWay(Integer saleWay) {
            this.saleWay = saleWay;
            return this;
        }
        public Integer getSaleWay() {
            return this.saleWay;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecListModuleList setSortIndex(Integer sortIndex) {
            this.sortIndex = sortIndex;
            return this;
        }
        public Integer getSortIndex() {
            return this.sortIndex;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecListModuleList setSpecId(Long specId) {
            this.specId = specId;
            return this;
        }
        public Long getSpecId() {
            return this.specId;
        }

    }

    public static class QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CommodityId")
        public Long commodityId;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModuleList")
        public java.util.List<QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecListModuleList> moduleList;

        @NameInMap("Name")
        public String name;

        @NameInMap("Properties")
        public java.util.Map<String, String> properties;

        @NameInMap("SortIndex")
        public Integer sortIndex;

        public static QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecList build(java.util.Map<String, ?> map) throws Exception {
            QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecList self = new QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecList();
            return TeaModel.build(map, self);
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecList setCommodityId(Long commodityId) {
            this.commodityId = commodityId;
            return this;
        }
        public Long getCommodityId() {
            return this.commodityId;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecList setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecList setModuleList(java.util.List<QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecListModuleList> moduleList) {
            this.moduleList = moduleList;
            return this;
        }
        public java.util.List<QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecListModuleList> getModuleList() {
            return this.moduleList;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecList setProperties(java.util.Map<String, String> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, String> getProperties() {
            return this.properties;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecList setSortIndex(Integer sortIndex) {
            this.sortIndex = sortIndex;
            return this;
        }
        public Integer getSortIndex() {
            return this.sortIndex;
        }

    }

    public static class QueryCommodityInfoResponseBodyResultCommodityBaseInfo extends TeaModel {
        @NameInMap("AuditStatus")
        public Integer auditStatus;

        @NameInMap("Channel")
        public Integer channel;

        @NameInMap("Code")
        public String code;

        @NameInMap("GmtPublished")
        public String gmtPublished;

        @NameInMap("Name")
        public String name;

        @NameInMap("SaleMode")
        public Integer saleMode;

        @NameInMap("SaleWay")
        public Integer saleWay;

        @NameInMap("SpecList")
        public java.util.List<QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecList> specList;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SupplierPK")
        public String supplierPK;

        @NameInMap("Type")
        public Integer type;

        public static QueryCommodityInfoResponseBodyResultCommodityBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryCommodityInfoResponseBodyResultCommodityBaseInfo self = new QueryCommodityInfoResponseBodyResultCommodityBaseInfo();
            return TeaModel.build(map, self);
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfo setAuditStatus(Integer auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public Integer getAuditStatus() {
            return this.auditStatus;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfo setChannel(Integer channel) {
            this.channel = channel;
            return this;
        }
        public Integer getChannel() {
            return this.channel;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfo setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfo setGmtPublished(String gmtPublished) {
            this.gmtPublished = gmtPublished;
            return this;
        }
        public String getGmtPublished() {
            return this.gmtPublished;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfo setSaleMode(Integer saleMode) {
            this.saleMode = saleMode;
            return this;
        }
        public Integer getSaleMode() {
            return this.saleMode;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfo setSaleWay(Integer saleWay) {
            this.saleWay = saleWay;
            return this;
        }
        public Integer getSaleWay() {
            return this.saleWay;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfo setSpecList(java.util.List<QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecList> specList) {
            this.specList = specList;
            return this;
        }
        public java.util.List<QueryCommodityInfoResponseBodyResultCommodityBaseInfoSpecList> getSpecList() {
            return this.specList;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfo setSupplierPK(String supplierPK) {
            this.supplierPK = supplierPK;
            return this;
        }
        public String getSupplierPK() {
            return this.supplierPK;
        }

        public QueryCommodityInfoResponseBodyResultCommodityBaseInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class QueryCommodityInfoResponseBodyResultSupplierBaseInfo extends TeaModel {
        @NameInMap("Aliyun_id")
        public String aliyunId;

        @NameInMap("Aliyun_kp")
        public String aliyunKp;

        @NameInMap("City")
        public Integer city;

        @NameInMap("Company_name")
        public String companyName;

        @NameInMap("Created_on")
        public String createdOn;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Isv_key")
        public String isvKey;

        @NameInMap("Province")
        public Integer province;

        @NameInMap("SaleMode")
        public Integer saleMode;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Type")
        public Integer type;

        public static QueryCommodityInfoResponseBodyResultSupplierBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryCommodityInfoResponseBodyResultSupplierBaseInfo self = new QueryCommodityInfoResponseBodyResultSupplierBaseInfo();
            return TeaModel.build(map, self);
        }

        public QueryCommodityInfoResponseBodyResultSupplierBaseInfo setAliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public String getAliyunId() {
            return this.aliyunId;
        }

        public QueryCommodityInfoResponseBodyResultSupplierBaseInfo setAliyunKp(String aliyunKp) {
            this.aliyunKp = aliyunKp;
            return this;
        }
        public String getAliyunKp() {
            return this.aliyunKp;
        }

        public QueryCommodityInfoResponseBodyResultSupplierBaseInfo setCity(Integer city) {
            this.city = city;
            return this;
        }
        public Integer getCity() {
            return this.city;
        }

        public QueryCommodityInfoResponseBodyResultSupplierBaseInfo setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public QueryCommodityInfoResponseBodyResultSupplierBaseInfo setCreatedOn(String createdOn) {
            this.createdOn = createdOn;
            return this;
        }
        public String getCreatedOn() {
            return this.createdOn;
        }

        public QueryCommodityInfoResponseBodyResultSupplierBaseInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryCommodityInfoResponseBodyResultSupplierBaseInfo setIsvKey(String isvKey) {
            this.isvKey = isvKey;
            return this;
        }
        public String getIsvKey() {
            return this.isvKey;
        }

        public QueryCommodityInfoResponseBodyResultSupplierBaseInfo setProvince(Integer province) {
            this.province = province;
            return this;
        }
        public Integer getProvince() {
            return this.province;
        }

        public QueryCommodityInfoResponseBodyResultSupplierBaseInfo setSaleMode(Integer saleMode) {
            this.saleMode = saleMode;
            return this;
        }
        public Integer getSaleMode() {
            return this.saleMode;
        }

        public QueryCommodityInfoResponseBodyResultSupplierBaseInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryCommodityInfoResponseBodyResultSupplierBaseInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class QueryCommodityInfoResponseBodyResult extends TeaModel {
        @NameInMap("CommodityBaseInfo")
        public QueryCommodityInfoResponseBodyResultCommodityBaseInfo commodityBaseInfo;

        @NameInMap("SupplierBaseInfo")
        public QueryCommodityInfoResponseBodyResultSupplierBaseInfo supplierBaseInfo;

        public static QueryCommodityInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryCommodityInfoResponseBodyResult self = new QueryCommodityInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryCommodityInfoResponseBodyResult setCommodityBaseInfo(QueryCommodityInfoResponseBodyResultCommodityBaseInfo commodityBaseInfo) {
            this.commodityBaseInfo = commodityBaseInfo;
            return this;
        }
        public QueryCommodityInfoResponseBodyResultCommodityBaseInfo getCommodityBaseInfo() {
            return this.commodityBaseInfo;
        }

        public QueryCommodityInfoResponseBodyResult setSupplierBaseInfo(QueryCommodityInfoResponseBodyResultSupplierBaseInfo supplierBaseInfo) {
            this.supplierBaseInfo = supplierBaseInfo;
            return this;
        }
        public QueryCommodityInfoResponseBodyResultSupplierBaseInfo getSupplierBaseInfo() {
            return this.supplierBaseInfo;
        }

    }

}
