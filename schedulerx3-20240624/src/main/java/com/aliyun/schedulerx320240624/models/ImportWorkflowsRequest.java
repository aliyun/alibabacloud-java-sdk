// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ImportWorkflowsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoCreateApp")
    public Boolean autoCreateApp;

    /**
     * <p>A short description of struct</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-a1804a3226d</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;kind&quot;:&quot;SchedulerXWorkflows&quot;,&quot;type&quot;:&quot;JSON&quot;,&quot;version&quot;:&quot;2.0&quot;,&quot;workflowInfo&quot;:{&quot;name&quot;:&quot;myWorkflow&quot;,&quot;description&quot;:&quot;&quot;,&quot;appName&quot;:&quot;xuerentest&quot;,&quot;appType&quot;:1,&quot;maxConcurrency&quot;:1,&quot;currentExecuteStatus&quot;:0,&quot;timeConfig&quot;:{&quot;timeType&quot;:1,&quot;timeExpression&quot;:&quot;0 0 12 * * ?&quot;,&quot;dataOffset&quot;:0}},&quot;nodes&quot;:[{&quot;name&quot;:&quot;Java1&quot;,&quot;startTime&quot;:-1,&quot;coordinate&quot;:{&quot;x&quot;:-222.0,&quot;y&quot;:40.0,&quot;width&quot;:220.0,&quot;height&quot;:76.0},&quot;appName&quot;:&quot;xuerentest&quot;,&quot;description&quot;:&quot;&quot;,&quot;jobType&quot;:&quot;xxljob&quot;,&quot;executeMode&quot;:&quot;standalone&quot;,&quot;contentType&quot;:1,&quot;content&quot;:&quot;{\&quot;jobHandler\&quot;:\&quot;helloworld\&quot;}&quot;,&quot;xattrs&quot;:&quot;{\&quot;executorBlockStrategy\&quot;:1}&quot;,&quot;dependentStrategy&quot;:1,&quot;routeStrategy&quot;:1,&quot;parameters&quot;:&quot;&quot;,&quot;maxConcurrency&quot;:1,&quot;maxAttempt&quot;:0,&quot;attemptInterval&quot;:30,&quot;priority&quot;:5,&quot;weight&quot;:1,&quot;timeConfig&quot;:{&quot;timeType&quot;:1,&quot;calendar&quot;:&quot;&quot;,&quot;dataOffset&quot;:0},&quot;monitorConfigInfo&quot;:{&quot;timeoutEnable&quot;:true,&quot;failEnable&quot;:true,&quot;failLimitTimes&quot;:1,&quot;failRate&quot;:100,&quot;missWorkerEnable&quot;:true,&quot;timeout&quot;:300,&quot;timeoutKillEnable&quot;:false,&quot;daysOfDeadline&quot;:0,&quot;sendChannel&quot;:&quot;&quot;,&quot;alarmType&quot;:&quot;CustomContacts&quot;,&quot;successNotice&quot;:false,&quot;endEarlyEnable&quot;:false,&quot;endEarly&quot;:30},&quot;contactInfoList&quot;:[]},{&quot;name&quot;:&quot;shell1&quot;,&quot;startTime&quot;:-1,&quot;coordinate&quot;:{&quot;x&quot;:102.0,&quot;y&quot;:-51.0,&quot;width&quot;:220.0,&quot;height&quot;:76.0},&quot;appName&quot;:&quot;xuerentest&quot;,&quot;description&quot;:&quot;&quot;,&quot;jobType&quot;:&quot;script_shell&quot;,&quot;executeMode&quot;:&quot;standalone&quot;,&quot;contentType&quot;:2,&quot;content&quot;:&quot;echo \&quot;hello world\&quot;&quot;,&quot;xattrs&quot;:&quot;{\&quot;executorBlockStrategy\&quot;:1}&quot;,&quot;dependentStrategy&quot;:1,&quot;routeStrategy&quot;:1,&quot;parameters&quot;:&quot;&quot;,&quot;maxConcurrency&quot;:1,&quot;maxAttempt&quot;:0,&quot;attemptInterval&quot;:30,&quot;priority&quot;:5,&quot;weight&quot;:1,&quot;timeConfig&quot;:{&quot;timeType&quot;:1,&quot;calendar&quot;:&quot;&quot;,&quot;dataOffset&quot;:0},&quot;monitorConfigInfo&quot;:{&quot;timeoutEnable&quot;:true,&quot;failEnable&quot;:true,&quot;failLimitTimes&quot;:1,&quot;failRate&quot;:100,&quot;missWorkerEnable&quot;:true,&quot;timeout&quot;:300,&quot;timeoutKillEnable&quot;:false,&quot;daysOfDeadline&quot;:0,&quot;sendChannel&quot;:&quot;&quot;,&quot;alarmType&quot;:&quot;CustomContacts&quot;,&quot;successNotice&quot;:false,&quot;endEarlyEnable&quot;:false,&quot;endEarly&quot;:30},&quot;contactInfoList&quot;:[]},{&quot;name&quot;:&quot;Java2&quot;,&quot;startTime&quot;:-1,&quot;coordinate&quot;:{&quot;x&quot;:390.0,&quot;y&quot;:55.0,&quot;width&quot;:220.0,&quot;height&quot;:76.0},&quot;appName&quot;:&quot;xuerentest&quot;,&quot;description&quot;:&quot;&quot;,&quot;jobType&quot;:&quot;xxljob&quot;,&quot;executeMode&quot;:&quot;standalone&quot;,&quot;contentType&quot;:1,&quot;content&quot;:&quot;{\&quot;jobHandler\&quot;:\&quot;helloworld2\&quot;}&quot;,&quot;xattrs&quot;:&quot;{\&quot;executorBlockStrategy\&quot;:1,\&quot;localParams\&quot;:[]}&quot;,&quot;dependentStrategy&quot;:1,&quot;routeStrategy&quot;:1,&quot;parameters&quot;:&quot;&quot;,&quot;maxConcurrency&quot;:1,&quot;maxAttempt&quot;:0,&quot;attemptInterval&quot;:30,&quot;priority&quot;:5,&quot;weight&quot;:1,&quot;timeConfig&quot;:{&quot;timeType&quot;:1,&quot;calendar&quot;:&quot;&quot;,&quot;dataOffset&quot;:0},&quot;monitorConfigInfo&quot;:{&quot;timeoutEnable&quot;:true,&quot;failEnable&quot;:true,&quot;failLimitTimes&quot;:1,&quot;failRate&quot;:100,&quot;missWorkerEnable&quot;:true,&quot;timeout&quot;:300,&quot;timeoutKillEnable&quot;:false,&quot;daysOfDeadline&quot;:0,&quot;sendChannel&quot;:&quot;&quot;,&quot;alarmType&quot;:&quot;CustomContacts&quot;,&quot;successNotice&quot;:false,&quot;endEarlyEnable&quot;:false,&quot;endEarly&quot;:30},&quot;contactInfoList&quot;:[]},{&quot;name&quot;:&quot;shell2&quot;,&quot;startTime&quot;:-1,&quot;coordinate&quot;:{&quot;x&quot;:89.0,&quot;y&quot;:161.0,&quot;width&quot;:220.0,&quot;height&quot;:76.0},&quot;appName&quot;:&quot;xuerentest&quot;,&quot;description&quot;:&quot;&quot;,&quot;jobType&quot;:&quot;script_shell&quot;,&quot;executeMode&quot;:&quot;standalone&quot;,&quot;contentType&quot;:2,&quot;content&quot;:&quot;echo \&quot;hello world2\&quot;&quot;,&quot;xattrs&quot;:&quot;{\&quot;executorBlockStrategy\&quot;:1}&quot;,&quot;dependentStrategy&quot;:1,&quot;routeStrategy&quot;:1,&quot;parameters&quot;:&quot;&quot;,&quot;maxConcurrency&quot;:1,&quot;maxAttempt&quot;:0,&quot;attemptInterval&quot;:30,&quot;priority&quot;:5,&quot;weight&quot;:1,&quot;timeConfig&quot;:{&quot;timeType&quot;:1,&quot;calendar&quot;:&quot;&quot;,&quot;dataOffset&quot;:0},&quot;monitorConfigInfo&quot;:{&quot;timeoutEnable&quot;:true,&quot;failEnable&quot;:true,&quot;failLimitTimes&quot;:1,&quot;failRate&quot;:100,&quot;missWorkerEnable&quot;:true,&quot;timeout&quot;:300,&quot;timeoutKillEnable&quot;:false,&quot;daysOfDeadline&quot;:0,&quot;sendChannel&quot;:&quot;&quot;,&quot;alarmType&quot;:&quot;CustomContacts&quot;,&quot;successNotice&quot;:false,&quot;endEarlyEnable&quot;:false,&quot;endEarly&quot;:30},&quot;contactInfoList&quot;:[]}],&quot;edges&quot;:[{&quot;from&quot;:&quot;Java1&quot;,&quot;to&quot;:&quot;shell1&quot;},{&quot;from&quot;:&quot;Java1&quot;,&quot;to&quot;:&quot;shell2&quot;},{&quot;from&quot;:&quot;Schedulerx-Root&quot;,&quot;to&quot;:&quot;Java1&quot;},{&quot;from&quot;:&quot;shell1&quot;,&quot;to&quot;:&quot;Java2&quot;},{&quot;from&quot;:&quot;shell2&quot;,&quot;to&quot;:&quot;Java2&quot;}]}]</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Overwrite")
    public Boolean overwrite;

    public static ImportWorkflowsRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportWorkflowsRequest self = new ImportWorkflowsRequest();
        return TeaModel.build(map, self);
    }

    public ImportWorkflowsRequest setAutoCreateApp(Boolean autoCreateApp) {
        this.autoCreateApp = autoCreateApp;
        return this;
    }
    public Boolean getAutoCreateApp() {
        return this.autoCreateApp;
    }

    public ImportWorkflowsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ImportWorkflowsRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ImportWorkflowsRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

}
