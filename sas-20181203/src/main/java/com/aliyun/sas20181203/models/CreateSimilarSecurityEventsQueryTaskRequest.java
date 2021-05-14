// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateSimilarSecurityEventsQueryTaskRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityEventId")
    public Long securityEventId;

    @NameInMap("SimilarEventScenarioCode")
    public String similarEventScenarioCode;

    public static CreateSimilarSecurityEventsQueryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSimilarSecurityEventsQueryTaskRequest self = new CreateSimilarSecurityEventsQueryTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateSimilarSecurityEventsQueryTaskRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateSimilarSecurityEventsQueryTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSimilarSecurityEventsQueryTaskRequest setSecurityEventId(Long securityEventId) {
        this.securityEventId = securityEventId;
        return this;
    }
    public Long getSecurityEventId() {
        return this.securityEventId;
    }

    public CreateSimilarSecurityEventsQueryTaskRequest setSimilarEventScenarioCode(String similarEventScenarioCode) {
        this.similarEventScenarioCode = similarEventScenarioCode;
        return this;
    }
    public String getSimilarEventScenarioCode() {
        return this.similarEventScenarioCode;
    }

}
