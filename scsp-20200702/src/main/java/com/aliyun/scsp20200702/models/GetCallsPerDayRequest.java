// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetCallsPerDayRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DataIdStart")
    public String dataIdStart;

    @NameInMap("DataIdEnd")
    public String dataIdEnd;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("HourId")
    public String hourId;

    @NameInMap("MinuteId")
    public String minuteId;

    @NameInMap("PhoneNumbers")
    public String phoneNumbers;

    @NameInMap("HavePhoneNumbers")
    public String havePhoneNumbers;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    public static GetCallsPerDayRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCallsPerDayRequest self = new GetCallsPerDayRequest();
        return TeaModel.build(map, self);
    }

    public GetCallsPerDayRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetCallsPerDayRequest setDataIdStart(String dataIdStart) {
        this.dataIdStart = dataIdStart;
        return this;
    }
    public String getDataIdStart() {
        return this.dataIdStart;
    }

    public GetCallsPerDayRequest setDataIdEnd(String dataIdEnd) {
        this.dataIdEnd = dataIdEnd;
        return this;
    }
    public String getDataIdEnd() {
        return this.dataIdEnd;
    }

    public GetCallsPerDayRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public GetCallsPerDayRequest setHourId(String hourId) {
        this.hourId = hourId;
        return this;
    }
    public String getHourId() {
        return this.hourId;
    }

    public GetCallsPerDayRequest setMinuteId(String minuteId) {
        this.minuteId = minuteId;
        return this;
    }
    public String getMinuteId() {
        return this.minuteId;
    }

    public GetCallsPerDayRequest setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public GetCallsPerDayRequest setHavePhoneNumbers(String havePhoneNumbers) {
        this.havePhoneNumbers = havePhoneNumbers;
        return this;
    }
    public String getHavePhoneNumbers() {
        return this.havePhoneNumbers;
    }

    public GetCallsPerDayRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public GetCallsPerDayRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
