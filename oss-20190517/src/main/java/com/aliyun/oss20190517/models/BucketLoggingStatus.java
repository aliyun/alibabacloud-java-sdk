// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class BucketLoggingStatus extends TeaModel {
    @NameInMap("LoggingEnabled")
    public LoggingEnabled loggingEnabled;

    public static BucketLoggingStatus build(java.util.Map<String, ?> map) throws Exception {
        BucketLoggingStatus self = new BucketLoggingStatus();
        return TeaModel.build(map, self);
    }

    public BucketLoggingStatus setLoggingEnabled(LoggingEnabled loggingEnabled) {
        this.loggingEnabled = loggingEnabled;
        return this;
    }
    public LoggingEnabled getLoggingEnabled() {
        return this.loggingEnabled;
    }

}
