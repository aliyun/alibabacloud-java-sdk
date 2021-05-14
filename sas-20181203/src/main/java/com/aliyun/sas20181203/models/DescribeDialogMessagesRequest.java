// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDialogMessagesRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeDialogMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDialogMessagesRequest self = new DescribeDialogMessagesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDialogMessagesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
