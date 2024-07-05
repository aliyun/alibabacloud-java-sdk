// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyRenderingInstanceBandwidthRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxEgressBandwidth")
    public Integer maxEgressBandwidth;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxIngressBandwidth")
    public Integer maxIngressBandwidth;

    /**
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
