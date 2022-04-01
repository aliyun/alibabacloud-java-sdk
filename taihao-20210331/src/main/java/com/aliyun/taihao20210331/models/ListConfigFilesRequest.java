// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListConfigFilesRequest extends TeaModel {
    // listConfigFilesParam
    @NameInMap("listConfigFilesParam")
    public ListConfigFilesParam listConfigFilesParam;

    public static ListConfigFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfigFilesRequest self = new ListConfigFilesRequest();
        return TeaModel.build(map, self);
    }

    public ListConfigFilesRequest setListConfigFilesParam(ListConfigFilesParam listConfigFilesParam) {
        this.listConfigFilesParam = listConfigFilesParam;
        return this;
    }
    public ListConfigFilesParam getListConfigFilesParam() {
        return this.listConfigFilesParam;
    }

}
