// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddWorksAuthorizationRequest extends TeaModel {
    /**
     * <p>The type of granted permissions. Valid values:</p>
     * <ul>
     * <li>1: View.</li>
     * <li>3: View and export.</li>
     * <li>11: Edit, view, and export.
     * Note: When the value is set to 11, the authorization does not expire.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuthPoints")
    public Integer authPoints;

    /**
     * <p>The authorization scope. Valid values:</p>
     * <ul>
     * <li>0: User. The AuthorizedId parameter corresponds to the user ID in Quick BI.</li>
     * <li>1: User group. The AuthorizedId parameter corresponds to the user group ID in Quick BI.</li>
     * <li>2: All organization members. The AuthorizedId parameter corresponds to the organization ID in Quick BI.</li>
     * <li>3: All workspace members. The AuthorizedId parameter corresponds to the workspace ID in Quick BI.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AuthorizeScope")
    public Integer authorizeScope;

    /**
     * <p>The ID of the authorized object. For more information, see the description of AuthorizeScope.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ASDAS-WDAS****ASDA</p>
     */
    @NameInMap("AuthorizedId")
    public String authorizedId;

    /**
     * <p>The expiration date of the authorization. Format: yyyy-MM-dd. Example: 2022-02-16. Note: The authorization period must be at least N+1 days. This parameter is required when the AuthPoints parameter is not set to 11.</p>
     * 
     * <strong>example:</strong>
     * <p>2099-12-31</p>
     */
    @NameInMap("ExpireDay")
    public String expireDay;

    /**
     * <p>The resource ID.</p>
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
     * <li>dashboard: Dashboard.</li>
     * <li>report: Workbook.</li>
     * <li>dashboardOfflineQuery: Ad hoc query.</li>
     * <li>cube: Dataset.</li>
     * <li>datasource: Data source.</li>
     * <li>screen: Data screen.</li>
     * <li>ANALYSIS: Ad hoc analysis.</li>
     * <li>dataForm: Data entry.</li>
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
