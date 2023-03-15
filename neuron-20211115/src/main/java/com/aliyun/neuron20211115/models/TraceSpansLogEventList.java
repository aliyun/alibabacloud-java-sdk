// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class TraceSpansLogEventList extends TeaModel {
    @NameInMap("logEventTagEntryList")
    public java.util.List<TagEntry> logEventTagEntryList;

    public static TraceSpansLogEventList build(java.util.Map<String, ?> map) throws Exception {
        TraceSpansLogEventList self = new TraceSpansLogEventList();
        return TeaModel.build(map, self);
    }

    public TraceSpansLogEventList setLogEventTagEntryList(java.util.List<TagEntry> logEventTagEntryList) {
        this.logEventTagEntryList = logEventTagEntryList;
        return this;
    }
    public java.util.List<TagEntry> getLogEventTagEntryList() {
        return this.logEventTagEntryList;
    }

}
