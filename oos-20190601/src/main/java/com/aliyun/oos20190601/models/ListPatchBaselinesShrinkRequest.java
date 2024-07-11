// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListPatchBaselinesShrinkRequest extends TeaModel {
    /**
     * <p>The approved patches.</p>
     */
    @NameInMap("ApprovedPatches")
    public String approvedPatchesShrink;

    /**
     * <p>Specifies whether the approved patch involves updates other than security-related updates.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ApprovedPatchesEnableNonSecurity")
    public Boolean approvedPatchesEnableNonSecurity;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name of the patch baseline.</p>
     * 
     * <strong>example:</strong>
     * <p>MyPatchBaseline</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The type of the operating system. Valid values:</p>
     * <ul>
     * <li>Windows</li>
     * <li>Ubuntu</li>
     * <li>CentOS</li>
     * <li>Debian</li>
     * <li>AliyunLinux</li>
     * <li>RedhatEnterpriseLinux</li>
     * <li>Anolis</li>
     * <li>AlmaLinux</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AliyunLinux</p>
     */
    @NameInMap("OperationSystem")
    public String operationSystem;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxsn4m4******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The share type of the template. Valid values:</p>
     * <ul>
     * <li><strong>Public</strong></li>
     * <li><strong>Private</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Private</p>
     */
    @NameInMap("ShareType")
    public String shareType;

    /**
     * <p>The patch source configurations.</p>
     */
    @NameInMap("Sources")
    public String sourcesShrink;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static ListPatchBaselinesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPatchBaselinesShrinkRequest self = new ListPatchBaselinesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPatchBaselinesShrinkRequest setApprovedPatchesShrink(String approvedPatchesShrink) {
        this.approvedPatchesShrink = approvedPatchesShrink;
        return this;
    }
    public String getApprovedPatchesShrink() {
        return this.approvedPatchesShrink;
    }

    public ListPatchBaselinesShrinkRequest setApprovedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
        this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
        return this;
    }
    public Boolean getApprovedPatchesEnableNonSecurity() {
        return this.approvedPatchesEnableNonSecurity;
    }

    public ListPatchBaselinesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPatchBaselinesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListPatchBaselinesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPatchBaselinesShrinkRequest setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
        return this;
    }
    public String getOperationSystem() {
        return this.operationSystem;
    }

    public ListPatchBaselinesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListPatchBaselinesShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListPatchBaselinesShrinkRequest setShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }
    public String getShareType() {
        return this.shareType;
    }

    public ListPatchBaselinesShrinkRequest setSourcesShrink(String sourcesShrink) {
        this.sourcesShrink = sourcesShrink;
        return this;
    }
    public String getSourcesShrink() {
        return this.sourcesShrink;
    }

    public ListPatchBaselinesShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
