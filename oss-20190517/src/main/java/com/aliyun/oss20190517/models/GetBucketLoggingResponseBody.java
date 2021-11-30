// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketLoggingResponseBody extends TeaModel {
    @NameInMap("LoggingEnabled")
    public LoggingEnabled loggingEnabled;

    public static GetBucketLoggingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketLoggingResponseBody self = new GetBucketLoggingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketLoggingResponseBody setLoggingEnabled(LoggingEnabled loggingEnabled) {
        this.loggingEnabled = loggingEnabled;
        return this;
    }
    public LoggingEnabled getLoggingEnabled() {
        return this.loggingEnabled;
    }

}
