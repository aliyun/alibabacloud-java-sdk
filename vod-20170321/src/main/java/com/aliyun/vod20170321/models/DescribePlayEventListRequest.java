// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayEventListRequest extends TeaModel {
    @NameInMap("Language")
    public String language;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PlayTs")
    public String playTs;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static DescribePlayEventListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayEventListRequest self = new DescribePlayEventListRequest();
        return TeaModel.build(map, self);
    }

    public DescribePlayEventListRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribePlayEventListRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DescribePlayEventListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePlayEventListRequest setPlayTs(String playTs) {
        this.playTs = playTs;
        return this;
    }
    public String getPlayTs() {
        return this.playTs;
    }

    public DescribePlayEventListRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
