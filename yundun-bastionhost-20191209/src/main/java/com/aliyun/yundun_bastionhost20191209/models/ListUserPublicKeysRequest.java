// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListUserPublicKeysRequest extends TeaModel {
    /**
     * <p>The ID of the Bastionhost instance where the user whose public keys you want to query resides.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">describeinstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number of the paged query. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The maximum number of entries to return on each page for a paged query.<br> The maximum value of the PageSize parameter is 100. Default value: 20. If this parameter is empty, 20 entries are returned by default.</p>
     * <blockquote>
     * <p>We recommend that you do not leave the PageSize parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID of the Bastionhost instance where the user resides.</p>
     * <blockquote>
     * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user whose public keys you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
