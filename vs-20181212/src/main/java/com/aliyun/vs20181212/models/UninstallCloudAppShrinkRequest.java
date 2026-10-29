// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UninstallCloudAppShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the cloud application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cap-b06b26edfhytbn b94a75ae1a79efc90eb</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The page number for instance associations in a project. By default, a paged query sorts results in descending order of instance association time. This parameter is valid only when ProjectId is not empty. It limits the maximum number of instances on which the action is executed in the project to control the impact scope of the action. Default value: 1.</p>
     * <ol>
     * <li>Valid values of PageNumber:
     *   a. [Recommended] Method 1: Calculate the upper limit based on the total number of instances associated with the project. You can call the ListRenderingProjectInstances operation to obtain the total number.
     *   b. Method 2: Determine whether PageNumber reaches the upper limit for the project based on the response. [Advantage: No need to calculate the valid value range]. PageNumber reaches the upper limit if the response meets any of the following conditions:
     *  i. The response returns HTTP status code 403 and error code 200301.
     *  ii. The sum of SuccessInstanceCount and FailedInstanceCount in the response is less than PageSize.</li>
     * <li>Scenario example:
     *   a. Uninstall instances in a project in full: If the number of instances in the project is greater than PageSize (default value: 100), you can call the Uninstall operation multiple times and increment PageNumber by 1 each time to uninstall all instances. You can call the ListCloudAppInstallations operation to query the uninstallation progress of the instances in the project.</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of selected instances in a project. This parameter is valid only when ProjectId is not empty. It limits the maximum number of instances on which the action is executed in the project to control the impact scope of the action. Default value: 100. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the patch package to uninstall. This parameter is supported only in Windows scenarios.</p>
     * <ol>
     * <li>By default, the StablePatchId is uninstalled.</li>
     * <li>If you set this parameter to origin, the original version is uninstalled.</li>
     * <li>If you set this parameter to all, all installed versions are uninstalled.</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>patch-03fa76e8e13a49b6a966b063d9d309b4</p>
     */
    @NameInMap("PatchId")
    public String patchId;

    /**
     * <p>The ID of the project.</p>
     * 
     * <strong>example:</strong>
     * <p>project-422bc38dfgh5eb44149f135ef76304f63b</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The cloud application service instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    /**
     * <p>The list of cloud application service instance IDs.</p>
     */
    @NameInMap("RenderingInstanceIds")
    public String renderingInstanceIdsShrink;

    public static UninstallCloudAppShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallCloudAppShrinkRequest self = new UninstallCloudAppShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UninstallCloudAppShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UninstallCloudAppShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public UninstallCloudAppShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public UninstallCloudAppShrinkRequest setPatchId(String patchId) {
        this.patchId = patchId;
        return this;
    }
    public String getPatchId() {
        return this.patchId;
    }

    public UninstallCloudAppShrinkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UninstallCloudAppShrinkRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public UninstallCloudAppShrinkRequest setRenderingInstanceIdsShrink(String renderingInstanceIdsShrink) {
        this.renderingInstanceIdsShrink = renderingInstanceIdsShrink;
        return this;
    }
    public String getRenderingInstanceIdsShrink() {
        return this.renderingInstanceIdsShrink;
    }

}
