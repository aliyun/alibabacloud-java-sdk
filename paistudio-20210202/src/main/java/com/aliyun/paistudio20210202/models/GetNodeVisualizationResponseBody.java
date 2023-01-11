// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetNodeVisualizationResponseBody extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VisualizationType")
    public String visualizationType;

    public static GetNodeVisualizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeVisualizationResponseBody self = new GetNodeVisualizationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeVisualizationResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetNodeVisualizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNodeVisualizationResponseBody setVisualizationType(String visualizationType) {
        this.visualizationType = visualizationType;
        return this;
    }
    public String getVisualizationType() {
        return this.visualizationType;
    }

}
