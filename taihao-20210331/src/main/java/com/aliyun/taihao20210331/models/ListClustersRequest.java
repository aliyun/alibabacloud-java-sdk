// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClustersRequest extends TeaModel {
    // listClustersParam
    @NameInMap("listClustersParam")
    public ListClustersParam listClustersParam;

    public static ListClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClustersRequest self = new ListClustersRequest();
        return TeaModel.build(map, self);
    }

    public ListClustersRequest setListClustersParam(ListClustersParam listClustersParam) {
        this.listClustersParam = listClustersParam;
        return this;
    }
    public ListClustersParam getListClustersParam() {
        return this.listClustersParam;
    }

}
