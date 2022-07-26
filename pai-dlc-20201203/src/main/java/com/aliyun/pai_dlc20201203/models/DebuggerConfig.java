// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DebuggerConfig extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("DebuggerConfigId")
    public String debuggerConfigId;

    @NameInMap("Description")
    public String description;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifyTime")
    public String gmtModifyTime;

    public static DebuggerConfig build(java.util.Map<String, ?> map) throws Exception {
        DebuggerConfig self = new DebuggerConfig();
        return TeaModel.build(map, self);
    }

    public DebuggerConfig setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DebuggerConfig setDebuggerConfigId(String debuggerConfigId) {
        this.debuggerConfigId = debuggerConfigId;
        return this;
    }
    public String getDebuggerConfigId() {
        return this.debuggerConfigId;
    }

    public DebuggerConfig setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DebuggerConfig setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public DebuggerConfig setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public DebuggerConfig setGmtModifyTime(String gmtModifyTime) {
        this.gmtModifyTime = gmtModifyTime;
        return this;
    }
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

}
