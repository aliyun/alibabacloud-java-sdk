// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddWorksAuthorizationRequest extends TeaModel {
    /**
     * <p>The permissions to grant. Valid values:</p>
     * <p><code>1</code>: View</p>
     * <p><code>3</code>: View and Export</p>
     * <p><code>11</code>: Edit, View, and Export</p>
     * <p><strong>Note</strong>: If AuthPoints is set to 11, the authorization is permanent and the ExpireDay parameter is ignored.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuthPoints")
    public Integer authPoints;

    /**
     * <p>The type of the principal. Valid values:</p>
     * <ul>
     * <li><p><code>0</code>: User. Set AuthorizedId to the user ID.</p>
     * </li>
     * <li><p><code>1</code>: User group. Set AuthorizedId to the user group ID.</p>
     * </li>
     * <li><p><code>2</code>: All members of an organization. Set AuthorizedId to the organization ID.</p>
     * </li>
     * <li><p><code>3</code>: All members of a workspace. Set AuthorizedId to the workspace ID.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AuthorizeScope")
    public Integer authorizeScope;

    /**
     * <p>The ID of the principal to be authorized. The AuthorizeScope parameter specifies the type of principal.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ASDAS-WDAS****ASDA</p>
     */
    @NameInMap("AuthorizedId")
    public String authorizedId;

    /**
     * <p>The expiration date for the permissions.</p>
     * <p>Format: <code>YYYY-MM-DD</code>.</p>
     * <p><strong>Note</strong>: This parameter is required if AuthPoints is not 11. The authorization must be valid for at least one day after the authorization date.</p>
     * 
     * <strong>example:</strong>
     * <p>2099-12-31</p>
     */
    @NameInMap("ExpireDay")
    public String expireDay;

    /**
     * <p>The ID of the work.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>al*************7ufv</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The type of the work. Valid values:</p>
     * <ul>
     * <li><p><code>dashboard</code>: A dashboard.</p>
     * </li>
     * <li><p><code>report</code>: A report.</p>
     * </li>
     * <li><p><code>dashboardOfflineQuery</code>: An ad-hoc query.</p>
     * </li>
     * <li><p><code>cube</code>: A dataset.</p>
     * </li>
     * <li><p><code>datasource</code>: A data source.</p>
     * </li>
     * <li><p><code>screen</code>: A data screen.</p>
     * </li>
     * <li><p><code>ANALYSIS</code>: An ad-hoc analysis.</p>
     * </li>
     * <li><p><code>dataForm</code>: A data form.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dashboard</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static AddWorksAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        AddWorksAuthorizationRequest self = new AddWorksAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public AddWorksAuthorizationRequest setAuthPoints(Integer authPoints) {
        this.authPoints = authPoints;
        return this;
    }
    public Integer getAuthPoints() {
        return this.authPoints;
    }

    public AddWorksAuthorizationRequest setAuthorizeScope(Integer authorizeScope) {
        this.authorizeScope = authorizeScope;
        return this;
    }
    public Integer getAuthorizeScope() {
        return this.authorizeScope;
    }

    public AddWorksAuthorizationRequest setAuthorizedId(String authorizedId) {
        this.authorizedId = authorizedId;
        return this;
    }
    public String getAuthorizedId() {
        return this.authorizedId;
    }

    public AddWorksAuthorizationRequest setExpireDay(String expireDay) {
        this.expireDay = expireDay;
        return this;
    }
    public String getExpireDay() {
        return this.expireDay;
    }

    public AddWorksAuthorizationRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public AddWorksAuthorizationRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
