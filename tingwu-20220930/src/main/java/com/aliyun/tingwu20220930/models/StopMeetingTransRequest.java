// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20220930.models;

import com.aliyun.tea.*;

public class StopMeetingTransRequest extends TeaModel {
    @NameInMap("MeetingRoleNum")
    public Integer meetingRoleNum;

    @NameInMap("OnlyRoleSplitResult")
    public Boolean onlyRoleSplitResult;

    public static StopMeetingTransRequest build(java.util.Map<String, ?> map) throws Exception {
        StopMeetingTransRequest self = new StopMeetingTransRequest();
        return TeaModel.build(map, self);
    }

    public StopMeetingTransRequest setMeetingRoleNum(Integer meetingRoleNum) {
        this.meetingRoleNum = meetingRoleNum;
        return this;
    }
    public Integer getMeetingRoleNum() {
        return this.meetingRoleNum;
    }

    public StopMeetingTransRequest setOnlyRoleSplitResult(Boolean onlyRoleSplitResult) {
        this.onlyRoleSplitResult = onlyRoleSplitResult;
        return this;
    }
    public Boolean getOnlyRoleSplitResult() {
        return this.onlyRoleSplitResult;
    }

}
