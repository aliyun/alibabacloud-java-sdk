// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class UserStatistic extends TeaModel {
    /**
     * <p>Quantity of Data items passed</p>
     * 
     * <strong>example:</strong>
     * <p>172</p>
     */
    @NameInMap("AcceptedMarkItemsCount")
    public Float acceptedMarkItemsCount;

    /**
     * <p>Total inspection count</p>
     * 
     * <strong>example:</strong>
     * <p>140</p>
     */
    @NameInMap("CheckCount")
    public Float checkCount;

    /**
     * <p>Quantity passed in inspection</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("CheckedAcceptedCount")
    public Float checkedAcceptedCount;

    /**
     * <p>Inspection accuracy.<br>Inspection accuracy = Number Of Error inspected / Quantity inspected</p>
     * 
     * <strong>example:</strong>
     * <p>95.33</p>
     */
    @NameInMap("CheckedAccuracy")
    public Float checkedAccuracy;

    /**
     * <p>Annotation efficiency. Unit: items/hour<br>Annotation efficiency = Quantity annotated / Annotation duration (including rejections)</p>
     * 
     * <strong>example:</strong>
     * <p>0.1</p>
     */
    @NameInMap("MarkEfficiency")
    public Float markEfficiency;

    /**
     * <p>Annotation duration. Unit: hours</p>
     * 
     * <strong>example:</strong>
     * <p>0.1</p>
     */
    @NameInMap("MarkTime")
    public Float markTime;

    /**
     * <p>Sampling accuracy.<br>Validated accuracy = Number Of Error validated / Quantity validated</p>
     * 
     * <strong>example:</strong>
     * <p>84.92</p>
     */
    @NameInMap("SamplingAccuracy")
    public Float samplingAccuracy;

    /**
     * <p>Total sampling quantity</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SamplingCount")
    public Float samplingCount;

    /**
     * <p>Number Of Error in sampling</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SamplingErrorCount")
    public Float samplingErrorCount;

    /**
     * <p>Total Data items</p>
     * 
     * <strong>example:</strong>
     * <p>172</p>
     */
    @NameInMap("TotalMarkItemsCount")
    public Float totalMarkItemsCount;

    /**
     * <p>User ID</p>
     * 
     * <strong>example:</strong>
     * <p>166***9980757311</p>
     */
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
