// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CreateAgingRequest extends TeaModel {
    // 结束时间
    @NameInMap("EndTime")
    public Long endTime;

    // sass实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 名称
    @NameInMap("Name")
    public String name;

    // 店铺ID
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

    public static CreateAgingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgingRequest self = new CreateAgingRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgingRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateAgingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAgingRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAgingRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public CreateAgingRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateAgingRequest setTimeDay(String timeDay) {
        this.timeDay = timeDay;
        return this;
    }
    public String getTimeDay() {
        return this.timeDay;
    }

    public CreateAgingRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
