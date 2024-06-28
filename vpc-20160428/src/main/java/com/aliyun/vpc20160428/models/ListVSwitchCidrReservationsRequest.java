// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVSwitchCidrReservationsRequest extends TeaModel {
    /**
     * <p>The IP version of the reserved CIDR block. Valid values:</p>
     * <ul>
     * <li><strong>IPv4</strong> (default)</li>
     * <li><strong>IPv6</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>You do not need to specify this parameter for the first request.</li>
     * <li>You must specify the token that is obtained from the previous query as the value of NextToken.</li>
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
     * <p>The region ID of the vSwitch.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListVSwitchCidrReservationsRequestTags> tags;

    /**
     * <p>The ID of the reserved CIDR block. You can specify at most 10 IDs.</p>
     */
    @NameInMap("VSwitchCidrReservationIds")
    public java.util.List<String> vSwitchCidrReservationIds;

    /**
     * <p>The type of the reserved CIDR block. Set the value to <strong>prefix</strong>.</p>
     * <blockquote>
     * <p> When you allocate CIDR blocks, or enable the service to automatically allocate CIDR blocks to elastic network interfaces (ENIs), the CIDR blocks to allocate must fall into the reserved CIDR block. If the reserved CIDR is exhausted, an error message is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>prefix</p>
     */
    @NameInMap("VSwitchCidrReservationType")
    public String vSwitchCidrReservationType;

    /**
     * <p>The ID of the vSwitch for which you want to query reserved CIDR blocks.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-25navfgbue4g****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static ListVSwitchCidrReservationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVSwitchCidrReservationsRequest self = new ListVSwitchCidrReservationsRequest();
        return TeaModel.build(map, self);
    }

    public ListVSwitchCidrReservationsRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public ListVSwitchCidrReservationsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListVSwitchCidrReservationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVSwitchCidrReservationsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListVSwitchCidrReservationsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListVSwitchCidrReservationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVSwitchCidrReservationsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListVSwitchCidrReservationsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListVSwitchCidrReservationsRequest setTags(java.util.List<ListVSwitchCidrReservationsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListVSwitchCidrReservationsRequestTags> getTags() {
        return this.tags;
    }

    public ListVSwitchCidrReservationsRequest setVSwitchCidrReservationIds(java.util.List<String> vSwitchCidrReservationIds) {
        this.vSwitchCidrReservationIds = vSwitchCidrReservationIds;
        return this;
    }
    public java.util.List<String> getVSwitchCidrReservationIds() {
        return this.vSwitchCidrReservationIds;
    }

    public ListVSwitchCidrReservationsRequest setVSwitchCidrReservationType(String vSwitchCidrReservationType) {
        this.vSwitchCidrReservationType = vSwitchCidrReservationType;
        return this;
    }
    public String getVSwitchCidrReservationType() {
        return this.vSwitchCidrReservationType;
    }

    public ListVSwitchCidrReservationsRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static class ListVSwitchCidrReservationsRequestTags extends TeaModel {
        /**
         * <p>The tag key. You can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>A tag key can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify at most 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length, and cannot start with acs: or aliyun. It cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListVSwitchCidrReservationsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListVSwitchCidrReservationsRequestTags self = new ListVSwitchCidrReservationsRequestTags();
            return TeaModel.build(map, self);
        }

        public ListVSwitchCidrReservationsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListVSwitchCidrReservationsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
