// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteRenderingInstanceGatewayRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    public static DeleteRenderingInstanceGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRenderingInstanceGatewayRequest self = new DeleteRenderingInstanceGatewayRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRenderingInstanceGatewayRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

}
