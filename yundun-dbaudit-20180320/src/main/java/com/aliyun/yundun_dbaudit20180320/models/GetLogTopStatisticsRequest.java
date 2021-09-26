// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogTopStatisticsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DbId")
    public Integer dbId;

    @NameInMap("TopTime")
    public String topTime;

    public static GetLogTopStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogTopStatisticsRequest self = new GetLogTopStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetLogTopStatisticsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetLogTopStatisticsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetLogTopStatisticsRequest setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public GetLogTopStatisticsRequest setTopTime(String topTime) {
        this.topTime = topTime;
        return this;
    }
    public String getTopTime() {
        return this.topTime;
    }

}
