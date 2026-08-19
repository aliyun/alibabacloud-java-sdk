// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayTopVideosRequest extends TeaModel {
    /**
     * <p>The date to query. Format: yyyy-MM-ddTHH:mm:ssZ (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-29T13:00:00Z</p>
     */
    @NameInMap("BizDate")
    public String bizDate;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. Default value: <strong>100</strong>. Maximum value: <strong>1000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribePlayTopVideosRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayTopVideosRequest self = new DescribePlayTopVideosRequest();
        return TeaModel.build(map, self);
    }

    public DescribePlayTopVideosRequest setBizDate(String bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public String getBizDate() {
        return this.bizDate;
    }

    public DescribePlayTopVideosRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePlayTopVideosRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DescribePlayTopVideosRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
