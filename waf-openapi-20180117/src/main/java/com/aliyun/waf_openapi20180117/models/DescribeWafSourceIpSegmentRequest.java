// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class DescribeWafSourceIpSegmentRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Region")
    public String region;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeWafSourceIpSegmentRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWafSourceIpSegmentRequest self = new DescribeWafSourceIpSegmentRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWafSourceIpSegmentRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeWafSourceIpSegmentRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeWafSourceIpSegmentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeWafSourceIpSegmentRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeWafSourceIpSegmentRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
