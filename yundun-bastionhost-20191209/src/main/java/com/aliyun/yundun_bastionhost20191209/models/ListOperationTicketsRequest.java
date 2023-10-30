// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListOperationTicketsRequest extends TeaModel {
    @NameInMap("AssetAddress")
    public String assetAddress;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RegionId")
    public String regionId;

    public static ListOperationTicketsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOperationTicketsRequest self = new ListOperationTicketsRequest();
        return TeaModel.build(map, self);
    }

    public ListOperationTicketsRequest setAssetAddress(String assetAddress) {
        this.assetAddress = assetAddress;
        return this;
    }
    public String getAssetAddress() {
        return this.assetAddress;
    }

    public ListOperationTicketsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListOperationTicketsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListOperationTicketsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListOperationTicketsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
