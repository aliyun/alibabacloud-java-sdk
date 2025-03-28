// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20191209.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttributeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbaudit-cn-78v1gc****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lang")
    public String lang;

    /**
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

    public DescribeInstanceAttributeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInstanceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
