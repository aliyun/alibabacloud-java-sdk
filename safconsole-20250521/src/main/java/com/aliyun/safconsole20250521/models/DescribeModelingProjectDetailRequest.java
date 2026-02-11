// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeModelingProjectDetailRequest extends TeaModel {
    /**
     * <p>Project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static DescribeModelingProjectDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelingProjectDetailRequest self = new DescribeModelingProjectDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeModelingProjectDetailRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
