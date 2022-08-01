// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetShipperConfigResponseBody extends TeaModel {
    @NameInMap("createTime")
    public Long createTime;

    @NameInMap("lastModifyTime")
    public Long lastModifyTime;

    @NameInMap("shipperName")
    public String shipperName;

    @NameInMap("targetConfiguration")
    public java.util.Map<String, ?> targetConfiguration;

    @NameInMap("targetType")
    public String targetType;

    public static GetShipperConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetShipperConfigResponseBody self = new GetShipperConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetShipperConfigResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetShipperConfigResponseBody setLastModifyTime(Long lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }
    public Long getLastModifyTime() {
        return this.lastModifyTime;
    }

    public GetShipperConfigResponseBody setShipperName(String shipperName) {
        this.shipperName = shipperName;
        return this;
    }
    public String getShipperName() {
        return this.shipperName;
    }

    public GetShipperConfigResponseBody setTargetConfiguration(java.util.Map<String, ?> targetConfiguration) {
        this.targetConfiguration = targetConfiguration;
        return this;
    }
    public java.util.Map<String, ?> getTargetConfiguration() {
        return this.targetConfiguration;
    }

    public GetShipperConfigResponseBody setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
