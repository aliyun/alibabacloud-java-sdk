// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the Bastionhost instance to query.</p>
     * <blockquote>
     * <p>You can obtain the Bastionhost instance ID by calling the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-78v1ghxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the Bastionhost instance to query.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAttributeRequest self = new DescribeInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
