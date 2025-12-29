// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListGitOrganizationsRequest extends TeaModel {
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
     * <p>geegenw-j-imwinmtuej</p>
     */
    @NameInMap("Owner")
    public String owner;

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

    public static ListGitOrganizationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGitOrganizationsRequest self = new ListGitOrganizationsRequest();
        return TeaModel.build(map, self);
    }

    public ListGitOrganizationsRequest setBindType(String bindType) {
        this.bindType = bindType;
        return this;
    }
    public String getBindType() {
        return this.bindType;
    }

    public ListGitOrganizationsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListGitOrganizationsRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListGitOrganizationsRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ListGitOrganizationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
