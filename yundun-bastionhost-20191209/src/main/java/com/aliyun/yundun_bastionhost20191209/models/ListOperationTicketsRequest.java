// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListOperationTicketsRequest extends TeaModel {
    /**
     * <p>The address of the asset for which the O\&amp;M request is pending approval. This parameter supports exact match searches.</p>
     * 
     * <strong>example:</strong>
     * <p>10.167.XX.XX</p>
     */
    @NameInMap("AssetAddress")
    public String assetAddress;

    /**
     * <p>The ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number for a paged query. The default value is <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The maximum number of entries to return on each page of a paged query.<br> The maximum value for the PageSize parameter is 1000. The default value is 20. If you leave this parameter empty, 20 entries are returned.<br><br></p>
     * <blockquote>
     * <p>We recommend that you specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
