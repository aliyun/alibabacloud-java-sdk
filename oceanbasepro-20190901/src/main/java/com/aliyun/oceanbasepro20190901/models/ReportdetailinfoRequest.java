// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ReportdetailinfoRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static ReportdetailinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportdetailinfoRequest self = new ReportdetailinfoRequest();
        return TeaModel.build(map, self);
    }

    public ReportdetailinfoRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
