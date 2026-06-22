// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeTaskErrorLogRequest extends TeaModel {
    /**
     * <p>The ID of the image fix task.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeImageFixTask~~">DescribeImageFixTask</a> operation to query image vulnerability fix tasks and obtain the BuildTaskId.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ivf-6e520160-205d-4801-b8e9-9e7e****</p>
     */
    @NameInMap("BuildTaskId")
    public String buildTaskId;

    public static DescribeTaskErrorLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskErrorLogRequest self = new DescribeTaskErrorLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTaskErrorLogRequest setBuildTaskId(String buildTaskId) {
        this.buildTaskId = buildTaskId;
        return this;
    }
    public String getBuildTaskId() {
        return this.buildTaskId;
    }

}
