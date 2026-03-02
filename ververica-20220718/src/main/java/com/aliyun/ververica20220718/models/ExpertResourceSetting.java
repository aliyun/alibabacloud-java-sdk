// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ExpertResourceSetting extends TeaModel {
    /**
     * <p>The basic resource configuration of the JobManager.</p>
     */
    @NameInMap("jobmanagerResourceSettingSpec")
    public BasicResourceSettingSpec jobmanagerResourceSettingSpec;

    /**
     * <p>The resource configuration plan of the deployment in expert mode.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;ssgProfiles\&quot;:[{\&quot;name\&quot;:\&quot;default\&quot;,\&quot;cpu\&quot;:1.13,\&quot;heap\&quot;:\&quot;1 gb\&quot;,\&quot;offHeap\&quot;:\&quot;32 mb\&quot;,\&quot;managed\&quot;:{},\&quot;extended\&quot;:{}}],\&quot;nodes\&quot;:[{\&quot;id\&quot;:1,\&quot;type\&quot;:\&quot;StreamExecTableSourceScan\&quot;,\&quot;desc\&quot;:\&quot;Source: datagen_source[78]\&quot;,\&quot;profile\&quot;:{\&quot;group\&quot;:\&quot;default\&quot;,\&quot;parallelism\&quot;:1,\&quot;maxParallelism\&quot;:32768,\&quot;minParallelism\&quot;:1}},{\&quot;id\&quot;:2,\&quot;type\&quot;:\&quot;StreamExecSink\&quot;,\&quot;desc\&quot;:\&quot;Sink: blackhole_sink[79]\&quot;,\&quot;profile\&quot;:{\&quot;group\&quot;:\&quot;default\&quot;,\&quot;parallelism\&quot;:1,\&quot;maxParallelism\&quot;:32768,\&quot;minParallelism\&quot;:1}}],\&quot;edges\&quot;:[{\&quot;source\&quot;:1,\&quot;target\&quot;:2,\&quot;mode\&quot;:\&quot;PIPELINED\&quot;,\&quot;strategy\&quot;:\&quot;FORWARD\&quot;}],\&quot;vertices\&quot;:{\&quot;717c7b8afebbfb7137f6f0f99beb2a94\&quot;:[1,2]}}</p>
     */
    @NameInMap("resourcePlan")
    public String resourcePlan;

    public static ExpertResourceSetting build(java.util.Map<String, ?> map) throws Exception {
        ExpertResourceSetting self = new ExpertResourceSetting();
        return TeaModel.build(map, self);
    }

    public ExpertResourceSetting setJobmanagerResourceSettingSpec(BasicResourceSettingSpec jobmanagerResourceSettingSpec) {
        this.jobmanagerResourceSettingSpec = jobmanagerResourceSettingSpec;
        return this;
    }
    public BasicResourceSettingSpec getJobmanagerResourceSettingSpec() {
        return this.jobmanagerResourceSettingSpec;
    }

    public ExpertResourceSetting setResourcePlan(String resourcePlan) {
        this.resourcePlan = resourcePlan;
        return this;
    }
    public String getResourcePlan() {
        return this.resourcePlan;
    }

}
