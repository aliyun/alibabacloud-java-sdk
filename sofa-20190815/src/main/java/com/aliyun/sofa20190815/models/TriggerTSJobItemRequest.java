// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class TriggerTSJobItemRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("ParamMap")
    public String paramMap;

    @NameInMap("Zone")
    public String zone;

    public static TriggerTSJobItemRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerTSJobItemRequest self = new TriggerTSJobItemRequest();
        return TeaModel.build(map, self);
    }

    public TriggerTSJobItemRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TriggerTSJobItemRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public TriggerTSJobItemRequest setParamMap(String paramMap) {
        this.paramMap = paramMap;
        return this;
    }
    public String getParamMap() {
        return this.paramMap;
    }

    public TriggerTSJobItemRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
