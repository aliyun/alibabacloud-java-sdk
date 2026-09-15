// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class ListDigitalEmployeesRequest extends TeaModel {
    /**
     * <p>Filters digital employees by channel type. If this parameter is not specified, the default channel is used.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("channel")
    public String channel;

    /**
     * <p>The display name of the digital employee.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The type of the digital employee.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("employeeType")
    public String employeeType;

    /**
     * <p>The page size. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The name of the digital employee.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ae******ey</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    public static ListDigitalEmployeesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDigitalEmployeesRequest self = new ListDigitalEmployeesRequest();
        return TeaModel.build(map, self);
    }

    public ListDigitalEmployeesRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ListDigitalEmployeesRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ListDigitalEmployeesRequest setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
        return this;
    }
    public String getEmployeeType() {
        return this.employeeType;
    }

    public ListDigitalEmployeesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDigitalEmployeesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDigitalEmployeesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDigitalEmployeesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListDigitalEmployeesRequest setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

}
