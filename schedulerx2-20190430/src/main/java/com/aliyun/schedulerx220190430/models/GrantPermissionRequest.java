// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GrantPermissionRequest extends TeaModel {
    /**
     * <p>Specifies whether to grant the permissions with the GRANT option. Valid values: -<strong>true</strong> -<strong>false</strong></p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("GrantOption")
    public Boolean grantOption;

    /**
     * <p>The application group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test.defaultGroup</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The namespace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffcdf01</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The source of the namespace. This parameter is required only for a special third party.</p>
     * 
     * <strong>example:</strong>
     * <p>schedulerx</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>277641081920123456</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The username.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lilei</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static GrantPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantPermissionRequest self = new GrantPermissionRequest();
        return TeaModel.build(map, self);
    }

    public GrantPermissionRequest setGrantOption(Boolean grantOption) {
        this.grantOption = grantOption;
        return this;
    }
    public Boolean getGrantOption() {
        return this.grantOption;
    }

    public GrantPermissionRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GrantPermissionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GrantPermissionRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public GrantPermissionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GrantPermissionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GrantPermissionRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
