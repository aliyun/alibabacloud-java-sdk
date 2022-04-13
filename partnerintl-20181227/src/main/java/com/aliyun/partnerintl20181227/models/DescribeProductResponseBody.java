// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.partnerintl20181227.models;

import com.aliyun.tea.*;

public class DescribeProductResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ForceFatal")
    public Boolean forceFatal;

    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeProductResponseBodyResult result;

    @NameInMap("Synchro")
    public Boolean synchro;

    public static DescribeProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductResponseBody self = new DescribeProductResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProductResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeProductResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeProductResponseBody setForceFatal(Boolean forceFatal) {
        this.forceFatal = forceFatal;
        return this;
    }
    public Boolean getForceFatal() {
        return this.forceFatal;
    }

    public DescribeProductResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public DescribeProductResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public DescribeProductResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProductResponseBody setResult(DescribeProductResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeProductResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeProductResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class DescribeProductResponseBodyResultProductExtras extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Label")
        public String label;

        @NameInMap("Order")
        public Integer order;

        // HTML, LIST, JSON, SLIDER, LINK, IMG
        @NameInMap("Type")
        public String type;

        @NameInMap("Values")
        public Object values;

        public static DescribeProductResponseBodyResultProductExtras build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyResultProductExtras self = new DescribeProductResponseBodyResultProductExtras();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyResultProductExtras setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeProductResponseBodyResultProductExtras setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeProductResponseBodyResultProductExtras setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public DescribeProductResponseBodyResultProductExtras setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeProductResponseBodyResultProductExtras setValues(Object values) {
            this.values = values;
            return this;
        }
        public Object getValues() {
            return this.values;
        }

    }

    public static class DescribeProductResponseBodyResultProductSkusModulesPropertiesPropertyValues extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Max")
        public String max;

        @NameInMap("Min")
        public String min;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Step")
        public String step;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static DescribeProductResponseBodyResultProductSkusModulesPropertiesPropertyValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyResultProductSkusModulesPropertiesPropertyValues self = new DescribeProductResponseBodyResultProductSkusModulesPropertiesPropertyValues();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyResultProductSkusModulesPropertiesPropertyValues setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeProductResponseBodyResultProductSkusModulesPropertiesPropertyValues setMax(String max) {
            this.max = max;
            return this;
        }
        public String getMax() {
            return this.max;
        }

        public DescribeProductResponseBodyResultProductSkusModulesPropertiesPropertyValues setMin(String min) {
            this.min = min;
            return this;
        }
        public String getMin() {
            return this.min;
        }

        public DescribeProductResponseBodyResultProductSkusModulesPropertiesPropertyValues setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeProductResponseBodyResultProductSkusModulesPropertiesPropertyValues setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

        public DescribeProductResponseBodyResultProductSkusModulesPropertiesPropertyValues setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeProductResponseBodyResultProductSkusModulesPropertiesPropertyValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeProductResponseBodyResultProductSkusModulesProperties extends TeaModel {
        @NameInMap("Conversion")
        public String conversion;

        @NameInMap("CustomContaint")
        public String customContaint;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("DisplayUnit")
        public String displayUnit;

        @NameInMap("Group")
        public String group;

        @NameInMap("IsNeedTransmit")
        public Boolean isNeedTransmit;

        @NameInMap("IsShow")
        public Boolean isShow;

        @NameInMap("IsUpgrade")
        public Boolean isUpgrade;

        @NameInMap("Key")
        public String key;

        @NameInMap("Name")
        public String name;

        @NameInMap("Order")
        public Long order;

        @NameInMap("PropertyValues")
        public java.util.List<DescribeProductResponseBodyResultProductSkusModulesPropertiesPropertyValues> propertyValues;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("ShowType")
        public String showType;

        @NameInMap("Unit")
        public String unit;

        public static DescribeProductResponseBodyResultProductSkusModulesProperties build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyResultProductSkusModulesProperties self = new DescribeProductResponseBodyResultProductSkusModulesProperties();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyResultProductSkusModulesProperties setConversion(String conversion) {
            this.conversion = conversion;
            return this;
        }
        public String getConversion() {
            return this.conversion;
        }

        public DescribeProductResponseBodyResultProductSkusModulesProperties setCustomContaint(String customContaint) {
            this.customContaint = customContaint;
            return this;
        }
        public String getCustomContaint() {
            return this.customContaint;
        }

        public DescribeProductResponseBodyResultProductSkusModulesProperties setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeProductResponseBodyResultProductSkusModulesProperties setDisplayUnit(String displayUnit) {
            this.displayUnit = displayUnit;
            return this;
        }
        public String getDisplayUnit() {
            return this.displayUnit;
        }

        public DescribeProductResponseBodyResultProductSkusModulesProperties setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public DescribeProductResponseBodyResultProductSkusModulesProperties setIsNeedTransmit(Boolean isNeedTransmit) {
            this.isNeedTransmit = isNeedTransmit;
            return this;
        }
        public Boolean getIsNeedTransmit() {
            return this.isNeedTransmit;
        }

        public DescribeProductResponseBodyResultProductSkusModulesProperties setIsShow(Boolean isShow) {
            this.isShow = isShow;
            return this;
        }
        public Boolean getIsShow() {
            return this.isShow;
        }

        public DescribeProductResponseBodyResultProductSkusModulesProperties setIsUpgrade(Boolean isUpgrade) {
            this.isUpgrade = isUpgrade;
            return this;
        }
        public Boolean getIsUpgrade() {
            return this.isUpgrade;
        }

        public DescribeProductResponseBodyResultProductSkusModulesProperties setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeProductResponseBodyResultProductSkusModulesProperties setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProductResponseBodyResultProductSkusModulesProperties setOrder(Long order) {
            this.order = order;
            return this;
        }
        public Long getOrder() {
            return this.order;
        }

        public DescribeProductResponseBodyResultProductSkusModulesProperties setPropertyValues(java.util.List<DescribeProductResponseBodyResultProductSkusModulesPropertiesPropertyValues> propertyValues) {
            this.propertyValues = propertyValues;
            return this;
        }
        public java.util.List<DescribeProductResponseBodyResultProductSkusModulesPropertiesPropertyValues> getPropertyValues() {
            return this.propertyValues;
        }

        public DescribeProductResponseBodyResultProductSkusModulesProperties setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeProductResponseBodyResultProductSkusModulesProperties setShowType(String showType) {
            this.showType = showType;
            return this;
        }
        public String getShowType() {
            return this.showType;
        }

        public DescribeProductResponseBodyResultProductSkusModulesProperties setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class DescribeProductResponseBodyResultProductSkusModules extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Properties")
        public java.util.List<DescribeProductResponseBodyResultProductSkusModulesProperties> properties;

        public static DescribeProductResponseBodyResultProductSkusModules build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyResultProductSkusModules self = new DescribeProductResponseBodyResultProductSkusModules();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyResultProductSkusModules setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeProductResponseBodyResultProductSkusModules setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeProductResponseBodyResultProductSkusModules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProductResponseBodyResultProductSkusModules setProperties(java.util.List<DescribeProductResponseBodyResultProductSkusModulesProperties> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.List<DescribeProductResponseBodyResultProductSkusModulesProperties> getProperties() {
            return this.properties;
        }

    }

    public static class DescribeProductResponseBodyResultProductSkusOrderPeriods extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("PeriodType")
        public String periodType;

        public static DescribeProductResponseBodyResultProductSkusOrderPeriods build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyResultProductSkusOrderPeriods self = new DescribeProductResponseBodyResultProductSkusOrderPeriods();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyResultProductSkusOrderPeriods setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProductResponseBodyResultProductSkusOrderPeriods setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

    }

    public static class DescribeProductResponseBodyResultProductSkusSalePricesSalePriceItems extends TeaModel {
        @NameInMap("Price")
        public Float price;

        @NameInMap("PriceType")
        public String priceType;

        @NameInMap("TradeType")
        public String tradeType;

        public static DescribeProductResponseBodyResultProductSkusSalePricesSalePriceItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyResultProductSkusSalePricesSalePriceItems self = new DescribeProductResponseBodyResultProductSkusSalePricesSalePriceItems();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyResultProductSkusSalePricesSalePriceItems setPrice(Float price) {
            this.price = price;
            return this;
        }
        public Float getPrice() {
            return this.price;
        }

        public DescribeProductResponseBodyResultProductSkusSalePricesSalePriceItems setPriceType(String priceType) {
            this.priceType = priceType;
            return this;
        }
        public String getPriceType() {
            return this.priceType;
        }

        public DescribeProductResponseBodyResultProductSkusSalePricesSalePriceItems setTradeType(String tradeType) {
            this.tradeType = tradeType;
            return this;
        }
        public String getTradeType() {
            return this.tradeType;
        }

    }

    public static class DescribeProductResponseBodyResultProductSkusSalePrices extends TeaModel {
        @NameInMap("Period")
        public String period;

        @NameInMap("Quota")
        public String quota;

        @NameInMap("SalePriceItems")
        public java.util.List<DescribeProductResponseBodyResultProductSkusSalePricesSalePriceItems> salePriceItems;

        @NameInMap("SortId")
        public Integer sortId;

        @NameInMap("Type")
        public String type;

        public static DescribeProductResponseBodyResultProductSkusSalePrices build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyResultProductSkusSalePrices self = new DescribeProductResponseBodyResultProductSkusSalePrices();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyResultProductSkusSalePrices setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public DescribeProductResponseBodyResultProductSkusSalePrices setQuota(String quota) {
            this.quota = quota;
            return this;
        }
        public String getQuota() {
            return this.quota;
        }

        public DescribeProductResponseBodyResultProductSkusSalePrices setSalePriceItems(java.util.List<DescribeProductResponseBodyResultProductSkusSalePricesSalePriceItems> salePriceItems) {
            this.salePriceItems = salePriceItems;
            return this;
        }
        public java.util.List<DescribeProductResponseBodyResultProductSkusSalePricesSalePriceItems> getSalePriceItems() {
            return this.salePriceItems;
        }

        public DescribeProductResponseBodyResultProductSkusSalePrices setSortId(Integer sortId) {
            this.sortId = sortId;
            return this;
        }
        public Integer getSortId() {
            return this.sortId;
        }

        public DescribeProductResponseBodyResultProductSkusSalePrices setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeProductResponseBodyResultProductSkus extends TeaModel {
        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("Code")
        public String code;

        @NameInMap("Constraints")
        public String constraints;

        @NameInMap("Hidden")
        public Boolean hidden;

        @NameInMap("Modules")
        public java.util.List<DescribeProductResponseBodyResultProductSkusModules> modules;

        @NameInMap("Name")
        public String name;

        @NameInMap("OrderPeriods")
        public java.util.List<DescribeProductResponseBodyResultProductSkusOrderPeriods> orderPeriods;

        @NameInMap("Properties")
        public java.util.Map<String, ?> properties;

        @NameInMap("SalePrices")
        public java.util.List<DescribeProductResponseBodyResultProductSkusSalePrices> salePrices;

        @NameInMap("SortId")
        public Integer sortId;

        public static DescribeProductResponseBodyResultProductSkus build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyResultProductSkus self = new DescribeProductResponseBodyResultProductSkus();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyResultProductSkus setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeProductResponseBodyResultProductSkus setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeProductResponseBodyResultProductSkus setConstraints(String constraints) {
            this.constraints = constraints;
            return this;
        }
        public String getConstraints() {
            return this.constraints;
        }

        public DescribeProductResponseBodyResultProductSkus setHidden(Boolean hidden) {
            this.hidden = hidden;
            return this;
        }
        public Boolean getHidden() {
            return this.hidden;
        }

        public DescribeProductResponseBodyResultProductSkus setModules(java.util.List<DescribeProductResponseBodyResultProductSkusModules> modules) {
            this.modules = modules;
            return this;
        }
        public java.util.List<DescribeProductResponseBodyResultProductSkusModules> getModules() {
            return this.modules;
        }

        public DescribeProductResponseBodyResultProductSkus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProductResponseBodyResultProductSkus setOrderPeriods(java.util.List<DescribeProductResponseBodyResultProductSkusOrderPeriods> orderPeriods) {
            this.orderPeriods = orderPeriods;
            return this;
        }
        public java.util.List<DescribeProductResponseBodyResultProductSkusOrderPeriods> getOrderPeriods() {
            return this.orderPeriods;
        }

        public DescribeProductResponseBodyResultProductSkus setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public DescribeProductResponseBodyResultProductSkus setSalePrices(java.util.List<DescribeProductResponseBodyResultProductSkusSalePrices> salePrices) {
            this.salePrices = salePrices;
            return this;
        }
        public java.util.List<DescribeProductResponseBodyResultProductSkusSalePrices> getSalePrices() {
            return this.salePrices;
        }

        public DescribeProductResponseBodyResultProductSkus setSortId(Integer sortId) {
            this.sortId = sortId;
            return this;
        }
        public Integer getSortId() {
            return this.sortId;
        }

    }

    public static class DescribeProductResponseBodyResultShopInfoWangWangs extends TeaModel {
        @NameInMap("Remark")
        public String remark;

        @NameInMap("UserName")
        public String userName;

        public static DescribeProductResponseBodyResultShopInfoWangWangs build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyResultShopInfoWangWangs self = new DescribeProductResponseBodyResultShopInfoWangWangs();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyResultShopInfoWangWangs setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeProductResponseBodyResultShopInfoWangWangs setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeProductResponseBodyResultShopInfo extends TeaModel {
        @NameInMap("Emails")
        public String emails;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Telephones")
        public java.util.List<String> telephones;

        @NameInMap("WangWangs")
        public java.util.List<DescribeProductResponseBodyResultShopInfoWangWangs> wangWangs;

        public static DescribeProductResponseBodyResultShopInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyResultShopInfo self = new DescribeProductResponseBodyResultShopInfo();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyResultShopInfo setEmails(String emails) {
            this.emails = emails;
            return this;
        }
        public String getEmails() {
            return this.emails;
        }

        public DescribeProductResponseBodyResultShopInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeProductResponseBodyResultShopInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProductResponseBodyResultShopInfo setTelephones(java.util.List<String> telephones) {
            this.telephones = telephones;
            return this;
        }
        public java.util.List<String> getTelephones() {
            return this.telephones;
        }

        public DescribeProductResponseBodyResultShopInfo setWangWangs(java.util.List<DescribeProductResponseBodyResultShopInfoWangWangs> wangWangs) {
            this.wangWangs = wangWangs;
            return this;
        }
        public java.util.List<DescribeProductResponseBodyResultShopInfoWangWangs> getWangWangs() {
            return this.wangWangs;
        }

    }

    public static class DescribeProductResponseBodyResult extends TeaModel {
        @NameInMap("AuditFailMsg")
        public String auditFailMsg;

        @NameInMap("AuditStatus")
        public String auditStatus;

        @NameInMap("AuditTime")
        public Long auditTime;

        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        @NameInMap("FrontCategoryId")
        public Long frontCategoryId;

        @NameInMap("GmtCreated")
        public Long gmtCreated;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("PicUrl")
        public String picUrl;

        @NameInMap("ProductExtras")
        public java.util.List<DescribeProductResponseBodyResultProductExtras> productExtras;

        @NameInMap("ProductSkus")
        public java.util.List<DescribeProductResponseBodyResultProductSkus> productSkus;

        @NameInMap("Score")
        public Double score;

        @NameInMap("ShopInfo")
        public DescribeProductResponseBodyResultShopInfo shopInfo;

        @NameInMap("ShortDescription")
        public String shortDescription;

        @NameInMap("Status")
        public String status;

        @NameInMap("SupplierPk")
        public Long supplierPk;

        @NameInMap("Type")
        public String type;

        @NameInMap("UseCount")
        public Long useCount;

        @NameInMap("Version")
        public String version;

        public static DescribeProductResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyResult self = new DescribeProductResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyResult setAuditFailMsg(String auditFailMsg) {
            this.auditFailMsg = auditFailMsg;
            return this;
        }
        public String getAuditFailMsg() {
            return this.auditFailMsg;
        }

        public DescribeProductResponseBodyResult setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public DescribeProductResponseBodyResult setAuditTime(Long auditTime) {
            this.auditTime = auditTime;
            return this;
        }
        public Long getAuditTime() {
            return this.auditTime;
        }

        public DescribeProductResponseBodyResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeProductResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeProductResponseBodyResult setFrontCategoryId(Long frontCategoryId) {
            this.frontCategoryId = frontCategoryId;
            return this;
        }
        public Long getFrontCategoryId() {
            return this.frontCategoryId;
        }

        public DescribeProductResponseBodyResult setGmtCreated(Long gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public Long getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeProductResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeProductResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProductResponseBodyResult setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public DescribeProductResponseBodyResult setProductExtras(java.util.List<DescribeProductResponseBodyResultProductExtras> productExtras) {
            this.productExtras = productExtras;
            return this;
        }
        public java.util.List<DescribeProductResponseBodyResultProductExtras> getProductExtras() {
            return this.productExtras;
        }

        public DescribeProductResponseBodyResult setProductSkus(java.util.List<DescribeProductResponseBodyResultProductSkus> productSkus) {
            this.productSkus = productSkus;
            return this;
        }
        public java.util.List<DescribeProductResponseBodyResultProductSkus> getProductSkus() {
            return this.productSkus;
        }

        public DescribeProductResponseBodyResult setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public DescribeProductResponseBodyResult setShopInfo(DescribeProductResponseBodyResultShopInfo shopInfo) {
            this.shopInfo = shopInfo;
            return this;
        }
        public DescribeProductResponseBodyResultShopInfo getShopInfo() {
            return this.shopInfo;
        }

        public DescribeProductResponseBodyResult setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }
        public String getShortDescription() {
            return this.shortDescription;
        }

        public DescribeProductResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeProductResponseBodyResult setSupplierPk(Long supplierPk) {
            this.supplierPk = supplierPk;
            return this;
        }
        public Long getSupplierPk() {
            return this.supplierPk;
        }

        public DescribeProductResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeProductResponseBodyResult setUseCount(Long useCount) {
            this.useCount = useCount;
            return this;
        }
        public Long getUseCount() {
            return this.useCount;
        }

        public DescribeProductResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
