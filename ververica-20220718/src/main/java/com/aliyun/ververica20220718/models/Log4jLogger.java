// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Log4jLogger extends TeaModel {
    @NameInMap("loggerLevel")
    public String loggerLevel;

    @NameInMap("loggerName")
    public String loggerName;

    public static Log4jLogger build(java.util.Map<String, ?> map) throws Exception {
        Log4jLogger self = new Log4jLogger();
        return TeaModel.build(map, self);
    }

    public Log4jLogger setLoggerLevel(String loggerLevel) {
        this.loggerLevel = loggerLevel;
        return this;
    }
    public String getLoggerLevel() {
        return this.loggerLevel;
    }

    public Log4jLogger setLoggerName(String loggerName) {
        this.loggerName = loggerName;
        return this;
    }
    public String getLoggerName() {
        return this.loggerName;
    }

}
