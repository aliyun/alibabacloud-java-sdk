// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DeregisterTemplatesFromRuleRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SentenceParam")
    public String sentenceParam;

    public static DeregisterTemplatesFromRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeregisterTemplatesFromRuleRequest self = new DeregisterTemplatesFromRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeregisterTemplatesFromRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeregisterTemplatesFromRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeregisterTemplatesFromRuleRequest setSentenceParam(String sentenceParam) {
        this.sentenceParam = sentenceParam;
        return this;
    }
    public String getSentenceParam() {
        return this.sentenceParam;
    }

}
