// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyProjectAuthorizationRequest extends TeaModel {
    /**
     * <p>The ID of the project authorization to modify.</p>
     * <blockquote>
     * <p>You can call the ListProjectAuthorizations operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuthorizationId")
    public Long authorizationId;

    /**
     * <p>The new description of the project authorization.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the bastion host instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new name of the project authorization.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The scope of manageable assets associated with the authorization after modification. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: All projects.</p>
     * </li>
     * <li><p><strong>2</strong>: Specified projects.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScopeType")
    public Integer scopeType;

    public static ModifyProjectAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyProjectAuthorizationRequest self = new ModifyProjectAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyProjectAuthorizationRequest setAuthorizationId(Long authorizationId) {
        this.authorizationId = authorizationId;
        return this;
    }
    public Long getAuthorizationId() {
        return this.authorizationId;
    }

    public ModifyProjectAuthorizationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyProjectAuthorizationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyProjectAuthorizationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyProjectAuthorizationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyProjectAuthorizationRequest setScopeType(Integer scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public Integer getScopeType() {
        return this.scopeType;
    }

}
