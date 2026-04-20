// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddWorksAuthorizationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuthPoints")
    public Integer authPoints;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AuthorizeScope")
    public Integer authorizeScope;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ASDAS-WDAS****ASDA</p>
     */
    @NameInMap("AuthorizedId")
    public String authorizedId;

    /**
     * <strong>example:</strong>
     * <p>2099-12-31</p>
     */
    @NameInMap("ExpireDay")
    public String expireDay;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>al*************7ufv</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
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
