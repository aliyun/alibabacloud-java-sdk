// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class LoggingEnabled extends TeaModel {
    // 存储访问日志的存储空间
    @NameInMap("TargetBucket")
    public String targetBucket;

    // 保存的日志文件前缀
    @NameInMap("TargetPrefix")
    public String targetPrefix;

    public static LoggingEnabled build(java.util.Map<String, ?> map) throws Exception {
        LoggingEnabled self = new LoggingEnabled();
        return TeaModel.build(map, self);
    }

    public LoggingEnabled setTargetBucket(String targetBucket) {
        this.targetBucket = targetBucket;
        return this;
    }
    public String getTargetBucket() {
        return this.targetBucket;
    }

    public LoggingEnabled setTargetPrefix(String targetPrefix) {
        this.targetPrefix = targetPrefix;
        return this;
    }
    public String getTargetPrefix() {
        return this.targetPrefix;
    }

}
