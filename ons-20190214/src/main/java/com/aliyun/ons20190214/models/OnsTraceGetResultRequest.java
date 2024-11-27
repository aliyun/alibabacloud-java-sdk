// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTraceGetResultRequest extends TeaModel {
    /**
     * <p>The ID of the instance to which the message you want to query belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>MQ_INST_111111111111_DOxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the task that was created to query the trace of the message.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>272967562652883649157096685****</p>
     */
    @NameInMap("QueryId")
    public String queryId;

    /**
     * <p>The topic to which the message belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static OnsTraceGetResultRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsTraceGetResultRequest self = new OnsTraceGetResultRequest();
        return TeaModel.build(map, self);
    }

    public OnsTraceGetResultRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsTraceGetResultRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public OnsTraceGetResultRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
