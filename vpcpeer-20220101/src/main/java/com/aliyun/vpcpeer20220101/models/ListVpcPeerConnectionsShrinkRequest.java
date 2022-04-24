// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class ListVpcPeerConnectionsShrinkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Name")
    public String name;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    // 根据两端vpcid过滤，不区分发起端和接收端。如果只传入一个，则根据一端过滤
    @NameInMap("VpcId")
    public String vpcIdShrink;

    public static ListVpcPeerConnectionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpcPeerConnectionsShrinkRequest self = new ListVpcPeerConnectionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListVpcPeerConnectionsShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListVpcPeerConnectionsShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ListVpcPeerConnectionsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListVpcPeerConnectionsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpcPeerConnectionsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListVpcPeerConnectionsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcPeerConnectionsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVpcPeerConnectionsShrinkRequest setVpcIdShrink(String vpcIdShrink) {
        this.vpcIdShrink = vpcIdShrink;
        return this;
    }
    public String getVpcIdShrink() {
        return this.vpcIdShrink;
    }

}
