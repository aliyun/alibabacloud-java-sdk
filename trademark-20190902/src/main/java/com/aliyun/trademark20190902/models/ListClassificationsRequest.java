// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListClassificationsRequest extends TeaModel {
    @NameInMap("ParentCode")
    public String parentCode;

    public static ListClassificationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClassificationsRequest self = new ListClassificationsRequest();
        return TeaModel.build(map, self);
    }

    public ListClassificationsRequest setParentCode(String parentCode) {
        this.parentCode = parentCode;
        return this;
    }
    public String getParentCode() {
        return this.parentCode;
    }

}
