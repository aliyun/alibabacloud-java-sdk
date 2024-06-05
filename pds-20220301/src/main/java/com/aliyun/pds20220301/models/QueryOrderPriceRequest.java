// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class QueryOrderPriceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("instance_id")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("order_type")
    public String orderType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("package")
    public String _package;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("period")
    public Long period;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("period_unit")
    public String periodUnit;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("total_size")
    public Long totalSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("user_count")
    public Long userCount;

    public static QueryOrderPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderPriceRequest self = new QueryOrderPriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrderPriceRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrderPriceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryOrderPriceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public QueryOrderPriceRequest set_package(String _package) {
        this._package = _package;
        return this;
    }
    public String get_package() {
        return this._package;
    }

    public QueryOrderPriceRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public QueryOrderPriceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public QueryOrderPriceRequest setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryOrderPriceRequest setUserCount(Long userCount) {
        this.userCount = userCount;
        return this;
    }
    public Long getUserCount() {
        return this.userCount;
    }

}
