// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateSimilarSecurityEventsQueryTaskRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the alert event.</p>
     * <br>
     * <p>>  You must specify at least one of the SecurityEventId and SimilarEventScenarioCode parameters.</p>
     */
    @NameInMap("SecurityEventId")
    public Long securityEventId;

    /**
     * <p>The codes of alert events that are triggered by the same rule or of the same alert type.</p>
     * <br>
     * <p>>  You must specify at least one of the SecurityEventId and SimilarEventScenarioCode parameters.</p>
     */
    @NameInMap("SimilarEventScenarioCode")
    public String similarEventScenarioCode;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static CreateSimilarSecurityEventsQueryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSimilarSecurityEventsQueryTaskRequest self = new CreateSimilarSecurityEventsQueryTaskRequest();
        return TeaModel.build(map, self);
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

    public CreateSimilarSecurityEventsQueryTaskRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
