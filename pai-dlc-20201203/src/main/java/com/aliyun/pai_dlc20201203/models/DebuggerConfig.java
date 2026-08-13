// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DebuggerConfig extends TeaModel {
    /**
     * <p>The configuration item details in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;description\&quot;:\&quot;This is a new pytorchjob template\&quot;}</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The system-generated unique ID of the debug config.</p>
     * 
     * <strong>example:</strong>
     * <p>dc-vf9lowjt3pso</p>
     */
    @NameInMap("DebuggerConfigId")
    public String debuggerConfigId;

    /**
     * <p>The description of the configuration item.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a basic Pytorch configuration template</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the template configuration item.</p>
     * 
     * <strong>example:</strong>
     * <p>Pytorch Experiment Config</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The creation time in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:35:00Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The modification time in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:00Z</p>
     */
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
