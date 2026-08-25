// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DescribeClientsRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("CallerAliUid")
    public String callerAliUid;

    /**
     * <p>The client type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ClientType")
    public Integer clientType;

    /**
     * <p>The custom task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-***</p>
     */
    @NameInMap("CustomResourceId")
    public String customResourceId;

    /**
     * <p>The effective status of the custom task. Valid values:</p>
     * <ul>
     * <li>true: effective.</li>
     * <li>false: ineffective.</li>
     * <li>null: all.</li>
     * </ul>
     */
    @NameInMap("CustomResourceStatus")
    public Boolean customResourceStatus;

    /**
     * <p>Specifies whether the client is managed.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("InManage")
    public Boolean inManage;

    /**
     * <p>Specifies whether to include subgroups.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeSubGroups")
    public Boolean includeSubGroups;

    /**
     * <p>The maximum number of results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The device model.</p>
     * 
     * <strong>example:</strong>
     * <p>US02-2BFXG</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdEdsXbwG2ZlbWCzN4wTTg6wQvfp7u1BJl4bxCAby41POSaYAlCvfULQpkAnb0ff****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The soft client status.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("OnlineStatus")
    public Boolean onlineStatus;

    /**
     * <p>The soft client platform.</p>
     * 
     * <strong>example:</strong>
     * <p>linux</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The fuzzy search parameter. Supports fuzzy search by SN, alias, or IP address. This parameter is incompatible with exact search parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>061</p>
     */
    @NameInMap("SearchKeyword")
    public String searchKeyword;

    /**
     * <p>The group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>tg-bp103v8x70nasykdjrd1</p>
     */
    @NameInMap("TerminalGroupId")
    public String terminalGroupId;

    /**
     * <p>The UUIDs of the servers to query. Separate multiple UUIDs with commas (,).</p>
     */
    @NameInMap("Uuids")
    public java.util.List<String> uuids;

    /**
     * <p>Specifies whether to return bound users.</p>
     */
    @NameInMap("WithBindUser")
    public Boolean withBindUser;

    public static DescribeClientsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientsRequest self = new DescribeClientsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClientsRequest setCallerAliUid(String callerAliUid) {
        this.callerAliUid = callerAliUid;
        return this;
    }
    public String getCallerAliUid() {
        return this.callerAliUid;
    }

    public DescribeClientsRequest setClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }
    public Integer getClientType() {
        return this.clientType;
    }

    public DescribeClientsRequest setCustomResourceId(String customResourceId) {
        this.customResourceId = customResourceId;
        return this;
    }
    public String getCustomResourceId() {
        return this.customResourceId;
    }

    public DescribeClientsRequest setCustomResourceStatus(Boolean customResourceStatus) {
        this.customResourceStatus = customResourceStatus;
        return this;
    }
    public Boolean getCustomResourceStatus() {
        return this.customResourceStatus;
    }

    public DescribeClientsRequest setInManage(Boolean inManage) {
        this.inManage = inManage;
        return this;
    }
    public Boolean getInManage() {
        return this.inManage;
    }

    public DescribeClientsRequest setIncludeSubGroups(Boolean includeSubGroups) {
        this.includeSubGroups = includeSubGroups;
        return this;
    }
    public Boolean getIncludeSubGroups() {
        return this.includeSubGroups;
    }

    public DescribeClientsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeClientsRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public DescribeClientsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeClientsRequest setOnlineStatus(Boolean onlineStatus) {
        this.onlineStatus = onlineStatus;
        return this;
    }
    public Boolean getOnlineStatus() {
        return this.onlineStatus;
    }

    public DescribeClientsRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public DescribeClientsRequest setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
        return this;
    }
    public String getSearchKeyword() {
        return this.searchKeyword;
    }

    public DescribeClientsRequest setTerminalGroupId(String terminalGroupId) {
        this.terminalGroupId = terminalGroupId;
        return this;
    }
    public String getTerminalGroupId() {
        return this.terminalGroupId;
    }

    public DescribeClientsRequest setUuids(java.util.List<String> uuids) {
        this.uuids = uuids;
        return this;
    }
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

    public DescribeClientsRequest setWithBindUser(Boolean withBindUser) {
        this.withBindUser = withBindUser;
        return this;
    }
    public Boolean getWithBindUser() {
        return this.withBindUser;
    }

}
