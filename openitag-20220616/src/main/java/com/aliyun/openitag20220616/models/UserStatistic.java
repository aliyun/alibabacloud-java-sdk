// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class UserStatistic extends TeaModel {
    @NameInMap("AcceptedMarkItemsCount")
    public Float acceptedMarkItemsCount;

    @NameInMap("CheckCount")
    public Float checkCount;

    @NameInMap("CheckedAcceptedCount")
    public Float checkedAcceptedCount;

    @NameInMap("CheckedAccuracy")
    public Float checkedAccuracy;

    @NameInMap("MarkEfficiency")
    public Float markEfficiency;

    @NameInMap("MarkTime")
    public Float markTime;

    @NameInMap("SamplingAccuracy")
    public Float samplingAccuracy;

    @NameInMap("SamplingCount")
    public Float samplingCount;

    @NameInMap("SamplingErrorCount")
    public Float samplingErrorCount;

    @NameInMap("TotalMarkItemsCount")
    public Float totalMarkItemsCount;

    @NameInMap("UserId")
    public String userId;

    public static UserStatistic build(java.util.Map<String, ?> map) throws Exception {
        UserStatistic self = new UserStatistic();
        return TeaModel.build(map, self);
    }

    public UserStatistic setAcceptedMarkItemsCount(Float acceptedMarkItemsCount) {
        this.acceptedMarkItemsCount = acceptedMarkItemsCount;
        return this;
    }
    public Float getAcceptedMarkItemsCount() {
        return this.acceptedMarkItemsCount;
    }

    public UserStatistic setCheckCount(Float checkCount) {
        this.checkCount = checkCount;
        return this;
    }
    public Float getCheckCount() {
        return this.checkCount;
    }

    public UserStatistic setCheckedAcceptedCount(Float checkedAcceptedCount) {
        this.checkedAcceptedCount = checkedAcceptedCount;
        return this;
    }
    public Float getCheckedAcceptedCount() {
        return this.checkedAcceptedCount;
    }

    public UserStatistic setCheckedAccuracy(Float checkedAccuracy) {
        this.checkedAccuracy = checkedAccuracy;
        return this;
    }
    public Float getCheckedAccuracy() {
        return this.checkedAccuracy;
    }

    public UserStatistic setMarkEfficiency(Float markEfficiency) {
        this.markEfficiency = markEfficiency;
        return this;
    }
    public Float getMarkEfficiency() {
        return this.markEfficiency;
    }

    public UserStatistic setMarkTime(Float markTime) {
        this.markTime = markTime;
        return this;
    }
    public Float getMarkTime() {
        return this.markTime;
    }

    public UserStatistic setSamplingAccuracy(Float samplingAccuracy) {
        this.samplingAccuracy = samplingAccuracy;
        return this;
    }
    public Float getSamplingAccuracy() {
        return this.samplingAccuracy;
    }

    public UserStatistic setSamplingCount(Float samplingCount) {
        this.samplingCount = samplingCount;
        return this;
    }
    public Float getSamplingCount() {
        return this.samplingCount;
    }

    public UserStatistic setSamplingErrorCount(Float samplingErrorCount) {
        this.samplingErrorCount = samplingErrorCount;
        return this;
    }
    public Float getSamplingErrorCount() {
        return this.samplingErrorCount;
    }

    public UserStatistic setTotalMarkItemsCount(Float totalMarkItemsCount) {
        this.totalMarkItemsCount = totalMarkItemsCount;
        return this;
    }
    public Float getTotalMarkItemsCount() {
        return this.totalMarkItemsCount;
    }

    public UserStatistic setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
