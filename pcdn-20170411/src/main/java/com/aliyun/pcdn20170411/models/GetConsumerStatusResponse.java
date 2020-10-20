// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetConsumerStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("IntegreatedMode")
    @Validation(required = true)
    public Integer integreatedMode;

    @NameInMap("Inservice")
    @Validation(required = true)
    public Boolean inservice;

    @NameInMap("RealtimeMonitor")
    @Validation(required = true)
    public Boolean realtimeMonitor;

    @NameInMap("LiveMonitor")
    @Validation(required = true)
    public Boolean liveMonitor;

    @NameInMap("CdnUrlRedirectFlag")
    @Validation(required = true)
    public Boolean cdnUrlRedirectFlag;

    @NameInMap("BusinessType")
    @Validation(required = true)
    public String businessType;

    @NameInMap("Audit")
    @Validation(required = true)
    public Integer audit;

    @NameInMap("Comment")
    @Validation(required = true)
    public String comment;

    @NameInMap("CreatedAt")
    @Validation(required = true)
    public String createdAt;

    @NameInMap("UpdatedAt")
    @Validation(required = true)
    public String updatedAt;

    public static GetConsumerStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerStatusResponse self = new GetConsumerStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetConsumerStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConsumerStatusResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetConsumerStatusResponse setIntegreatedMode(Integer integreatedMode) {
        this.integreatedMode = integreatedMode;
        return this;
    }
    public Integer getIntegreatedMode() {
        return this.integreatedMode;
    }

    public GetConsumerStatusResponse setInservice(Boolean inservice) {
        this.inservice = inservice;
        return this;
    }
    public Boolean getInservice() {
        return this.inservice;
    }

    public GetConsumerStatusResponse setRealtimeMonitor(Boolean realtimeMonitor) {
        this.realtimeMonitor = realtimeMonitor;
        return this;
    }
    public Boolean getRealtimeMonitor() {
        return this.realtimeMonitor;
    }

    public GetConsumerStatusResponse setLiveMonitor(Boolean liveMonitor) {
        this.liveMonitor = liveMonitor;
        return this;
    }
    public Boolean getLiveMonitor() {
        return this.liveMonitor;
    }

    public GetConsumerStatusResponse setCdnUrlRedirectFlag(Boolean cdnUrlRedirectFlag) {
        this.cdnUrlRedirectFlag = cdnUrlRedirectFlag;
        return this;
    }
    public Boolean getCdnUrlRedirectFlag() {
        return this.cdnUrlRedirectFlag;
    }

    public GetConsumerStatusResponse setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public GetConsumerStatusResponse setAudit(Integer audit) {
        this.audit = audit;
        return this;
    }
    public Integer getAudit() {
        return this.audit;
    }

    public GetConsumerStatusResponse setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public GetConsumerStatusResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public GetConsumerStatusResponse setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
