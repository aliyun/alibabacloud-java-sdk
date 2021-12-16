// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetCallsPerDayRequest extends TeaModel {
    @NameInMap("DataId")
    public String dataId;

    @NameInMap("DataIdEnd")
    public String dataIdEnd;

    @NameInMap("DataIdStart")
    public String dataIdStart;

    @NameInMap("HavePhoneNumbers")
    public String havePhoneNumbers;

    @NameInMap("HourId")
    public String hourId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MinuteId")
    public String minuteId;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PhoneNumbers")
    public String phoneNumbers;

    public static GetCallsPerDayRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCallsPerDayRequest self = new GetCallsPerDayRequest();
        return TeaModel.build(map, self);
    }

    public GetCallsPerDayRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public GetCallsPerDayRequest setDataIdEnd(String dataIdEnd) {
        this.dataIdEnd = dataIdEnd;
        return this;
    }
    public String getDataIdEnd() {
        return this.dataIdEnd;
    }

    public GetCallsPerDayRequest setDataIdStart(String dataIdStart) {
        this.dataIdStart = dataIdStart;
        return this;
    }
    public String getDataIdStart() {
        return this.dataIdStart;
    }

    public GetCallsPerDayRequest setHavePhoneNumbers(String havePhoneNumbers) {
        this.havePhoneNumbers = havePhoneNumbers;
        return this;
    }
    public String getHavePhoneNumbers() {
        return this.havePhoneNumbers;
    }

    public GetCallsPerDayRequest setHourId(String hourId) {
        this.hourId = hourId;
        return this;
    }
    public String getHourId() {
        return this.hourId;
    }

    public GetCallsPerDayRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetCallsPerDayRequest setMinuteId(String minuteId) {
        this.minuteId = minuteId;
        return this;
    }
    public String getMinuteId() {
        return this.minuteId;
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

    public GetCallsPerDayRequest setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

}
