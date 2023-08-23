// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListPatchBaselinesRequest extends TeaModel {
    @NameInMap("ApprovedPatches")
    public java.util.List<String> approvedPatches;

    @NameInMap("ApprovedPatchesEnableNonSecurity")
    public Boolean approvedPatchesEnableNonSecurity;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The share type of the patch baseline.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("OperationSystem")
    public String operationSystem;

    /**
     * <p>The type of the operating system. Valid values:</p>
     * <br>
     * <p>*   AliyunLinux</p>
     * <p>*   Windows</p>
     * <p>*   Ubuntu</p>
     * <p>*   Centos</p>
     * <p>*   Debian</p>
     * <p>*   RedhatEnterpriseLinux</p>
     * <p>*   Anolis</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupld")
    public String resourceGroupld;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     */
    @NameInMap("ShareType")
    public String shareType;

    @NameInMap("Sources")
    public java.util.List<String> sources;

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

    public ListPatchBaselinesRequest setResourceGroupld(String resourceGroupld) {
        this.resourceGroupld = resourceGroupld;
        return this;
    }
    public String getResourceGroupld() {
        return this.resourceGroupld;
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
        @NameInMap("Key")
        public String key;

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
