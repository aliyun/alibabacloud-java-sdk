// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListConfigHistoryRequest extends TeaModel {
    // listConfigHistoryParam
    @NameInMap("listConfigHistoryParam")
    public ListConfigHistoryParam listConfigHistoryParam;

    public static ListConfigHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfigHistoryRequest self = new ListConfigHistoryRequest();
        return TeaModel.build(map, self);
    }

    public ListConfigHistoryRequest setListConfigHistoryParam(ListConfigHistoryParam listConfigHistoryParam) {
        this.listConfigHistoryParam = listConfigHistoryParam;
        return this;
    }
    public ListConfigHistoryParam getListConfigHistoryParam() {
        return this.listConfigHistoryParam;
    }

}
