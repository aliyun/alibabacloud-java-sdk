// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class ListReportsRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("SceneType")
    public String sceneType;

    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("SceneId")
    public String sceneId;

    public static ListReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListReportsRequest self = new ListReportsRequest();
        return TeaModel.build(map, self);
    }

}
