// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterPriceResponseBody extends TeaModel {
    /**
     * <p>The order type. Valid values:</p>
     * <ul>
     * <li>BUY: new purchase.</li>
     * <li>UPGRADE: specification change.</li>
     * <li>RENEW: renewal.</li>
     * <li>CONVERT: billing method conversion.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BUY</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The price details.</p>
     */
    @NameInMap("PriceInfo")
    public DescribeDBClusterPriceResponseBodyPriceInfo priceInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7E2FE3BB-C677-5FF9-9FC5-XXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public DescribeDBClusterPriceResponseBodyRules rules;

    /**
     * <p>Indicates whether discounts are allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("ShowDiscount")
    public Boolean showDiscount;

    public static DescribeDBClusterPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterPriceResponseBody self = new DescribeDBClusterPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterPriceResponseBody setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribeDBClusterPriceResponseBody setPriceInfo(DescribeDBClusterPriceResponseBodyPriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public DescribeDBClusterPriceResponseBodyPriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public DescribeDBClusterPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterPriceResponseBody setRules(DescribeDBClusterPriceResponseBodyRules rules) {
        this.rules = rules;
        return this;
    }
    public DescribeDBClusterPriceResponseBodyRules getRules() {
        return this.rules;
    }

    public DescribeDBClusterPriceResponseBody setShowDiscount(Boolean showDiscount) {
        this.showDiscount = showDiscount;
        return this;
    }
    public Boolean getShowDiscount() {
        return this.showDiscount;
    }

    public static class DescribeDBClusterPriceResponseBodyPriceInfoCouponsCoupon extends TeaModel {
        @NameInMap("CouponNo")
        public String couponNo;

        @NameInMap("IsSelected")
        public String isSelected;

        @NameInMap("Name")
        public String name;

        public static DescribeDBClusterPriceResponseBodyPriceInfoCouponsCoupon build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPriceResponseBodyPriceInfoCouponsCoupon self = new DescribeDBClusterPriceResponseBodyPriceInfoCouponsCoupon();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterPriceResponseBodyPriceInfoCouponsCoupon setCouponNo(String couponNo) {
            this.couponNo = couponNo;
            return this;
        }
        public String getCouponNo() {
            return this.couponNo;
        }

        public DescribeDBClusterPriceResponseBodyPriceInfoCouponsCoupon setIsSelected(String isSelected) {
            this.isSelected = isSelected;
            return this;
        }
        public String getIsSelected() {
            return this.isSelected;
        }

        public DescribeDBClusterPriceResponseBodyPriceInfoCouponsCoupon setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDBClusterPriceResponseBodyPriceInfoCoupons extends TeaModel {
        @NameInMap("Coupon")
        public java.util.List<DescribeDBClusterPriceResponseBodyPriceInfoCouponsCoupon> coupon;

        public static DescribeDBClusterPriceResponseBodyPriceInfoCoupons build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPriceResponseBodyPriceInfoCoupons self = new DescribeDBClusterPriceResponseBodyPriceInfoCoupons();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterPriceResponseBodyPriceInfoCoupons setCoupon(java.util.List<DescribeDBClusterPriceResponseBodyPriceInfoCouponsCoupon> coupon) {
            this.coupon = coupon;
            return this;
        }
        public java.util.List<DescribeDBClusterPriceResponseBodyPriceInfoCouponsCoupon> getCoupon() {
            return this.coupon;
        }

    }

    public static class DescribeDBClusterPriceResponseBodyPriceInfoRuleIds extends TeaModel {
        @NameInMap("RuleId")
        public java.util.List<String> ruleId;

        public static DescribeDBClusterPriceResponseBodyPriceInfoRuleIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPriceResponseBodyPriceInfoRuleIds self = new DescribeDBClusterPriceResponseBodyPriceInfoRuleIds();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterPriceResponseBodyPriceInfoRuleIds setRuleId(java.util.List<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public java.util.List<String> getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribeDBClusterPriceResponseBodyPriceInfo extends TeaModel {
        @NameInMap("Coupons")
        public DescribeDBClusterPriceResponseBodyPriceInfoCoupons coupons;

        /**
         * <p>The currency unit.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The discount amount.</p>
         * 
         * <strong>example:</strong>
         * <p>1978.2</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>1099.0</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("RuleIds")
        public DescribeDBClusterPriceResponseBodyPriceInfoRuleIds ruleIds;

        /**
         * <p>The final price, which is the original price minus the discount.</p>
         * 
         * <strong>example:</strong>
         * <p>165.0</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeDBClusterPriceResponseBodyPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPriceResponseBodyPriceInfo self = new DescribeDBClusterPriceResponseBodyPriceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterPriceResponseBodyPriceInfo setCoupons(DescribeDBClusterPriceResponseBodyPriceInfoCoupons coupons) {
            this.coupons = coupons;
            return this;
        }
        public DescribeDBClusterPriceResponseBodyPriceInfoCoupons getCoupons() {
            return this.coupons;
        }

        public DescribeDBClusterPriceResponseBodyPriceInfo setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeDBClusterPriceResponseBodyPriceInfo setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeDBClusterPriceResponseBodyPriceInfo setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeDBClusterPriceResponseBodyPriceInfo setRuleIds(DescribeDBClusterPriceResponseBodyPriceInfoRuleIds ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public DescribeDBClusterPriceResponseBodyPriceInfoRuleIds getRuleIds() {
            return this.ruleIds;
        }

        public DescribeDBClusterPriceResponseBodyPriceInfo setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeDBClusterPriceResponseBodyRulesRule extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("RuleId")
        public Long ruleId;

        public static DescribeDBClusterPriceResponseBodyRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPriceResponseBodyRulesRule self = new DescribeDBClusterPriceResponseBodyRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterPriceResponseBodyRulesRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDBClusterPriceResponseBodyRulesRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribeDBClusterPriceResponseBodyRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<DescribeDBClusterPriceResponseBodyRulesRule> rule;

        public static DescribeDBClusterPriceResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPriceResponseBodyRules self = new DescribeDBClusterPriceResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterPriceResponseBodyRules setRule(java.util.List<DescribeDBClusterPriceResponseBodyRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribeDBClusterPriceResponseBodyRulesRule> getRule() {
            return this.rule;
        }

    }

}
