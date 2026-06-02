// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DescribeClientsRequest extends TeaModel {
    /**
     * <p>aliuid</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("CallerAliUid")
    public String callerAliUid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ClientType")
    public Integer clientType;

    /**
     * <strong>example:</strong>
     * <p>cr-***</p>
     */
    @NameInMap("CustomResourceId")
    public String customResourceId;

    @NameInMap("CustomResourceStatus")
    public Boolean customResourceStatus;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("InManage")
    public Boolean inManage;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeSubGroups")
    public Boolean includeSubGroups;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>US02-2BFXG</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <strong>example:</strong>
     * <p>AAAAAdEdsXbwG2ZlbWCzN4wTTg6wQvfp7u1BJl4bxCAby41POSaYAlCvfULQpkAnb0ff****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("OnlineStatus")
    public Boolean onlineStatus;

    /**
     * <strong>example:</strong>
     * <p>linux</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <strong>example:</strong>
     * <p>061</p>
     */
    @NameInMap("SearchKeyword")
    public String searchKeyword;

    /**
     * <strong>example:</strong>
     * <p>tg-bp103v8x70nasykdjrd1</p>
     */
    @NameInMap("TerminalGroupId")
    public String terminalGroupId;

    @NameInMap("Uuids")
    public java.util.List<String> uuids;

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
