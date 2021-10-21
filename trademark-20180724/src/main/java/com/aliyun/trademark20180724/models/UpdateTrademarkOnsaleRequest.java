// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UpdateTrademarkOnsaleRequest extends TeaModel {
    @NameInMap("ClassificationCode")
    public String classificationCode;

    @NameInMap("TmName")
    public String tmName;

    @NameInMap("TmIcon")
    public String tmIcon;

    @NameInMap("OriginalPrice")
    public Float originalPrice;

    @NameInMap("TmNumber")
    public String tmNumber;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("Label")
    public String label;

    @NameInMap("RegAnnDate")
    public Long regAnnDate;

    @NameInMap("OwnerName")
    public String ownerName;

    @NameInMap("OwnerEnName")
    public String ownerEnName;

    @NameInMap("SecondaryClassification")
    public String secondaryClassification;

    @NameInMap("ThirdClassification")
    public String thirdClassification;

    @NameInMap("Type")
    public String type;

    @NameInMap("Reason")
    public String reason;

    public static UpdateTrademarkOnsaleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrademarkOnsaleRequest self = new UpdateTrademarkOnsaleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTrademarkOnsaleRequest setClassificationCode(String classificationCode) {
        this.classificationCode = classificationCode;
        return this;
    }
    public String getClassificationCode() {
        return this.classificationCode;
    }

    public UpdateTrademarkOnsaleRequest setTmName(String tmName) {
        this.tmName = tmName;
        return this;
    }
    public String getTmName() {
        return this.tmName;
    }

    public UpdateTrademarkOnsaleRequest setTmIcon(String tmIcon) {
        this.tmIcon = tmIcon;
        return this;
    }
    public String getTmIcon() {
        return this.tmIcon;
    }

    public UpdateTrademarkOnsaleRequest setOriginalPrice(Float originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }
    public Float getOriginalPrice() {
        return this.originalPrice;
    }

    public UpdateTrademarkOnsaleRequest setTmNumber(String tmNumber) {
        this.tmNumber = tmNumber;
        return this;
    }
    public String getTmNumber() {
        return this.tmNumber;
    }

    public UpdateTrademarkOnsaleRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public UpdateTrademarkOnsaleRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public UpdateTrademarkOnsaleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTrademarkOnsaleRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public UpdateTrademarkOnsaleRequest setRegAnnDate(Long regAnnDate) {
        this.regAnnDate = regAnnDate;
        return this;
    }
    public Long getRegAnnDate() {
        return this.regAnnDate;
    }

    public UpdateTrademarkOnsaleRequest setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public UpdateTrademarkOnsaleRequest setOwnerEnName(String ownerEnName) {
        this.ownerEnName = ownerEnName;
        return this;
    }
    public String getOwnerEnName() {
        return this.ownerEnName;
    }

    public UpdateTrademarkOnsaleRequest setSecondaryClassification(String secondaryClassification) {
        this.secondaryClassification = secondaryClassification;
        return this;
    }
    public String getSecondaryClassification() {
        return this.secondaryClassification;
    }

    public UpdateTrademarkOnsaleRequest setThirdClassification(String thirdClassification) {
        this.thirdClassification = thirdClassification;
        return this;
    }
    public String getThirdClassification() {
        return this.thirdClassification;
    }

    public UpdateTrademarkOnsaleRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateTrademarkOnsaleRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
