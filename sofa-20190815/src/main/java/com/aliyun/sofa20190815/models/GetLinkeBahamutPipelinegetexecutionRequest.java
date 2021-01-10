// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPipelinegetexecutionRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static GetLinkeBahamutPipelinegetexecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPipelinegetexecutionRequest self = new GetLinkeBahamutPipelinegetexecutionRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPipelinegetexecutionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
