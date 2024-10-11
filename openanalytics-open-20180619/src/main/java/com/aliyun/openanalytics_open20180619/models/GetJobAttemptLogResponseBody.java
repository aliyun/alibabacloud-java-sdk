// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetJobAttemptLogResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>local:///opt/spark/jars/offline-sql.jar, main_file\n+ exec /usr/bin/tini -s -- /jdk/jdk8/bin/java -cp \&quot;/opt/tools/exec-wrapper.jar:.:::/opt/spark/jars/*\&quot; com.aliyun.dla.spark.SparkJobWrapper /opt/spark/bin/spark-submit --conf spark.driver.host=172.16.6.205 --conf spark.ui.port=4040 --conf \&quot;spark.driver.extraJavaOptions=-Dlog4j.configuration=file:///opt/spark/log-conf/log4j.properties -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/tmp/dump.hprof -XX:OnOutOfMemoryError=\&quot;bash /opt/tools/oss-cp.sh /tmp/dump.hprof oss://dla-test-cn-hangzhou/spark-logs/release-test/j202105272322hangzhou5d64f1560000128-0001/driver/dump.hprof; bash /opt/tools/job-stop.sh\&quot; \&quot;</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>9CE8F271-F918-43B6-8F58-F9F1C2DCFDB8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetJobAttemptLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobAttemptLogResponseBody self = new GetJobAttemptLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobAttemptLogResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetJobAttemptLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
