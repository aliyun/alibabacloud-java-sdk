// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateRenderingProjectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>project-b93ea81de76f48609eed3cd420f0399f</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRenderingProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRenderingProjectResponseBody self = new CreateRenderingProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRenderingProjectResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateRenderingProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
