// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLFlowSankey extends TeaModel {
    /**
     * <p>The five columns of the main chain.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Key&quot;:&quot;traj&quot;,&quot;Label&quot;:&quot;Generated trajectory&quot;,&quot;Count&quot;:96}]</p>
     */
    @NameInMap("Columns")
    public java.util.List<RLFlowSankeyColumn> columns;

    /**
     * <p>The outflow edges of each column.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;From&quot;:&quot;run&quot;,&quot;FromIdx&quot;:1,&quot;Label&quot;:&quot;Not started&quot;,&quot;Count&quot;:0}]</p>
     */
    @NameInMap("Exits")
    public java.util.List<RLFlowSankeyExit> exits;

    public static RLFlowSankey build(java.util.Map<String, ?> map) throws Exception {
        RLFlowSankey self = new RLFlowSankey();
        return TeaModel.build(map, self);
    }

    public RLFlowSankey setColumns(java.util.List<RLFlowSankeyColumn> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<RLFlowSankeyColumn> getColumns() {
        return this.columns;
    }

    public RLFlowSankey setExits(java.util.List<RLFlowSankeyExit> exits) {
        this.exits = exits;
        return this;
    }
    public java.util.List<RLFlowSankeyExit> getExits() {
        return this.exits;
    }

}
