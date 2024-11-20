// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ImportStacksToStackGroupShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>Import ops stacks to stack group</p>
     */
    @NameInMap("OperationDescription")
    public String operationDescription;

    /**
     * <strong>example:</strong>
     * <p>{&quot;FailureToleranceCount&quot;: 1,&quot;MaxConcurrentCount&quot;: 2}</p>
     */
    @NameInMap("OperationPreferences")
    public String operationPreferencesShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceDirectoryFolderIds")
    public String resourceDirectoryFolderIdsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StackArns")
    public String stackArnsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyStackGroup</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    public static ImportStacksToStackGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportStacksToStackGroupShrinkRequest self = new ImportStacksToStackGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ImportStacksToStackGroupShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ImportStacksToStackGroupShrinkRequest setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
        return this;
    }
    public String getOperationDescription() {
        return this.operationDescription;
    }

    public ImportStacksToStackGroupShrinkRequest setOperationPreferencesShrink(String operationPreferencesShrink) {
        this.operationPreferencesShrink = operationPreferencesShrink;
        return this;
    }
    public String getOperationPreferencesShrink() {
        return this.operationPreferencesShrink;
    }

    public ImportStacksToStackGroupShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ImportStacksToStackGroupShrinkRequest setResourceDirectoryFolderIdsShrink(String resourceDirectoryFolderIdsShrink) {
        this.resourceDirectoryFolderIdsShrink = resourceDirectoryFolderIdsShrink;
        return this;
    }
    public String getResourceDirectoryFolderIdsShrink() {
        return this.resourceDirectoryFolderIdsShrink;
    }

    public ImportStacksToStackGroupShrinkRequest setStackArnsShrink(String stackArnsShrink) {
        this.stackArnsShrink = stackArnsShrink;
        return this;
    }
    public String getStackArnsShrink() {
        return this.stackArnsShrink;
    }

    public ImportStacksToStackGroupShrinkRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

}
