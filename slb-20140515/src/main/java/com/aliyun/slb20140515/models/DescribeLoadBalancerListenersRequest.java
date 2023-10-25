// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerListenersRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The protocol used by the listener. Valid values:</p>
     * <br>
     * <p>*   **tcp**</p>
     * <p>*   **udp**</p>
     * <p>*   **http**</p>
     * <p>*   **https**</p>
     */
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    /**
     * <p>The ID of the CLB instance. You can specify at most 10 IDs.</p>
     */
    @NameInMap("LoadBalancerId")
    public java.util.List<String> loadBalancerId;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: **1** to **100**. If you do not specify a value, the default value **20** is used.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If this is your first query and no subsequent queries are to be sent, ignore this parameter.</p>
     * <p>*   If a subsequent query is to be sent, set the parameter to the value of NextToken that is returned from the last call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the CLB instance is deployed.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~DescribeRegions~~) operation to query the most recent region list.</p>
     * <br>
     * <p>>  If the endpoint of the selected region is slb.aliyuncs.com, the `RegionId` parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>标签列表。</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeLoadBalancerListenersRequestTag> tag;

    public static DescribeLoadBalancerListenersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerListenersRequest self = new DescribeLoadBalancerListenersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerListenersRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeLoadBalancerListenersRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
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
        /**
         * <p>资源的标签键。N的取值范围：**1~20**。一旦输入该值，则不允许为空字符串。</p>
         * <br>
         * <p>最多支持64个字符，不能以`aliyun`和`acs:`开头，不能包含`http://`或者`https://`。</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>资源的标签值。N的取值范围：**1~20**。一旦输入该值，可以为空字符串。</p>
         * <p>最多支持128个字符，不能以`aliyun`和`acs:`开头，不能包含`http://`或者`https://`。</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeLoadBalancerListenersRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerListenersRequestTag self = new DescribeLoadBalancerListenersRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerListenersRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeLoadBalancerListenersRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
