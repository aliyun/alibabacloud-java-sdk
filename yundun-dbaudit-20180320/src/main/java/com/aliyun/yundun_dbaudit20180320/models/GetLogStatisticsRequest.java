// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogStatisticsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DbId")
    public Integer dbId;

    @NameInMap("BeginDate")
    public String beginDate;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("ByDbId")
    public Integer byDbId;

    @NameInMap("ByClientIp")
    public Integer byClientIp;

    @NameInMap("ByDbUser")
    public Integer byDbUser;

    @NameInMap("ByDbServer")
    public Integer byDbServer;

    @NameInMap("ByClientProgram")
    public Integer byClientProgram;

    @NameInMap("BySqlType")
    public Integer bySqlType;

    public static GetLogStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogStatisticsRequest self = new GetLogStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetLogStatisticsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetLogStatisticsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetLogStatisticsRequest setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public GetLogStatisticsRequest setBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public String getBeginDate() {
        return this.beginDate;
    }

    public GetLogStatisticsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetLogStatisticsRequest setByDbId(Integer byDbId) {
        this.byDbId = byDbId;
        return this;
    }
    public Integer getByDbId() {
        return this.byDbId;
    }

    public GetLogStatisticsRequest setByClientIp(Integer byClientIp) {
        this.byClientIp = byClientIp;
        return this;
    }
    public Integer getByClientIp() {
        return this.byClientIp;
    }

    public GetLogStatisticsRequest setByDbUser(Integer byDbUser) {
        this.byDbUser = byDbUser;
        return this;
    }
    public Integer getByDbUser() {
        return this.byDbUser;
    }

    public GetLogStatisticsRequest setByDbServer(Integer byDbServer) {
        this.byDbServer = byDbServer;
        return this;
    }
    public Integer getByDbServer() {
        return this.byDbServer;
    }

    public GetLogStatisticsRequest setByClientProgram(Integer byClientProgram) {
        this.byClientProgram = byClientProgram;
        return this;
    }
    public Integer getByClientProgram() {
        return this.byClientProgram;
    }

    public GetLogStatisticsRequest setBySqlType(Integer bySqlType) {
        this.bySqlType = bySqlType;
        return this;
    }
    public Integer getBySqlType() {
        return this.bySqlType;
    }

}
