// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeInstanceLogsOutput extends TeaModel {
    @NameInMap("WebLogEntrys")
    public java.util.List<WebLogEntry> webLogEntrys;

    public static DescribeInstanceLogsOutput build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceLogsOutput self = new DescribeInstanceLogsOutput();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceLogsOutput setWebLogEntrys(java.util.List<WebLogEntry> webLogEntrys) {
        this.webLogEntrys = webLogEntrys;
        return this;
    }
    public java.util.List<WebLogEntry> getWebLogEntrys() {
        return this.webLogEntrys;
    }

}
