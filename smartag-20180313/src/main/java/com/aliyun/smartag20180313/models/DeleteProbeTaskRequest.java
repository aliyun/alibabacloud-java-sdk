// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteProbeTaskRequest extends TeaModel {
    @NameInMap("ProbeTaskId")
    public String probeTaskId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SagId")
    public String sagId;

    @NameInMap("Sn")
    public String sn;

    public static DeleteProbeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProbeTaskRequest self = new DeleteProbeTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProbeTaskRequest setProbeTaskId(String probeTaskId) {
        this.probeTaskId = probeTaskId;
        return this;
    }
    public String getProbeTaskId() {
        return this.probeTaskId;
    }

    public DeleteProbeTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteProbeTaskRequest setSagId(String sagId) {
        this.sagId = sagId;
        return this;
    }
    public String getSagId() {
        return this.sagId;
    }

    public DeleteProbeTaskRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

}
