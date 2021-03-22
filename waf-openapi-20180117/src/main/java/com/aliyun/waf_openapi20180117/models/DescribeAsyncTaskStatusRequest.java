// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class DescribeAsyncTaskStatusRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Region")
    public String region;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("WafRequestId")
    public String wafRequestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeAsyncTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAsyncTaskStatusRequest self = new DescribeAsyncTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAsyncTaskStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeAsyncTaskStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAsyncTaskStatusRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeAsyncTaskStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeAsyncTaskStatusRequest setWafRequestId(String wafRequestId) {
        this.wafRequestId = wafRequestId;
        return this;
    }
    public String getWafRequestId() {
        return this.wafRequestId;
    }

    public DescribeAsyncTaskStatusRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
