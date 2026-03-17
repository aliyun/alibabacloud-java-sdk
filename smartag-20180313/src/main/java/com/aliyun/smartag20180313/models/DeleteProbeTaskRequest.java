// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteProbeTaskRequest extends TeaModel {
    /**
     * <p>The ID of the probe task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>probe-****</p>
     */
    @NameInMap("ProbeTaskId")
    public String probeTaskId;

    /**
     * <p>The region ID of the Smart Access Gateway (SAG) instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the SAG instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-****</p>
     */
    @NameInMap("SagId")
    public String sagId;

    /**
     * <p>The serial number of the SAG device.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag****</p>
     */
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
