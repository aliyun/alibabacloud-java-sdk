// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodMediaPlayDataRequest extends TeaModel {
    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("OrderName")
    public String orderName;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("Os")
    public String os;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PlayDate")
    public String playDate;

    @NameInMap("Region")
    public String region;

    @NameInMap("TerminalType")
    public String terminalType;

    public static DescribeVodMediaPlayDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodMediaPlayDataRequest self = new DescribeVodMediaPlayDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodMediaPlayDataRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public DescribeVodMediaPlayDataRequest setOrderName(String orderName) {
        this.orderName = orderName;
        return this;
    }
    public String getOrderName() {
        return this.orderName;
    }

    public DescribeVodMediaPlayDataRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribeVodMediaPlayDataRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public DescribeVodMediaPlayDataRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DescribeVodMediaPlayDataRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeVodMediaPlayDataRequest setPlayDate(String playDate) {
        this.playDate = playDate;
        return this;
    }
    public String getPlayDate() {
        return this.playDate;
    }

    public DescribeVodMediaPlayDataRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeVodMediaPlayDataRequest setTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }
    public String getTerminalType() {
        return this.terminalType;
    }

}
