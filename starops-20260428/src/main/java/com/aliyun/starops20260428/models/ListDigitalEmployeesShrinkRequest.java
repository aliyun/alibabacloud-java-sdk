// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class ListDigitalEmployeesShrinkRequest extends TeaModel {
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
    public String tagsShrink;

    public static ListDigitalEmployeesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDigitalEmployeesShrinkRequest self = new ListDigitalEmployeesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDigitalEmployeesShrinkRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ListDigitalEmployeesShrinkRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ListDigitalEmployeesShrinkRequest setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
        return this;
    }
    public String getEmployeeType() {
        return this.employeeType;
    }

    public ListDigitalEmployeesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDigitalEmployeesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDigitalEmployeesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDigitalEmployeesShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListDigitalEmployeesShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
