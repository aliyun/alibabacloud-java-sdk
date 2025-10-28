// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListSummariesRequest extends TeaModel {
    @NameInMap("Option")
    public String option;

    public static ListSummariesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSummariesRequest self = new ListSummariesRequest();
        return TeaModel.build(map, self);
    }

    public ListSummariesRequest setOption(String option) {
        this.option = option;
        return this;
    }
    public String getOption() {
        return this.option;
    }

}
