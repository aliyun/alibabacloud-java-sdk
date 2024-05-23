// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribePriceResponseBody extends TeaModel {
    /**
     * <p>Order parameters.</p>
     */
    @NameInMap("OrderParams")
    public String orderParams;

    /**
     * <p>The price information.</p>
     */
    @NameInMap("PriceInfo")
    public DescribePriceResponseBodyPriceInfo priceInfo;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the promotion rule.</p>
     */
    @NameInMap("Rules")
    public DescribePriceResponseBodyRules rules;

    /**
     * <p>Serverless price information.</p>
     */
    @NameInMap("ServerlessPrice")
    public DescribePriceResponseBodyServerlessPrice serverlessPrice;

    /**
     * <p>Indicates whether discounts can be used.</p>
     */
    @NameInMap("ShowDiscount")
    public Boolean showDiscount;

    /**
     * <p>The estimated hourly fee that is calculated based on the maximum number of RCUs.</p>
     */
    @NameInMap("TradeMaxRCUAmount")
    public Float tradeMaxRCUAmount;

    /**
     * <p>The estimated hourly fee that is calculated based on the minimum number of RCUs.</p>
     */
    @NameInMap("TradeMinRCUAmount")
    public Float tradeMinRCUAmount;

    public static DescribePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceResponseBody self = new DescribePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePriceResponseBody setOrderParams(String orderParams) {
        this.orderParams = orderParams;
        return this;
    }
    public String getOrderParams() {
        return this.orderParams;
    }

    public DescribePriceResponseBody setPriceInfo(DescribePriceResponseBodyPriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public DescribePriceResponseBodyPriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public DescribePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePriceResponseBody setRules(DescribePriceResponseBodyRules rules) {
        this.rules = rules;
        return this;
    }
    public DescribePriceResponseBodyRules getRules() {
        return this.rules;
    }

    public DescribePriceResponseBody setServerlessPrice(DescribePriceResponseBodyServerlessPrice serverlessPrice) {
        this.serverlessPrice = serverlessPrice;
        return this;
    }
    public DescribePriceResponseBodyServerlessPrice getServerlessPrice() {
        return this.serverlessPrice;
    }

    public DescribePriceResponseBody setShowDiscount(Boolean showDiscount) {
        this.showDiscount = showDiscount;
        return this;
    }
    public Boolean getShowDiscount() {
        return this.showDiscount;
    }

    public DescribePriceResponseBody setTradeMaxRCUAmount(Float tradeMaxRCUAmount) {
        this.tradeMaxRCUAmount = tradeMaxRCUAmount;
        return this;
    }
    public Float getTradeMaxRCUAmount() {
        return this.tradeMaxRCUAmount;
    }

    public DescribePriceResponseBody setTradeMinRCUAmount(Float tradeMinRCUAmount) {
        this.tradeMinRCUAmount = tradeMinRCUAmount;
        return this;
    }
    public Float getTradeMinRCUAmount() {
        return this.tradeMinRCUAmount;
    }

    public static class DescribePriceResponseBodyPriceInfoActivityInfo extends TeaModel {
        /**
         * <p>The returned message.</p>
         */
        @NameInMap("CheckErrMsg")
        public String checkErrMsg;

        /**
         * <p>The error code that is returned.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        @NameInMap("Success")
        public String success;

        public static DescribePriceResponseBodyPriceInfoActivityInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoActivityInfo self = new DescribePriceResponseBodyPriceInfoActivityInfo();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoActivityInfo setCheckErrMsg(String checkErrMsg) {
            this.checkErrMsg = checkErrMsg;
            return this;
        }
        public String getCheckErrMsg() {
            return this.checkErrMsg;
        }

        public DescribePriceResponseBodyPriceInfoActivityInfo setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribePriceResponseBodyPriceInfoActivityInfo setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

    }

    public static class DescribePriceResponseBodyPriceInfoCouponsCoupon extends TeaModel {
        /**
         * <p>The coupon ID.</p>
         */
        @NameInMap("CouponNo")
        public String couponNo;

        /**
         * <p>The description of the coupon.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the coupon is selected.</p>
         */
        @NameInMap("IsSelected")
        public String isSelected;

        /**
         * <p>The coupon name.</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribePriceResponseBodyPriceInfoCouponsCoupon build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoCouponsCoupon self = new DescribePriceResponseBodyPriceInfoCouponsCoupon();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoCouponsCoupon setCouponNo(String couponNo) {
            this.couponNo = couponNo;
            return this;
        }
        public String getCouponNo() {
            return this.couponNo;
        }

        public DescribePriceResponseBodyPriceInfoCouponsCoupon setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePriceResponseBodyPriceInfoCouponsCoupon setIsSelected(String isSelected) {
            this.isSelected = isSelected;
            return this;
        }
        public String getIsSelected() {
            return this.isSelected;
        }

        public DescribePriceResponseBodyPriceInfoCouponsCoupon setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribePriceResponseBodyPriceInfoCoupons extends TeaModel {
        @NameInMap("Coupon")
        public java.util.List<DescribePriceResponseBodyPriceInfoCouponsCoupon> coupon;

        public static DescribePriceResponseBodyPriceInfoCoupons build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoCoupons self = new DescribePriceResponseBodyPriceInfoCoupons();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoCoupons setCoupon(java.util.List<DescribePriceResponseBodyPriceInfoCouponsCoupon> coupon) {
            this.coupon = coupon;
            return this;
        }
        public java.util.List<DescribePriceResponseBodyPriceInfoCouponsCoupon> getCoupon() {
            return this.coupon;
        }

    }

    public static class DescribePriceResponseBodyPriceInfoRuleIds extends TeaModel {
        @NameInMap("RuleId")
        public java.util.List<String> ruleId;

        public static DescribePriceResponseBodyPriceInfoRuleIds build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoRuleIds self = new DescribePriceResponseBodyPriceInfoRuleIds();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoRuleIds setRuleId(java.util.List<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public java.util.List<String> getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribePriceResponseBodyPriceInfo extends TeaModel {
        /**
         * <p>The information about the promotion.</p>
         */
        @NameInMap("ActivityInfo")
        public DescribePriceResponseBodyPriceInfoActivityInfo activityInfo;

        /**
         * <p>The information about the coupon.</p>
         */
        @NameInMap("Coupons")
        public DescribePriceResponseBodyPriceInfoCoupons coupons;

        /**
         * <p>The currency unit.</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The discount.</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <p>Order Information</p>
         */
        @NameInMap("OrderLines")
        public String orderLines;

        /**
         * <p>The original price.</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        /**
         * <p>An array that consists of the ID of the promotion rule.</p>
         */
        @NameInMap("RuleIds")
        public DescribePriceResponseBodyPriceInfoRuleIds ruleIds;

        /**
         * <p>Estimated hourly cost calculated based on the maximum RCU selected by the user.</p>
         */
        @NameInMap("TradeMaxRCUAmount")
        public Float tradeMaxRCUAmount;

        /**
         * <p>Estimated hourly cost calculated based on the minimum RCU selected by the user.</p>
         */
        @NameInMap("TradeMinRCUAmount")
        public Float tradeMinRCUAmount;

        /**
         * <p>The transaction price, which is equal to the original price minus the discount.</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribePriceResponseBodyPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfo self = new DescribePriceResponseBodyPriceInfo();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfo setActivityInfo(DescribePriceResponseBodyPriceInfoActivityInfo activityInfo) {
            this.activityInfo = activityInfo;
            return this;
        }
        public DescribePriceResponseBodyPriceInfoActivityInfo getActivityInfo() {
            return this.activityInfo;
        }

        public DescribePriceResponseBodyPriceInfo setCoupons(DescribePriceResponseBodyPriceInfoCoupons coupons) {
            this.coupons = coupons;
            return this;
        }
        public DescribePriceResponseBodyPriceInfoCoupons getCoupons() {
            return this.coupons;
        }

        public DescribePriceResponseBodyPriceInfo setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribePriceResponseBodyPriceInfo setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribePriceResponseBodyPriceInfo setOrderLines(String orderLines) {
            this.orderLines = orderLines;
            return this;
        }
        public String getOrderLines() {
            return this.orderLines;
        }

        public DescribePriceResponseBodyPriceInfo setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribePriceResponseBodyPriceInfo setRuleIds(DescribePriceResponseBodyPriceInfoRuleIds ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public DescribePriceResponseBodyPriceInfoRuleIds getRuleIds() {
            return this.ruleIds;
        }

        public DescribePriceResponseBodyPriceInfo setTradeMaxRCUAmount(Float tradeMaxRCUAmount) {
            this.tradeMaxRCUAmount = tradeMaxRCUAmount;
            return this;
        }
        public Float getTradeMaxRCUAmount() {
            return this.tradeMaxRCUAmount;
        }

        public DescribePriceResponseBodyPriceInfo setTradeMinRCUAmount(Float tradeMinRCUAmount) {
            this.tradeMinRCUAmount = tradeMinRCUAmount;
            return this;
        }
        public Float getTradeMinRCUAmount() {
            return this.tradeMinRCUAmount;
        }

        public DescribePriceResponseBodyPriceInfo setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribePriceResponseBodyRulesRule extends TeaModel {
        /**
         * <p>The description of the promotion rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the promotion rule.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the promotion rule.</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        public static DescribePriceResponseBodyRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyRulesRule self = new DescribePriceResponseBodyRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyRulesRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePriceResponseBodyRulesRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePriceResponseBodyRulesRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribePriceResponseBodyRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<DescribePriceResponseBodyRulesRule> rule;

        public static DescribePriceResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyRules self = new DescribePriceResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyRules setRule(java.util.List<DescribePriceResponseBodyRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribePriceResponseBodyRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribePriceResponseBodyServerlessPrice extends TeaModel {
        /**
         * <p>MaxRCU discount amount.</p>
         */
        @NameInMap("RCUDiscountMaxAmount")
        public Float RCUDiscountMaxAmount;

        /**
         * <p>MinRCU discount amount.</p>
         */
        @NameInMap("RCUDiscountMinAmount")
        public Float RCUDiscountMinAmount;

        /**
         * <p>MaxRCU price.</p>
         */
        @NameInMap("RCUOriginalMaxAmount")
        public Float RCUOriginalMaxAmount;

        /**
         * <p>MinRCU price.</p>
         */
        @NameInMap("RCUOriginalMinAmount")
        public Float RCUOriginalMinAmount;

        /**
         * <p>Original price of the disk.</p>
         */
        @NameInMap("StorageOriginalAmount")
        public Float storageOriginalAmount;

        /**
         * <p>Maximum total price before discount.</p>
         */
        @NameInMap("TotalOriginalMaxAmount")
        public Float totalOriginalMaxAmount;

        /**
         * <p>The minimum total price before the discount.</p>
         */
        @NameInMap("TotalOriginalMinAmount")
        public Float totalOriginalMinAmount;

        /**
         * <p>MaxRCU transaction price.</p>
         */
        @NameInMap("TradeMaxRCUAmount")
        public Float tradeMaxRCUAmount;

        /**
         * <p>MinRCU transaction price.</p>
         */
        @NameInMap("TradeMinRCUAmount")
        public Float tradeMinRCUAmount;

        /**
         * <p>Disk discount price.</p>
         */
        @NameInMap("storageDiscountAmount")
        public Float storageDiscountAmount;

        public static DescribePriceResponseBodyServerlessPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyServerlessPrice self = new DescribePriceResponseBodyServerlessPrice();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyServerlessPrice setRCUDiscountMaxAmount(Float RCUDiscountMaxAmount) {
            this.RCUDiscountMaxAmount = RCUDiscountMaxAmount;
            return this;
        }
        public Float getRCUDiscountMaxAmount() {
            return this.RCUDiscountMaxAmount;
        }

        public DescribePriceResponseBodyServerlessPrice setRCUDiscountMinAmount(Float RCUDiscountMinAmount) {
            this.RCUDiscountMinAmount = RCUDiscountMinAmount;
            return this;
        }
        public Float getRCUDiscountMinAmount() {
            return this.RCUDiscountMinAmount;
        }

        public DescribePriceResponseBodyServerlessPrice setRCUOriginalMaxAmount(Float RCUOriginalMaxAmount) {
            this.RCUOriginalMaxAmount = RCUOriginalMaxAmount;
            return this;
        }
        public Float getRCUOriginalMaxAmount() {
            return this.RCUOriginalMaxAmount;
        }

        public DescribePriceResponseBodyServerlessPrice setRCUOriginalMinAmount(Float RCUOriginalMinAmount) {
            this.RCUOriginalMinAmount = RCUOriginalMinAmount;
            return this;
        }
        public Float getRCUOriginalMinAmount() {
            return this.RCUOriginalMinAmount;
        }

        public DescribePriceResponseBodyServerlessPrice setStorageOriginalAmount(Float storageOriginalAmount) {
            this.storageOriginalAmount = storageOriginalAmount;
            return this;
        }
        public Float getStorageOriginalAmount() {
            return this.storageOriginalAmount;
        }

        public DescribePriceResponseBodyServerlessPrice setTotalOriginalMaxAmount(Float totalOriginalMaxAmount) {
            this.totalOriginalMaxAmount = totalOriginalMaxAmount;
            return this;
        }
        public Float getTotalOriginalMaxAmount() {
            return this.totalOriginalMaxAmount;
        }

        public DescribePriceResponseBodyServerlessPrice setTotalOriginalMinAmount(Float totalOriginalMinAmount) {
            this.totalOriginalMinAmount = totalOriginalMinAmount;
            return this;
        }
        public Float getTotalOriginalMinAmount() {
            return this.totalOriginalMinAmount;
        }

        public DescribePriceResponseBodyServerlessPrice setTradeMaxRCUAmount(Float tradeMaxRCUAmount) {
            this.tradeMaxRCUAmount = tradeMaxRCUAmount;
            return this;
        }
        public Float getTradeMaxRCUAmount() {
            return this.tradeMaxRCUAmount;
        }

        public DescribePriceResponseBodyServerlessPrice setTradeMinRCUAmount(Float tradeMinRCUAmount) {
            this.tradeMinRCUAmount = tradeMinRCUAmount;
            return this;
        }
        public Float getTradeMinRCUAmount() {
            return this.tradeMinRCUAmount;
        }

        public DescribePriceResponseBodyServerlessPrice setStorageDiscountAmount(Float storageDiscountAmount) {
            this.storageDiscountAmount = storageDiscountAmount;
            return this;
        }
        public Float getStorageDiscountAmount() {
            return this.storageDiscountAmount;
        }

    }

}
