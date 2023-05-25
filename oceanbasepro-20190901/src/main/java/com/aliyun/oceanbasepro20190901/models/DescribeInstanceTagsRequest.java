// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceTagsRequest extends TeaModel {
    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The returned response.</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static DescribeInstanceTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTagsRequest self = new DescribeInstanceTagsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTagsRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeInstanceTagsRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
