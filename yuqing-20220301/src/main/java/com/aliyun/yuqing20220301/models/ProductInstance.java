// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class ProductInstance extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EUWYEEQ</p>
     */
    @NameInMap("appCode")
    public String appCode;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("buyerName")
    public String buyerName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ID2343231321</p>
     */
    @NameInMap("buyerUid")
    public String buyerUid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN</p>
     */
    @NameInMap("channel")
    public String channel;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <strong>example:</strong>
     * <p>1640292843231</p>
     */
    @NameInMap("end")
    public Long end;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ID3928389103844</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>D23938474923u42</p>
     */
    @NameInMap("orderNo")
    public String orderNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>C394884</p>
     */
    @NameInMap("productCode")
    public String productCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>C847573</p>
     */
    @NameInMap("productSpecCode")
    public String productSpecCode;

    /**
     * <strong>example:</strong>
     * <p>1640292843231</p>
     */
    @NameInMap("start")
    public Long start;

    /**
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("tenantName")
    public String tenantName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UID284747383</p>
     */
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
