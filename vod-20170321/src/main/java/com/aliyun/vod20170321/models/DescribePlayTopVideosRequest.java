// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayTopVideosRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("BizDate")
    @Validation(required = true)
    public String bizDate;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribePlayTopVideosRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayTopVideosRequest self = new DescribePlayTopVideosRequest();
        return TeaModel.build(map, self);
    }

}
