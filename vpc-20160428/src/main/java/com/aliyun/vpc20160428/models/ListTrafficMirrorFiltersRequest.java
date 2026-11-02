// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListTrafficMirrorFiltersRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return for the current request. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that indicates whether a next query is available. Valid values:</p>
     * <ul>
     * <li>For the first query or when no subsequent query is required, leave this parameter empty.</li>
     * <li>If a subsequent query is required, set the value to the NextToken value returned by the previous API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the traffic mirror.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs. For more information about the regions that support traffic mirroring, see <a href="https://help.aliyun.com/document_detail/207513.html">Traffic mirroring overview</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hongkong</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the traffic mirroring belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4ph****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListTrafficMirrorFiltersRequestTags> tags;

    /**
     * <p>The instance IDs of the traffic mirror filters. The maximum value of <strong>N</strong> is <strong>100</strong>, which means that you can query up to 100 filters at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>tmf-j6cmls82xnc86vtpe****</p>
     */
    @NameInMap("TrafficMirrorFilterIds")
    public java.util.List<String> trafficMirrorFilterIds;

    /**
     * <p>The name of the traffic mirror filter.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("TrafficMirrorFilterName")
    public String trafficMirrorFilterName;

    public static ListTrafficMirrorFiltersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTrafficMirrorFiltersRequest self = new ListTrafficMirrorFiltersRequest();
        return TeaModel.build(map, self);
    }

    public ListTrafficMirrorFiltersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTrafficMirrorFiltersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTrafficMirrorFiltersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListTrafficMirrorFiltersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTrafficMirrorFiltersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTrafficMirrorFiltersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListTrafficMirrorFiltersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTrafficMirrorFiltersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListTrafficMirrorFiltersRequest setTags(java.util.List<ListTrafficMirrorFiltersRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListTrafficMirrorFiltersRequestTags> getTags() {
        return this.tags;
    }

    public ListTrafficMirrorFiltersRequest setTrafficMirrorFilterIds(java.util.List<String> trafficMirrorFilterIds) {
        this.trafficMirrorFilterIds = trafficMirrorFilterIds;
        return this;
    }
    public java.util.List<String> getTrafficMirrorFilterIds() {
        return this.trafficMirrorFilterIds;
    }

    public ListTrafficMirrorFiltersRequest setTrafficMirrorFilterName(String trafficMirrorFilterName) {
        this.trafficMirrorFilterName = trafficMirrorFilterName;
        return this;
    }
    public String getTrafficMirrorFilterName() {
        return this.trafficMirrorFilterName;
    }

    public static class ListTrafficMirrorFiltersRequestTags extends TeaModel {
        /**
         * <p>The tag key of the resource. You can specify up to 20 tag keys. If you specify this parameter, you cannot specify an empty string.</p>
         * <p>A tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify up to 20 tag values. If you specify this parameter, you can specify an empty string.</p>
         * <p>A tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTrafficMirrorFiltersRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListTrafficMirrorFiltersRequestTags self = new ListTrafficMirrorFiltersRequestTags();
            return TeaModel.build(map, self);
        }

        public ListTrafficMirrorFiltersRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTrafficMirrorFiltersRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
