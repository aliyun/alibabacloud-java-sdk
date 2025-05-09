// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeMultiPriceResponseBody extends TeaModel {
    @NameInMap("PriceInfo")
    public DescribeMultiPriceResponseBodyPriceInfo priceInfo;

    /**
     * <strong>example:</strong>
     * <p>833C4D2C-09C7-5CE6-8159-06758B964970</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMultiPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultiPriceResponseBody self = new DescribeMultiPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMultiPriceResponseBody setPriceInfo(DescribeMultiPriceResponseBodyPriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public DescribeMultiPriceResponseBodyPriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public DescribeMultiPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMultiPriceResponseBodyPriceInfoPricePriceDetailsModuleDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>734.65</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <strong>example:</strong>
         * <p>DesktopType</p>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <strong>example:</strong>
         * <p>eds.enterprise_office.8c32g</p>
         */
        @NameInMap("ModuleValue")
        public String moduleValue;

        /**
         * <strong>example:</strong>
         * <p>10900</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        /**
         * <strong>example:</strong>
         * <p>292.2</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeMultiPriceResponseBodyPriceInfoPricePriceDetailsModuleDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiPriceResponseBodyPriceInfoPricePriceDetailsModuleDetails self = new DescribeMultiPriceResponseBodyPriceInfoPricePriceDetailsModuleDetails();
            return TeaModel.build(map, self);
        }

        public DescribeMultiPriceResponseBodyPriceInfoPricePriceDetailsModuleDetails setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeMultiPriceResponseBodyPriceInfoPricePriceDetailsModuleDetails setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public DescribeMultiPriceResponseBodyPriceInfoPricePriceDetailsModuleDetails setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public DescribeMultiPriceResponseBodyPriceInfoPricePriceDetailsModuleDetails setModuleValue(String moduleValue) {
            this.moduleValue = moduleValue;
            return this;
        }
        public String getModuleValue() {
            return this.moduleValue;
        }

        public DescribeMultiPriceResponseBodyPriceInfoPricePriceDetailsModuleDetails setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeMultiPriceResponseBodyPriceInfoPricePriceDetailsModuleDetails setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeMultiPriceResponseBodyPriceInfoPricePriceDetailsPriceDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20.00</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <strong>example:</strong>
         * <p>100.00</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        /**
         * <strong>example:</strong>
         * <p>DurationPackage</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>80.00</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeMultiPriceResponseBodyPriceInfoPricePriceDetailsPriceDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiPriceResponseBodyPriceInfoPricePriceDetailsPriceDetail self = new DescribeMultiPriceResponseBodyPriceInfoPricePriceDetailsPriceDetail();
            return TeaModel.build(map, self);
        }

        public DescribeMultiPriceResponseBodyPriceInfoPricePriceDetailsPriceDetail setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeMultiPriceResponseBodyPriceInfoPricePriceDetailsPriceDetail setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeMultiPriceResponseBodyPriceInfoPricePriceDetailsPriceDetail setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeMultiPriceResponseBodyPriceInfoPricePriceDetailsPriceDetail setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeMultiPriceResponseBodyPriceInfoPricePriceDetails extends TeaModel {
        @NameInMap("ModuleDetails")
        public java.util.List<DescribeMultiPriceResponseBodyPriceInfoPricePriceDetailsModuleDetails> moduleDetails;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OrderItem")
        public Integer orderItem;

        @NameInMap("PriceDetail")
        public DescribeMultiPriceResponseBodyPriceInfoPricePriceDetailsPriceDetail priceDetail;

        public static DescribeMultiPriceResponseBodyPriceInfoPricePriceDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiPriceResponseBodyPriceInfoPricePriceDetails self = new DescribeMultiPriceResponseBodyPriceInfoPricePriceDetails();
            return TeaModel.build(map, self);
        }

        public DescribeMultiPriceResponseBodyPriceInfoPricePriceDetails setModuleDetails(java.util.List<DescribeMultiPriceResponseBodyPriceInfoPricePriceDetailsModuleDetails> moduleDetails) {
            this.moduleDetails = moduleDetails;
            return this;
        }
        public java.util.List<DescribeMultiPriceResponseBodyPriceInfoPricePriceDetailsModuleDetails> getModuleDetails() {
            return this.moduleDetails;
        }

        public DescribeMultiPriceResponseBodyPriceInfoPricePriceDetails setOrderItem(Integer orderItem) {
            this.orderItem = orderItem;
            return this;
        }
        public Integer getOrderItem() {
            return this.orderItem;
        }

        public DescribeMultiPriceResponseBodyPriceInfoPricePriceDetails setPriceDetail(DescribeMultiPriceResponseBodyPriceInfoPricePriceDetailsPriceDetail priceDetail) {
            this.priceDetail = priceDetail;
            return this;
        }
        public DescribeMultiPriceResponseBodyPriceInfoPricePriceDetailsPriceDetail getPriceDetail() {
            return this.priceDetail;
        }

    }

    public static class DescribeMultiPriceResponseBodyPriceInfoPricePromotions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>new</p>
         */
        @NameInMap("OptionCode")
        public String optionCode;

        @NameInMap("PromotionDesc")
        public String promotionDesc;

        /**
         * <strong>example:</strong>
         * <p>youhuiquan_promotion_option_id_for_blank</p>
         */
        @NameInMap("PromotionId")
        public String promotionId;

        @NameInMap("PromotionName")
        public String promotionName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Selected")
        public Boolean selected;

        public static DescribeMultiPriceResponseBodyPriceInfoPricePromotions build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiPriceResponseBodyPriceInfoPricePromotions self = new DescribeMultiPriceResponseBodyPriceInfoPricePromotions();
            return TeaModel.build(map, self);
        }

        public DescribeMultiPriceResponseBodyPriceInfoPricePromotions setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribeMultiPriceResponseBodyPriceInfoPricePromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public DescribeMultiPriceResponseBodyPriceInfoPricePromotions setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public DescribeMultiPriceResponseBodyPriceInfoPricePromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public DescribeMultiPriceResponseBodyPriceInfoPricePromotions setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class DescribeMultiPriceResponseBodyPriceInfoPrice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <strong>example:</strong>
         * <p>534.6</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <strong>example:</strong>
         * <p>6800</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("PriceDetails")
        public java.util.List<DescribeMultiPriceResponseBodyPriceInfoPricePriceDetails> priceDetails;

        @NameInMap("Promotions")
        public java.util.List<DescribeMultiPriceResponseBodyPriceInfoPricePromotions> promotions;

        @NameInMap("RefundInstanceIdPriceMap")
        public java.util.Map<String, Float> refundInstanceIdPriceMap;

        /**
         * <strong>example:</strong>
         * <p>60.00</p>
         */
        @NameInMap("RefundPrice")
        public Float refundPrice;

        /**
         * <strong>example:</strong>
         * <p>82.6</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeMultiPriceResponseBodyPriceInfoPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiPriceResponseBodyPriceInfoPrice self = new DescribeMultiPriceResponseBodyPriceInfoPrice();
            return TeaModel.build(map, self);
        }

        public DescribeMultiPriceResponseBodyPriceInfoPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeMultiPriceResponseBodyPriceInfoPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeMultiPriceResponseBodyPriceInfoPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeMultiPriceResponseBodyPriceInfoPrice setPriceDetails(java.util.List<DescribeMultiPriceResponseBodyPriceInfoPricePriceDetails> priceDetails) {
            this.priceDetails = priceDetails;
            return this;
        }
        public java.util.List<DescribeMultiPriceResponseBodyPriceInfoPricePriceDetails> getPriceDetails() {
            return this.priceDetails;
        }

        public DescribeMultiPriceResponseBodyPriceInfoPrice setPromotions(java.util.List<DescribeMultiPriceResponseBodyPriceInfoPricePromotions> promotions) {
            this.promotions = promotions;
            return this;
        }
        public java.util.List<DescribeMultiPriceResponseBodyPriceInfoPricePromotions> getPromotions() {
            return this.promotions;
        }

        public DescribeMultiPriceResponseBodyPriceInfoPrice setRefundInstanceIdPriceMap(java.util.Map<String, Float> refundInstanceIdPriceMap) {
            this.refundInstanceIdPriceMap = refundInstanceIdPriceMap;
            return this;
        }
        public java.util.Map<String, Float> getRefundInstanceIdPriceMap() {
            return this.refundInstanceIdPriceMap;
        }

        public DescribeMultiPriceResponseBodyPriceInfoPrice setRefundPrice(Float refundPrice) {
            this.refundPrice = refundPrice;
            return this;
        }
        public Float getRefundPrice() {
            return this.refundPrice;
        }

        public DescribeMultiPriceResponseBodyPriceInfoPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeMultiPriceResponseBodyPriceInfoRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>accounts_suspect_users</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>hrzdvc</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        public static DescribeMultiPriceResponseBodyPriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiPriceResponseBodyPriceInfoRules self = new DescribeMultiPriceResponseBodyPriceInfoRules();
            return TeaModel.build(map, self);
        }

        public DescribeMultiPriceResponseBodyPriceInfoRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeMultiPriceResponseBodyPriceInfoRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribeMultiPriceResponseBodyPriceInfo extends TeaModel {
        @NameInMap("Price")
        public DescribeMultiPriceResponseBodyPriceInfoPrice price;

        @NameInMap("Rules")
        public java.util.List<DescribeMultiPriceResponseBodyPriceInfoRules> rules;

        public static DescribeMultiPriceResponseBodyPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiPriceResponseBodyPriceInfo self = new DescribeMultiPriceResponseBodyPriceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeMultiPriceResponseBodyPriceInfo setPrice(DescribeMultiPriceResponseBodyPriceInfoPrice price) {
            this.price = price;
            return this;
        }
        public DescribeMultiPriceResponseBodyPriceInfoPrice getPrice() {
            return this.price;
        }

        public DescribeMultiPriceResponseBodyPriceInfo setRules(java.util.List<DescribeMultiPriceResponseBodyPriceInfoRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeMultiPriceResponseBodyPriceInfoRules> getRules() {
            return this.rules;
        }

    }

}
