// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktGlobaltemplatedetailRequest extends TeaModel {
    @NameInMap("Stamp")
    public String stamp;

    public static ListLinkeLinktGlobaltemplatedetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktGlobaltemplatedetailRequest self = new ListLinkeLinktGlobaltemplatedetailRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktGlobaltemplatedetailRequest setStamp(String stamp) {
        this.stamp = stamp;
        return this;
    }
    public String getStamp() {
        return this.stamp;
    }

}
