// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class NodeOperationParameters extends TeaModel {
    /**
     * <p>The parameter settings for disabling node scheduling.</p>
     */
    @NameInMap("CordonParameters")
    public NodeCordonParameters cordonParameters;

    /**
     * <p>The parameter settings for draining task instances from a node.</p>
     */
    @NameInMap("DrainParameters")
    public NodeDrainParameters drainParameters;

    /**
     * <p>The parameters for changing disk capacity.</p>
     */
    @NameInMap("ResizeDiskParameters")
    public ResizeDiskParameters resizeDiskParameters;

    /**
     * <p>The parameter settings for enabling node scheduling.</p>
     */
    @NameInMap("UncordonParameters")
    public NodeUncordonParameters uncordonParameters;

    public static NodeOperationParameters build(java.util.Map<String, ?> map) throws Exception {
        NodeOperationParameters self = new NodeOperationParameters();
        return TeaModel.build(map, self);
    }

    public NodeOperationParameters setCordonParameters(NodeCordonParameters cordonParameters) {
        this.cordonParameters = cordonParameters;
        return this;
    }
    public NodeCordonParameters getCordonParameters() {
        return this.cordonParameters;
    }

    public NodeOperationParameters setDrainParameters(NodeDrainParameters drainParameters) {
        this.drainParameters = drainParameters;
        return this;
    }
    public NodeDrainParameters getDrainParameters() {
        return this.drainParameters;
    }

    public NodeOperationParameters setResizeDiskParameters(ResizeDiskParameters resizeDiskParameters) {
        this.resizeDiskParameters = resizeDiskParameters;
        return this;
    }
    public ResizeDiskParameters getResizeDiskParameters() {
        return this.resizeDiskParameters;
    }

    public NodeOperationParameters setUncordonParameters(NodeUncordonParameters uncordonParameters) {
        this.uncordonParameters = uncordonParameters;
        return this;
    }
    public NodeUncordonParameters getUncordonParameters() {
        return this.uncordonParameters;
    }

}
