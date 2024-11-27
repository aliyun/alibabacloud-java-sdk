// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ImportJobsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoCreateApp")
    public Boolean autoCreateApp;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;kind&quot;: &quot;SchedulerXJobs&quot;,
     *   &quot;type&quot;: &quot;JSON&quot;,
     *   &quot;version&quot;: &quot;2.0&quot;,
     *   &quot;content&quot;: [
     *     {
     *       &quot;appName&quot;: &quot;xxl-job-executor-perf-test-xx&quot;,
     *       &quot;groupId&quot;: &quot;xxl-job-executor-perf-test-xx&quot;,
     *       &quot;description&quot;: &quot;xxl-job-executor-xx&quot;,
     *       &quot;jobConfigInfo&quot;: [
     *         {
     *           &quot;jobHandler&quot;: &quot;testJobVoidHandler&quot;,
     *           &quot;dataOffset&quot;: 0,
     *           &quot;executeMode&quot;: &quot;standalone&quot;,
     *           &quot;monitorConfigInfo&quot;: {
     *             &quot;alarmType&quot;: &quot;CustomContacts&quot;,
     *             &quot;failLimitTimes&quot;: 1,
     *             &quot;failEnable&quot;: true,
     *             &quot;failRate&quot;: 100,
     *             &quot;timeoutKillEnable&quot;: false,
     *             &quot;missWorkerEnable&quot;: false,
     *             &quot;sendChannel&quot;: &quot;webhook&quot;,
     *             &quot;timeoutEnable&quot;: true,
     *             &quot;timeout&quot;: 7200,
     *             &quot;daysOfDeadline&quot;: 0,
     *             &quot;successNotice&quot;: false
     *           },
     *           &quot;attemptInterval&quot;: 30,
     *           &quot;cleanMode&quot;: &quot;{\&quot;cleanMode\&quot;:\&quot;NUM_ONLY\&quot;,\&quot;totalRemain\&quot;:300}&quot;,
     *           &quot;description&quot;: &quot;&quot;,
     *           &quot;routeStrategy&quot;: 1,
     *           &quot;userName&quot;: &quot;xx&quot;,
     *           &quot;userId&quot;: &quot;xx&quot;,
     *           &quot;content&quot;: &quot;{\&quot;jobHandler\&quot;:\&quot;testJobVoidHandler\&quot;}&quot;,
     *           &quot;maxConcurrency&quot;: 1,
     *           &quot;maxAttempt&quot;: 0,
     *           &quot;name&quot;: &quot;perf_auto_test_0&quot;,
     *           &quot;xattrs&quot;: &quot;&quot;,
     *           &quot;jobType&quot;: &quot;xxljob&quot;,
     *           &quot;contentType&quot;: 1,
     *           &quot;parameters&quot;: &quot;success-withMsg&quot;,
     *           &quot;timeConfig&quot;: {
     *             &quot;calendar&quot;: &quot;&quot;,
     *             &quot;dataOffset&quot;: 0,
     *             &quot;timeType&quot;: 1,
     *             &quot;paramMap&quot;: {},
     *             &quot;timeExpression&quot;: &quot;* * * * * ?&quot;
     *           },
     *           &quot;contactInfoList&quot;: [],
     *           &quot;status&quot;: 0
     *         }
     *       ]
     *     }
     *   ]
     * }</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Overwrite")
    public Boolean overwrite;

    public static ImportJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportJobsRequest self = new ImportJobsRequest();
        return TeaModel.build(map, self);
    }

    public ImportJobsRequest setAutoCreateApp(Boolean autoCreateApp) {
        this.autoCreateApp = autoCreateApp;
        return this;
    }
    public Boolean getAutoCreateApp() {
        return this.autoCreateApp;
    }

    public ImportJobsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ImportJobsRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ImportJobsRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

}
