// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class LogGroupList extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("logGroupList")
    public java.util.List<LogGroup> logGroupList;

    public static LogGroupList build(java.util.Map<String, ?> map) throws Exception {
        LogGroupList self = new LogGroupList();
        return TeaModel.build(map, self);
    }

    public LogGroupList setLogGroupList(java.util.List<LogGroup> logGroupList) {
        this.logGroupList = logGroupList;
        return this;
    }
    public java.util.List<LogGroup> getLogGroupList() {
        return this.logGroupList;
    }

}
