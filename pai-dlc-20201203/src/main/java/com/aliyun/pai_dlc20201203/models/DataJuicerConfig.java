// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DataJuicerConfig extends TeaModel {
    @NameInMap("CommandType")
    public String commandType;

    @NameInMap("ExecutionMode")
    public String executionMode;

    public static DataJuicerConfig build(java.util.Map<String, ?> map) throws Exception {
        DataJuicerConfig self = new DataJuicerConfig();
        return TeaModel.build(map, self);
    }

    public DataJuicerConfig setCommandType(String commandType) {
        this.commandType = commandType;
        return this;
    }
    public String getCommandType() {
        return this.commandType;
    }

    public DataJuicerConfig setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }
    public String getExecutionMode() {
        return this.executionMode;
    }

}
