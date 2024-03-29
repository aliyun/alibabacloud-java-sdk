// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateVideoSummaryTaskRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("EndTimeStamp")
    public Long endTimeStamp;

    @NameInMap("LiveVideoSummary")
    public String liveVideoSummary;

    @NameInMap("OptionList")
    public String optionList;

    @NameInMap("StartTimeStamp")
    public Long startTimeStamp;

    public static CreateVideoSummaryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoSummaryTaskRequest self = new CreateVideoSummaryTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateVideoSummaryTaskRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public CreateVideoSummaryTaskRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public CreateVideoSummaryTaskRequest setEndTimeStamp(Long endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
        return this;
    }
    public Long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    public CreateVideoSummaryTaskRequest setLiveVideoSummary(String liveVideoSummary) {
        this.liveVideoSummary = liveVideoSummary;
        return this;
    }
    public String getLiveVideoSummary() {
        return this.liveVideoSummary;
    }

    public CreateVideoSummaryTaskRequest setOptionList(String optionList) {
        this.optionList = optionList;
        return this;
    }
    public String getOptionList() {
        return this.optionList;
    }

    public CreateVideoSummaryTaskRequest setStartTimeStamp(Long startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
        return this;
    }
    public Long getStartTimeStamp() {
        return this.startTimeStamp;
    }

}
