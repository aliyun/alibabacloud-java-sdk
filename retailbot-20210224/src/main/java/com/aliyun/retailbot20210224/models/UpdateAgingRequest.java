// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpdateAgingRequest extends TeaModel {
    // 结束时间
    @NameInMap("EndTime")
    public Long endTime;

    // sass实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // 时效名称
    @NameInMap("Name")
    public String name;

    // 店铺id
    @NameInMap("ShopId")
    public String shopId;

    // 开始时间
    @NameInMap("StartTime")
    public Long startTime;

    // 循环日期,星期为单位,用逗号分割
    // 1,2,3,4,5,6,7
    @NameInMap("TimeDay")
    public String timeDay;

    // 时效类型,
    // 1:固定时效
    // 2:循环时效
    @NameInMap("Type")
    public String type;

    public static UpdateAgingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgingRequest self = new UpdateAgingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgingRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public UpdateAgingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateAgingRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAgingRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public UpdateAgingRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public UpdateAgingRequest setTimeDay(String timeDay) {
        this.timeDay = timeDay;
        return this;
    }
    public String getTimeDay() {
        return this.timeDay;
    }

    public UpdateAgingRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
