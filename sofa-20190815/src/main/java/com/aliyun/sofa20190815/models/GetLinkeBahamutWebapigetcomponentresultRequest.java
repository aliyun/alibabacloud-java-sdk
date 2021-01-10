// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutWebapigetcomponentresultRequest extends TeaModel {
    @NameInMap("ComponentName")
    public String componentName;

    @NameInMap("PipelineExecutionId")
    public String pipelineExecutionId;

    public static GetLinkeBahamutWebapigetcomponentresultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutWebapigetcomponentresultRequest self = new GetLinkeBahamutWebapigetcomponentresultRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutWebapigetcomponentresultRequest setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public GetLinkeBahamutWebapigetcomponentresultRequest setPipelineExecutionId(String pipelineExecutionId) {
        this.pipelineExecutionId = pipelineExecutionId;
        return this;
    }
    public String getPipelineExecutionId() {
        return this.pipelineExecutionId;
    }

}
