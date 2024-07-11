// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListGitRepositoriesRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OrgName")
    public String orgName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Owner")
    public String owner;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Platform")
    public String platform;

    @NameInMap("RegionId")
    public String regionId;

    public static ListGitRepositoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGitRepositoriesRequest self = new ListGitRepositoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListGitRepositoriesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListGitRepositoriesRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public ListGitRepositoriesRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListGitRepositoriesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListGitRepositoriesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListGitRepositoriesRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ListGitRepositoriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
