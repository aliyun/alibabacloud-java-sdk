// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UninstallCloudAppRequest extends TeaModel {
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
     * <p>Page number for paged queries of instance associations in the project. Results are sorted by association time in descending order. This parameter applies only when ProjectId is not empty. It limits the maximum number of instances affected by this operation to control impact scope. Default value: 1.</p>
     * <ol>
     * <li><p>Valid PageNumber range:
     * a. Recommended method: Calculate the upper limit based on the total number of instances associated with the project. You can get this count using the ListRenderingProjectInstances API.
     * b. Alternative method: Check the API response to determine whether PageNumber has reached the upper limit. This avoids manual calculation. PageNumber has reached the upper limit if either of the following occurs:
     * ⅰ. The API returns HTTP status 403 and error code 200301.
     * ⅱ. The sum of SuccessInstanceCount and FailedInstanceCount in the response is less than PageSize.</p>
     * </li>
     * <li><p>Example scenario:
     * a. Full uninstall across all project instances: If the project has more instances than PageSize (default 100), call UninstallCloudApp multiple times, incrementing PageNumber by 1 each time. Track uninstall progress using the ListCloudAppInstallations API.</p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Maximum number of instances selected in the project. This parameter applies only when ProjectId is not empty. It limits the maximum number of instances affected by this operation to control impact scope. Default value: 100. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>ID of the patch package to uninstall. Supported only on Windows.</p>
     * <ol>
     * <li><p>Default: uninstall the StablePatchId.</p>
     * </li>
     * <li><p>Set to origin to uninstall the original version.</p>
     * </li>
     * <li><p>Set to all to uninstall all installed versions.</p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>patch-03fa76e8e13a49b6a966b063d9d309b4</p>
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
     * <p>Cloud application instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    /**
     * <p>List of cloud application instance IDs</p>
     */
    @NameInMap("RenderingInstanceIds")
    public java.util.List<String> renderingInstanceIds;

    public static UninstallCloudAppRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallCloudAppRequest self = new UninstallCloudAppRequest();
        return TeaModel.build(map, self);
    }

    public UninstallCloudAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UninstallCloudAppRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public UninstallCloudAppRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public UninstallCloudAppRequest setPatchId(String patchId) {
        this.patchId = patchId;
        return this;
    }
    public String getPatchId() {
        return this.patchId;
    }

    public UninstallCloudAppRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UninstallCloudAppRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public UninstallCloudAppRequest setRenderingInstanceIds(java.util.List<String> renderingInstanceIds) {
        this.renderingInstanceIds = renderingInstanceIds;
        return this;
    }
    public java.util.List<String> getRenderingInstanceIds() {
        return this.renderingInstanceIds;
    }

}
