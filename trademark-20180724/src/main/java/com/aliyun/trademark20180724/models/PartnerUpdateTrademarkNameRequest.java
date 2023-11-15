// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class PartnerUpdateTrademarkNameRequest extends TeaModel {
    @NameInMap("AliyunKp")
    public String aliyunKp;

    @NameInMap("Bid")
    public String bid;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CallerParentId")
    public Long callerParentId;

    @NameInMap("CallerType")
    public String callerType;

    @NameInMap("EventSceneType")
    public Long eventSceneType;

    @NameInMap("IntentionBizId")
    public String intentionBizId;

    @NameInMap("TmComment")
    public String tmComment;

    @NameInMap("TmIcon")
    public String tmIcon;

    @NameInMap("TmName")
    public String tmName;

    @NameInMap("Type")
    public Integer type;

    public static PartnerUpdateTrademarkNameRequest build(java.util.Map<String, ?> map) throws Exception {
        PartnerUpdateTrademarkNameRequest self = new PartnerUpdateTrademarkNameRequest();
        return TeaModel.build(map, self);
    }

    public PartnerUpdateTrademarkNameRequest setAliyunKp(String aliyunKp) {
        this.aliyunKp = aliyunKp;
        return this;
    }
    public String getAliyunKp() {
        return this.aliyunKp;
    }

    public PartnerUpdateTrademarkNameRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public PartnerUpdateTrademarkNameRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public PartnerUpdateTrademarkNameRequest setCallerParentId(Long callerParentId) {
        this.callerParentId = callerParentId;
        return this;
    }
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    public PartnerUpdateTrademarkNameRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public PartnerUpdateTrademarkNameRequest setEventSceneType(Long eventSceneType) {
        this.eventSceneType = eventSceneType;
        return this;
    }
    public Long getEventSceneType() {
        return this.eventSceneType;
    }

    public PartnerUpdateTrademarkNameRequest setIntentionBizId(String intentionBizId) {
        this.intentionBizId = intentionBizId;
        return this;
    }
    public String getIntentionBizId() {
        return this.intentionBizId;
    }

    public PartnerUpdateTrademarkNameRequest setTmComment(String tmComment) {
        this.tmComment = tmComment;
        return this;
    }
    public String getTmComment() {
        return this.tmComment;
    }

    public PartnerUpdateTrademarkNameRequest setTmIcon(String tmIcon) {
        this.tmIcon = tmIcon;
        return this;
    }
    public String getTmIcon() {
        return this.tmIcon;
    }

    public PartnerUpdateTrademarkNameRequest setTmName(String tmName) {
        this.tmName = tmName;
        return this;
    }
    public String getTmName() {
        return this.tmName;
    }

    public PartnerUpdateTrademarkNameRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
