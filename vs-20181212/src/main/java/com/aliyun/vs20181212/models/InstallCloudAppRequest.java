// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class InstallCloudAppRequest extends TeaModel {
    /**
     * <p>Cloud application ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cap-b06b26edfhytbn b94a75ae1a79efc90eb</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Page number for paged queries of instance associations under the project. Paged queries default to reverse order by instance association time. This applies only when ProjectId is not empty. It limits the maximum number of instances for actions within the project, controlling the impact scope. Default is 1.</p>
     * <ol>
     * <li><p>PageNumber value range:
     * a. Method one (recommended): Calculate the upper limit using the total number of instances associated with the project. The ListRenderingProjectInstances interface provides this count.
     * b. Method two: Determine if PageNumber reaches the project\&quot;s upper limit by checking the interface return value. This avoids calculating the range. PageNumber reaches the upper limit if the interface returns any of these conditions:
     * ⅰ. A 403 status code and error code 200301.
     * ⅱ. The sum of \<code>SuccessInstanceCount\\</code> and \<code>FailedInstanceCount\\</code> is less than \<code>PageSize\\</code>.</p>
     * </li>
     * <li><p>Scenario examples:
     * a. Full installation for project instances: If the number of project instances exceeds \<code>PageSize\\</code> (default 100), invoke Install multiple times. Increment PageNumber by 1 for each call to complete the full installation. Get project instance installation progress using the ListCloudAppInstallations interface.
     * b. New instance installation for a project: Start with \<code>PageNumber=1\\</code>. Paged queries default to reverse order by instance association time. The \<code>PageNumber=1\\</code> page shows the latest new instances.</p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Maximum number of instances selected for the project. This applies only when ProjectId is not empty. It limits the maximum number of instances for actions within the project, controlling the impact scope. Default is 100. The value range is 1-100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Patch package ID to install. This is only for Windows scenarios.</p>
     * <ol>
     * <li><p>Install \<code>StablePatchId\\</code> by default.</p>
     * </li>
     * <li><p>Enter \<code>origin\\</code> to install the original version.</p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>patch-7bdf679812484df08a956b73e0b3bdf6</p>
     */
    @NameInMap("PatchId")
    public String patchId;

    /**
     * <p>Project ID</p>
     * 
     * <strong>example:</strong>
     * <p>project-422bc38dfgh5eb44149f135ef76304f63b</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>Cloud application service instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    /**
     * <p>List of cloud application service instance IDs</p>
     */
    @NameInMap("RenderingInstanceIds")
    public java.util.List<String> renderingInstanceIds;

    public static InstallCloudAppRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallCloudAppRequest self = new InstallCloudAppRequest();
        return TeaModel.build(map, self);
    }

    public InstallCloudAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public InstallCloudAppRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public InstallCloudAppRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public InstallCloudAppRequest setPatchId(String patchId) {
        this.patchId = patchId;
        return this;
    }
    public String getPatchId() {
        return this.patchId;
    }

    public InstallCloudAppRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public InstallCloudAppRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public InstallCloudAppRequest setRenderingInstanceIds(java.util.List<String> renderingInstanceIds) {
        this.renderingInstanceIds = renderingInstanceIds;
        return this;
    }
    public java.util.List<String> getRenderingInstanceIds() {
        return this.renderingInstanceIds;
    }

}
