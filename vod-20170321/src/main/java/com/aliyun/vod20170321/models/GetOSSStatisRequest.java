// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetOSSStatisRequest extends TeaModel {
    @NameInMap("Division")
    public String division;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("EndTimeUTC")
    public String endTimeUTC;

    @NameInMap("Level")
    public String level;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("StartTimeUTC")
    public String startTimeUTC;

    public static GetOSSStatisRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOSSStatisRequest self = new GetOSSStatisRequest();
        return TeaModel.build(map, self);
    }

    public GetOSSStatisRequest setDivision(String division) {
        this.division = division;
        return this;
    }
    public String getDivision() {
        return this.division;
    }

    public GetOSSStatisRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetOSSStatisRequest setEndTimeUTC(String endTimeUTC) {
        this.endTimeUTC = endTimeUTC;
        return this;
    }
    public String getEndTimeUTC() {
        return this.endTimeUTC;
    }

    public GetOSSStatisRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public GetOSSStatisRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GetOSSStatisRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public GetOSSStatisRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetOSSStatisRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetOSSStatisRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetOSSStatisRequest setStartTimeUTC(String startTimeUTC) {
        this.startTimeUTC = startTimeUTC;
        return this;
    }
    public String getStartTimeUTC() {
        return this.startTimeUTC;
    }

}
