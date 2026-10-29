// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyRenderingInstanceBandwidthRequest extends TeaModel {
    /**
     * <p>The maximum outbound bandwidth limit, in Mbit/s. You must specify at least one of MaxIngressBandwidth and MaxEgressBandwidth.</p>
     * <ul>
     * <li>The original configuration of the instance does not limit the bandwidth.</li>
     * <li>If you do not specify this parameter or specify 0, the last configuration is retained by default.</li>
     * <li>If you specify a value less than 0, the bandwidth limit is reset to unlimited.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxEgressBandwidth")
    public Integer maxEgressBandwidth;

    /**
     * <p>The maximum inbound bandwidth limit, in Mbit/s. You must specify at least one of MaxIngressBandwidth and MaxEgressBandwidth.</p>
     * <ul>
     * <li>The original configuration of the instance does not limit the bandwidth.</li>
     * <li>If you do not specify this parameter or specify 0, the last configuration is retained by default.</li>
     * <li>If you specify a value less than 0, the bandwidth limit is reset to unlimited.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxIngressBandwidth")
    public Integer maxIngressBandwidth;

    /**
     * <p>The instance ID of the cloud application service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    public static ModifyRenderingInstanceBandwidthRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRenderingInstanceBandwidthRequest self = new ModifyRenderingInstanceBandwidthRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRenderingInstanceBandwidthRequest setMaxEgressBandwidth(Integer maxEgressBandwidth) {
        this.maxEgressBandwidth = maxEgressBandwidth;
        return this;
    }
    public Integer getMaxEgressBandwidth() {
        return this.maxEgressBandwidth;
    }

    public ModifyRenderingInstanceBandwidthRequest setMaxIngressBandwidth(Integer maxIngressBandwidth) {
        this.maxIngressBandwidth = maxIngressBandwidth;
        return this;
    }
    public Integer getMaxIngressBandwidth() {
        return this.maxIngressBandwidth;
    }

    public ModifyRenderingInstanceBandwidthRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

}
