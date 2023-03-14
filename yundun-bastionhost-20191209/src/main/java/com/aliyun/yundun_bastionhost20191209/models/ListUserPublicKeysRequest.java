// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListUserPublicKeysRequest extends TeaModel {
    /**
     * <p>The ID of the bastion host on which you want to query all public keys of the user.</p>
     * <br>
     * <p>> You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries to return on each page.\</p>
     * <p>Maximum value: 100. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <br>
     * <p>> We recommend that you do not leave this parameter empty.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID of the bastion host on which you want to query all public keys of the user.</p>
     * <br>
     * <p>> For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user whose public keys you want to query.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListUserPublicKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserPublicKeysRequest self = new ListUserPublicKeysRequest();
        return TeaModel.build(map, self);
    }

    public ListUserPublicKeysRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListUserPublicKeysRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListUserPublicKeysRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListUserPublicKeysRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListUserPublicKeysRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
