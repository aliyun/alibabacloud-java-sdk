// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ComplementIntentionUserIdRequest extends TeaModel {
    // aliyunKp
    @NameInMap("AliyunKp")
    public String aliyunKp;

    // bid
    @NameInMap("Bid")
    public String bid;

    // bizId
    @NameInMap("BizId")
    public String bizId;

    // callerParentId
    @NameInMap("CallerParentId")
    public Long callerParentId;

    // callerType
    @NameInMap("CallerType")
    public String callerType;

    @NameInMap("ComplementUserId")
    public String complementUserId;

    // type
    @NameInMap("Type")
    public Integer type;

    public static ComplementIntentionUserIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ComplementIntentionUserIdRequest self = new ComplementIntentionUserIdRequest();
        return TeaModel.build(map, self);
    }

    public ComplementIntentionUserIdRequest setAliyunKp(String aliyunKp) {
        this.aliyunKp = aliyunKp;
        return this;
    }
    public String getAliyunKp() {
        return this.aliyunKp;
    }

    public ComplementIntentionUserIdRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public ComplementIntentionUserIdRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ComplementIntentionUserIdRequest setCallerParentId(Long callerParentId) {
        this.callerParentId = callerParentId;
        return this;
    }
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    public ComplementIntentionUserIdRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public ComplementIntentionUserIdRequest setComplementUserId(String complementUserId) {
        this.complementUserId = complementUserId;
        return this;
    }
    public String getComplementUserId() {
        return this.complementUserId;
    }

    public ComplementIntentionUserIdRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
