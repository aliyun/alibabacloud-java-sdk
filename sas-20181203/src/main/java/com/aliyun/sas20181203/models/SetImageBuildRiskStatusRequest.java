// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetImageBuildRiskStatusRequest extends TeaModel {
    /**
     * <p>The UUIDs of images. Separate multiple UUIDs with commas (,).</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeImageInstances~~">DescribeImageInstances</a> operation to query the UUIDs of images.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>f382fccd88b94c5c8c864def681*****,ac32fccd88b94c5c8c864def681*****</p>
     */
    @NameInMap("ImageUuids")
    public String imageUuids;

    /**
     * <p>The keyword of the image build command risk.</p>
     * 
     * <strong>example:</strong>
     * <p>risk.type</p>
     */
    @NameInMap("RiskKey")
    public String riskKey;

    /**
     * <p>The status of the image build command risk. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: unhandled.</li>
     * <li><strong>1</strong>: ignored.</li>
     * <li><strong>2</strong>: false positive.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static SetImageBuildRiskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetImageBuildRiskStatusRequest self = new SetImageBuildRiskStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetImageBuildRiskStatusRequest setImageUuids(String imageUuids) {
        this.imageUuids = imageUuids;
        return this;
    }
    public String getImageUuids() {
        return this.imageUuids;
    }

    public SetImageBuildRiskStatusRequest setRiskKey(String riskKey) {
        this.riskKey = riskKey;
        return this;
    }
    public String getRiskKey() {
        return this.riskKey;
    }

    public SetImageBuildRiskStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
