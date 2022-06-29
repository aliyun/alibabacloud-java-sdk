// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListSupportResourceTypesRequest extends TeaModel {
    @NameInMap("MaxResult")
    public Integer maxResult;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceTye")
    public String resourceTye;

    @NameInMap("ShowItems")
    public Boolean showItems;

    @NameInMap("SupportCode")
    public String supportCode;

    public static ListSupportResourceTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSupportResourceTypesRequest self = new ListSupportResourceTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListSupportResourceTypesRequest setMaxResult(Integer maxResult) {
        this.maxResult = maxResult;
        return this;
    }
    public Integer getMaxResult() {
        return this.maxResult;
    }

    public ListSupportResourceTypesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSupportResourceTypesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListSupportResourceTypesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListSupportResourceTypesRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListSupportResourceTypesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListSupportResourceTypesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListSupportResourceTypesRequest setResourceTye(String resourceTye) {
        this.resourceTye = resourceTye;
        return this;
    }
    public String getResourceTye() {
        return this.resourceTye;
    }

    public ListSupportResourceTypesRequest setShowItems(Boolean showItems) {
        this.showItems = showItems;
        return this;
    }
    public Boolean getShowItems() {
        return this.showItems;
    }

    public ListSupportResourceTypesRequest setSupportCode(String supportCode) {
        this.supportCode = supportCode;
        return this;
    }
    public String getSupportCode() {
        return this.supportCode;
    }

}
