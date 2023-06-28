// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerListenersRequest extends TeaModel {
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    @NameInMap("LoadBalancerId")
    public java.util.List<String> loadBalancerId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tag")
    public java.util.List<DescribeLoadBalancerListenersRequestTag> tag;

    public static DescribeLoadBalancerListenersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerListenersRequest self = new DescribeLoadBalancerListenersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerListenersRequest setListenerProtocol(String listenerProtocol) {
        this.listenerProtocol = listenerProtocol;
        return this;
    }
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    public DescribeLoadBalancerListenersRequest setLoadBalancerId(java.util.List<String> loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public java.util.List<String> getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DescribeLoadBalancerListenersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeLoadBalancerListenersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeLoadBalancerListenersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeLoadBalancerListenersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLoadBalancerListenersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLoadBalancerListenersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeLoadBalancerListenersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeLoadBalancerListenersRequest setTag(java.util.List<DescribeLoadBalancerListenersRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeLoadBalancerListenersRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeLoadBalancerListenersRequestTag extends TeaModel {
        public static DescribeLoadBalancerListenersRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerListenersRequestTag self = new DescribeLoadBalancerListenersRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
