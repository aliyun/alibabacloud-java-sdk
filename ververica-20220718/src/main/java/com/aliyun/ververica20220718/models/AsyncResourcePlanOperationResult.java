// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class AsyncResourcePlanOperationResult extends TeaModel {
    /**
     * <p>The information about the ticket. The value of this parameter is returned when the value of the ticketStatus parameter is FAILED or EXECUTING.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;create resource plan failed&quot;</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The resource configuration plan of the deployment in expert mode. The value of this parameter is returned when the value of the ticketStatus parameter is FINISHED.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;ssgProfiles\&quot;:[{\&quot;name\&quot;:\&quot;default\&quot;,\&quot;cpu\&quot;:1.13,\&quot;heap\&quot;:\&quot;1 gb\&quot;,\&quot;offHeap\&quot;:\&quot;32 mb\&quot;,\&quot;managed\&quot;:{},\&quot;extended\&quot;:{}}],\&quot;nodes\&quot;:[{\&quot;id\&quot;:1,\&quot;type\&quot;:\&quot;StreamExecTableSourceScan\&quot;,\&quot;desc\&quot;:\&quot;Source: datagen_source[78]\&quot;,\&quot;profile\&quot;:{\&quot;group\&quot;:\&quot;default\&quot;,\&quot;parallelism\&quot;:1,\&quot;maxParallelism\&quot;:32768,\&quot;minParallelism\&quot;:1}},{\&quot;id\&quot;:2,\&quot;type\&quot;:\&quot;StreamExecSink\&quot;,\&quot;desc\&quot;:\&quot;Sink: blackhole_sink[79]\&quot;,\&quot;profile\&quot;:{\&quot;group\&quot;:\&quot;default\&quot;,\&quot;parallelism\&quot;:1,\&quot;maxParallelism\&quot;:32768,\&quot;minParallelism\&quot;:1}}],\&quot;edges\&quot;:[{\&quot;source\&quot;:1,\&quot;target\&quot;:2,\&quot;mode\&quot;:\&quot;PIPELINED\&quot;,\&quot;strategy\&quot;:\&quot;FORWARD\&quot;}],\&quot;vertices\&quot;:{\&quot;717c7b8afebbfb7137f6f0f99beb2a94\&quot;:[1,2]}}</p>
     */
    @NameInMap("plan")
    public String plan;

    /**
     * <p>The status of the ticket that applies for an asynchronous operation. Valid values:</p>
     * <ul>
     * <li>EXECUTING</li>
     * <li>FINISHED</li>
     * <li>FAILED</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FINISHED</p>
     */
    @NameInMap("ticketStatus")
    public String ticketStatus;

    public static AsyncResourcePlanOperationResult build(java.util.Map<String, ?> map) throws Exception {
        AsyncResourcePlanOperationResult self = new AsyncResourcePlanOperationResult();
        return TeaModel.build(map, self);
    }

    public AsyncResourcePlanOperationResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AsyncResourcePlanOperationResult setPlan(String plan) {
        this.plan = plan;
        return this;
    }
    public String getPlan() {
        return this.plan;
    }

    public AsyncResourcePlanOperationResult setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
        return this;
    }
    public String getTicketStatus() {
        return this.ticketStatus;
    }

}
