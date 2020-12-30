// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetConsumerStatusResponseBody extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("LiveMonitor")
    public Boolean liveMonitor;

    @NameInMap("Audit")
    public Integer audit;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IntegreatedMode")
    public Integer integreatedMode;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("CdnUrlRedirectFlag")
    public Boolean cdnUrlRedirectFlag;

    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("Inservice")
    public Boolean inservice;

    @NameInMap("RealtimeMonitor")
    public Boolean realtimeMonitor;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    public static GetConsumerStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerStatusResponseBody self = new GetConsumerStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConsumerStatusResponseBody setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public GetConsumerStatusResponseBody setLiveMonitor(Boolean liveMonitor) {
        this.liveMonitor = liveMonitor;
        return this;
    }
    public Boolean getLiveMonitor() {
        return this.liveMonitor;
    }

    public GetConsumerStatusResponseBody setAudit(Integer audit) {
        this.audit = audit;
        return this;
    }
    public Integer getAudit() {
        return this.audit;
    }

    public GetConsumerStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConsumerStatusResponseBody setIntegreatedMode(Integer integreatedMode) {
        this.integreatedMode = integreatedMode;
        return this;
    }
    public Integer getIntegreatedMode() {
        return this.integreatedMode;
    }

    public GetConsumerStatusResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public GetConsumerStatusResponseBody setCdnUrlRedirectFlag(Boolean cdnUrlRedirectFlag) {
        this.cdnUrlRedirectFlag = cdnUrlRedirectFlag;
        return this;
    }
    public Boolean getCdnUrlRedirectFlag() {
        return this.cdnUrlRedirectFlag;
    }

    public GetConsumerStatusResponseBody setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public GetConsumerStatusResponseBody setInservice(Boolean inservice) {
        this.inservice = inservice;
        return this;
    }
    public Boolean getInservice() {
        return this.inservice;
    }

    public GetConsumerStatusResponseBody setRealtimeMonitor(Boolean realtimeMonitor) {
        this.realtimeMonitor = realtimeMonitor;
        return this;
    }
    public Boolean getRealtimeMonitor() {
        return this.realtimeMonitor;
    }

    public GetConsumerStatusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetConsumerStatusResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
