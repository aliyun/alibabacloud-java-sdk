// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ImportStacksToStackGroupRequest extends TeaModel {
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
    public java.util.Map<String, ?> operationPreferences;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceDirectoryFolderIds")
    public java.util.List<String> resourceDirectoryFolderIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StackArns")
    public java.util.List<String> stackArns;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyStackGroup</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    public static ImportStacksToStackGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportStacksToStackGroupRequest self = new ImportStacksToStackGroupRequest();
        return TeaModel.build(map, self);
    }

    public ImportStacksToStackGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ImportStacksToStackGroupRequest setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
        return this;
    }
    public String getOperationDescription() {
        return this.operationDescription;
    }

    public ImportStacksToStackGroupRequest setOperationPreferences(java.util.Map<String, ?> operationPreferences) {
        this.operationPreferences = operationPreferences;
        return this;
    }
    public java.util.Map<String, ?> getOperationPreferences() {
        return this.operationPreferences;
    }

    public ImportStacksToStackGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ImportStacksToStackGroupRequest setResourceDirectoryFolderIds(java.util.List<String> resourceDirectoryFolderIds) {
        this.resourceDirectoryFolderIds = resourceDirectoryFolderIds;
        return this;
    }
    public java.util.List<String> getResourceDirectoryFolderIds() {
        return this.resourceDirectoryFolderIds;
    }

    public ImportStacksToStackGroupRequest setStackArns(java.util.List<String> stackArns) {
        this.stackArns = stackArns;
        return this;
    }
    public java.util.List<String> getStackArns() {
        return this.stackArns;
    }

    public ImportStacksToStackGroupRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

}
