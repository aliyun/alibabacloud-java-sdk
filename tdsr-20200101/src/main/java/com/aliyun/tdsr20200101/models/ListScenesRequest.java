// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class ListScenesRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("IsPublishQuery")
    public Boolean isPublishQuery;

    public static ListScenesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScenesRequest self = new ListScenesRequest();
        return TeaModel.build(map, self);
    }

}
