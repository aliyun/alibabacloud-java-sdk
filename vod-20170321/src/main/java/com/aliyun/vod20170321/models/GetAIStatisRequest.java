// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAIStatisRequest extends TeaModel {
    @NameInMap("Division")
    public String division;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("EndTimeUTC")
    public String endTimeUTC;

    /**
     * <p>This parameter is required.</p>
     */
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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetAIStatisRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAIStatisRequest self = new GetAIStatisRequest();
        return TeaModel.build(map, self);
    }

    public GetAIStatisRequest setDivision(String division) {
        this.division = division;
        return this;
    }
    public String getDivision() {
        return this.division;
    }

    public GetAIStatisRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetAIStatisRequest setEndTimeUTC(String endTimeUTC) {
        this.endTimeUTC = endTimeUTC;
        return this;
    }
    public String getEndTimeUTC() {
        return this.endTimeUTC;
    }

    public GetAIStatisRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public GetAIStatisRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GetAIStatisRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public GetAIStatisRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetAIStatisRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetAIStatisRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetAIStatisRequest setStartTimeUTC(String startTimeUTC) {
        this.startTimeUTC = startTimeUTC;
        return this;
    }
    public String getStartTimeUTC() {
        return this.startTimeUTC;
    }

    public GetAIStatisRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
