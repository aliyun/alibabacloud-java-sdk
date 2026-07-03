// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListDpiSignaturesRequest extends TeaModel {
    /**
     * <p>The ID of the application group.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("DpiGroupId")
    public String dpiGroupId;

    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>235</p>
     */
    @NameInMap("DpiSignatureIds")
    public java.util.List<String> dpiSignatureIds;

    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>EdgeCast</p>
     */
    @NameInMap("DpiSignatureNames")
    public java.util.List<String> dpiSignatureNames;

    /**
     * <p>The number of applications to return on each page.</p>
     * <p>Valid values: <strong>1</strong> to <strong>100</strong>.</p>
     * <p>Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to query the regions and their IDs that are supported by SAG.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ListDpiSignaturesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDpiSignaturesRequest self = new ListDpiSignaturesRequest();
        return TeaModel.build(map, self);
    }

    public ListDpiSignaturesRequest setDpiGroupId(String dpiGroupId) {
        this.dpiGroupId = dpiGroupId;
        return this;
    }
    public String getDpiGroupId() {
        return this.dpiGroupId;
    }

    public ListDpiSignaturesRequest setDpiSignatureIds(java.util.List<String> dpiSignatureIds) {
        this.dpiSignatureIds = dpiSignatureIds;
        return this;
    }
    public java.util.List<String> getDpiSignatureIds() {
        return this.dpiSignatureIds;
    }

    public ListDpiSignaturesRequest setDpiSignatureNames(java.util.List<String> dpiSignatureNames) {
        this.dpiSignatureNames = dpiSignatureNames;
        return this;
    }
    public java.util.List<String> getDpiSignatureNames() {
        return this.dpiSignatureNames;
    }

    public ListDpiSignaturesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDpiSignaturesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDpiSignaturesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListDpiSignaturesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListDpiSignaturesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDpiSignaturesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListDpiSignaturesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
