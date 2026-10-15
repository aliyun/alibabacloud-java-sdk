// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationAttributesRequest extends TeaModel {
    /**
     * <p>The edit permission type. Valid values:</p>
     * <ul>
     * <li>0: Private.</li>
     * <li>11: All workspace members except guests. For data forms, datasets, and data sources, this value indicates all workspace developers.</li>
     * <li>12: Specified members. For data forms, datasets, and data sources, this value indicates specified developers.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EditPermissionType")
    public Integer editPermissionType;

    /**
     * <p>The ID of the resource to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>al*************7ufv</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li>dashboard: dashboard.</li>
     * <li>screen: data visualization.</li>
     * <li>report: workbook.</li>
     * <li>ANALYSIS: ad hoc analysis.</li>
     * <li>dashboardOfflineQuery: self-service data retrieval.</li>
     * <li>dataForm: data form.</li>
     * <li>cube: dataset.</li>
     * <li>datasource: data source.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cube</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The usage permission type for datasets and data sources. Valid values:</p>
     * <ul>
     * <li>1: All workspace members except guests.</li>
     * <li>2: Specified members.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsePermissionType")
    public Integer usePermissionType;

    public static UpdateAuthorizationAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorizationAttributesRequest self = new UpdateAuthorizationAttributesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorizationAttributesRequest setEditPermissionType(Integer editPermissionType) {
        this.editPermissionType = editPermissionType;
        return this;
    }
    public Integer getEditPermissionType() {
        return this.editPermissionType;
    }

    public UpdateAuthorizationAttributesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public UpdateAuthorizationAttributesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UpdateAuthorizationAttributesRequest setUsePermissionType(Integer usePermissionType) {
        this.usePermissionType = usePermissionType;
        return this;
    }
    public Integer getUsePermissionType() {
        return this.usePermissionType;
    }

}
