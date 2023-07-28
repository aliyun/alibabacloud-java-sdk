// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListPatchBaselinesShrinkRequest extends TeaModel {
    @NameInMap("ApprovedPatches")
    public String approvedPatchesShrink;

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

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     */
    @NameInMap("ShareType")
    public String shareType;

    @NameInMap("Sources")
    public String sourcesShrink;

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
