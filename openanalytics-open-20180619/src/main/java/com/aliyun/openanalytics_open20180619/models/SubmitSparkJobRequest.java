// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class SubmitSparkJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;name&quot;: &quot;SparkPi&quot;,     &quot;file&quot;: &quot;local:///tmp/spark-examples.jar&quot;,     &quot;className&quot;: &quot;org.apache.spark.examples.SparkPi&quot;,     &quot;args&quot;: [         &quot;100&quot;     ],     &quot;conf&quot;: {         &quot;spark.driver.resourceSpec&quot;: &quot;medium&quot;,         &quot;spark.executor.instances&quot;: 5,         &quot;spark.executor.resourceSpec&quot;: &quot;medium&quot;     } }</p>
     */
    @NameInMap("ConfigJson")
    public String configJson;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyCluster</p>
     */
    @NameInMap("VcName")
    public String vcName;

    public static SubmitSparkJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSparkJobRequest self = new SubmitSparkJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSparkJobRequest setConfigJson(String configJson) {
        this.configJson = configJson;
        return this;
    }
    public String getConfigJson() {
        return this.configJson;
    }

    public SubmitSparkJobRequest setVcName(String vcName) {
        this.vcName = vcName;
        return this;
    }
    public String getVcName() {
        return this.vcName;
    }

}
