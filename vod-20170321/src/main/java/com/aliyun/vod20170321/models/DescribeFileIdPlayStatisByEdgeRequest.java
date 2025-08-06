// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeFileIdPlayStatisByEdgeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("From")
    public String from;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ScrollToken")
    public String scrollToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("To")
    public String to;

    public static DescribeFileIdPlayStatisByEdgeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileIdPlayStatisByEdgeRequest self = new DescribeFileIdPlayStatisByEdgeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFileIdPlayStatisByEdgeRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeFileIdPlayStatisByEdgeRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeFileIdPlayStatisByEdgeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFileIdPlayStatisByEdgeRequest setScrollToken(String scrollToken) {
        this.scrollToken = scrollToken;
        return this;
    }
    public String getScrollToken() {
        return this.scrollToken;
    }

    public DescribeFileIdPlayStatisByEdgeRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

}
