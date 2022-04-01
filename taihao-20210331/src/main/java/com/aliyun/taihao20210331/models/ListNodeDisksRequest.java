// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListNodeDisksRequest extends TeaModel {
    // listNodeDiskParam
    @NameInMap("listNodeDiskParam")
    public ListNodeDiskParam listNodeDiskParam;

    public static ListNodeDisksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodeDisksRequest self = new ListNodeDisksRequest();
        return TeaModel.build(map, self);
    }

    public ListNodeDisksRequest setListNodeDiskParam(ListNodeDiskParam listNodeDiskParam) {
        this.listNodeDiskParam = listNodeDiskParam;
        return this;
    }
    public ListNodeDiskParam getListNodeDiskParam() {
        return this.listNodeDiskParam;
    }

}
