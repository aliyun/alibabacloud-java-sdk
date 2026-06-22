// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateSimilarSecurityEventsQueryTaskRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the alert event.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>14323</p>
     */
    @NameInMap("SecurityEventId")
    public Long securityEventId;

    /**
     * <p>The code of the alerting event that has the same type or rule hits.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("SimilarEventScenarioCode")
    public String similarEventScenarioCode;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.XX.XX</p>
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
