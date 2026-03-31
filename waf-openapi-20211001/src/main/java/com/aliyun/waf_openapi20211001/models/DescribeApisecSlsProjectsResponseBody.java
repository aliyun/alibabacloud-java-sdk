// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecSlsProjectsResponseBody extends TeaModel {
    /**
     * <p>The names of the projects in Simple Log Service.</p>
     */
    @NameInMap("Projects")
    public java.util.List<String> projects;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19****5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApisecSlsProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecSlsProjectsResponseBody self = new DescribeApisecSlsProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisecSlsProjectsResponseBody setProjects(java.util.List<String> projects) {
        this.projects = projects;
        return this;
    }
    public java.util.List<String> getProjects() {
        return this.projects;
    }

    public DescribeApisecSlsProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
