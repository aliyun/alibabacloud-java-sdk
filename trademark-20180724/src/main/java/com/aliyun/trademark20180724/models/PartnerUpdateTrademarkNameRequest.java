// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class PartnerUpdateTrademarkNameRequest extends TeaModel {
    // tmIcon
    @NameInMap("TmIcon")
    public String tmIcon;

    // aliyunKp
    @NameInMap("AliyunKp")
    public String aliyunKp;

    // type
    @NameInMap("Type")
    public Integer type;

    // bizId
    @NameInMap("BizId")
    public String bizId;

    // callerType
    @NameInMap("CallerType")
    public String callerType;

    // callerParentId
    @NameInMap("CallerParentId")
    public Long callerParentId;

    // tmComment
    @NameInMap("TmComment")
    public String tmComment;

    // tmName
    @NameInMap("TmName")
    public String tmName;

    // bid
    @NameInMap("Bid")
    public String bid;

    @NameInMap("EventSceneType")
    public String eventSceneType;

    public static PartnerUpdateTrademarkNameRequest build(java.util.Map<String, ?> map) throws Exception {
        PartnerUpdateTrademarkNameRequest self = new PartnerUpdateTrademarkNameRequest();
        return TeaModel.build(map, self);
    }

    public PartnerUpdateTrademarkNameRequest setTmIcon(String tmIcon) {
        this.tmIcon = tmIcon;
        return this;
    }
    public String getTmIcon() {
        return this.tmIcon;
    }

    public PartnerUpdateTrademarkNameRequest setAliyunKp(String aliyunKp) {
        this.aliyunKp = aliyunKp;
        return this;
    }
    public String getAliyunKp() {
        return this.aliyunKp;
    }

    public PartnerUpdateTrademarkNameRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public PartnerUpdateTrademarkNameRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public PartnerUpdateTrademarkNameRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public PartnerUpdateTrademarkNameRequest setCallerParentId(Long callerParentId) {
        this.callerParentId = callerParentId;
        return this;
    }
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    public PartnerUpdateTrademarkNameRequest setTmComment(String tmComment) {
        this.tmComment = tmComment;
        return this;
    }
    public String getTmComment() {
        return this.tmComment;
    }

    public PartnerUpdateTrademarkNameRequest setTmName(String tmName) {
        this.tmName = tmName;
        return this;
    }
    public String getTmName() {
        return this.tmName;
    }

    public PartnerUpdateTrademarkNameRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public PartnerUpdateTrademarkNameRequest setEventSceneType(String eventSceneType) {
        this.eventSceneType = eventSceneType;
        return this;
    }
    public String getEventSceneType() {
        return this.eventSceneType;
    }

}
