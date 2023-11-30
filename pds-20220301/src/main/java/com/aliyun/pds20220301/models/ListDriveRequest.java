// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListDriveRequest extends TeaModel {
    /**
     * <p>The maximum number of results to return. Valid values: 1 to 100. Default value: 100.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker. By default, this parameter is empty.</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The owner of the drive. If this parameter is not specified, all drives are returned.</p>
     */
    @NameInMap("owner")
    public String owner;

    /**
     * <p>The type of the owner. Valid values:</p>
     * <br>
     * <p>user and group.</p>
     * <br>
     * <p>By default, drives of all owner types are returned.</p>
     */
    @NameInMap("owner_type")
    public String ownerType;

    public static ListDriveRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDriveRequest self = new ListDriveRequest();
        return TeaModel.build(map, self);
    }

    public ListDriveRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListDriveRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListDriveRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListDriveRequest setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

}
