// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSimilarEventScenariosRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the alert event.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to query the ID of the alert event.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12321</p>
     */
    @NameInMap("SecurityEventId")
    public Long securityEventId;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeSimilarEventScenariosRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSimilarEventScenariosRequest self = new DescribeSimilarEventScenariosRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSimilarEventScenariosRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSimilarEventScenariosRequest setSecurityEventId(Long securityEventId) {
        this.securityEventId = securityEventId;
        return this;
    }
    public Long getSecurityEventId() {
        return this.securityEventId;
    }

    public DescribeSimilarEventScenariosRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
