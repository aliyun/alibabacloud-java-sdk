// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeFileIdPlayStatisByOriginRequest extends TeaModel {
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

    public static DescribeFileIdPlayStatisByOriginRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileIdPlayStatisByOriginRequest self = new DescribeFileIdPlayStatisByOriginRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFileIdPlayStatisByOriginRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeFileIdPlayStatisByOriginRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeFileIdPlayStatisByOriginRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFileIdPlayStatisByOriginRequest setScrollToken(String scrollToken) {
        this.scrollToken = scrollToken;
        return this;
    }
    public String getScrollToken() {
        return this.scrollToken;
    }

    public DescribeFileIdPlayStatisByOriginRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

}
