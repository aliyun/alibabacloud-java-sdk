// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class TimeRange extends TeaModel {
    @NameInMap("end")
    public String end;

    @NameInMap("start")
    public String start;

    public static TimeRange build(java.util.Map<String, ?> map) throws Exception {
        TimeRange self = new TimeRange();
        return TeaModel.build(map, self);
    }

    public TimeRange setEnd(String end) {
        this.end = end;
        return this;
    }
    public String getEnd() {
        return this.end;
    }

    public TimeRange setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

}
