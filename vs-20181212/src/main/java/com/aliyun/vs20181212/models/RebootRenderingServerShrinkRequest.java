// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class RebootRenderingServerShrinkRequest extends TeaModel {
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
    public String renderingInstanceIdsShrink;

    public static RebootRenderingServerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootRenderingServerShrinkRequest self = new RebootRenderingServerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RebootRenderingServerShrinkRequest setPrecheck(Boolean precheck) {
        this.precheck = precheck;
        return this;
    }
    public Boolean getPrecheck() {
        return this.precheck;
    }

    public RebootRenderingServerShrinkRequest setRenderingInstanceIdsShrink(String renderingInstanceIdsShrink) {
        this.renderingInstanceIdsShrink = renderingInstanceIdsShrink;
        return this;
    }
    public String getRenderingInstanceIdsShrink() {
        return this.renderingInstanceIdsShrink;
    }

}
