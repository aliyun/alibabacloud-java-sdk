// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class ProductInstance extends TeaModel {
    // 应用码
    @NameInMap("appCode")
    public String appCode;

    // 购买者名称
    @NameInMap("buyerName")
    public String buyerName;

    // 购买者账号uid
    @NameInMap("buyerUid")
    public String buyerUid;

    // 商业化渠道码
    @NameInMap("channel")
    public String channel;

    // 购买配置信息
    @NameInMap("config")
    public String config;

    // 生效结束时间
    @NameInMap("end")
    public Long end;

    // 实例id
    @NameInMap("instanceId")
    public String instanceId;

    // 订单号，幂等使用
    @NameInMap("orderNo")
    public String orderNo;

    // 产品码
    @NameInMap("productCode")
    public String productCode;

    // 规格码
    @NameInMap("productSpecCode")
    public String productSpecCode;

    // 生效开始时间
    @NameInMap("start")
    public Long start;

    // 租户名称
    @NameInMap("tenantName")
    public String tenantName;

    // 租户uid
    @NameInMap("tenantUid")
    public String tenantUid;

    public static ProductInstance build(java.util.Map<String, ?> map) throws Exception {
        ProductInstance self = new ProductInstance();
        return TeaModel.build(map, self);
    }

    public ProductInstance setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public ProductInstance setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public ProductInstance setBuyerUid(String buyerUid) {
        this.buyerUid = buyerUid;
        return this;
    }
    public String getBuyerUid() {
        return this.buyerUid;
    }

    public ProductInstance setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ProductInstance setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ProductInstance setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public ProductInstance setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ProductInstance setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public ProductInstance setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ProductInstance setProductSpecCode(String productSpecCode) {
        this.productSpecCode = productSpecCode;
        return this;
    }
    public String getProductSpecCode() {
        return this.productSpecCode;
    }

    public ProductInstance setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public ProductInstance setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public ProductInstance setTenantUid(String tenantUid) {
        this.tenantUid = tenantUid;
        return this;
    }
    public String getTenantUid() {
        return this.tenantUid;
    }

}
