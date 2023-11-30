// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchDriveRequest extends TeaModel {
    /**
     * <p>The drive name.</p>
     */
    @NameInMap("drive_name")
    public String driveName;

    /**
     * <p>The maximum number of asynchronous tasks to return. Valid values: 1 to 100. Default value: 100.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker.\</p>
     * <p>By default, this parameter is left empty.</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The owner of the drive.</p>
     */
    @NameInMap("owner")
    public String owner;

    /**
     * <p>The type of the owner. Valid values:</p>
     * <br>
     * <p>user group</p>
     */
    @NameInMap("owner_type")
    public String ownerType;

    public static SearchDriveRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchDriveRequest self = new SearchDriveRequest();
        return TeaModel.build(map, self);
    }

    public SearchDriveRequest setDriveName(String driveName) {
        this.driveName = driveName;
        return this;
    }
    public String getDriveName() {
        return this.driveName;
    }

    public SearchDriveRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public SearchDriveRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public SearchDriveRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public SearchDriveRequest setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

}
