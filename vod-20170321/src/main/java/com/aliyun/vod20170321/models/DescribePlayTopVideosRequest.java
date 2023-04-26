// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayTopVideosRequest extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("BizDate")
    public String bizDate;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribePlayTopVideos**.</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The time to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
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
