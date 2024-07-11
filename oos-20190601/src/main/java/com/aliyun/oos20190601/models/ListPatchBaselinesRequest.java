// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListPatchBaselinesRequest extends TeaModel {
    /**
     * <p>The approved patches.</p>
     */
    @NameInMap("ApprovedPatches")
    public java.util.List<String> approvedPatches;

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
    public java.util.List<String> sources;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListPatchBaselinesRequestTags> tags;

    public static ListPatchBaselinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPatchBaselinesRequest self = new ListPatchBaselinesRequest();
        return TeaModel.build(map, self);
    }

    public ListPatchBaselinesRequest setApprovedPatches(java.util.List<String> approvedPatches) {
        this.approvedPatches = approvedPatches;
        return this;
    }
    public java.util.List<String> getApprovedPatches() {
        return this.approvedPatches;
    }

    public ListPatchBaselinesRequest setApprovedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
        this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
        return this;
    }
    public Boolean getApprovedPatchesEnableNonSecurity() {
        return this.approvedPatchesEnableNonSecurity;
    }

    public ListPatchBaselinesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPatchBaselinesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListPatchBaselinesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPatchBaselinesRequest setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
        return this;
    }
    public String getOperationSystem() {
        return this.operationSystem;
    }

    public ListPatchBaselinesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListPatchBaselinesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListPatchBaselinesRequest setShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }
    public String getShareType() {
        return this.shareType;
    }

    public ListPatchBaselinesRequest setSources(java.util.List<String> sources) {
        this.sources = sources;
        return this;
    }
    public java.util.List<String> getSources() {
        return this.sources;
    }

    public ListPatchBaselinesRequest setTags(java.util.List<ListPatchBaselinesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListPatchBaselinesRequestTags> getTags() {
        return this.tags;
    }

    public static class ListPatchBaselinesRequestTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListPatchBaselinesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListPatchBaselinesRequestTags self = new ListPatchBaselinesRequestTags();
            return TeaModel.build(map, self);
        }

        public ListPatchBaselinesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListPatchBaselinesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
