// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAuditHistoryRequest extends TeaModel {
    @NameInMap("VideoId")
    @Validation(required = true)
    public String videoId;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SortBy")
    public String sortBy;

    public static GetAuditHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuditHistoryRequest self = new GetAuditHistoryRequest();
        return TeaModel.build(map, self);
    }

}
