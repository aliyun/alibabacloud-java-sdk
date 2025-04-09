// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class ListListenersRequest extends TeaModel {
    /**
     * <p>The listener IDs. You can specify up to 20 listeners.</p>
     */
    @NameInMap("ListenerIds")
    public java.util.List<String> listenerIds;

    /**
     * <p>The listener protocol. Valid values: <strong>TCP</strong>, <strong>UDP</strong>, and <strong>TCPSSL</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>TCPSSL</p>
     */
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    /**
     * <p>The IDs of the NLB instances. You can specify up to 20 instances.</p>
     */
    @NameInMap("LoadBalancerIds")
    public java.util.List<String> loadBalancerIds;

    /**
     * <p>The number of entries to return in each call. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong></p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token used to specify a particular page of results. Valid values:</p>
     * <ul>
     * <li>Leave this parameter empty for the first query or the only query.</li>
     * <li>Set this parameter to the value of NextToken obtained from the previous query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region where the NLB instance is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to enable fine-grained monitoring. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SecSensorEnabled")
    public String secSensorEnabled;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListListenersRequestTag> tag;

    public static ListListenersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListListenersRequest self = new ListListenersRequest();
        return TeaModel.build(map, self);
    }

    public ListListenersRequest setListenerIds(java.util.List<String> listenerIds) {
        this.listenerIds = listenerIds;
        return this;
    }
    public java.util.List<String> getListenerIds() {
        return this.listenerIds;
    }

    public ListListenersRequest setListenerProtocol(String listenerProtocol) {
        this.listenerProtocol = listenerProtocol;
        return this;
    }
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    public ListListenersRequest setLoadBalancerIds(java.util.List<String> loadBalancerIds) {
        this.loadBalancerIds = loadBalancerIds;
        return this;
    }
    public java.util.List<String> getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    public ListListenersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListListenersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListListenersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListListenersRequest setSecSensorEnabled(String secSensorEnabled) {
        this.secSensorEnabled = secSensorEnabled;
        return this;
    }
    public String getSecSensorEnabled() {
        return this.secSensorEnabled;
    }

    public ListListenersRequest setTag(java.util.List<ListListenersRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListListenersRequestTag> getTag() {
        return this.tag;
    }

    public static class ListListenersRequestTag extends TeaModel {
        /**
         * <p>The key of the tag. You can specify up to 20 tags. The tag key cannot be an empty string.</p>
         * <p>It can be up to 64 characters in length, cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. You can specify up to 20 tags. The tag value can be an empty string.</p>
         * <p>It can be up to 128 characters in length, cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListListenersRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListListenersRequestTag self = new ListListenersRequestTag();
            return TeaModel.build(map, self);
        }

        public ListListenersRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListListenersRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
