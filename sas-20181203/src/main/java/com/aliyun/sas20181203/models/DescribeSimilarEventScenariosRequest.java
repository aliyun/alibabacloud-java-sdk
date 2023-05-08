// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSimilarEventScenariosRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityEventId")
    public Long securityEventId;

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
