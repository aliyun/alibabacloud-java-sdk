// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListGitAccountsRequest extends TeaModel {
    @NameInMap("BindType")
    public String bindType;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>github</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>roleName</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    public static ListGitAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGitAccountsRequest self = new ListGitAccountsRequest();
        return TeaModel.build(map, self);
    }

    public ListGitAccountsRequest setBindType(String bindType) {
        this.bindType = bindType;
        return this;
    }
    public String getBindType() {
        return this.bindType;
    }

    public ListGitAccountsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListGitAccountsRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ListGitAccountsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListGitAccountsRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
