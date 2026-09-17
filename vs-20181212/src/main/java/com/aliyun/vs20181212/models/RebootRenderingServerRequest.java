// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class RebootRenderingServerRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform only an admission check without actually restarting the hosts. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Precheck")
    public Boolean precheck;

    /**
     * <p>The list of cloud application service instance IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RenderingInstanceIds")
    public java.util.List<String> renderingInstanceIds;

    public static RebootRenderingServerRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootRenderingServerRequest self = new RebootRenderingServerRequest();
        return TeaModel.build(map, self);
    }

    public RebootRenderingServerRequest setPrecheck(Boolean precheck) {
        this.precheck = precheck;
        return this;
    }
    public Boolean getPrecheck() {
        return this.precheck;
    }

    public RebootRenderingServerRequest setRenderingInstanceIds(java.util.List<String> renderingInstanceIds) {
        this.renderingInstanceIds = renderingInstanceIds;
        return this;
    }
    public java.util.List<String> getRenderingInstanceIds() {
        return this.renderingInstanceIds;
    }

}
